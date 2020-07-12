package com.vyntra.vyntrau.security;

import javax.persistence.*;


@Entity
@Table(name = "user")
public class User {
	

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "username", nullable = false, unique = true)
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "number")
    private String number;
    @Column(name = "email")
    private String email;

    public User() {
		// TODO Auto-generated constructor stub
	}
    public User(String username, String password, String number,String email) {
        this.username = username;
        this.password = password;
        this.number = number;
        this.email = email;
    }
}
