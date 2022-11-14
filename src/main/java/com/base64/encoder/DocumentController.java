package com.base64.encoder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("document")
public class DocumentController {

    @Autowired
    public DocumentService service;

    @GetMapping("upload")
    public ResponseEntity<Document> encodeFile(@RequestParam MultipartFile file, String name) throws IOException {
        return new ResponseEntity<>(service.save(file, name), HttpStatus.OK);
    }
}
