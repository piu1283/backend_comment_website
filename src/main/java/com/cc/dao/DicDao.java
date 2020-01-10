package com.cc.dao;

import java.util.List;

import com.cc.bean.Dic;

public interface DicDao {
	/**
	 * 获取所有的字典列表
	 * @param dic
	 * @return
	 */
    List<Dic> select(Dic dic);
}