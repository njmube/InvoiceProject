package tk.mbondos.dtos;

import org.springframework.stereotype.Component;
import tk.mbondos.domain.embeddable.Address;


public class CustomerDto {

    private Long id;
    private String name;
    private Address address;
    private String nip;

    public CustomerDto() {
    }

    public CustomerDto(Long id, String name, Address address, String nip) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.nip = nip;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void validate() {

    }
}
