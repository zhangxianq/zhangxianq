package zxq;

import com.mysql.jdbc.JDBC4Connection;

public class ConnectionFactory  extends  HibernateDaosupfff{
    public void connect(){
        Configuration config = new  Configuration().configure("com/ebookstore/config/hibernate.cfg.xml");
        Session session = config.buildSessionFactory().openSession();


        Transaction tran=session.beginTransaction();
        tran.begin();



        session.save(object);
        tran.commit();
        session.flush();
    }
}
