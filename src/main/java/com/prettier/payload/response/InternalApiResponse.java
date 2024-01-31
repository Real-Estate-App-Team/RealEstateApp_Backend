package com.prettier.payload.response;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@Builder
public class InternalApiResponse<T> {

    private FriendlyMessage friendlyMessage;
    private T payload;
    private boolean hasError;
    private List<String> errorMessages;
    private HttpStatus httpStatus;
    private LocalDateTime timeStamp;
    private String path;
}
