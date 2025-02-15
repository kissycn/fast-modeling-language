package com.aliyun.fastmodel.transform.oceanbase.client.property.key;

import java.util.List;

import com.aliyun.fastmodel.transform.oceanbase.client.property.SubPartitionClient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * key partition client
 *
 * @author panguanjing
 * @date 2024/2/22
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SubKeyPartitionClient extends SubPartitionClient {
    private Long subPartitionCount;

    private List<String> columnList;

}
