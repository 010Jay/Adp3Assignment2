package za.ac.cput;

/*
  Author: Jason Jaftha 217009301
  Description: Methods and Test cases for the collection interface.
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

class CollectionTest {

    //Attributes
        Collection<String> dogCollection = new HashSet<>();

    @BeforeEach
    void setUp() {

        //Add method | add 3 dogs to the interface
            dogCollection.add("Mika");
            dogCollection.add("Bimbis");
            dogCollection.add("Hulk");
    }

    @Test
    public void testAdd()
    {
        int size = dogCollection.size();

        System.out.println(dogCollection);

        assertEquals(3, size); //Expects 3 elements
    }

    @Test
    public void testRemove()
    {
        //Remove method | remove dog 3 "Hulk"
            dogCollection.remove("Hulk");

        int size = dogCollection.size();

        System.out.println(dogCollection);

        assertEquals(2, size); //Expects 2 elements
    }

    @Test
    public void testFind()
    {
        String source = "Mika"; //Element(Dog) to be check if it does exist in the dogCollecton.
        boolean found = dogCollection.contains(source);

        if(found)
        {
            System.out.println("Your dog " + source + " does exist in the dogCollection.");
        }
        else
        {
            System.out.println("Your dog " + source + " does not exist in the dogCollection.");
        }

        assertTrue(found); //Expects true;
    }
}