package org.ralasafe.encrypt;

import org.apache.commons.codec.binary.Base64;

/**
 * Need <code>org.apache.commons.codec.binary.Base64</code> as a libary.
 */
public class Base64Encrypt implements Encrypt {
    public String encrypt(String rawTxt) {
        if (rawTxt == null) {
            return null;
        }

        return new String(Base64.encodeBase64(rawTxt.getBytes()));
    }
}
