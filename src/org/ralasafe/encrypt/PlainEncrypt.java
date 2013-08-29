package org.ralasafe.encrypt;


/**
 * Don't encrypt. Return rawtxt.
 *
 */
public class PlainEncrypt implements Encrypt {
	public String encrypt( String rawTxt ) {
		return rawTxt;
	}
}
