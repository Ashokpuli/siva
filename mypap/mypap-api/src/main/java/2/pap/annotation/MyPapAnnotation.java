package 2.pap.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
public @interface MyPapAnnotation {
        
        Class<?> myVariable() default Void.class;

}

