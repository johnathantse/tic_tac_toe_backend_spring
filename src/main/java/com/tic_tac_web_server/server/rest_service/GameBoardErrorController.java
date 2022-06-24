package com.tic_tac_web_server.server.rest_service;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameBoardErrorController implements ErrorController {

    @RequestMapping(value = "/error", method = { RequestMethod.GET, RequestMethod.PUT })
    public ResponseEntity<String> handleError(HttpServletRequest request, HttpServletResponse response) {
        int status = response.getStatus();
        request.getAttribute(RequestDispatcher.ERROR_REQUEST_URI);
        String message = "HTTP Error " + status;
        String logMessage = message + " on URI: " + request.getAttribute(RequestDispatcher.ERROR_REQUEST_URI);
        if (status == HttpStatus.NOT_FOUND.value()) {
            System.err.println(logMessage);
            return new ResponseEntity<String>(message, HttpStatus.NOT_FOUND);
        } else if (status == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
            System.err.println(logMessage);
            return new ResponseEntity<String>(message, HttpStatus.BAD_REQUEST);
        } else {
            System.err.println(logMessage);
            return new ResponseEntity<String>(message, HttpStatus.BAD_REQUEST);

        }

    }
}
