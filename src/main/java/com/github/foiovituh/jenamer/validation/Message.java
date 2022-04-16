package com.github.foiovituh.jenamer.validation;

public enum Message {
    FILE_NOT_FOUND("File not found"),
    MISSING_ARGUMENTS("Missing arguments"),
    HELP("! For more information, type --help."),
    MUST_BE_DIRECTORY("The first argument must be the path of a directory");
    
    private final String message;
    
    Message(String message) {
        this.message = message;
    }
    
    public String get() {
        return message;
    }
    
    public String getWithHelp() {
        return message + HELP.get();
    }
}
