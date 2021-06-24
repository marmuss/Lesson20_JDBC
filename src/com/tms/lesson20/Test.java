package com.tms.lesson20;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws SQLException {
        DBUserStorage dbUserStorage = new DBUserStorage("jdbc:postgresql://localhost:5432/postgres");

//        List<Address> addresses = new ArrayList<>();
//        addresses.add(0, new Address(0, "Main"));
//        addresses.add(1, new Address(0, "Falcon"));
//        List<PhoneNumber> phones = new ArrayList<>();
//        phones.add(0, new PhoneNumber(0, "1111111"));
//        phones.add(1, new PhoneNumber(0, "7815897"));
//        phones.add(2, new PhoneNumber(0, "9346896"));
//        dbUserStorage.save(new User(0, "test", "test", "test",
//                addresses, phones));

//        dbUserStorage.deleteById(19);
//        System.out.println(dbUserStorage.getAll());
//        System.out.println(dbUserStorage.getByUsername("test"));
//        System.out.println(dbUserStorage.existByID(22));
//        System.out.println(dbUserStorage.exist());
//        System.out.println(dbUserStorage.getAllByStreet("Walpole"));
    }
}
