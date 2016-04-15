package demo

import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy

@Retention(RetentionPolicy.RUNTIME)
@interface SomeAnnotation {
    // this attribute causes a problem...
    SomeEnum problematicAttribute() default SomeEnum.ONE
}
