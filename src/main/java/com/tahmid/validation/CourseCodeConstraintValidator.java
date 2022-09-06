package com.tahmid.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author Tahmidul Islam
 */
public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode,String> {
    private String coursePrefix;

    @Override
    public void initialize(CourseCode theCourseCode) {
        coursePrefix = theCourseCode.value();
    }

    @Override
    public boolean isValid(String theCode,
                           ConstraintValidatorContext constraintValidatorContext) {

        boolean result = false;

        if(theCode!=null && theCode.startsWith("ICE"))
            result = true;
        return result;
    }
}
