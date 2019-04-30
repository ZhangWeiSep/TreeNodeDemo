package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @pathName：TreeNode
 * @author：ZhangWei
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TreeNode<T> {

    /**
     * 数据域
     */
    public T val;
    /**
     * 左孩子
     */
    public TreeNode left;
    /**
     * 右孩子
     */
    public TreeNode right;

}
