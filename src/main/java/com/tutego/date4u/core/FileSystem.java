package com.tutego.date4u.core;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.boot.autoconfigure.ssl.SslProperties.Bundles.Watch.File;

public class FileSystem {
    private final Path root = 
        Paths.get(System.getProperty("user.home")).resolve("fs");

    public FileSystem() {
        try {
            if (! Files.isDirectory(root)) {
                Files.createDirectory(root);
            }
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
