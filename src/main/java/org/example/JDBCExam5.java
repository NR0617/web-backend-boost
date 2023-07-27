package org.example;

import org.example.dao.RoleDao;
import org.example.dto.Role;

public class JDBCExam5 {
    public static void main(String[] args) {
//수정테스트
        int roleId = 500;
        String description = "CFO";

        Role role = new Role(roleId, description);

        RoleDao dao = new RoleDao();
        int updateCount = dao.updateRole(role);

        System.out.println(updateCount);
    }
}