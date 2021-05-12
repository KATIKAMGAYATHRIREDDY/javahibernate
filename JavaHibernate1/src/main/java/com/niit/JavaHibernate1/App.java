package com.niit.JavaHibernate1;
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
	        StudentName studentName = new StudentName("fname","mname","lname");
	        Student student = new Student(21, null, 3,33);

	       // Student student = new Student(4, "Ramu", 5,55);
	       //Student student1 = new Student(3, "Ram", 4,44);
	        //System.out.println(student);
	        Configuration configuration = new Configuration().configure().addAnnotatedClass(Student.class);
	        
	        SessionFactory sessionFactory = configuration.buildSessionFactory();
	        Session session = sessionFactory.openSession();
	        Transaction transaction = session.beginTransaction();
	      session.save(student);
	      //  session.save(student1);
	      //  session.save(student2);

	       transaction.commit();
	        //Student s1=session.get(Student.class, 1);
	        //System.out.println(s1);
	        
	      
	    }
}