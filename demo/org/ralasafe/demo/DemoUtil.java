package org.ralasafe.demo;

import java.sql.Connection;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

import org.ralasafe.db.DBPower;

public class DemoUtil {

    public static Connection getConnection() {
        return DBPower.getConnection(DBPower.getDefaultAppDsName());
    }

//	public static String getMessage(Locale locale, String key) {
//		return ResourceBundle.getBundle("demo", locale).getString(key);
//	}
//
//	public static String getMessage(Locale locale, String key, String argument) {
//		ResourceBundle rb = ResourceBundle.getBundle("demo", locale);
//		return MessageFormat.format(rb.getString(key),
//				new Object[] { argument });
//	}
}
