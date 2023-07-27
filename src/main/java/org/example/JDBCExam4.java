package org.example;

import org.example.dao.RoleDao;

public class JDBCExam4 {
    public static void main(String[] args) {
//삭제 테스트
        int roleId = 501;

        RoleDao dao = new RoleDao();
        int deleteCount = dao.deleteRole(roleId);

        System.out.println(deleteCount);
    }
}