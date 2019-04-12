package com.baizhi.service.Impl;

import com.baizhi.dao.BookDao;
import com.baizhi.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    @Override
    public List selectAll() {
        List list=bookDao.selectAll();
        return list;
    }
}
