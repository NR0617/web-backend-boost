package org.example;

import org.example.dao.RoleDao;
import org.example.dto.Role;

public class JDBCExam {
    public static void main(String[] args) {
        RoleDao dao = new RoleDao();
        Role role = dao.getRole(100);
        System.out.println(role);
    }
}
