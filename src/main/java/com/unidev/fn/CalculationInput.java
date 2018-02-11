package com.unidev.fn;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Request object for calculations, can be used for: <br/>
 *  - fetching available sizes <br/>
 *  - do actual conversion <br/>
 */
@NoArgsConstructor
@ToString
@AllArgsConstructor
@Builder
public class CalculationInput {

    @Getter
    @Setter
    private OperationType operationType = OperationType.Calculate;

    @Getter
    @Setter
    private String size;

    @Getter
    @Setter
    private SizeType type;

}
