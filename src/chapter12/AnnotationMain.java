package chapter12;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnnotationMain {


    @ExampleAnnotation()
    public void someMethod() {

    }

    public void myMethod() {
        System.out.println("Hello");
    }

    @ExampleAnnotation()
    public static void main(String[] args) throws NoSuchMethodException {
        AnnotationMain annotationMain = new AnnotationMain();
        Method[] declaredMethods = annotationMain.getClass().getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println("method name is: " + declaredMethod.getName());
            Annotation[] annotations = declaredMethod.getDeclaredAnnotations();
            for (Annotation annotation : annotations) {
               if(annotation instanceof ExampleAnnotation) {
                   System.out.println("our ExampleAnnotation is present");
               }
            }
        }
    }

}
