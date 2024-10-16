package com.company.Annotation_2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The {@code RunImmediately} annotation is used to indicate that a method or field should be executed or used immediately,
 * and it can specify how many times the action should be performed.
 *
 * <p>This annotation can be applied to both methods and fields due to the {@code @Target} meta-annotation which specifies
 * {@code ElementType.FIELD} and {@code ElementType.METHOD}.
 *
 * <p>The {@code Retention} policy is set to {@code RUNTIME}, meaning that this annotation will be available at runtime
 * through reflection.
 *
 * <p>The {@code RunImmediately} annotation includes one element, {@code times}, which specifies how many times the
 * annotated method or field should be executed or accessed.
 *
 * <p>This annotation could be useful in cases where a method or field needs to be executed repeatedly upon initialization
 * or at a specific event.
 *
 * <p>For example, if you want a method to run immediately a certain number of times after an object is created, you can
 * annotate the method with {@code @RunImmediately(times = 5)}, and it will execute five times.
 *
 * <h2>Imported Classes:</h2>
 *
 * <ul>
 *   <li>{@code ElementType} (from {@code java.lang.annotation.ElementType}):
 *   <br>Used to specify the kinds of elements an annotation type can be applied to, like methods or fields.
 *   In this case, {@code ElementType.FIELD} and {@code ElementType.METHOD} are specified, meaning the annotation can be
 *   used on fields and methods.
 *   </li>
 *
 *   <li>{@code Retention} (from {@code java.lang.annotation.Retention}):
 *   <br>Indicates how long annotations with the annotated type are to be retained. In this case, {@code RetentionPolicy.RUNTIME}
 *   means that the annotation will be available at runtime, allowing it to be accessed through reflection.
 *   </li>
 *
 *   <li>{@code Target} (from {@code java.lang.annotation.Target}):
 *   <br>Used to specify where this annotation can be applied, such as to fields, methods, or classes. Here, it specifies
 *   that the annotation can be applied to fields and methods using {@code ElementType.FIELD} and {@code ElementType.METHOD}.
 *   </li>
 * </ul>
 *
 */
@Preamble(date = "16/10/2024", author = "Goku", currentRevision = 1, lastModified = "N\\A", reviewers = "Vegeta")
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface RunImmediately {

    /**
     * The {@code times} element specifies how many times the annotated method or field should be executed or accessed.
     *
     * @return the number of times to run the method or access the field.
     */
    int times();
}
