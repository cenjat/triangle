package cn.tju.test;

/**
 * Created by shui on 2016/3/18.
 */
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;
@RunWith(Parameterized.class)
public class TestScalene extends TestTemple {
    public TestScalene(int a, int b, int c, boolean e) {
        super(a, b, c, e);
    }
    @Parameterized.Parameters
    public static Collection<Object[]> getData(){
        return Arrays.asList(new Object[][]{
                {1,1,2,false},
                {2,3,5,false},
                {1,1,1,false},
                {2,2,8,false},
                {3,4,5,true}

        });
    }
    @Test
    public void testScalene() {
        assertEquals(this.getExpected(),this.getTriangle().isScalene());
    }
}
