package com.dongnao.jack.service;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * ValidationService
 *
 * @author william.liangf
 */
public interface ValidationService { // 缺省可按服务接口区分验证场景，如：@NotNull(groups = ValidationService.class)

    void save(ValidationParameter parameter);
    
    void update(ValidationParameter parameter);
    
    void delete(
            @Min(1) long id,
            @NotNull @Size(min = 2, max = 16) @Pattern(regexp = "^[a-zA-Z]+$") String operator);
    
    @interface Save {
    } // 与方法同名接口，首字母大写，用于区分验证场景，如：@NotNull(groups = ValidationService.Save.class)，可选
    
    @interface Update {
    } // 与方法同名接口，首字母大写，用于区分验证场景，如：@NotNull(groups = ValidationService.Update.class)，可选
    
}
