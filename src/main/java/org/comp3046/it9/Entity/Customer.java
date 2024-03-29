package org.comp3046.it9.Entity;

import org.comp3046.it9.Utils.Convert;

import java.util.Date;

public class Customer {
    private final int uid;
    private final String name;
    private final String salutation;
    private final String username;
    private final int mobile;
    private final String email;
    private final Date birthday;

    public Customer(final int uid,
                    final String name,
                    final String salutation,
                    final String username,
                    final int mobile,
                    final String email,
                    final Date birthday) {
        this.uid = uid;
        this.name = name;
        this.salutation = salutation;
        this.username = username;
        this.mobile = mobile;
        this.email = email;
        this.birthday = birthday;
    }

    public int getUid() {
        return uid;
    }

    public String getName() {
        return name;
    }

    public String getSalutation() {
        return salutation;
    }

    public String getUsername() {
        return username;
    }

    public int getMobile() {
        return mobile;
    }

    public String getEmail() {
        return email;
    }

    public Date getBirthday() {
        return birthday;
    }

    @Override
    public String toString() {
        String msg = "Customer {\r\n";
        msg += "Uid: %d\r\n";
        msg += "Name: %s\r\n";
        msg += "Salutation: %s\r\n";
        msg += "Username: %s\r\n";
        msg += "Mobile: %d\r\n";
        msg += "Email: %s\r\n";
        msg += "Birthday: %s\r\n";
        msg += "}";

        return String.format(
                msg, getUid(), getName(), getSalutation(), getUsername(),
                getMobile(), getEmail(), Convert.dateToString(getBirthday()));
    }
}
