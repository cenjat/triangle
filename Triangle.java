package cn.tju.triangle;

public class Triangle {

    private int  a;
    private int b;
    private int c;
    public Triangle(){
        a = 0;
        b = 0;
        c = 0;
    }
    public Triangle(int a,int b,int c){

        this.a = a;
        this.b = b;
        this.c = c;
    }
    //判断是不是等边三角形，如果三边相等返回true
    public boolean isEquilateral(){

        return a == b && b == c && isTriangle() ;
    }
    //判断是不是等腰三角形，如果有两边相等返回true
    public boolean isIsosceles() {
        return (a == b || a == c || b == c) && isTriangle();

    }
    //既不是等边又不是等腰
    public boolean isScalene(){
        return a != b && a != c && b != c && isTriangle();
    }
    // 判断三边是否构成三角形
    private  boolean isTriangle(){
        boolean add = (a + b > c) && (a + c > b) && ( b + c > a);
        boolean mi = (a - b < c) && (b - a <c) && (a - c < b)&& (c - a < b) && (b - c < a) && (c - b < a);
        return add && mi;
    }

}

