package com.gxs.springcloud.service;

import com.gxs.springcloud.entities.DeptEntity;

import java.util.List;

/**
 * @author GongXings
 * @createTime 30 15:03
 * @description
 */
public interface DeptService {

    /**
     * 插入
     * @param deptEntity
     * @return
     */
    boolean addDept(DeptEntity deptEntity);

    /**
     * 根据id查找
     * @param deptNo
     * @return
     */
    DeptEntity findById(Long deptNo);

    /**
     * 查询全部
     * @return
     */
    List<DeptEntity> findAll();
}