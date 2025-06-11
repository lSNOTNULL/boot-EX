package org.example.bootex.repository;

import org.example.bootex.entity.Prompt;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PromptRepository extends JpaRepository<Prompt, String> {
}
