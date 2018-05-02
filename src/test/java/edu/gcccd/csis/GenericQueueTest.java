package edu.gcccd.csis;

import org.junit.Test;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;


public class GenericQueueTest
{
    @Test
    public void StarbucksCustomers()
    {
        GenericQueue<String> customerNames = new GenericQueue<>();
        String[] customers = {"Mozart", "Beethoven","Bach"};

        for (String customer: customers)
        {
            customerNames.enqueue(customer);
        }

        assertEquals(3, customerNames.length());

        assertEquals("Mozart", customerNames.dequeue() );
        assertEquals(2, customerNames.length());

        assertEquals("Beethoven", customerNames.dequeue() );
        assertEquals(1, customerNames.length());

        assertEquals("Bach", customerNames.dequeue() );
        assertEquals(0, customerNames.length());

        assertTrue(customerNames.isEmpty());
        assertNull(customerNames.dequeue());


    }

    @Test
    public void StarbucksNumbers()
    {
        GenericQueue<Integer> customerNumbers = new GenericQueue<>();
        int [] customers = {432,678,27};

        for (int customer: customers)
        {
            customerNumbers.enqueue(customer);
        }

        assertEquals(3, customerNumbers.length());

        assertEquals(Integer.valueOf(432), customerNumbers.dequeue() );
        assertEquals(2, customerNumbers.length());

        assertEquals(Integer.valueOf(678), customerNumbers.dequeue() );
        assertEquals(1, customerNumbers.length());

        assertEquals(Integer.valueOf(27), customerNumbers.dequeue() );
        assertEquals(0, customerNumbers.length());

        assertTrue(customerNumbers.isEmpty());
        assertNull(customerNumbers.dequeue());

    }

}
