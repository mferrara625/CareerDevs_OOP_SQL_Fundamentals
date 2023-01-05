package com.company.SQL_Joins;

public class SQL_Joins {

    public void innerJoin(){
        System.out.println("SELECT * FROM Customer INNER JOIN City ON Customer.CityId = City.CityId");
    }

    public void leftJoin(){
        System.out.println("SELECT * FROM Customer LEFT JOIN City ON Customer.CityId = City.CityId");
    }

    public void rightJoin(){
        System.out.println("SELECT * FROM Customer RIGHT JOIN City ON Customer.CityId = City.CityId");
    }

    public void fullJoin(){
        System.out.println("SELECT * FROM Customer FULL JOIN City ON Customer.CityId = City.CityId");
    }
}
