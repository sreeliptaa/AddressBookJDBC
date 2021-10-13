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

}
