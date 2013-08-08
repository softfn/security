package org.ralasafe.encrypt;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * Use SHA encrypt, then hex to string.
 * Need <code>org.apache.commons.codec.digest.DigestUtils</code> as libary.
 */
public class ShaEncrypt implements Encrypt {
    public String encrypt(String rawTxt) {
        if (rawTxt == null) {
            return null;
        }
        return DigestUtils.shaHex(rawTxt);
    }
}
