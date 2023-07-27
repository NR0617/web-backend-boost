package org.example.dao;

import org.example.dto.Role;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RoleDao {
    private static String dbUrl = "jdbc:mysql://localhost:3306/connectdb?useSSL=false&serverTimezone=UTC";
    private static String dbUser = "connectuser";
    private static String dbPasswd = "connect123!@#";
    public Role getRole(Integer roleId) {

        Role role = null;
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.jdbc.Driver"); // 드라이버를 로딩
            conn = DriverManager.getConnection(dbUrl, dbUser, dbPasswd);
            String sql = "SELECT role_id,description FROM role WHERE role_id = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, roleId); // 첫번째 인자인 parameterIndex는 물음표의 순서, 두번재는 넣을 값
            rs = ps.executeQuery(); //ps를 실행해주세요 - rs에 결과가 들어온다
            if(rs.next()) {
                int id = rs.getInt("role_id"); //컬럼의 이름을 넣으면 해당 컬럼
                String description = rs.getString(2);// 숫자를 넣으면 꺼내오는 값의 순서, select문의 순서와 동일
                role = new Role(id, description);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return role;
    }

    public int addRole(Role role) {
        int insertCount = 0;

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String sql = "INSERT INTO role (role_id, description) VALUES ( ?, ? )";


        try (Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPasswd);
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, role.getRoleId()); // index는 sql의 물음표 순서
            ps.setString(2, role.getDescription());


            insertCount = ps.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return insertCount;
    }
    public List<Role> getRoles() {
        List<Role> list = new ArrayList<>();

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        String sql = "SELECT description, role_id FROM role order by role_id desc";
        try (Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPasswd);
             PreparedStatement ps = conn.prepareStatement(sql)) {

            try (ResultSet rs = ps.executeQuery()) {

                while (rs.next()) {
                    String description = rs.getString(1);
                    int id = rs.getInt("role_id");
                    Role role = new Role(id, description);
                    list.add(role); // list에 반복할때마다 Role인스턴스를 생성하여 list에 추가한다.
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return list;
    }
}
