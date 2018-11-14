package database;
/*Real*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Main {
	Main(){
		try {
		Connection conn = getConnection();
		createTable(conn);
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
	try {
		Connection conn = getConnection();
		createTable(conn);
		//insert1("user4",conn); 
		//insert1("user8",conn);
		//updatepassword("user4","pass2",conn);
		//delete("user6","h1",conn);
		//get(conn);
		//getProfile("user4",conn);
		//check("user2","conn);
		//bookingInfo("user2",conn);
		//System.out.println(check("user2","pass8",conn));
	} catch (Exception e){
		e.printStackTrace();
	}
}

public static /*ArrayList<String>*/ void get(Connection con) throws Exception{
    try{
        PreparedStatement statement = con.prepareStatement("SELECT password FROM userdata ");
       
        ResultSet result = statement.executeQuery();
        //System.out.print(result.getString("password"));
        ArrayList<String> array = new ArrayList<String>();
        while(result.next()){
            //System.out.print(result.getString("name"));
            array.add(result.getString("password"));
        }
        System.out.println("All records have been selected!");
        for(int i=0;i<array.size();i++) {
        	System.out.println(array.get(i));
        }
        //return array;
       
    }catch(Exception e){System.out.println(e);}
    //return null;
   
}

public static ArrayList<ArrayList<String>> bookingInfo(String usrname,Connection con) throws Exception{
    try{
    	
        PreparedStatement statement = con.prepareStatement("SELECT username,aadhar,hotelcode,checkin,checkout,singlerooms,doublerooms"
        		+ " FROM userdata WHERE username='"+usrname+"'  ");
       
        ResultSet result = statement.executeQuery();
        //System.out.print(result.getString("password"));
        ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
        
        int j=0;
        while(result.next()){
        	list.add(new ArrayList<>());
            list.get(j).add(result.getString("username"));
            list.get(j).add(result.getString("aadhar"));
            list.get(j).add(result.getString("hotelcode"));
            list.get(j).add(result.getString("checkin"));
            list.get(j).add(result.getString("checkout"));
            list.get(j).add(result.getString("singlerooms"));
            list.get(j).add(result.getString("doublerooms"));
            j++;
        }
        
        System.out.println("All records have been selected!");
        for(int i=0;i<list.size();i++){
        	for(int k=0;k<7;k++){
        		System.out.print(list.get(i).get(k)+" ");
        	}
        	System.out.println("");
        }
        return list;
       
    }catch(Exception e){System.out.println(e);}
    return null;
}

public static ArrayList<String> getProfile(String usrname,Connection con) throws Exception{
    try{
        PreparedStatement statement = con.prepareStatement("SELECT username,password,name,dob,email FROM userdata WHERE username='"+usrname+"'  ");
       
        ResultSet result = statement.executeQuery();
        //System.out.print(result.getString("password"));
        ArrayList<String> array = new ArrayList<String>();
        
        result.next();
        array.add(result.getString("username"));
        array.add(result.getString("password"));
        array.add(result.getString("name"));
        array.add(result.getString("dob"));
        array.add(result.getString("email"));
        
        System.out.println("All records have been selected!");
        for(int i=0;i<array.size();i++) {
        	System.out.println(array.get(i));
        }
        return array;
       
    }catch(Exception e){System.out.println(e);}
    return null;
}

public static boolean check(String usrname,String pass,Connection con) throws Exception{
    try{
    	PreparedStatement statement = con.prepareStatement("SELECT password,username FROM userdata WHERE username='"+usrname+"' AND password='"+pass+"'");
    	ResultSet result = statement.executeQuery();
        ArrayList<String> array = new ArrayList<String>();
        while(result.next()){
            array.add(result.getString("username"));
        }
        System.out.println("All records have been selected!");
        if(array.isEmpty()) {
        	return false;
        }
        else {
        	return true;
        }
        
    } catch(Exception e){System.out.println(e);}
    finally {
        System.out.println("Insert Completed.");
    }
    return true;
}

