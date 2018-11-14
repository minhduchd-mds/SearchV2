/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.da;

import com.fpt.entity.Product;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author dominhduc
 */
public class ProductDataAccess {
    private PreparedStatement searchStratement;
    private PreparedStatement  getSearchStratement()  throws ClassNotFoundException,
            SQLException{
        if(searchStratement == null){
            Connection connection = new DBConnnection().getConnection();
            
        
            searchStratement = 
                    connection.prepareStatement("SELECT pro_id, pro_name, pro_desc FROM ProductStore WHERE pro_name like ?");
        }
        return searchStratement; 
    }

    public List<Product> getProductsByName(String name) {
        try{
            PreparedStatement sataement = getSearchStratement();
            sataement.setString(1,"%"+ name+"%");
            ResultSet rs = sataement.executeQuery();
            List<Product> product = new LinkedList<Product>();
            while(rs.next()){
                product.add(new Product(rs.getInt("pro_id"),
                rs.getString("pro_name"),rs.getString("pro_desc")));
            }
            return product;
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
   
}
