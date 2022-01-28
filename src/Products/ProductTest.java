package Products;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class ProductTest {

    @Test
    public void checkExpiredTest()
    {
        Date d1 = new Date(2025,10,10);
        Product p1 = new Product("A1",100,d1);
        assertFalse(p1.checkExpired());

    }
}