public static boolean insert1(String usrname,String pass,String name,String dob,String email,Connection con) throws Exception{
    try{
    	/**/
    	PreparedStatement statement = con.prepareStatement("SELECT username FROM userdata WHERE username='"+usrname+"'  ");
        
        ResultSet result = statement.executeQuery();
        ArrayList<String> array = new ArrayList<String>();
        while(result.next()){
            array.add(result.getString("username"));
        }
    	if(!array.isEmpty()) {
    	    System.out.println("false");
    		return false;
    	}
    	/**/
    	PreparedStatement insert = con.prepareStatement("INSERT INTO userdata (username,password,name,dob,email)"
        		+ " VALUES ('"+usrname+"','"+pass+"','"+name+"','"+dob+"','"+email+"')");
        insert.executeUpdate();
        return true;
    } catch(Exception e){System.out.println(e);}
    finally {
        System.out.println("Insert Completed.");
    }
    System.out.println("true");
    return true;
}

public static void insert2(String usrname,String pass,String name,String dob,String email,
		String aadhar,String hotelcode,String checkin,String checkout,String singlerooms,String doublerooms,Connection con) throws Exception{
    try{
        
        PreparedStatement insert = con.prepareStatement("INSERT INTO userdata (username,password,name,dob,email,aadhar,hotelcode,checkin,checkout,"
        		+ "singlerooms,doublerooms)"
        		+ " VALUES ('"+usrname+"','"+pass+"','"+name+"','"+dob+"','"+email+"','"+aadhar+"','"+hotelcode+"','"+checkin+"','"+checkout+"','"+singlerooms+"','"+doublerooms+"')");
        insert.executeUpdate();
    } catch(Exception e){System.out.println(e);}
    finally {
        System.out.println("Insert Completed.");
    }
}

public static void delete(String usrname,String hc,Connection con) throws Exception{
    try{
        PreparedStatement delete = con.prepareStatement("DELETE FROM userdata WHERE username='"+usrname+"' AND hotelcode='"+hc+"'");
        delete.executeUpdate();
    } catch(Exception e){System.out.println(e);}
    finally {
        System.out.println("Delete Completed.");
    }
}


public static void updatepassword(String usrname,String pass,Connection con) throws Exception{
    try{
        PreparedStatement update = con.prepareStatement("UPDATE userdata SET password='"+pass+"' WHERE username='"+usrname+"'");
        update.executeUpdate();
    } catch(Exception e){System.out.println(e);}
    finally {
        System.out.println("Update Completed.");
    }
}

public static void createTable(Connection con) throws Exception{
	  try{
		  PreparedStatement create = con.prepareStatement(
				"CREATE TABLE IF NOT EXISTS "
		  		+ "userdata(id int NOT NULL AUTO_INCREMENT,"
		  		+ "username varchar(255),"
		  		+ "password varchar(255),"
		  		+ "name varchar(255),"
		  		+ "dob date,"
		  		+ "email varchar(255),"
		  		+ "aadhar varchar(255),"
		  		+ "hotelcode varchar(255),"
		  		+ "checkin date,"
		  		+ "checkout date,"
		  		+ "singlerooms int,"
		  		+ "doublerooms int,"
		  		+ "PRIMARY KEY(id))");
		  
		  create.executeUpdate();
	  } 
	  catch(Exception e){System.out.println(e);}
	  finally {
		  System.out.println("Creation Completed");
	  };

	 }
 public static Connection getConnection() throws Exception{
	  try{
	   String driver = "com.mysql.cj.jdbc.Driver";
	   String url = "jdbc:mysql://LOCALHOST:3306/userdatabase";
	   String username = "root";
	   String password = "dhruv23899";
	   Class.forName(driver);
	   
	   Connection conn = DriverManager.getConnection(url,username,password);
	   System.out.println("Connected");
	   return conn;
	  } catch(Exception e){System.out.println(e);}
	  return null;
	 }

}
