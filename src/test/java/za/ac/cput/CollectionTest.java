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
        Collection<String> dogCollection;

    @BeforeEach
    void setUp() {

        //Initialize
            dogCollection = new HashSet<>();

        //Add method | add 3 dogs to the interface
            dogCollection.add("Mika");
            dogCollection.add("Bimbis");
            dogCollection.add("Whitey");
    }

    @Test
    public void testAdd()
    {
        int size = dogCollection.size();
        assertEquals(3, size); //Expect 3 elements

        System.out.println(dogCollection);
    }

    @Test
    public void testRemove()
    {
        //Remove method | remove dog 3
            dogCollection.remove("Whitey");

        int size = dogCollection.size();
        assertEquals(2, size); //Expect 2 elements

        System.out.println(dogCollection);
    }

    @Test
    public void testFind()
    {
        String source = "Mika"; //Element to be check if it does exist in the dogCollecton.

        if(dogCollection.contains(source))
        {
            System.out.println("Your dog " + source + " does exist in the dogCollection.");
        }
        else
        {
            System.out.println("Your dog " + source + " does not exist in the dogCollection.");
        }
    }

}