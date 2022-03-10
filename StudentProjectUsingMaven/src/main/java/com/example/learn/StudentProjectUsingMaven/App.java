package com.example.learn.StudentProjectUsingMaven;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        //add
        Student s=new Student();
    	s.setId(103);
    	s.setName("Choudhary");
    	s.setAge(21);
    	System.out.println(s);
    	Configuration conf=new Configuration().addAnnotatedClass(Student.class);
    	conf.configure("hibernate.cfg.xml"); //class
    	SessionFactory sf=conf.buildSessionFactory(); // interface
	    Session session=sf.openSession(); //interface
	    Transaction tx=session.beginTransaction();
    	session.save(s);
    	tx.commit();
    	session.close();
    	sf.close();
	    System.out.println(session);
        
        
        
	    
	    //update
        
        
//    	Configuration conf=new Configuration().addAnnotatedClass(Student.class);
//    	conf.configure("hibernate.cfg.xml"); //class
//    	SessionFactory sf=conf.buildSessionFactory(); // interface
//	    Session session=sf.openSession(); //interface
//	    Transaction tx=session.beginTransaction();
//	    int id=101;
//	    int age=30;
//	    String name="Omansh";
//    	Student s=session.get(Student.class,id);
//    	s.setAge(age);
//    	s.setName(name);
//    	tx.commit();
//    	session.close();
//    	sf.close();
//	    System.out.println(session);
        
        //reterive
//    	Configuration conf=new Configuration().addAnnotatedClass(Student.class);
//    	conf.configure("hibernate.cfg.xml"); //class
//    	SessionFactory sf=conf.buildSessionFactory(); // interface
//	    Session session=sf.openSession(); //interface
//    	Query query=session.createQuery("from Student");
//    	List<Object[]> students=(List<Object[]>)query.list();
//    	System.out.println(students);
//    	session.close();
//    	sf.close();
        
      //delete
//    	Configuration conf=new Configuration().addAnnotatedClass(Student.class);
//    	conf.configure("hibernate.cfg.xml"); //class
//    	SessionFactory sf=conf.buildSessionFactory(); // interface
//	    Session session=sf.openSession(); //interface
//	    Transaction tx=session.beginTransaction();
//	    int id=101;
//    	Student s=session.get(Student.class,id);
//    	session.delete(s);
//    	tx.commit();
//    	session.close();
//    	sf.close();
//	    System.out.println(session);
        
        //sort based on id
        
        
        
    }
}
