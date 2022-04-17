package com.github.foiovituh.jenamer.validation;

import com.github.foiovituh.jenamer.io.Help;
import static com.github.foiovituh.jenamer.validation.Message.DIRECTORY_NOT_FOUND;
import static com.github.foiovituh.jenamer.validation.Message.MISSING_ARGUMENTS;
import static com.github.foiovituh.jenamer.validation.Message.MUST_BE_DIRECTORY;
import java.io.File;
import java.util.stream.Stream;

public final class Validator {
    private Validator() {}
    
    public static void alert(String message) {
        System.out.println(message);
        System.exit(0);
    }
    
    public static void arguments(String[] arguments, int expected) {
        Stream.of(arguments).findFirst().ifPresent(Help::showReadmeMd);
        
        if (arguments.length < expected) {
            alert(MISSING_ARGUMENTS.getWithHelp());
        } 
    }
    
    public static void file(File file) {
        if (!file.exists()) {
            alert(DIRECTORY_NOT_FOUND.getWithHelp());
        } else if (!file.isDirectory()) {
            alert(MUST_BE_DIRECTORY.getWithHelp());
        }
    }
}
