package com.company.Annotation_2;

import java.lang.reflect.Method;

/**
 * The {@code Main} class serves as the entry point for the application, demonstrating
 * the usage of annotations and reflection with instances of {@code AnimeCharacter}.
 *
 * <h2>Key Functionalities:</h2>
 * <ul>
 *   <li>{@code testGetClassMethod()}: Demonstrates retrieving and printing class information
 *       of the passed {@code AnimeCharacter} instance.</li>
 *   <li>{@code extractClassType()}: Extracts and holds the class type of a given object.</li>
 *   <li>{@code testAnnotationCheckerClass()}: Checks and prints annotation names for
 *       the given {@code AnimeCharacter} instances.</li>
 * </ul>
 *
 * <h3>Imported Classes Explanation:</h3>
 * <ul>
 *   <li>{@code java.lang.reflect.Method}: Represents a method that can be invoked on an object
 *       at runtime using reflection, allowing access to method details and invocation.</li>
 * </ul>
 */
@Preamble(date = "16/10/2024", author = "Goku", currentRevision = 1, lastModified = "N\\A", reviewers = "Vegeta")
public class Main {

    /**
     * This method retrieves and prints the class information of the passed {@code AnimeCharacter} instance.
     *
     * @param animeCharacter the {@code AnimeCharacter} instance whose class information is displayed.
     */
    public void testGetClassMethod(AnimeCharacter animeCharacter) {
        System.out.println("From testGetClassMethod() method: ");
        System.out.println(animeCharacter.getClass()); // Prints the Class object for animeCharacter
        System.out.println(animeCharacter.getClass().getName()); // Prints the fully qualified name of the class
        System.out.println("Class name: " + animeCharacter.getClass().getSimpleName() + "\n"); // Prints simple class name
    }

    /**
     * This method extracts and holds the class type of the given object.
     *
     * @param object the object whose class type is extracted.
     */
    public void extractClassType(Object object) {
        Class<?> clazz = object.getClass(); // Retrieves the Class object of the passed object
    }

    /**
     * This method checks and prints annotation names for the given {@code AnimeCharacter} instances.
     *
     * @param animeCharacter the first {@code AnimeCharacter} instance.
     * @param animeCharacter1 the second {@code AnimeCharacter} instance.
     */
    public void testAnnotationCheckerClass(AnimeCharacter animeCharacter, AnimeCharacter animeCharacter1) {
        AnnotationChecker.getMethodAnnotationNames(animeCharacter); // Check annotations on methods of animeCharacter
        AnnotationChecker.getClassAnnotationNames(animeCharacter1); // Check annotations on class of animeCharacter1
    }

    /**
     * The main method serves as the application's entry point, creating instances of
     * {@code AnimeCharacter}, and invoking various methods to demonstrate functionality.
     *
     * @param args command-line arguments.
     */
    public static void main(String[] args) {
        Main main = new Main();
        AnimeCharacter goku = new Goku("Goku"); // Creating an instance of Goku
        AnimeCharacter vegeta = new Vegeta("Vegeta"); // Creating an instance of Vegeta

        // Calling various test methods
        main.testGetClassMethod(goku);
        main.extractClassType(vegeta);
        main.testAnnotationCheckerClass(goku, vegeta);

        // Calling all methods of the goku instance
        CallMethod.callAllMethods(goku);
    }
}
