package com.example.onetoone.projection;

public interface PersonByCloseProjection {
    String getFirstName();
    String getLastName();
    AddressRs getAddress();

    interface AddressRs {
        String getState();
        String getCity();
        String getStreet();
        String getZipCode();
    }
}
