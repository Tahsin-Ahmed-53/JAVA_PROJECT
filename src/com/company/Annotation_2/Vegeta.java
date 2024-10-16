package com.company.Annotation_2;

/**
 * The {@code Vegeta} class implements the {@code AnimeCharacter} interface and represents another iconic anime character.
 * Similar to the {@code Goku} class, {@code Vegeta} has a name, current form, and power level.
 *
 * <p>This class demonstrates the use of custom annotations such as {@link VeryImportant} to indicate significant aspects
 * of the class.
 *
 * <p>The {@code VeryImportant} annotation is applied to the constructor to highlight the importance of the initialization
 * of the {@code name} field.
 *
 * <p>The {@code currentForm} and {@code PowerLevel} methods implement the behavior of Vegeta as an anime character.
 */
@Preamble(
        date = "16/10/2024",
        author = "Goku",
        currentRevision = 1,
        lastModified = "N\\A",
        reviewers = {"Vegeta"}
)
public class Vegeta implements AnimeCharacter {

    /**
     * The {@code name} field represents the name of the anime character Vegeta.
     */
    String name;

    /**
     * Constructor for creating a {@code Vegeta} object with a specified name.
     * This constructor is marked with the {@link VeryImportant} annotation to indicate its critical importance in initializing Vegeta's name.
     *
     * @param name The name of the character.
     */
    @VeryImportant
    public Vegeta(String name) {
        this.name = name;
    }

    /**
     * Displays the current form of Vegeta. This method prints "ultra ego".
     */
    @Override
    public void currentForm() {
        System.out.println("ultra ego");
    }

    /**
     * Displays the power level of Vegeta. This method prints "4999999".
     */
    @Override
    public void PowerLevel() {
        System.out.println("4999999");
    }
}
