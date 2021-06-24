package com.tms.lesson20;

import java.util.List;

public class User {
    private int id;
    private String name;
    private String username;
    private String password;
    private List<Address> addresses;
    private List<PhoneNumber> phones;

    public User(int id, String name, String username, String password, List<Address> addresses, List<PhoneNumber> phones) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.addresses = addresses;
        this.phones = phones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public List<PhoneNumber> getPhones() {
        return phones;
    }

    public void setPhones(List<PhoneNumber> phones) {
        this.phones = phones;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", addresses=" + addresses +
                ", phones=" + phones +
                '}';
    }
}
