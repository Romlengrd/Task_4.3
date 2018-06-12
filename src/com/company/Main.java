package com.company;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get("src\\com\\company\\file.txt")),  Charset.forName("UTF-8"));
        System.out.println(content);

        File file2 = new File("src\\com\\company\\file2.txt");
        file2.createNewFile();
        try (OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream("src\\com\\company\\file2.txt"), "utf-16")) {
            out.write(content);
        }



    }
}

