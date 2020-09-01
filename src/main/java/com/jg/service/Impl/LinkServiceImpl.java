package com.jg.service.Impl;

import com.jg.mapper.LinkMapper;
import com.jg.pojo.Link;
import com.jg.service.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author adminstrator
 */
@Service
public class LinkServiceImpl implements LinkService {
    @Autowired
    private LinkMapper linkMapper;
    @Override
    public void save(Link link) {
      linkMapper.insert(link);
    }

    @Override
    public void update(Link link) {
        linkMapper.update(link);
    }

    @Override
    public Link getById(Integer id) {
        return linkMapper.getById(id);
    }

    @Override
    public void deleteById(Integer id) {
        linkMapper.deleteById(id);
    }

    @Override
    public List<Link> getTypeList() {
        return linkMapper.getAll();
    }
}
