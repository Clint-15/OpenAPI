package com.openapi.openapicommon.model.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.openapi.openapicommon.model.entity.Post;

/**
 * 帖子视图
 *
 * @author openapi
 * @TableName product
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class PostVO extends Post {

    /**
     * 是否已点赞
     */
    private Boolean hasThumb;

    private static final long serialVersionUID = 1L;
}