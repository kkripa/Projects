package Classes;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

public class ProductDB {
    
    public ArrayList<Product> getAllProducts()
    {
        EntityManager em= DBUtil.getEmFactory().createEntityManager();
        String qString="SELECT P FROM Product P";
        try
        {
            TypedQuery<Product> tq = em.createQuery(qString,Product.class);
            List<Product> p= tq.getResultList();
            ArrayList<Product> p1=new ArrayList<>(p);
            return p1;
        }
        finally
        {
            em.close();
        }
    }
    
    public Product getProduct(String productCode)
    {
        EntityManager em=DBUtil.getEmFactory().createEntityManager();
        try
        {
            Product p=em.find(Product.class,productCode);
            return p;
        }
        finally
        {
            em.close();
        }
    }
    
    public void addProduct(String ProductCode, String ProductName,String CatalogCategory, double Price, String Description, String ImageURL1, String ImageURL2, String ImageURL3, String ImageURL4)
    {
        Product p=new Product();
        p.setProductCode(ProductCode);
        p.setProductName(ProductName);
        p.setCatalogCategory(CatalogCategory);
        p.setPrice(Price);
        p.setDescription(Description);
        p.setImageURL1(ImageURL1);
        p.setImageURL1(ImageURL2);
        p.setImageURL1(ImageURL3);
        p.setImageURL1(ImageURL4);
        addProduct(p);
    }
    
    public void addProduct(Product product)
    {
        EntityManager em=DBUtil.getEmFactory().createEntityManager();
        EntityTransaction et=em.getTransaction();
        try
        {
            et.begin();
            em.persist(product);
            et.commit();
        }
        catch(Exception e)
        {
            et.rollback();
        }
        finally
        {
            em.close();
        }
    }
    
    public ArrayList<String> getCategory()
    {
        EntityManager em=DBUtil.getEmFactory().createEntityManager();
        String qString="SELECT Distinct P.CatalogCategory FROM Product p";
        try
        {     
            TypedQuery<String> tq = em.createQuery(qString,String.class);
            List<String> c= tq.getResultList();
            ArrayList<String> cat=new ArrayList<>(c);
            return cat;
        }
        finally
        {
            em.close();
        }
    }  
 }
