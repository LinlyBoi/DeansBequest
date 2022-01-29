package Phonebook;

import org.junit.Test;

import static org.junit.Assert.*;

public class YellowPagesTest
{

    @Test
    public void totalNumbers()
    {
        YellowPages testPage = new YellowPages();
        testPage.insert("8105464654654678","Jeff");
        testPage.insert("81078979878974","Jefferson");
        testPage.insert("8104654654654654","Jeffery");
        testPage.insert("81265464654654654","Jef");
        assertEquals(4,testPage.TotalNumbers());
    }

    @Test
    public void percentage810()
    {
        YellowPages testPage = new YellowPages();
        testPage.insert("8105464654654678","Jeff");
        testPage.insert("81078979878974","Jefferson");
        testPage.insert("8104654654654654","Jeffery");
        testPage.insert("81265464654654654","Jef");
        assertEquals(75.0,testPage.percentage810(),0.1);
    }
}