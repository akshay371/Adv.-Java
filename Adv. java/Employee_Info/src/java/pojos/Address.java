package pojos;
// Generated 6 Oct, 2018 2:41:50 PM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Address generated by hbm2java
 */
public class Address  implements java.io.Serializable {


     private Integer id;
     private String streetName;
     private String cityName;
     private String stateName;
     private int zipCode;
     private Set employeeses = new HashSet(0);

    public Address() {
    }

	
    public Address(String streetName, String cityName, String stateName, int zipCode) {
        this.streetName = streetName;
        this.cityName = cityName;
        this.stateName = stateName;
        this.zipCode = zipCode;
    }
    public Address(String streetName, String cityName, String stateName, int zipCode, Set employeeses) {
       this.streetName = streetName;
       this.cityName = cityName;
       this.stateName = stateName;
       this.zipCode = zipCode;
       this.employeeses = employeeses;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getStreetName() {
        return this.streetName;
    }
    
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
    public String getCityName() {
        return this.cityName;
    }
    
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    public String getStateName() {
        return this.stateName;
    }
    
    public void setStateName(String stateName) {
        this.stateName = stateName;
    }
    public int getZipCode() {
        return this.zipCode;
    }
    
    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
    public Set getEmployeeses() {
        return this.employeeses;
    }
    
    public void setEmployeeses(Set employeeses) {
        this.employeeses = employeeses;
    }




}


