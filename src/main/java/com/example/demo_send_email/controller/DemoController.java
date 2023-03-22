package com.example.demo_send_email.controller;

import com.example.demo_send_email.service.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DemoController {

    private final EmailService emailService;

    @GetMapping("/send-email-2")
    public ResponseEntity<String> demo2() {
        this.emailService.sendEmail("passakornchoosuk@gmail.com", "passakornchoosuk@gmail.com", "test subject", "test body");
        return ResponseEntity.ok("sent email");
    }

    @GetMapping("/send-email")
    public ResponseEntity<String> demo() {
        this.emailService.sendEmailWithAttachment2("passakornchoosuk@gmail.com", "passakornchoosuk@gmail.com", "test subject", "test body");

        return ResponseEntity.ok("sent email");
    }

}
