package com.github.foiovituh.jenamer.validation;

import static com.github.foiovituh.jenamer.validation.Message.FILE_NOT_FOUND;
import static com.github.foiovituh.jenamer.validation.Message.MISSING_ARGUMENTS;
import static com.github.foiovituh.jenamer.validation.Message.MUST_BE_DIRECTORY;
import java.io.File;

public final class Validator {
    private Validator() {}
    
    private static void alert(String message) {
        System.out.println(message);
        System.exit(0);
    }
    
    public static void arguments(String[] arguments, int expected) {
        if (arguments == null || arguments.length < expected) {
            alert(MISSING_ARGUMENTS.getWithHelp());
        }
    }
    
    public static void file(File file) {
        if (!file.exists()) {
            alert(FILE_NOT_FOUND.getWithHelp());
        } else if (!file.isDirectory()) {
            alert(MUST_BE_DIRECTORY.getWithHelp());
        }
    }
}
