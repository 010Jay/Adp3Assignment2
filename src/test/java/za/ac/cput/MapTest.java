package za.ac.cput;

/*
  Author: Jason Jaftha 217009301
  Description: Methods and Test cases for the Map interface.
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class MapTest {

    //Attributes
        Map<Integer ,String> personMap = new HashMap<>();

    @BeforeEach
    void setUp() {

        //Add method | Add 3 people to the personMap
            personMap.put(1, "Jon");
            personMap.put(2, "Demon");
            personMap.put(3, "Niklaus");
    }

    @Test
    public void testAdd()
    {
        int size = personMap.size();

        for(int i = 1; i <= size; i++) //Display personMap
        {
            System.out.println(personMap.get(i));
        }

        assertEquals(3, size); //Expect 3 elements
    }

    @Test
    public void testRemove()
    {
        //Remove method | remove the 3 person "Nicklaus Mikaelson"
            personMap.remove(3);

        int size = personMap.size();

        for(int i = 1; i <= size; i++) //Display personMap
        {
            System.out.println(personMap.get(i));
        }

        assertEquals(2, size);
    }

    @Test
    public void testFind()
    {
        String source = "Jon";
        boolean found = personMap.containsValue(source);

        if(found)
        {
            System.out.println("The name " + source + " does exist in the personMap.");
        }
        else
        {
            System.out.println("The name " + source + " does not exist in the personMap.");
        }

        assertTrue( found);
    }
}
