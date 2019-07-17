package com.kona.framework.config.web;

import com.kona.base.lib.exception.ExceptionAdvance;
import org.springframework.web.bind.annotation.ControllerAdvice;

/**
 * @author : Yuan.Pan 2019/6/30 12:36 PM
 */
@ControllerAdvice(value = "com.kona.framework.web.controller")
public class ExceptionAdvanceImpl extends ExceptionAdvance {
}
