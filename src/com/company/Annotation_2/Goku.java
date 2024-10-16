package com.company.Annotation_2;

import com.company.annotation.VeryImportant;

/**
 * The {@code Goku} class implements the {@code AnimeCharacter} interface and represents a character from anime with
 * certain characteristics like name, current form, and power level.
 *
 * <p>This class demonstrates the use of custom annotations like {@link VeryImportant} to mark certain fields as crucial.
 *
 * <p>Annotations:
 * <ul>
 *     <li>{@link Preamble} is used at the class level to document metadata about the class like author, date, and reviewers.</li>
 *     <li>{@link VeryImportant} is used to mark the {@code name} field as critical.</li>
 * </ul>
 *
 * <p>For example, the {@code Goku} class has a {@link VeryImportant} annotation applied to the {@code name} field.
 * This indicates that the name of Goku is considered very important in the context of the class functionality.
 *
 * <p>The {@code currentForm} and {@code PowerLevel} methods implement the functionality defined by the {@code AnimeCharacter}
 * interface, allowing this class to exhibit the behavior of an anime character.
 */
@Preamble(
        date = "16/10/2024",
        author = "Goku",
        currentRevision = 1,
        lastModified = "N\\A",
        reviewers = {"Vegeta"}
)
public class Goku implements AnimeCharacter {

    /**
     * The {@code name} field represents the name of the anime character Goku.
     * It is marked with the {@link VeryImportant} annotation to indicate its critical importance.
     */
    @VeryImportant
    public String name;

    /**
     * Constructor for creating a {@code Goku} object with a specified name.
     *
     * @param name The name of the character.
     */
    public Goku(String name) {
        this.name = name;
    }

    /**
     * Displays the current form of Goku. This method prints "ultra instinct".
     */
    @Override
    public void currentForm() {
        System.out.println("ultra instinct");
    }

    /**
     * Displays the power level of Goku. This method prints "5000001".
     */
    @Override
    public void PowerLevel() {
        System.out.println("5000001");
    }
}
