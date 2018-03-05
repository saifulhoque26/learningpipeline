package learningtests;

import items.*;
import org.junit.Assert;
import org.junit.Test;

public class itemsTest
{
    @Test
    public void test1()
    {
        items a = new items("jama", 5,5);
        Assert.assertEquals(a.getItemCount(),5);
    }
}
