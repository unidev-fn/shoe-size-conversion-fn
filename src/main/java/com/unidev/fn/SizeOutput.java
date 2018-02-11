package com.unidev.fn;

import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Calculation output object.
 */
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class SizeOutput extends AbstractOutput {

    @Setter
    @Getter
    private Set<String> usSizes;

    @Getter
    @Setter
    private Set<String> euSizes;

}
