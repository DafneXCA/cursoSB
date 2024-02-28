package com.infsis.example.Services.implement;

import com.infsis.example.DTOs.BlogDTO;
import com.infsis.example.DTOs.UserDTO;
import com.infsis.example.Models.Blog;
import com.infsis.example.Models.User;
import com.infsis.example.Services.BlogService;

import java.util.List;

public class BlogServiceImpl implements BlogService {

    @Override
    public List<BlogDTO> getBlogs() {
        return null;
    }

    @Override
    public BlogDTO getBlogById(Integer blogId) {
        return null;
    }

    @Override
    public BlogDTO saveBlog(BlogDTO blogDTO) {
        return null;
    }

    @Override
    public BlogDTO updateBlog(Integer blogId, BlogDTO blogDTO) {
        return null;
    }

    @Override
    public void delete(Integer blogId) {

    }

    private BlogDTO BlogtoDto(Blog blog){

        BlogDTO blogDTO=new BlogDTO(
                blog.getId(),
                blog.getName(),
                UsertoDto(blog.getUser())
        );
        return blogDTO;
    }

    private  Blog blogDTOToBlog(BlogDTO blogDTO){
        Blog blog=new Blog();
        blog.setId(blogDTO.getId());
        blog.setName(blogDTO.getName());
        blog.setUser(DtoToUser(blogDTO.getUser()));

        return blog;
    }



    private UserDTO UsertoDto(User user){
        UserDTO userDTO=new UserDTO(
                user.getId(),
                user.getName(),
                user.getEmail()
        );
        return userDTO;
    }

    private User DtoToUser(UserDTO userDTO){
        User user=new User();
        user.setName(userDTO.getName());
        user.setEmail(userDTO.getEmail());

        return user;
    }
}
