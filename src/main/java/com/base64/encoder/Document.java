package com.base64.encoder;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table
public class Document {
    @Id
    @SequenceGenerator(name = "document_gen", sequenceName = "document_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "document_gen")
    private Integer id;
    private String name;
    @Column(columnDefinition = "TEXT")
    private String file;
}
