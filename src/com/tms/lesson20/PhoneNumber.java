package com.tms.lesson20;

public class PhoneNumber {
    private int id;
    private String phone;

    public PhoneNumber(int id, String phone) {
        this.id = id;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "id=" + id +
                ", phoneNumber='" + phone + '\'' +
                '}';
    }
}
