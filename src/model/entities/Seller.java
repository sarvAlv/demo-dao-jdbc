package model.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Seller implements Serializable{

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String name;
    private String email;
    private Date birthData;
    private Double baseSalary;

    private Department department;

    public Seller() {
    }

    public Seller(Integer id, String name, String email, Date birthData, Double baseSalary, Department department) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.birthData = birthData;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthData() {
        return birthData;
    }

    public void setBirthData(Date birthData) {
        this.birthData = birthData;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Seller seller = (Seller) o;
        return Objects.equals(id, seller.id) && Objects.equals(name, seller.name) && Objects.equals(email, seller.email) && Objects.equals(birthData, seller.birthData) && Objects.equals(baseSalary, seller.baseSalary) && Objects.equals(department, seller.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, birthData, baseSalary, department);
    }

    @Override
    public String toString() {
        return "Seller{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", birthData=" + birthData +
                ", baseSalary=" + baseSalary +
                ", department=" + department +
                '}';
    }


}
