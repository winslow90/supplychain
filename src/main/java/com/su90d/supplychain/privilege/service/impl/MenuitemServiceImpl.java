/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.su90d.supplychain.privilege.service.impl;

import com.su90d.supplychain.base.dao.BaseDao;
import com.su90d.supplychain.base.service.impl.BaseServiceImpl;
import com.su90d.supplychain.domain.privilege.Menuitem;
import com.su90d.supplychain.privilege.dao.MenuitemDao;
import com.su90d.supplychain.privilege.service.MenuitemService;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 *
 * @author superman90
 */
@Service("menuitemService")
public class MenuitemServiceImpl extends BaseServiceImpl<Menuitem> implements MenuitemService{
    @Resource(name="menuitemDao")
    private MenuitemDao menuitemDao;

    public MenuitemDao getMenuitemDao() {
        return menuitemDao;
    }

    public void setMenuitemDao(MenuitemDao menuitemDao) {
        this.menuitemDao = menuitemDao;
    }
    @Override
    public BaseDao getBaseDao() {
            // TODO Auto-generated method stub
            return this.menuitemDao;
    }
}
