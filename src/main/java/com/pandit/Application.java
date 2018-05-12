package com.pandit;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.File;

public class Application {

    ObjectMapper mapper = new ObjectMapper(new YAMLFactory());

    public static void main(String[] args) throws Exception{
        Application application = new Application();
        CardMemberNames cardMemberNames = application.readNames();
    }

    private CardMemberNames readNames() throws Exception{
        ClassLoader classLoader = getClass().getClassLoader();
        return mapper.readValue( new File( classLoader.getResource("recepientnames.yml").getFile() ), CardMemberNames.class );
    }
}
