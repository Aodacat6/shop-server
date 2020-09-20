package com.onlythinking.shop.model;

import com.onlythinking.commons.core.interceptor.CreatedTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Id;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

/**
 * <p> This was generated by Ot Mybatis generator. </p>
 * 
 * ot_sys_opt_log
 * 
 * 系统用户操作日志
 * 
 * @author lixingping
 * Date 2020-05-12 15:40:20
 */
@Data
@ApiModel("系统用户操作日志")
public class OtSysOptLog implements Serializable {
    /**
     * ID
     */
    @Id
    @ApiModelProperty(value = "ID")
    private String id;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    @CreatedTime
    private Date createdTime;

    /**
     * 操作记录
     */
    @ApiModelProperty(value = "操作记录")
    private String remark;

    /**
     * IP来源
     */
    @ApiModelProperty(value = "IP来源")
    private String ipGeo;

    /**
     * 操作人
     */
    @NotBlank
    @ApiModelProperty(value = "操作人", required = true)
    private String operator;

    /**
     * IP
     */
    @ApiModelProperty(value = "IP")
    private String optIp;

    /**
     * 操作说明
     */
    @ApiModelProperty(value = "操作说明")
    private String optName;

    /**
     * 请求数据
     */
    @ApiModelProperty(value = "请求数据")
    private String requestData;

    /**
     * 请求地址
     */
    @ApiModelProperty(value = "请求地址")
    private String requestUrl;

    private static final long serialVersionUID = 1L;
}