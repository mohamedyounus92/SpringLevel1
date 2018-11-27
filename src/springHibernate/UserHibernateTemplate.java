/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springHibernate;

import org.springframework.orm.hibernate4.HibernateTemplate;

/**
 *
 * @author md_yo
 */
public class UserHibernateTemplate implements IUserDAO {

    private HibernateTemplate template;
    
    @Override
    public void saveUserRecord(User u) {
        try
        {
            template.save(u);
            template.flush();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    /**
     * @param template the template to set
     */
    public void setTemplate(HibernateTemplate template) {
        this.template = template;
    }

    /**
     * @return the template
     */
    public HibernateTemplate getTemplate() {
        return template;
    }
    
}
