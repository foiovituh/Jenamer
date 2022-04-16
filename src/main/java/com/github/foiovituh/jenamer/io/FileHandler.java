package com.github.foiovituh.jenamer.io;

import com.github.foiovituh.jenamer.validation.Validator;
import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;
import static java.util.stream.Collectors.toSet;
import java.util.stream.Stream;

public class FileHandler {
    private static final String BAR = System.getProperties().getProperty("file.separator");
    private static final String FIRST_FILE_INDEX= "0";
    private final File element;
    private String path;
    
    public FileHandler(String element) {
        this.element = new File(element);
        
        Validator.file(this.element);
    }
    
    public void renameAllFilesTo(String template, String separator) {
        final AtomicInteger index = new AtomicInteger(0);
        
        Stream.of(element.listFiles())
                .filter(File::isFile)
                .collect(toSet())
                .forEach(file -> {
                    final String indexIncremented = String.valueOf(index.getAndIncrement());
                    final String extension = file.getName().substring(file.getName().lastIndexOf("."));
                    
                    if (FIRST_FILE_INDEX.equals(indexIncremented)) {
                        this.path = file.getParent() + BAR;
                    }
                    
                    file.renameTo(new File(path + template + separator + indexIncremented + extension));
                });
    }
}
