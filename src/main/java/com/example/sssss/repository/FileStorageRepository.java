package com.example.sssss.repository;

import com.example.sssss.domain.FileStorage;
import com.example.sssss.domain.FileStorageStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FileStorageRepository extends JpaRepository<FileStorage, Long> {

    FileStorage findByHashId(String hashId);

    List<FileStorage> findByAllFileStorageStatus(FileStorageStatus status);
}
