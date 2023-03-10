package com.openapi.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.openapi.openapicommon.model.entity.InterfaceInfo;

/**
 *
 */
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
