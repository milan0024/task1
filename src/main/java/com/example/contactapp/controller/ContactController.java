package com.example.contactapp.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

    // Form on contact.html POSTs here as application/x-www-form-urlencoded
    @PostMapping("/submit")
    public String submitForm(@RequestParam String name,
                              @RequestParam String email,
                              @RequestParam String message) {

        // Requirement: no DB yet, just print to console
        System.out.println("---- New Contact Form Submission ----");
        System.out.println("Name    : " + name);
        System.out.println("Email   : " + email);
        System.out.println("Message : " + message);
        System.out.println("--------------------------------------");

        return "<html><body style='font-family:sans-serif;text-align:center;margin-top:50px;'>"
                + "<h2>Thanks, " + name + "!</h2>"
                + "<p>Your message has been received.</p>"
                + "<a href='/index.html'>Back to home</a>"
                + "</body></html>";
    }
}
