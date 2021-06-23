package com.example.ecommerce.controller;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * This class is in charge of upload the archives and create the main folder where the data is saved.
 * */
public class FileUploadUtil {

  /**
   * @param uploadDir This is the route where the archive.
   * @param fileName Name how is gonna be saved.
   * @param multipartFile The archive.
   * @throws IOException If the archive can't be saved and show a message with the name of the archive.
   */
  public static void saveFile(String uploadDir, String fileName, MultipartFile multipartFile)
      throws IOException {
    Path uploadPath = Paths.get(uploadDir);

    if (!Files.exists(uploadPath)) {
      Files.createDirectories(uploadPath);
    }

    try (InputStream inputStream = multipartFile.getInputStream()) {
      Path filePath = uploadPath.resolve(fileName);
      Files.copy(inputStream, filePath, StandardCopyOption.REPLACE_EXISTING);
    } catch (IOException ioe) {
      throw new IOException("Could not save file: " + fileName, ioe);
    }
  }
}
