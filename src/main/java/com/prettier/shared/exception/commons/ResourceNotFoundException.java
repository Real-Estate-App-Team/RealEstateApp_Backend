package com.prettier.shared.exception.commons;

import com.prettier.shared.exception.globalExceptionHandling.ApiErrorResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@ResponseStatus(HttpStatus.NOT_FOUND) //status kodunu görmek istiyorsak
public class ResourceNotFoundException extends RuntimeException {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiErrorResponse> handleException(ResourceNotFoundException e,
                                                            HttpServletRequest request) {
        ApiErrorResponse response = new ApiErrorResponse();

        response.setHttpStatus(HttpStatus.NOT_FOUND);
               response.setHasError(true);
               response.setErrorMessages(e.getMessage());
               response.setPath(request.getRequestURI());
               response.setTimeStamp(LocalDateTime.now());

               return new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
    }
}
