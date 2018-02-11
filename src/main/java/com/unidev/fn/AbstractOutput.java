package com.unidev.fn;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public abstract class AbstractOutput {

    @Getter
    @Setter
    private ResultCode result;


}
