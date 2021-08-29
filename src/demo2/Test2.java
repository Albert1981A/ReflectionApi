package demo2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test2 {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class<?> clazz = Person.class;
        Constructor<?> constructor = null;
        Method method = null;
        Object object = null;

        constructor = clazz.getDeclaredConstructor(null);
        object = constructor.newInstance();
        System.out.println(object);

        constructor = clazz.getDeclaredConstructor(String.class, float.class);
        object = constructor.newInstance("Marina", 61.5f);
        System.out.println(object);

        constructor = clazz.getDeclaredConstructor(int.class, String.class, float.class);
        object = constructor.newInstance(123, "Karina", 62.5f);
        System.out.println(object);

        method = clazz.getDeclaredMethod("getName");
        System.out.println("getName: " + method.invoke(object));

        method = clazz.getDeclaredMethod("setName", String.class);
        method.invoke(object, "Kobi");

        method = clazz.getDeclaredMethod("getName");
        System.out.println("getName after setting it to be \"Kobi\": " + method.invoke(object));




    }

}
