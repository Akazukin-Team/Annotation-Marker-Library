package org.akazukin.annotation.marker;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marks a class or field as immutable.
 * <p>
 * An immutable class or element cannot be changed after the object is constructed.
 * This annotation serves as a documentation tool to indicate immutable in design
 * but does not enforce or guarantee immutable at runtime.
 * <p>
 * This annotation is retained in the compiled class files
 * but is not accessible at runtime via reflection.
 */
@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.TYPE, ElementType.FIELD})
public @interface Immutable {
}
