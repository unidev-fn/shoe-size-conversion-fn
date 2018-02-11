package com.unidev.fn;

import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class CalculationOutput extends AbstractOutput {

    @Setter
    @Getter
    private Map<SizeType, String> size;

}
