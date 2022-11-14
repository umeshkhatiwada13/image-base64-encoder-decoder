package com.base64.encoder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Base64;

@Service
public class DocumentServiceImpl implements DocumentService {

    @Autowired
    public DocumentRepo documentRepo;

    @Override
    public Document save(MultipartFile file, String name) throws IOException {
        Document document = new Document();
        document.setName(name);
        document.setFile(Base64.getEncoder().encodeToString(file.getBytes()));
        return documentRepo.save(document);
    }
}
