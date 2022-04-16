package com.github.foiovituh.jenamer;

import com.github.foiovituh.jenamer.io.FileHandler;
import com.github.foiovituh.jenamer.validation.Validator;

public final class Jenamer {
    private static final int CURRENT_NUMBER_OF_ARGUMENTS_REQUIRED = 3;
    
    public static void main(String[] args) {
        Validator.arguments(args, CURRENT_NUMBER_OF_ARGUMENTS_REQUIRED);
        new FileHandler(args[0]).renameAllFilesTo(args[1], args[2]);
    }
}
