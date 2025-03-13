import javax.xml.namespace.QName;
import java.lang.reflect.*;

/*Franklin Gainer
* 03-13-2025
* CIS 171-101
* Professor Larence*/

public class Main {

    private static Cat simon;

    public static void main(String[] args) {
        // Create a Cat object
        simon = new Cat("Simon", 9, "Tabby", 11.0);

        // Display initial info
        simon.displayInfo();

        // 1. Listing all fields.
        Field[] catField = Cat.class.getFields();
        for (Field f : catField) {
            System.out.println(" Feild name: \t"+f.getName());
            System.out.println(" Feild type: \t"+f.getType());
            System.out.println(" Feild value: \t"+f.getModifiers());
            System.out.println(" Feild value: \t"+f.getGenericType());
        }

        // 3. Changing private field access and modifying ALL values.
        try {
            Field namefield = Cat.class.getDeclaredField("name");
            namefield.setAccessible(true);
            namefield.set(simon,"bob");

            Field ageField = Cat.class.getDeclaredField("age");
            ageField.setAccessible(true);
            ageField.set(simon,9);

            Field breedFiled = Cat.class.getDeclaredField("breed");
            breedFiled.setAccessible(true);
            breedFiled.set(simon,"simease");

            Field weightField = Cat.class.getDeclaredField("weight");
            weightField.setAccessible(true);
            weightField.set(simon,9);

        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        simon.displayInfo();

        // 2. Listing all methods.
        Method[] catMethods = Cat.class.getMethods();
        for (int i = 0; i < catMethods.length; i++) {
            System.out.println(catMethods[i].getName());
            System.out.println("Method length \t" + catMethods.length);
            System.out.println("Method Name \t" + catMethods[i].getName());
            System.out.println("Method Type \t" + catMethods[i].getGenericReturnType());
            System.out.println("Method Modifier \t" + catMethods[i].getModifiers());
        }

        // 4. Changing private method access and invoking ALL of them.
        try {
            Method testMethod = Cat.class.getDeclaredMethod("purr");
            testMethod.setAccessible(true);
            String result = (String) testMethod.invoke(simon);
            System.out.println(result);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }

        try {
            Method testMethod2 = Cat.class.getDeclaredMethod("sleep");
            testMethod2.setAccessible(true);
            String result2 = (String) testMethod2.invoke(simon);
            System.out.println(result2);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
