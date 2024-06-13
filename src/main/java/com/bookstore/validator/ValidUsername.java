package com.bookstore.validator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;
import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({TYPE,FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = ValidUsernameValidator.class)

public @interface ValidUsername {
    String message() default "ten dang nhap khong hop le";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
