package com.example.SittersProject.postable.request.model;

import javax.persistence.*;

@Entity
@Table(name = "sitter_requests")
public class SitterRequest {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="requesterid")
    private Long requesterId;

    @Column(name="message")
    private String message;

    public SitterRequest(){}

    public SitterRequest(Long id, Long requesterId, String message) {
        this.id = id;
        this.requesterId = requesterId;
        this.message = message;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRequesterId() {
        return requesterId;
    }

    public void setRequesterId(Long requesterId) {
        this.requesterId = requesterId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
