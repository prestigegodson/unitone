/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tp.neo.controller.helpers;

import com.tp.neo.model.Customer;
import com.tp.neo.model.Notification;
import com.tp.neo.model.NotificationType;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author swedge-mac
 */
public class NotificationsManager {
 
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("NeoForcePU");
    EntityManager em = emf.createEntityManager(); 
    
    public String route = ""; 
    
    public NotificationsManager(String route){
        this.route = route;
    }

    public int createOrderNotification(Customer customer){
        String title = String.format("New order for % %", customer.getFirstname(), customer.getLastname());
        
        Notification notification = new Notification();
        NotificationType notificationType = new NotificationType();
        
        notification.setTitle(title);
        notification.setRoute(route);
        notification.setStatus((short)0);
        notification.setCreatedDate(new Date());
        notification.setClearOnClick((short)0);
        notification.setTypeId((NotificationType)em.createNamedQuery("NotificationType.findByAlias").setParameter("alias", "ALERT_NEW_ORDER").getSingleResult());
        
        em.persist(notification);
        em.flush();
        
        return 1;
    }
}