package cn.yunlingfly.swaggerspringbootstarter.infra.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Swagger属性配置
 *
 * @author yunlingfly@csdn
 */

@Component
@ConfigurationProperties(prefix = "swagger")
@Data
public class SwaggerProperties {
    /**
     * 标题
     */
    private String title;
    /**
     * 维护人
     */
    private Contact contact = new Contact();
    /**
     * 版本
     */
    private String version;
    /**
     * 描述
     */
    private String description;
    /**
     * swagger扫描的基础包，默认：全扫描
     */
    private String basePackage = "base-package";
    /**
     * 需要处理的基础URL规则，默认：/**
     */
    private String basePath = "base-path";
    /**
     * 需要排除的URL规则，默认：空
     */
    private String excludePath = "exclude-path";
    /**
     * 许可证
     */
    private String license;
    private String licenseUrl = "license-url";

    @Data
    public static class Contact {
        /**
         * 维护人名
         */
        private String name;
        /**
         * 维护人email
         */
        private String email;
        /**
         * 维护人url
         */
        private String url;
    }
}
