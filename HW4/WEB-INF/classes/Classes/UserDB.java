package Classes;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;


public class UserDB 
{
    
    public void addUser(String First_Name,String Last_Name,String Email_Adress,String Address_1_Field,String Address_2_Field,String City,String State,int Post_Code,String Country,String Password)
    {
        User u=new User();
        addUser(u);
    }

    public void addUser(User u)
    {
        EntityManager em=DBUtil.getEmFactory().createEntityManager();
        EntityTransaction et=em.getTransaction();
        try
        {
            et.begin();
            em.persist(u);
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

    public ArrayList<User> getAllUsers()
    {
        EntityManager em= DBUtil.getEmFactory().createEntityManager();
        String qString="SELECT U FROM User U";
        try
        {
            TypedQuery<User> tq = em.createQuery(qString,User.class);
            List<User> u= tq.getResultList();
            ArrayList<User> u1=new ArrayList<>(u);
            return u1;
        }
        finally
        {
            em.close();
        }
    } 
    
    public User getUser(int UserID)
    {
        EntityManager em=DBUtil.getEmFactory().createEntityManager();
        try
        {
            User u=em.find(User.class,UserID);
            return u;
        }
        finally
        {
            em.close();
        }
    }
    
    public void updateUser(User u)
    {
        EntityManager em=DBUtil.getEmFactory().createEntityManager();
        EntityTransaction et=em.getTransaction();
        try
        {
            et.begin();
            em.merge(u);
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

    public void deleteUser(User u)
    {
        EntityManager em=DBUtil.getEmFactory().createEntityManager();
        EntityTransaction et=em.getTransaction();
        try
        {
            et.begin();
            em.remove(em.merge(u));
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

}