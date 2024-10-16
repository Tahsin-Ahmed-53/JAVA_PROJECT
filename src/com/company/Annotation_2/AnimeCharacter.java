package com.company.Annotation_2;

/**
 * The {@code AnimeCharacter} interface represents a blueprint for all anime characters, defining key methods
 * like {@code PowerLevel} and {@code currentForm} that any implementing class must provide.
 *
 * <p>Classes like {@link Goku} and {@link Vegeta} implement this interface to define their unique power levels and forms.
 * Other classes can also implement this interface to model different anime characters.
 *
 * <p>This interface is annotated with the {@code @Preamble} annotation to provide additional metadata about its creation.
 *
 * <h2>Interface Methods:</h2>
 * <ul>
 *   <li>{@code PowerLevel()}: This method is intended to return the power level of the anime character when implemented.
 *   </li>
 *
 *   <li>{@code currentForm()}: This method is intended to print or return the current transformation form of the anime character.
 *   </li>
 * </ul>
 *
 * <h2>Static Methods:</h2>
 * <ul>
 *   <li>{@code callAllMethods(Goku myCat)}: This is a static utility method that currently does not perform any actions, but it can be
 *   modified to execute multiple methods on an instance of {@code Goku} or other classes implementing {@code AnimeCharacter}.
 *   </li>
 * </ul>
 *
 * <h2>Usage:</h2>
 * <p>Any class that implements {@code AnimeCharacter} must provide implementations for the methods {@code PowerLevel()}
 * and {@code currentForm()}.
 *
 * <p>For example:
 * <pre>
 * {@code
 * public class Goku implements AnimeCharacter {
 *     @Override
 *     public void PowerLevel() {
 *         System.out.println("Power Level: 5000001");
 *     }
 *     @Override
 *     public void currentForm() {
 *         System.out.println("Current Form: Ultra Instinct");
 *     }
 * }
 * }
 * </pre>
 *
 * <p>Likewise, other characters like {@link Vegeta} can provide their own implementations.
 *
 * <p>Annotated with {@code @Preamble} to document authorship and review details.
 */
@Preamble(date = "16/10/2024", author = "Goku", currentRevision = 1, lastModified = "N\\A", reviewers = "Vegeta")

public interface AnimeCharacter {

    /**
     * Static method that currently does not perform any actions.
     *
     * <p>It is designed to accept a {@code Goku} object, and could be extended to call multiple methods on that object.
     *
     * @param myCat the instance of {@code Goku} on which methods could be called
     */
    static void callAllMethods(Goku myCat) {
        // Currently empty but can be used to call methods on Goku instance
    }

    /**
     * This method should be implemented by classes to define the power level of the anime character.
     */
    public void PowerLevel();

    /**
     * This method should be implemented by classes to define the current form (or transformation) of the anime character.
     */
    public void currentForm();
}
