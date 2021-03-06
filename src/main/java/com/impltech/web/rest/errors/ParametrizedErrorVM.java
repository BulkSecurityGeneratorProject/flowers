package com.impltech.web.rest.errors;

import java.io.Serializable;
import java.util.Map;

/**
 * @author platon
 * View Model for sending a parametrized error message.
 */
public class ParametrizedErrorVM implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String message;
    private final Map<String, String> paramMap;

    public ParametrizedErrorVM(String message, Map<String, String> paramMap) {
        this.message = message;
        this.paramMap = paramMap;
    }

    public String getMessage() {
        return message;
    }

    public Map<String, String> getParams() {
        return paramMap;
    }

}
