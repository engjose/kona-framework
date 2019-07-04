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
 * @date 2019-07-02
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StoreMeta extends BasePo implements Serializable {
    private Long id;

    private String creator;

    private Date created;

    private String updator;

    private Date updated;

    /** 修改时间DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP */
    private Date modifyTime;

    /** 店铺编号 */
    private String storeNo;

    /** 店铺名称 */
    private String storeName;

    /** 商户编号 */
    private String merchantNo;

    /** 商户名称 */
    private String merchantName;

    /** 店铺类型1：官方旗舰店  2：专营店  3：专卖店 */
    private String storeType;

    /** 店铺logo url地址 */
    private String storeLogoUrl;

    /** 店铺背景图url地址 */
    private String storeBackgroundUrl;

    private static final long serialVersionUID = 1L;
}