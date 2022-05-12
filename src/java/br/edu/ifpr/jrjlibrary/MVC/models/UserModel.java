/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.jrjlibrary.MVC.models;

import br.edu.ifpr.jrjlibrary.MVC.entities.User;
import java.util.ArrayList;

/**
 *
 * @author jvolima
 */
public class UserModel {
    static ArrayList<User> users = new ArrayList();
    
    public ArrayList<User> getUsers() {
        return users;
    }
    
    public void create(User user) {
        users.add(user);
    }
    
    public User findByEmail(String email) {
        User user = null;
        for(User u: users) {
            if(u.getEmail().equals(email)) {
                user = u;
            }
        };
        
        return user;
    }
    
    public void edit(String email, User userEdited) {
        User user = findByEmail(email);
        
        int index = users.indexOf(user);
        
        users.set(index, userEdited);
    }
    
    public void delete(String email) {
        User user = findByEmail(email);
        users.remove(user);
    }
}
