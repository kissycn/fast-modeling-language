/*
 * Copyright (c)  2022. Aliyun.com All right reserved. This software is the
 * confidential and proprietary information of Aliyun.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Aliyun.com.
 */

package com.aliyun.fastmodel.transform.api.client.dto.constraint;

import java.util.List;

import com.aliyun.fastmodel.transform.api.client.dto.property.BaseClientProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 约束的client dto
 *
 * @author panguanjing
 * @date 2022/6/6
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Constraint {
    /**
     * 约束名称
     * 可选
     */
    private String name;

    /**
     * 列
     * 必选
     */
    private List<String> columns;

    /**
     * 约束类型
     * 必选{@link ConstraintType}
     */
    private ConstraintType type;

    /**
     * index的属性信息
     */
    private List<BaseClientProperty> properties;

}
