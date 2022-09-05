package com.tahmid;

import java.util.LinkedHashMap;

/**
 * @author Tahmidul Islam
 */
public class Student {
    private String firstName;
    private String lastName;
    private String country;
    private LinkedHashMap<String, String> countryOptions;
    private String[] favouriteLanguage;

    public Student(){
        countryOptions = new LinkedHashMap<>();

        countryOptions.put("IN","India");
        countryOptions.put("PAK","Pakistan");
        countryOptions.put("SL","Srilanka");
        countryOptions.put("AFG","Afghanistan");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    public String[] getFavouriteLanguage() {
        return favouriteLanguage;
    }

    public void setFavouriteLanguage(String[] favouriteLanguage) {
        this.favouriteLanguage = favouriteLanguage;
    }
}
