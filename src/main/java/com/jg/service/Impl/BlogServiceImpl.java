package com.jg.service.Impl;
import com.jg.mapper.TypeMapper;
import com.jg.pojo.Type;
import com.jg.vo.BlogVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jg.mapper.BlogMapper;
import com.jg.pojo.Blog;
import com.jg.service.BlogService;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author adminstrator
 */
@Service
public class BlogServiceImpl implements BlogService{
    @Autowired
    private BlogMapper blogMapper;
    @Autowired
    private TypeMapper typeMapper;
    @Override
    public void save(Blog blog) {
        blogMapper.insert(blog);
    }

    @Override
    public Blog getById(String id) {
        return blogMapper.getById(id);
    }

    @Override
    public void update(Blog blog) {
        blogMapper.update(blog);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public BlogVo readById(String id) {
        Blog blog = blogMapper.getById(id);
        blog.setBlogRead(blog.getBlogRead()+1);
        blogMapper.update(blog);
        BlogVo blogVo=new BlogVo();
        //属性copy
        BeanUtils.copyProperties(blog,blogVo);
        //查询分类
        Type type = typeMapper.getById(blog.getBlogType());
        blogVo.setType(type);
        return blogVo;
        //更新阅读数量
    }

    @Override
    public void deleteById(String id) {
        blogMapper.deleteById(id);
    }
}
