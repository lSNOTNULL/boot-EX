package org.example.bootex.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.ZonedDateTime;

@Data
@Entity
public class Prompt {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(nullable = false)
    String originalText;
    @Column(nullable = false)
    String editedText;
    ZonedDateTime createdAt;
}
