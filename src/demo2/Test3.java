package demo2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Test3 {

    public static void main(String[] args) {
        Class<?> clazz = Person.class;

        System.out.println("--------------------- Basic Meta Data ---------------------");
        System.out.println(clazz.getName());
        System.out.println(clazz.getPackageName());
        System.out.println(clazz.getSimpleName());
        System.out.println("------------- Access modifiers for class level -------------");
        int classModifiers = clazz.getModifiers();
        System.out.println("clazz.getModifiers() : " + classModifiers);
        System.out.println("isPublic : " + Modifier.isPublic(classModifiers));
        System.out.println("isFinal : " + Modifier.isFinal(classModifiers));
        System.out.println("isStatic : " + Modifier.isStatic(classModifiers));
        System.out.println("isPrivate : " + Modifier.isPrivate(classModifiers));
        System.out.println("isProtected : " + Modifier.isProtected(classModifiers));
        System.out.println("isSynchronized : " + Modifier.isSynchronized(classModifiers));
        System.out.println("isAbstract : " + Modifier.isAbstract(classModifiers));
        System.out.println("------------------------ Super Class -----------------------");
        System.out.println("Super Class : " + clazz.getSuperclass());
        System.out.println("------------------------ Interfaces ------------------------");
        Class[] interfaces = clazz.getInterfaces();
        Arrays.stream(interfaces).forEach(System.out::println);
        System.out.println("------------------------ Constructors ----------------------");
        Constructor[] constructors = clazz.getConstructors();
        Arrays.stream(constructors).forEach(System.out::println);
        System.out.println("--------------------------- Methods ------------------------");
        Method[] methods = clazz.getMethods();
        Arrays.stream(methods).forEach(method -> System.out.println(method.getName() + " - " + method.getGenericReturnType()));
        System.out.println("--------------------------- Getters ------------------------");
        Arrays.stream(methods).filter(method -> method.getName().startsWith("get")).forEach(System.out::println);
        System.out.println("--------------------------- Setters ------------------------");
        Arrays.stream(methods).filter(method -> method.getName().startsWith("set")).forEach(System.out::println);
        System.out.println("--------------------------- Fields -------------------------");
        Field[] fields = clazz.getDeclaredFields();
        Arrays.stream(fields).forEach(field -> System.out.println(field.getName()));

    }

}
