package com.ai.djh.controller;

import com.ai.djh.api.CommonResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description:
 *
 * @author [djh]杜佳恒
 * @date Created at 21:35 on 2019/3/4
 */
@RestController
@Slf4j
public class Controller {

    @GetMapping(value = "/api/init", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResponse<String> init() {
        log.info("xxxxxxxx");
        return new CommonResponse<>("hello! docker!");
    }
}
