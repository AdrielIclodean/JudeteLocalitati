package com.volkswagenag.dqm.rest.DorisUpload.app.xmlParse;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.volkswagenag.dqm.rest.DorisUpload.Data.Config;
import com.volkswagenag.dqm.rest.DorisUpload.app.Catalogue;
import com.volkswagenag.dqm.rest.DorisUpload.app.City;

import java.io.File;
import java.io.IOException;
import java.util.Comparator;

public class ParseCities {
    public static void main(String[] args) {

        try {
            ObjectMapper xmlMapper = new XmlMapper()
                    .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

            File xmlFile = new File("judeteLocalitatiAdr.xml");
            Catalogue value = xmlMapper.readValue(xmlFile, Catalogue.class);

            System.out.println(value);
            System.out.println("Toate judetele");

            value.getDistricts().forEach(e -> System.out.println(e.getCode() + " - " + e.getName()));

            System.out.println("-----------------");

            System.out.println("Orasele pentru judetul Cluj");
            value.getCities().stream()
                    .filter(e -> e.getDistrict().equals("CJ"))
                    .sorted(Comparator.comparing(City::getName))
                    .map(City::getName)
                    .distinct()
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
