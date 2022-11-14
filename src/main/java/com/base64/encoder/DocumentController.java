package com.base64.encoder;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class DocumentController {
    public ResponseEntity<String> encodeFile() {
        return null;
    }
}
