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
    
    public User findByIndex(int index) {
        User user = users.get(index);
        return user;
    }
      
    public void edit(int index, User userEdited) {
        users.set(index, userEdited);
    }
    
    public void delete(int index) {
        users.remove(index);
    }
}
