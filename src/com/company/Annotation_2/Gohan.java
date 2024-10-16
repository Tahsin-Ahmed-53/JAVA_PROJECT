package com.company.Annotation_2;

/**
 * The {@code Gohan} class represents an Anime character from the Dragon Ball series.
 * This class implements the {@code AnimeCharacter} interface and demonstrates
 * the usage of custom annotations and methods.
 *
 * <h2>Character Details:</h2>
 * <ul>
 *   <li>{@code name} is the name of the character, which is initialized via the constructor.</li>
 *   <li>{@code currentForm()} method prints the current transformation form of Gohan.</li>
 *   <li>{@code PowerLevel()} method prints Gohan's power level and is annotated with {@code RunImmediately} to specify its repeated execution.</li>
 * </ul>
 */
public class Gohan implements AnimeCharacter {

    /** Name of the Anime character */
    public String name;

    /**
     * Constructor to initialize the name of the character.
     *
     * @param name Name of the character
     */
    public Gohan(String name) {
        this.name = name;
    }

    /**
     * Prints the current form of Gohan.
     * This method is marked as very important with the {@code VeryImportant} annotation.
     */
    @Override
    public void currentForm() {
        System.out.println("Beast Gohan");
    }

    /**
     * Prints the power level of Gohan.
     * This method uses the {@code RunImmediately} annotation to specify it should run multiple times.
     */
    @Override
    @RunImmediately(times = 3)
    public void PowerLevel() {
        System.out.println("Power level : 5000000");
    }
}
