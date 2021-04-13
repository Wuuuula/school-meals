package com.jh.admin.service.impl;

import com.jh.admin.dao.AdminDao;
import com.jh.admin.service.AdminService;
import com.jh.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    //注入service依赖
    @Autowired
    AdminDao adminDao;

    /**
     * 管理员登录
     * @param username
     * @param password
     * @return
     */
    @Override
    public Admin selectByNameAndPwd(String username, String password) {
        return adminDao.selectByNameAndPwd(username,password);
    }

    /**
     * 查询所有店铺
     * @return
     */
    @Override
    public List<Merchant> selectFindAllMerchant() {
        return adminDao.selectFindAllMerchant();
    }

    /**
     * 根据cid查询店铺
     * @param cid
     * @return
     */
    @Override
    public List<Merchant> selectFindMerchant(long cid) {
        return adminDao.selectFindMerchant(cid);
    }

    /**
     * 添加店铺
     * @param merchant
     */
    @Override
    public int addMerchant(Merchant merchant) {
        return adminDao.addMerchant(merchant);
    }

    /**
     * 查询所有分类
     * @return
     */
    @Override
    public List<Category> findAllCategory() {
        return adminDao.findAllCategory();
    }

    /**
     * 查询所有订单
     * @return
     */
    @Override
    public List<Orders> findAllOrders() {
        return adminDao.findAllOrders();
    }

    @Override
    public List<OrderItem> findOrders(long oid) {
        return adminDao.findOrders(oid);
    }

    /**
     * 添加食物
     * @param food
     * @return
     */
    @Override
    public int addFood(Food food) {
        return adminDao.addFood(food);
    }

    /**
     * 查找食物
     * @param mid
     * @return
     */
    @Override
    public List<Food> findFoodDetail(long mid) {
        return adminDao.findFoodDetail(mid);
    }

    /**
     * 删除店铺
     * @param mid
     * @return
     */
    @Override
    public int deleteMerchant(long mid) {
        return adminDao.deleteMerchant(mid);
    }

    /**
     * 删除食物
     * @param fid
     * @return
     */
    @Override
    public int deleteFood(long fid) {
        return adminDao.deleteFood(fid);
    }

    @Override
    public Orders findOrder(long oid) {
        return adminDao.findOrder(oid);
    }

}
