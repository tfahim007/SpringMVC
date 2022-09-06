package com.tahmid;

import com.tahmid.validation.CourseCode;

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

    @CourseCode
    private String courseCode;
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

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
}
