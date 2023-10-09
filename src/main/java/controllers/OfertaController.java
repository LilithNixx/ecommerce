/*package controllers;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class OfertaController {
    public String createOferta(String unaDescripcion, int unStock, int unCodigoOferta, Float unPrecio) {
        return "Oferta creada";
    }

    SessionFactory sessionFactory = new Configuration().configure("Hibernate.cgf.xml").addAnnotationClass(Oferta.class).buildSessionFactory();

    Session session = sessionFactory.openSession();

    try {
        Oferta oferta = new Oferta(unaDescripcion, unStock, unCodigoOferta, unPrecio);
        session.beginTransaction();
        session.save(oferta);
        session.getTransaction().commit(); //efectuar cambio.
        sessionFactory.close(); //cierra o detiene todo.
        
        return "Oferta creada";

    } catch (Exception e) {

        e.printStackTrace();
    }
}*/
