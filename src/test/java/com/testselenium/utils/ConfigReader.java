package com.testselenium.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader
{
    private static Properties properties = new Properties();

    static {
        try (InputStream inputStream = new FileInputStream("src/main/resources/config.properties"))
        {
            properties.load(inputStream);
        }catch(IOException e)
        {
            e.printStackTrace();
            throw new RuntimeException("config.properties dosyası yüklenemedi.");
        }
    }

    public static String getProperty(String key)
    {
        return properties.getProperty(key);
    }
}