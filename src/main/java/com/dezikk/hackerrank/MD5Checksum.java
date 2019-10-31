package com.dezikk.hackerrank;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.xml.bind.DatatypeConverter;

public class MD5Checksum {
    public boolean isFilesEqual(String pathToFirstFile, String pathToSecondFile)
            throws NoSuchAlgorithmException, IOException {
        return getFileMD5Checksum(pathToFirstFile).equals(getFileMD5Checksum(pathToSecondFile));
    }

    public String getFileMD5Checksum(String pathToFile)
            throws NoSuchAlgorithmException, IOException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(Files.readAllBytes(Paths.get(pathToFile)));
        byte[] digest = md.digest();
        return DatatypeConverter
                .printHexBinary(digest).toUpperCase();

    }
}
