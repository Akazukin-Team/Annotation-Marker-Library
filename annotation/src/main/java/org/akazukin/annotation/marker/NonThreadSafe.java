package org.akazukin.annotation.marker;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marks a class, method, or field as non-thread-safe.
 * <p>
 * A non-thread-safe class or element should not be accessed by multiple threads concurrently
 * without external synchronization.
 * This annotation serves as a documentation tool to indicate not thread safety in design.
 * <p>
 * This annotation is retained in the compiled class files
 * but is not accessible at runtime via reflection.
 */
@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.TYPE})
public @interface NonThreadSafe {
}
