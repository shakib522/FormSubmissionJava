package com.example.formsubmission.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
@Data
@AllArgsConstructor
@Builder
public class SubmitResponse {
    private String message;
    private String status;
}
