package com.unidev.fn;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fnproject.fn.testing.FnResult;
import com.fnproject.fn.testing.FnTestingRule;
import java.io.IOException;
import org.junit.Rule;
import org.junit.Test;

public class ShoesFunctionTest {

    @Rule
    public final FnTestingRule testing = FnTestingRule.createDefault();

    private ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void usSizeCalculation() throws IOException {

        CalculationInput calculationInput = CalculationInput.builder()
            .operationType(OperationType.Calculate).type(SizeType.US).size("4").build();


        testing.givenEvent().withMethod("POST")
            .withBody(objectMapper.writeValueAsString(calculationInput))
            .enqueue();

        testing.thenRun(ShoesFunction.class, "handleRequest");

        FnResult result = testing.getOnlyResult();
        assertEquals(200, result.getStatus());
        String bodyAsString = result.getBodyAsString();

        CalculationOutput calculationOutput = objectMapper
            .readValue(bodyAsString, CalculationOutput.class);

        assertEquals(ResultCode.Success, calculationOutput.getResult());
        assertNotNull(calculationOutput.getSize());

    }

}