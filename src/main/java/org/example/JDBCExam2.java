package org.example;

import org.example.dao.RoleDao;
import org.example.dto.Role;

public class JDBCExam2 {
    public static void main(String[] args) {
        int roleId = 501;
        String description = "CFO";

        Role role = new Role(roleId, description);

        RoleDao dao = new RoleDao();
        int insertCount = dao.addRole(role);

        System.out.println(insertCount);
    }
}
