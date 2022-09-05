package com.tahmid;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author Tahmidul Islam
 */
public class Customer {
    private String firstName;
    @NotNull(message = "is Required")
    @Size(min=3)
    private String lastName;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
