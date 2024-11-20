package com.utsa.swe;

public class User {
    private String name;
    private String contactNo;
    private String address;



    public void getUserInformation(String name, String contactNo,String address){
        this.name=name;
        this.contactNo=contactNo;
        this.address=address;
    }

    public void showInformation(){
        System.out.println("Name:"+name);
        System.out.println("Contact No:"+contactNo);
        System.out.println("Address:"+address+"\n");
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }
}
