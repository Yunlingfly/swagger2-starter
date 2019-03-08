package cn.yunlingfly.swaggerspringbootstarter;

import org.springframework.context.annotation.Import;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.lang.annotation.*;

/**
 * 启用注解：@EnableYLFSwagger2
 *
 * @author yunlingfly@csdn
 */

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import({SwaggerServiceAutoConfiguration.class})
@EnableSwagger2
public @interface EnableYLFSwagger2 {
}