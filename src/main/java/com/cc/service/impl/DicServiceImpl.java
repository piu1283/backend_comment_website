package com.cc.service.impl;

import java.util.List;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cc.bean.Dic;
import com.cc.dao.DicDao;
import com.cc.service.DicService;

@Service
public class DicServiceImpl implements DicService {
    
    @Resource
    private DicDao dicDao;
    
    @Override
    public List<Dic> getListByType(String type) {
	Dic dic = new Dic();
	dic.setType(type);
	return dicDao.select(dic);
    }
}
