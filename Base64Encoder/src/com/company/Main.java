package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Base64;

public class Main {

    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(new File("enc.txt"));
        byte[] arrIn = new byte[70000];
        int l = inputStream.read(arrIn, 0, 70000);
        arrIn = Arrays.copyOfRange(arrIn, 0, l);
        byte arrOut[] = Base64.getMimeDecoder().decode(arrIn);
        FileOutputStream outputStream = new FileOutputStream(new File("pic.jpg"));
        outputStream.write(arrOut, 0, arrOut.length);
        inputStream.close();
        outputStream.close();
    }
}
