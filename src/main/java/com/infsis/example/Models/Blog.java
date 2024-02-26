package com.infsis.example.Models;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "blog")
    private List<Article> articles;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
    @CreatedDate
    private LocalDateTime createdAt;
}
