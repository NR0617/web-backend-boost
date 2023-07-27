package org.example;


import org.example.dao.RoleDao;
import org.example.dto.Role;

import java.util.List;

public class JDBCExam3 {
    public static void main(String[] args) {

        RoleDao dao = new RoleDao();

        List<Role> list = dao.getRoles();

        for(Role role : list) {
            System.out.println(role);
        }
    }
}
