package za.ac.cput;

/*
  Author: Jason Jaftha 217009301
  Description: Methods and Test cases for the Set interface.
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class SetTest {

    //Attributes
        Set<String> animalSet = new HashSet<>();

    @BeforeEach
    void setUp(){

        //Add method | Add 3 types of animals to the animalSet
            animalSet.add("Dog");
            animalSet.add("Cat");
            animalSet.add("Wolf");
    }

    @Test
    public void testAdd()
    {
        int size = animalSet.size();

        System.out.println(animalSet);

        assertEquals(3, size); //Expect 3 elements
    }

    @Test
    public void testRemove()
    {
        //Remove method | Remove element 3 "wolf" from the animalSet
            animalSet.remove("Wolf");

        int size = animalSet.size();

        System.out.println(animalSet);

        assertEquals(2, size); //Expect 2 elements
    }

    @Test
    public void testFind()
    {
        String source = "Wolf"; //Element(Wolf) to be check if it does exist in the animalSet.
        boolean found = animalSet.contains(source);

        if(found)
        {
            System.out.println("The animal " + source + " does exist in the animalSet.");
        }
        else
        {
            System.out.println("The animal " + source + " does not exist in the animalSet.");
        }

        assertTrue(found); //Expects true;
    }
}
