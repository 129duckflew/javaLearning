package cn.duckflew.JavaClubTest;

import java.sql.*;

public class TestPreparstatement
{

    public static void main(String[] args) throws ClassNotFoundException
    {
        String url="jdbc:mysql://localhost:3306/bigBlog?serverTimezone=GMT";
        String username="root";
        String password="yourPassword";
        Class.forName("com.mysql.cj.jdbc.Driver");
        try
        {
            Connection connection=DriverManager.getConnection(url,username,password);
            String sql="select * from blog_user where id=?";
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setInt(1,1);
            ResultSet resultSet = preparedStatement.executeQuery();
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();
            for (int i = 1; i <= columnCount; i++)
            {
                System.out.print(metaData.getColumnName(i));
                System.out.print("  ");
            }
            System.out.println();
            resultSet.next();
            for (int i = 1; i <=columnCount ; i++)
            {
                System.out.print(resultSet.getString(i));
                System.out.print("  ");
            }
        } catch (SQLException throwables)
        {
            throwables.printStackTrace();
        }
    }
}
