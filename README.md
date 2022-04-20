# :file_folder: Jenamer
Mass File Renamer developed in Java 17!

![example](https://user-images.githubusercontent.com/68431603/163689280-baca9f6e-e81d-4e03-a2f7-e4a13d8af086.gif)
<hr/><br>
### :pushpin: Objective
Solve the following situation: you have a directory with MANY disorganized files, how much time/effort would it take to rename them one by one? Jenamer renames all files based on a template name + separator + index.

:dart: Open:
- rename directories
- make separator optional
- allow setting the index position
- create a web(quarkus)/window(swing) version
<hr/><br>
### :link: Requirements
- Maven
- Java 8+
- Windows/Linux
- Terminal (console)
<hr/><br>
### :cd: Setup
1- Open pom.xml and configure your Java version on these lines:
```
<java.version>17</java.version>
<maven.compiler.source>17</maven.compiler.source>
<maven.compiler.target>17</maven.compiler.target>
```

2- Via terminal navigate to the Jenamer root directory and run `mvn install`
<hr/><br>
### :arrow_forward: How to use
`java -jar [jar path] [first argument] [second argument] [third argument]`

- First argument: full path to the target directory (if there are spaces you must enclose them in quotes)
- Second argument: template name, example -> "file"
- Third argument: index separator, example -> "-"

Example: `java -jar .\target\Jenamer-1.0-SNAPSHOT.jar "C:\Users\vitor\Desktop\Test" file -`
<hr/><br>
### :busts_in_silhouette: Do you want help me?

If you have any ideas or wish to contribute to the project, contact me on Twitter @foiovituh or send me a pull request! :)
