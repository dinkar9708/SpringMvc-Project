package springmvc.Dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import springmvc.model.User;
import java.util.List;

import javax.transaction.Transactional;

@Repository
public class UserDao {
    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Transactional
    public int saveUser(User user){
        int id = (Integer) this.hibernateTemplate.save(user);
        return id;
    }
    public List<User> displayUser(){
        List<User> list = this.hibernateTemplate.loadAll(User.class);
        return list;
    }
    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    public UserDao() {
    }

    public UserDao(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }


}
