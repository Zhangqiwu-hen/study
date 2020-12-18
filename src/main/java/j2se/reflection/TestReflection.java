package j2se.reflection;

import j2se.charactor.Hero;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestReflection {
    public static void main(String[] args) {
        File f = new File("D:\\cs\\ideaProject\\project\\study\\src\\main\\java\\j2se\\reflection\\hero.config");
        try(FileReader fr = new FileReader(f); BufferedReader br = new BufferedReader(fr)){
            String[] str=new String[4];
            for(int i=0;i< str.length;i++){
                str[i]= br.readLine();
            }

            Class c1 = Class.forName(str[0]);
            Constructor cc1 = c1.getConstructor();
            Object h1 = cc1.newInstance();
            Field f1 = c1.getField("name");
            f1.set(h1,str[1]);
            System.out.println(h1);

            Class c2 = Class.forName(str[2]);
            Constructor cc2 = c2.getConstructor();
            Object h2 = cc2.newInstance();
            Field f2 = c2.getField("name");
            f2.set(h2,str[3]);
            System.out.println(h2);

            Method m1 = c1.getMethod("attackHero",Hero.class);
            m1.invoke(h1,h2);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}