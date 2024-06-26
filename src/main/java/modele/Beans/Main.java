package modele.Beans;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();		
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		System.out.println(factory);
		Session session = factory.openSession();
		session.beginTransaction();
		session.getTransaction().commit();
		session.close();
		factory.close();
	}
}
