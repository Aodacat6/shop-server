package com.onlythinking.shop.model;

import com.onlythinking.commons.core.interceptor.CreatedTime;
import com.onlythinking.commons.core.interceptor.LastModifiedTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * <p> This was generated by Ot Mybatis generator. </p>
 *
 * ot_user_ma_session
 *
 * 小程序会话密钥
 *
 * @author lixingping
 * Date 2020-05-11 13:59:52
 */
@Data
@ApiModel("小程序会话密钥")
public class OtUserMaSession implements Serializable {
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
     * 应用编号
     */
    @NotBlank
    @ApiModelProperty(value = "应用编号", required = true)
    private String appNo;

    /**
     * 最后修改时间
     */
    @ApiModelProperty(value = "最后修改时间")
    @LastModifiedTime
    private Date lastModifiedTime;

    /**
     * 备注（修改记录)
     */
    @ApiModelProperty(value = "备注（修改记录)")
    private String remark;

    /**
     * 小程序类型(wx|swan|my|tt)
     */
    @NotBlank
    @ApiModelProperty(value = "小程序类型(wx|swan|my|tt)", required = true)
    private String maType;

    /**
     * 小程序openid
     */
    @NotBlank
    @ApiModelProperty(value = "小程序openid", required = true)
    private String openid;

    /**
     * 会话密钥
     */
    @ApiModelProperty(value = "会话密钥")
    private String sessionKey;

    /**
     * 用户ID
     */
    @ApiModelProperty(value = "用户ID")
    private String uid;

    private static final long serialVersionUID = 1L;
}
