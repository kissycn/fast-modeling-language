/*
 * Copyright (c)  2022. Aliyun.com All right reserved. This software is the
 * confidential and proprietary information of Aliyun.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Aliyun.com.
 */

package com.aliyun.fastmodel.compare.merge.impl;

import com.aliyun.fastmodel.core.tree.Comment;
import com.aliyun.fastmodel.core.tree.QualifiedName;
import com.aliyun.fastmodel.core.tree.statement.constants.TableDetailType;
import com.aliyun.fastmodel.core.tree.statement.table.CreateTable;
import com.aliyun.fastmodel.core.tree.statement.table.SetTableComment;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Desc:
 *
 * @author panguanjing
 * @date 2022/10/9
 */
public class SetTableCommentPipeLineTest {
    SetTableCommentPipeLine setTableCommentPipeLine = new SetTableCommentPipeLine();
    @Test
    public void process() {
        CreateTable input = CreateTable.builder()
            .detailType(TableDetailType.ADS)
            .comment(new Comment("abc"))
            .build()
            ;
        SetTableComment baseStatement = new SetTableComment(QualifiedName.of("abc"), new Comment("bcd"));
        CreateTable process = setTableCommentPipeLine.process(input, baseStatement);
        assertEquals(process.getCommentValue(), "bcd");
    }
}