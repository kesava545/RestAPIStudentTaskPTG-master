package com.example.studentData.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StudentEntity
{
    @Id
    private  long stdId;

    public StudentEntity()
    {
    }

    public StudentEntity(long stdId, String stdName, String stdAddress) {
        this.stdId = stdId;
        this.stdName = stdName;
        this.stdAddress = stdAddress;
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "stdId=" + stdId +
                ", stdName='" + stdName + '\'' +
                ", stdAddress='" + stdAddress + '\'' +
                '}';
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public String getStdAddress() {
        return stdAddress;
    }

    public void setStdAddress(String stdAddress) {
        this.stdAddress = stdAddress;
    }

    public  long getStdId()
    {
        return stdId;
    }
    public  void setStdId(int stdId){
        this.stdId=stdId;
    }
    private  String stdName;
    private  String stdAddress;

}
