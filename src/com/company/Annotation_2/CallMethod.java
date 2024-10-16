package com.company.Annotation_2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * The {@code CallMethod} class provides functionality to invoke methods of {@code AnimeCharacter}
 * objects using reflection. It also includes the ability to handle custom annotations like
 * {@code RunImmediately} to run methods multiple times based on annotation values.
 *
 * <h2>Key Functionalities:</h2>
 * <ul>
 *   <li>{@code callAllMethods()}: Invokes all methods of the passed {@code AnimeCharacter} instance.</li>
 *   <li>{@code RunImmediately()}: Executes a method multiple times if the {@code RunImmediately} annotation is present.</li>
 * </ul>
 *
 * <h3>Imported Classes Explanation:</h3>
 * <ul>
 *   <li>{@code java.lang.reflect.InvocationTargetException}: Handles exceptions thrown by invoked methods via reflection.</li>
 *   <li>{@code java.lang.reflect.Method}: Represents a method that can be invoked on an object at runtime using reflection.</li>
 * </ul>
 */
@Preamble(date = "16/10/2024", author = "Goku", currentRevision = 1, lastModified = "N\\A", reviewers = "Vegeta")
public class CallMethod {

    /**
     * This method retrieves and calls all declared methods of the {@code AnimeCharacter} class
     * using reflection.
     *
     * @param animeCharacter the {@code AnimeCharacter} instance whose methods are invoked.
     * @throws RuntimeException if the invoked methods throw exceptions.
     */
    public static void callAllMethods(AnimeCharacter animeCharacter) {
        try {
            Method methods[] = animeCharacter.getClass().getDeclaredMethods();

            for (Method method : methods) {
                System.out.println("\nCalling the " + method.getName() + " method of "
                        + animeCharacter.getClass().getSimpleName() + " class in a different way\n");
                System.out.println(method.getName() + "() -->");
                method.invoke(animeCharacter);
            }
        } catch (InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * This method checks if a method is annotated with {@code RunImmediately}. If so, it invokes
     * the method the number of times specified by the annotation's {@code times} value.
     *
     * @param animeCharacter the {@code AnimeCharacter} instance whose annotated method is invoked.
     * @param method the method to be invoked if annotated with {@code RunImmediately}.
     * @throws InvocationTargetException if the invoked method throws an exception.
     * @throws IllegalAccessException if the method cannot be accessed.
     */
    public static void RunImmediately(AnimeCharacter animeCharacter, Method method) throws InvocationTargetException, IllegalAccessException {
        // Check if the method is annotated with @RunImmediately
        if (method.isAnnotationPresent(RunImmediately.class)) {
            // Get the @RunImmediately annotation
            RunImmediately annotation = method.getAnnotation(RunImmediately.class);

            try {
                // Invoke the method the number of times specified in the annotation
                for (int i = 0; i < annotation.times(); i++) {
                    method.invoke(animeCharacter);
                }
            } catch (InvocationTargetException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
