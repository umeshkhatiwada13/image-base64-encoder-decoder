package com.base64.encoder;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface DocumentService {
    Document save(MultipartFile file, String name) throws IOException;
}
