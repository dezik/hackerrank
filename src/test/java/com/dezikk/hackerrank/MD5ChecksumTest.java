package com.dezikk.hackerrank;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MD5ChecksumTest {
    MD5Checksum mD5Checksum = new MD5Checksum();

    @Test
    void testIsFilesEqual() throws IOException, NoSuchAlgorithmException {
        boolean result = mD5Checksum.isFilesEqual("src/main/resources/first.pdf",
                "src/main/resources/second.pdf");
        Assertions.assertEquals(true, result);
    }
}
