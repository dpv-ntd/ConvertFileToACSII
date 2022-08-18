package com.entyd.ConvertFileToACSII;

import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author ENTYD
 */
public class Until {

    public static byte[] getFile(String url) {
        try {
            FileInputStream fis = new FileInputStream(url);
            byte[] ab = new byte[fis.available()];
            fis.read(ab, 0, ab.length);
            fis.close();
            return ab;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
