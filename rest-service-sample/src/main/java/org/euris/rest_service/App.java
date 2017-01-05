package org.euris.rest_service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class App 
{
	@RequestMapping(method = RequestMethod.GET, value = "/{message}", produces = "application/json")
    public String getMessage(final HttpServletRequest request, final HttpServletResponse response, @PathVariable(value = "message") String message)
    {
        return "Hello "+message;
    }
}
