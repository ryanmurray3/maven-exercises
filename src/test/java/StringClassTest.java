import ryanmurray.StringClass;

import org.junit.Test;

public class StringClassTest {

    //for testing all methods are public and not static and are void
    @Test
    public void test1StringIsString() {
        StringClass s = new StringClass();
        s.test1();
    }
    //test for true
    @Test
    public void test2StringBooleanTrue() {
       assert(true);
    }

}
