package com.ai.djh.api;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

/**
 * description:
 *
 * @author [djh]杜佳恒
 * @date Created at 21:36 on 2019/3/4
 */
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CommonResponse<T> implements Serializable {

    String resultCode;

    String resultMessage;

    T result;

    public CommonResponse(T result) {
        resultCode = "000000";
        resultMessage = "OK";
        this.result = result;
    }
}
