package springzuoyecglib;

import org.junit.Test;

public class LiuLanQiTest {
    @Test
    public void test01(){
        LiuLanQia erZi = new CglibLiuLanQi().cglibCreator();   //多态中的父类指向子类对象，本质是儿子对象
        String s = erZi.FangWen();
        System.out.println( s);
    }
}
