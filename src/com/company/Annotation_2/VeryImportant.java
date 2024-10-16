package com.company.Annotation_2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The {@code VeryImportant} annotation marks constructors or methods as being critical for the functionality of the class.
 * It can be used to highlight methods or constructors that need special attention or carry significant importance in the code logic.
 *
 * <h2>Imported Classes:</h2>
 * <ul>
 *   <li>{@code import java.lang.annotation.ElementType}:
 *     This import is used to define where the annotation can be applied.
 *     In this case, the annotation can be used on constructors and methods by specifying {@code ElementType.CONSTRUCTOR} and {@code ElementType.METHOD}.
 *   </li>
 *   <li>{@code import java.lang.annotation.Retention}:
 *     This import defines how long the annotation should be retained. Here, the annotation is retained at runtime.
 *   </li>
 *   <li>{@code import java.lang.annotation.RetentionPolicy}:
 *     This defines the retention policy. {@code RetentionPolicy.RUNTIME} ensures that the annotation is available at runtime for reflection.
 *   </li>
 *   <li>{@code import java.lang.annotation.Target}:
 *     Specifies the types of elements (like methods, constructors) on which this annotation can be used.
 *     Here, the annotation can only be applied to constructors and methods.
 *   </li>
 * </ul>
 *
 * <h2>Annotation Details:</h2>
 * <ul>
 *   <li>{@code @Target({ElementType.CONSTRUCTOR, ElementType.METHOD})}:
 *     Restricts this annotation to be applied only to constructors and methods.</li>
 *   <li>{@code @Retention(RetentionPolicy.RUNTIME)}:
 *     Ensures that this annotation will be available during runtime through reflection.
 *   </li>
 * </ul>
 *
 * <h2>Usage Example:</h2>
 * <pre>{@code
 * @VeryImportant
 * public void criticalMethod() {
 *     // This method is important for the overall system logic
 * }
 * }</pre>
 */
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface VeryImportant {
}
