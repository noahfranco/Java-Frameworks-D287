package com.example.demo.validators;

import com.example.demo.domain.Part;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class InventoryValidator implements ConstraintValidator<ValidInventory, Part> {
    @Override
    public void initialize(ValidInventory constraintAnnotation) {
    }

    @Override
    public boolean isValid(Part part, ConstraintValidatorContext constraintValidatorContext) {
        int minVal = part.getMinInv();
        int maxVal = part.getMaxInv();
        int inventory = part.getInv();

        // enforce that the inventory is between or at the minimum and maximum value.
        if (inventory < minVal) {
            constraintValidatorContext.buildConstraintViolationWithTemplate("Invalid inventory is less than the required minimum inventory value.").addConstraintViolation();

            return false;
        } else if (inventory > maxVal) {
            constraintValidatorContext.buildConstraintViolationWithTemplate("Invalid inventory is greater than the required maximum inventory value").addConstraintViolation();

            return false;
        }

        return true;
    }
}
