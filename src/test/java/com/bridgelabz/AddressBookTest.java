package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

public class AddressBookTest {
    public AddressBookService addressBookService;

    @Test
    public void ifData_WhenConnected_ShouldReturnSize() throws SQLException {
        addressBookService = new AddressBookService();
        int res = addressBookService.getQuery();
        Assertions.assertEquals(6, res);
    }

    @Test
    public void ifData_WhenUpdated_ShouldReturnSize() throws SQLException {
        addressBookService = new AddressBookService();
        boolean res = addressBookService.getUpdate("Heema", "Jetty", "heema123@gmail.com");
        Assertions.assertEquals(true, res);

    }
}
