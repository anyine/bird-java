package com.bird.web.api.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.bird.service.zero.DicTypeService;
import com.bird.service.zero.OrganizationService;
import com.bird.service.zero.dto.OrganizationDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuxx
 * @date 2018/3/19
 */
@RestController
@RequestMapping("/dic")
public class HomeController {

    @Reference
    private DicTypeService dicTypeService;

    @Reference
    private OrganizationService organizationService;

    @GetMapping("/test")
    public OrganizationDTO test(){
        return organizationService.getOrganization(1L);
    }
}
