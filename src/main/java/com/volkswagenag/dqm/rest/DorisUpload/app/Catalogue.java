package com.volkswagenag.dqm.rest.DorisUpload.app;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.ArrayList;
import java.util.List;

@JacksonXmlRootElement(localName = "Catalogue")
public class Catalogue {

    @JacksonXmlProperty(localName = "Country")
    @JacksonXmlElementWrapper(localName = "Countries")
    private List<Country> countries = new ArrayList<>();

    @JacksonXmlProperty(localName = "District")
    @JacksonXmlElementWrapper(localName = "Districts")
    private List<District> districts = new ArrayList<>();

    @JacksonXmlProperty(localName = "CityType")
    @JacksonXmlElementWrapper(localName = "CityTypes")
    private List<CityType> cityTypes = new ArrayList<>();

    @JacksonXmlProperty(localName = "City")
    @JacksonXmlElementWrapper(localName = "Cities")
    private List<City> cities = new ArrayList<>();

    public List<Country> getCountries() {
        return countries;
    }

    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }

    public List<District> getDistricts() {
        return districts;
    }

    public void setDistricts(List<District> districts) {
        this.districts = districts;
    }

    public List<CityType> getCityTypes() {
        return cityTypes;
    }

    public void setCityTypes(List<CityType> cityTypes) {
        this.cityTypes = cityTypes;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }
}
