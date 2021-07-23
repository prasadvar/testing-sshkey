package com.test.me.control;
import com.test.me.dao.dataclass;
import com.test.me.pojo.baseclass;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.transaction.Transactional;
import java.util.Collection;
import java.util.List;

@RequestMapping("/baseclass")
@Controller
public class controlling
{
    public SessionFactory sessionFactory;
    @Transactional
    @RequestMapping(value = "/submitForm")
    public  String submitForm(@ModelAttribute("baseclass")baseclass ss, Model model){
       sessionFactory = dataclass.getInstnce();
       Session session=sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(ss);

        Transaction tx1=session.beginTransaction();
        List<baseclass> personList;
        Query query = (Query) session.createQuery("from baseclass hs");
        Collection<baseclass> queryList =query.list();
        if (queryList != null && queryList.isEmpty()) {
            return null;
        } else {
            //   System.out.println("list " + queryList);
            personList=(List<baseclass>) queryList;
        }
        model.addAttribute("baseclass",new baseclass());
        model.addAttribute("personList",personList);
        tx1.commit();
        session.close();
        sessionFactory.close();
    return "out";

    }
}
