package cn.tju.test;

import cn.tju.triangle.Triangle;

/**
 * Created by shui on 2016/3/18.
 */
public class TestTemple {
    private int input1;
    private int input2;
    private int input3;
    private boolean expected ;
    private Triangle triangle;

    public TestTemple(int a, int b, int c, boolean e){
        input1 = a;
        input2  = b;
        input3 = c;
        expected = e;
        triangle = new Triangle(a,b,c);
    }
    public Triangle getTriangle(){
        return triangle;
    }
    public boolean getExpected(){
        return expected;
    }
}
