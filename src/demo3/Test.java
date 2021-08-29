package demo3;

import demo2.Person;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {

    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, ClassNotFoundException {

        // printing "Mosses" without "System.out.println"

        // Class<?> clazz = java.lang.Class.forName("java.lang.System");
        Class<?> clazz = System.class;
        Field out = clazz.getDeclaredField("out");
        Class<?> streamPrint = out.getType();
        Method method = streamPrint.getDeclaredMethod("println", String.class);
        Object object = out.get(null);
        method.invoke(object, "Mosses");

    }
}
