package com.yashi.util;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    private static final String URL="jdbc:postgresql://localhost:5432/sqlpractise";
    private static final String USER="postgres";
    private static final String PASSWORD="postgres123";

    public static Connection getConnection() throws Exception{
        return DriverManager.getConnection(URL,USER,PASSWORD);
    }
}