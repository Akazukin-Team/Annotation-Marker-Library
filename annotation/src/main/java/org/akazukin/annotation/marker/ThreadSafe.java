package org.akazukin.annotation.marker;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marks a class, method, or field as thread-safe.
 * <p>
 * A thread-safe class or element can be accessed by multiple threads concurrently
 * without requiring external synchronization.
 * This annotation serves as a documentation tool to indicate thread safety in design
 * but does not enforce or guarantee thread safety at runtime.
 * <p>
 * This annotation is retained in the compiled class files
 * but is not accessible at runtime via reflection.
 */
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
public @interface ThreadSafe {
}
