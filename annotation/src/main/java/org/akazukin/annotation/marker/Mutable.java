package org.akazukin.annotation.marker;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marks a class or field as mutable.
 * <p>
 * A mutable class or element can be changed after the object is constructed.
 * This annotation serves as a documentation tool to indicate mutable in design.
 * <p>
 * This annotation is retained in the compiled class files
 * but is not accessible at runtime via reflection.
 */
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.FIELD})
public @interface Mutable {
}
