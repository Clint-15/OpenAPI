package com.openapi.project.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.openapi.openapicommon.model.entity.UserInterfaceInfo;

import java.util.List;

/**
 * @Entity com.openapi.project.model.entity.UserInterfaceInfo
 */
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {

    List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int limit);
}




