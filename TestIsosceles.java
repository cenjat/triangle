package cn.tju.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.*;
/**
 * Created by shui on 2016/3/18.
 */
@RunWith(Parameterized.class)
public class TestIsosceles extends TestTemple {

    public TestIsosceles(int a, int b, int c, boolean e){
        super(a,b,c,e);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getData(){
        return Arrays.asList(new Object[][]{
                {1,1,2,false},
                {2,3,5,false},
                {1,1,1,true},
                {2,2,8,false},
                {2,3,2,true}
        });
    }
    @Test
    public void testIso() {
        assertEquals(this.getExpected(),this.getTriangle().isIsosceles());
    }
}

