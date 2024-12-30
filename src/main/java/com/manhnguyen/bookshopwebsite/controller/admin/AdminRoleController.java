package com.manhnguyen.bookshopwebsite.controller.admin;

import com.manhnguyen.bookshopwebsite.controller.common.BaseController;
import com.manhnguyen.bookshopwebsite.service.RoleService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@AllArgsConstructor
@Controller
@RequestMapping("/admin/roles_management")
public class AdminRoleController extends BaseController {
    private final RoleService roleService;
}

