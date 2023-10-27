/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Products;

/**
 *
 * @author iarsk66
 */
public class CallProductTable {

    
    public static List<Products> findAllProduct(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("OnlineShoppingCartPU");
        EntityManager em = emf.createEntityManager();
        List<Products> pdList = null;
        try{
            pdList = (List<Products>) em.createNamedQuery("Products.findAll").getResultList();
        }
        catch(Exception e){
            throw new RuntimeException(e);
        }finally {
            em.close();
            emf.close();
        }
        return pdList;
    }
   
}
