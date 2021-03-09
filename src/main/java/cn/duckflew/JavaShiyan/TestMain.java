package cn.duckflew.JavaShiyan;

import com.mysql.cj.protocol.Resultset;
import jdk.nashorn.internal.runtime.linker.LinkerCallSite;

import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestMain
{
    public static void main(String[] args) throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("ss", "ss", "ss");
        String sql="sss";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next());
    }
}
