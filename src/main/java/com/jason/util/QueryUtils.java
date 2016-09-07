package com.jason.util;

/**
 * @author jason, Moon
 * @since 2016. 9. 7.
 */
public class QueryUtils {
    public static String like(String property, String value) {
        return property + " LIKE CONCAT('%', '" + value + "', '%')";
    }
}
