package com.company.Understanding_getClass_Method;
import com.company.Annotation_2.AnimeCharacter;
import com.company.Annotation_2.Goku;
import com.company.Annotation_2.Preamble;
import com.company.Annotation_2.Vegeta;


/**
 * {@code Main} ক্লাসটি প্রোগ্রামটি চালানোর জন্য মেইন ক্লাস হিসেবে কাজ করে।
 * এখানে বিভিন্ন ক্লাসের কার্যকারিতা টেস্ট করা হয়।
 *
 * @author Taiyo Asano
 * @version 1.0
 */
@Preamble(date = "30/09/2024", author = "Taiyo", currentRevision = 1, lastModified = "N\\A", reviewers = "Vegeta")
public class Main {

    /**
     * {@code testGetClassMethod} মেথডটি {@code Animal} অবজেক্টের ক্লাস তথ্য প্রিন্ট করে।
     *
     * @param animal {@code Animal} অবজেক্ট
     */
    public void testGetClassMethod(AnimeCharacter animal) {
        System.out.println("From testGetClassMethod() method: ");
        System.out.println(animal.getClass());
        System.out.println(animal.getClass().getName());
        System.out.println("Class name: " + animal.getClass().getSimpleName() + "\n");
    }

    /**
     * {@code extractClassType} মেথডটি প্রদত্ত অবজেক্টের ক্লাস টাইপ বের করে।
     *
     * @param object যেকোনো অবজেক্ট
     */
    public void extractClassType(Object object) {
        Class<?> clazz = object.getClass();
    }

    /**
     * {@code testTaiyoListClass} মেথডটি {@code TaiyoList} এর কার্যকারিতা টেস্ট করে।
     */

    /**
     * {@code testAnnotationCheckerClass} মেথডটি {@code AnnotationChecker} এর কার্যকারিতা টেস্ট করে।
     *
     * @param animal {@code Animal} অবজেক্ট
     * @param animal1 আরেকটি {@code Animal} অবজেক্ট
     */


    /**
     * মেইন মেথডটি পুরো প্রোগ্রামটি চালানোর জন্য ব্যবহৃত হয়।
     *
     * @param args কমান্ড লাইন আর্গুমেন্ট
     */
    public static void main(String[] args) {
        Main main = new Main();
       Goku myCat = new Goku("Stella");
        Vegeta myDog = new Vegeta("Tommy");

        main.testGetClassMethod(myCat);
        main.extractClassType(myDog);

        AnimeCharacter.callAllMethods(myCat);

    }
}
