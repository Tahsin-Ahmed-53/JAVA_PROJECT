package com.company.Annotation_2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * The {@code AnnotationChecker} class provides methods to retrieve and display annotations
 * associated with classes, fields, and methods of {@code AnimeCharacter} instances.
 *
 * <h2>Key Functionalities:</h2>
 * <ul>
 *   <li>{@code getClassAnnotationNames()}: Retrieves and prints the annotations applied to
 *       the class of the given {@code AnimeCharacter} instance.</li>
 *   <li>{@code getFieldAnnotationNames()}: Retrieves and prints the annotations applied to
 *       the fields of the given {@code AnimeCharacter} instance.</li>
 *   <li>{@code getMethodAnnotationNames()}: Retrieves and prints the annotations applied to
 *       the methods of the given {@code AnimeCharacter} instance.</li>
 * </ul>
 *
 * <h3>Imported Classes Explanation:</h3>
 * <ul>
 *   <li>{@code java.lang.annotation.Annotation}: Represents a Java annotation.</li>
 *   <li>{@code java.lang.reflect.Field}: Represents a field of a class and provides access to
 *       the field's details and annotations.</li>
 *   <li>{@code java.lang.reflect.Method}: Represents a method of a class and provides access
 *       to the method's details and annotations.</li>
 * </ul>
 */
@Preamble(date = "16/10/2024", author = "Goku", currentRevision = 1, lastModified = "N\\A", reviewers = "Vegeta")
public class AnnotationChecker {

    /**
     * Retrieves and prints the annotations applied to the class of the given {@code AnimeCharacter} instance.
     *
     * @param animeCharacter the {@code AnimeCharacter} instance whose class annotations are displayed.
     */
    public static void getClassAnnotationNames(AnimeCharacter animeCharacter) {
        Annotation[] annotations = animeCharacter.getClass().getAnnotations(); // Get all annotations of the class
        for (Annotation annotation : annotations) {
            System.out.println("Class: " + animeCharacter.getClass().getSimpleName() + "    Annotation: " + annotation.annotationType().getSimpleName());
        }
    }

    /**
     * Retrieves and prints the annotations applied to the fields of the given {@code AnimeCharacter} instance.
     *
     * @param animeCharacter the {@code AnimeCharacter} instance whose field annotations are displayed.
     */
    public static void getFieldAnnotationNames(AnimeCharacter animeCharacter) {
        Field[] fields = animeCharacter.getClass().getDeclaredFields(); // Get all fields of the class
        for (Field field : fields) {
            Annotation[] annotations = field.getAnnotations(); // Get annotations of the field
            for (Annotation annotation : annotations) {
                System.out.println("Field: " + field.getName() + "     Annotation: " + annotation.annotationType().getSimpleName());
            }
        }
    }

    /**
     * Retrieves and prints the annotations applied to the methods of the given {@code AnimeCharacter} instance.
     *
     * @param animeCharacter the {@code AnimeCharacter} instance whose method annotations are displayed.
     */
    public static void getMethodAnnotationNames(AnimeCharacter animeCharacter) {
        System.out.println("\nGetting the method's names from " + animeCharacter.getClass().getSimpleName() + " class");
        Method[] methods = animeCharacter.getClass().getDeclaredMethods(); // Get all methods of the class
        for (Method method : methods) {
            Annotation[] annotations = method.getAnnotations(); // Get annotations of the method
            for (Annotation annotation : annotations) {
                System.out.println("Method: " + method.getName() + "     Annotation: " + annotation.annotationType().getSimpleName());
            }
        }
    }
}
