package com.finworkserp.utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties;

    static {

        try {
            String path = "configuration.properties";
            FileInputStream inputFile = new FileInputStream(path);

            properties = new Properties();
            properties.load(inputFile);

            inputFile.close();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static String get(String keyName){
        return properties.getProperty(keyName);
    }

}
