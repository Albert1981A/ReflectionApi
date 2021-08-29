package demo1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> clazz = Singleton.class;
        Object object = null;
        Constructor<?> ctor = clazz.getDeclaredConstructor(null);
        ctor.setAccessible(true);
        object = ctor.newInstance(null);
        object = ctor.newInstance(null);

    }

}
