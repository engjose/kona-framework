package com.kona.framework.model.po;

import com.kona.base.model.po.BasePo;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Generator
 *
 * @date 2019-07-08
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo extends BasePo implements Serializable {
    private String id;

    private String username;

    private String password;

    /** 微信openid */
    private String openid;

    /** 1买家2卖家 */
    private Byte role;

    /** 创建时间 */
    private Date createTime;

    /** 修改时间 */
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}