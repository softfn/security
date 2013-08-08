package org.ralasafe.encrypt;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * Use MD5 encrypt, then hex to string.
 * Need: <code>org.apache.commons.codec.digest.DigestUtils</code> as libary.
 */
public class Md5Encrypt implements Encrypt {
    public String encrypt(String rawTxt) {
        if (rawTxt == null) {
            return null;
        }
        return DigestUtils.md5Hex(rawTxt);
    }
}
