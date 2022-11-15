package Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBMain {

	public static void main(String[] args)  {
		
		
		Scanner scanner =new Scanner(System.in);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			Connection connection=
					DriverManager.getConnection("jdbc:mysql://localhost:3306/demo1?user=root&password=SK@sql");
			
//			Data fetching
//			Statement statement=connection.createStatement();
//			ResultSet resultSet=statement.executeQuery("select * from animals");
//			while(resultSet.next()) {
//				for(int i=1;i<=5;i++) {
//					System.out.print(resultSet.getString(i)+" ");
//				}
//				System.out.println();
//			}
			
//			Data manipulation
			
//			Insertion
//			PreparedStatement preparedStatement=
//					connection.prepareStatement("insert into animals(name,type,color,lifespan) values(?,?,?,?)");
//			String name=scanner.nextLine();
//			String type=scanner.nextLine();
//			String color=scanner.nextLine();
//			String life=scanner.nextLine();
//			
//			preparedStatement.setString(1, name);
//			preparedStatement.setString(2, type);
//			preparedStatement.setString(3, color);
//			preparedStatement.setString(4, life);
			
			
//			Data delete
			
//			PreparedStatement preparedStatement=
//					connection.prepareStatement("delete from animals where id=?");
//			preparedStatement.setInt(1, 4);

//			Data update
			
			PreparedStatement preparedStatement=
					connection.prepareStatement("update animals set type=? where id=?");
			preparedStatement.setString(1, "Tiger");
			preparedStatement.setInt(2,6);
			
			int status=preparedStatement.executeUpdate();
			
			if(status==1) {
				System.out.println("Successfully Executed");
			}else {
				System.out.println("Failed");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

		
		
	}
}
