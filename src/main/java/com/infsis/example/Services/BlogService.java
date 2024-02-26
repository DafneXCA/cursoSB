package com.infsis.example.Services;

import com.infsis.example.DTOs.BlogDTO;
import com.infsis.example.DTOs.UserDTO;
import com.infsis.example.Models.Blog;

import java.util.List;

public interface BlogService {
    List<BlogDTO> getBlogs();
    BlogDTO getBlogById(Integer blogId);

    BlogDTO saveBlog(BlogDTO blogDTO);

    BlogDTO updateBlog(Integer blogId, BlogDTO blogDTO);
    void delete(Integer blogId);
}
