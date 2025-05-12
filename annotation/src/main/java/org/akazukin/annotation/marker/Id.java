package org.akazukin.annotation.marker;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marks a field as an identifier.
 * <p>
 * A identifier field is generally treat as immutable.
 * This annotation serves as a documentation tool to indicate an identifier in design
 * but does not enforce or guarantee as an identifier or immutable at runtime.
 * <p>
 * This annotation is retained in the compiled class files
 * but is not accessible at runtime via reflection.
 */
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.FIELD})
public @interface Id {
}
