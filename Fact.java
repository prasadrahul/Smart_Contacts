import java. sql. * ;

public class Fact {



public Connection makeConnection()
throws SQLException {

try {
Class.forName("com.mysql.jdbc.Driver");
} catch (ClassNotFoundException e) {
   throw new SQLException("Unable to load driver class"); }
return DriverManager.getConnection("com.mysql.jdbc.Driver");
}


public Connection makeConnection(String URL)
throws SQLException {
return DriverManager. getConnection(URL) ;
}


public Connection makeConnection(String DriverName, String URL)
throws SQLException {
try {
Class.forName(DriverName);
} catch (ClassNotFoundException e) {
throw new SQLException("Unable to load driver class"); }
return DriverManager.getConnection(URL);


public Connection makeConnection(String URL, String username,String password)
throws SQLException {
return DriverManager. getConnection(URL, username, password) ;
}


public Connection makeConnection(String DriverName, String URL,String username, String password)
throws SQLException {
try {
Class.forName(DriverName);
} catch (ClassNotFoundException e) {
throw new SQLException("Unable to load driver class");
}
return DriverManager.getConnection(URL,username,password);
public void closeConnection(Connection c, Statement s)
{
try {
if (s != null) s.close();
if (c != null) c.close();
} catch (SQLException sqlex) {}
}


// my name is rahul



public static void main(String args[]) {
Fact CJ = new Fact();
Connection dbConnect = null;
Statement dbStatement = null;
try {
switch (args.length) {
case 0 : dbConnect = CJ.makeConnection();
break;
case 1 : dbConnect = CJ.makeConnection(args[O]);
break;
case 2 : dbConnect = CJ.makeConnection(args[O],args[l]);
break;
case 3 : dbConnect = CJ.makeConnection(args[O],args[l],args[2]);
break;
case 4 : dbConnect = CJ.makeConnection(args[O],args[l],args[2],args[3]);
break;
default :
System.out.println("Using the default driver");
dbConnect = CJ.makeConnection();
}
System.out.println("Made a connection!");
dbStatement = dbConnect.createStatement();
System.out.println("Made a statement!");
} catch (SQLException sqlex) {
System.out.println(sqlex.getMessage());
}
finally {
CJ.closeConnection(dbConnect,dbStatement);
System.out.println("Closed the connection.");
}


}
}