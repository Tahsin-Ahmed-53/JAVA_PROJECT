package com.company.Annotation_2;

/**
 * The {@code Trunks} class represents a character from the Anime world, implementing the {@code AnimeCharacter} interface.
 * This class demonstrates the use of annotations like {@code VeryImportant} and {@code RunImmediately} on fields and methods.
 *
 * <h2>Class Details:</h2>
 * <ul>
 *   <li>{@code Trunks} has a field {@code name} which stores the name of the character.</li>
 *   <li>The constructor is marked with {@code @VeryImportant}, indicating the importance of creating a {@code Trunks} object.</li>
 *   <li>The method {@code PowerLevel()} is annotated with {@code @RunImmediately(times = 3)}, meaning it will run 3 times when triggered.</li>
 * </ul>
 *
 * <h2>Annotations Used:</h2>
 * <ul>
 *   <li>{@code @VeryImportant}: Marks the constructor as crucial in this class.</li>
 *   <li>{@code @RunImmediately(times = 3)}: Indicates that the {@code PowerLevel()} method should be executed 3 times upon invocation.</li>
 * </ul>
 *
 * <h2>Example:</h2>
 * <pre>{@code
 * Trunks trunks = new Trunks("Trunks");
 * trunks.currentForm();   // Output: Super saiyan
 * trunks.PowerLevel();    // Output: 100000 (3 times)
 * }</pre>
 *
 * @author Taiyo Asano
 * @date 16/10/2024
 */
public class Trunks implements AnimeCharacter {
    String name;

    /**
     * Constructs a new {@code Trunks} object with the specified name.
     *
     * @param name The name of the character.
     */
    @VeryImportant
    public Trunks(String name) {
        this.name = name;
    }

    /**
     * Prints the current form of Trunks.
     * Output: "Super saiyan"
     */
    @Override
    public void currentForm() {
        System.out.println("Super saiyan");
    }

    /**
     * Prints the power level of Trunks.
     * This method will run 3 times due to the {@code @RunImmediately(times = 3)} annotation.
     * Output: "100000" (printed 3 times)
     */
    @Override
    @RunImmediately(times = 3)
    public void PowerLevel() {
        System.out.println("100000");
    }
}
