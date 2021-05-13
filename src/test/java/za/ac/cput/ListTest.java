package za.ac.cput;

/*
  Author: Jason Jaftha 217009301
  Description: Methods and Test cases for the List interface.
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class ListTest {

    List<String> employeeList = new ArrayList<>();

    @BeforeEach
    void setUp(){

        //Add method | Add 3 employees to the employeeList
            employeeList.add("Bob");
            employeeList.add("Elena");
            employeeList.add("Sofia");
    }

    @Test
    public void testAdd()
    {
        int size = employeeList.size();

        System.out.println(employeeList);

        assertEquals(3, size); //Expects 3 elements
    }

    @Test
    public void testRemove()
    {
        //Remove method | remove element 1 "Bob" from the employeeList
            employeeList.remove("Bob");

        int size = employeeList.size();

        System.out.println(employeeList);

        assertEquals(2, size); //Expects 2 elements
    }

    @Test
    public void testFind()
    {
        String source = "Elena"; //Element(Elena) to be check if it does exist in the employeeList.
        boolean found = employeeList.contains(source);

        if(found)
        {
            System.out.println("The employee " + source + " does exist in the employeeList.");
        }
        else
        {
            System.out.println("The employee " + source + " does not exist in the employeeList.");
        }

        assertTrue(found); //Expects true;

    }
}
