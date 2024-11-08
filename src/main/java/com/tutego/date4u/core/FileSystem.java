package com.tutego.date4u.core;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FileSystem {
    private final Path root = 
        Paths.get(System.getProperty("user.home")).resolve("fs");
    
}
