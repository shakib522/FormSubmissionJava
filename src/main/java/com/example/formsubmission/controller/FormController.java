package com.example.formsubmission.controller;


import com.example.formsubmission.model.Form;
import com.example.formsubmission.model.SubmitResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://127.0.0.1:5500/")
@RestController
@RequestMapping("/api/v1")
public class FormController {
    @GetMapping("/welcome")
    public String submitForm() {
        return "Welcome to form submission!";
    }
    @PostMapping("/submit")
    public ResponseEntity<SubmitResponse> post(@RequestBody Form form) {
        System.out.println(form);
        SubmitResponse submitResponse = SubmitResponse.builder()
                .message("Form submitted successfully")
                .status("200")
                .build();
        return ResponseEntity.status(201).body(submitResponse);
    }
}
