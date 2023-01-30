package edu.escuelait.tienda.validators;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = CUITValidator.class)
@Target( { ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface CUIT {
   String message() default "Invalid CUIT Number";
   Class<?>[] groups() default {};
   Class<? extends Payload>[] payload() default {};
}

