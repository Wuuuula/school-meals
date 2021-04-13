package com.jh.user.service.impl;

import com.jh.entity.*;
import com.jh.user.dao.UserDao;
import com.jh.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public User selectByNameAndPwd(String username, String password) {
        return userDao.selectByNameAndPwd(username, password);
    }

    @Override
    public List<Merchant> findMerchant(long cid) {
        return userDao.findMerchant(cid);
    }

    @Override
    public List<Food> findFoodDetail(long mid) {
        return userDao.findFoodDetail(mid);
    }

    @Override
    public Food findFood(long fid) {
        return userDao.findFood(fid);
    }

    @Override
    public int addOrder(Orders order) {
        return userDao.addOrder(order);
    }

    @Override
    public int addOrderItem(OrderItem orderItem) {
        return userDao.addOrderItem(orderItem);
    }

    @Override
    public Orders findOrder(long oid) {
        return userDao.findOrder(oid);
    }

    @Override
    public int pay(float total, long uid) {
        return userDao.pay(total, uid);
    }

    @Override
    public List<Orders> findOrders(long uid) {
        return userDao.findOrders(uid);
    }

    @Override
    public int over(long oid) {
        return userDao.over(oid);
    }

    @Override
    public List<OrderItem> orderDetail(long oid) {
        return userDao.orderDetail(oid);
    }


}
