package j2se.reflection;

import j2se.charactor.Hero;

import java.io.*;
import java.lang.reflect.Constructor;

public class TestReflection {
    public static void main(String[] args) {
        System.out.println(getHero());
    }

    public static Hero getHero(){
        File f = new File("D:\\cs\\ideaProject\\project\\study\\src\\main\\java\\j2se\\reflection\\hero.config");
        try(FileReader fr = new FileReader(f) ){
            char[] all = new char[(int)f.length()];
            fr.read(all);
            String className = String.valueOf(all);
            Class pClass = Class.forName(className);
            Constructor c = pClass.getConstructor();
            return (Hero) c.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}