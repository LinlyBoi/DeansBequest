package Phonebook;

import org.junit.Test;

import static org.junit.Assert.*;

public class PhonebookTest
{

    @Test
    public void insert()
    {
        PhoneNumber n1 = new PhoneNumber("81011111111","Medhat");
        Phonebook testBook = new Phonebook();
        assertTrue(testBook.insert(n1.getNumber(),n1.getNumber()));
        assertFalse(testBook.insert("1000000","hmm"));
        assertFalse(testBook.insert("000565656565656565656","Nm"));
        assertFalse(testBook.insert("2310456789","Nope"));
        assertFalse(testBook.insert(n1.getNumber(),n1.getNumber()));
    }

    @Test
    public void getPhoneNumber()
    {
        Phonebook testBook = new Phonebook();
        testBook.insert("71023748927398", "Jeff");
        String name = "Jeff";
        assertEquals(name, testBook.getName("71023748927398"));

    }

    @Test
    public void getName()
    {
        Phonebook testBook = new Phonebook();
        testBook.insert("810789987","Hamada");
        assertEquals("810789987", testBook.getPhoneNumber("Hamada"));
    }
}