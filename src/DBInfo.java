

		import java.sql.*;

	public	 class DBInfo {
		   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
		   static final String DB_URL = "jdbc:mysql://localhost/project1";

		   //  Database credentials
		   static final String USER = "root";
		   static final String PASS = "root";
		   
		public  static Connection ConnectDB()
		   {
			   Connection conn = null;
		   
		   try{
		      Class.forName("com.mysql.jdbc.Driver");
		      System.out.println("Connecting to database...");
		      conn = DriverManager.getConnection(DB_URL,USER,PASS);
		   
		   }catch(SQLException se){
		      se.printStackTrace();
		      return null;
		   }catch(Exception e){
		      e.printStackTrace();
		      return null;
		   }finally{
		      
		         
		    	  if(conn!=null)
		           return conn;
		    	  else
		    	  return null;
		   }
		   }
		 }

