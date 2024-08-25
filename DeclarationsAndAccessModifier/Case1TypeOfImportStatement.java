package DeclarationsAndAccessModifier;


//import java.util.ArrayList;
//import java.util.ArrayList.*;
//import java.util;
import java.util.*;
import java.sql.*;

/*
 * There are two types of import statement 
 * 1)Explicit class import --> import java.util.ArrayList; --->It is highly recommend to use explicit class import because it improves readablity of the code.
. * 2)Implicit class import--> import java.util.*;--> NOt recommend to use because it reduces readiblity of the code 
 */

 /*

Whenever we are using fully qualified it is not required to write import statment simillary whenever we are wrting import statment it is not required to use fully qualified name


  */
   
public class Case1TypeOfImportStatement {
 public static void main(String[] args) {
  //  Date d= new Date(); -->Reference to date is ambigous

  /*
   * in case of list we may get ambigouity problem 
   * 
   */
  /*
   * while resolving class name compiler will always give the precedence in the following order ex
   * HIghest priority goes to explicit class import 
 * classes present in current working directory
 * Implicit class import
 */
 
 /*
  * Wheneverwe are importing  a java package all classes and interfaces preent in that package is by default available but not subpackage classes
  \if we want touse subpackage class compulosry we should write import statement util subpackage

  to use pattern class in our program import java.util.regex.*;
  */

  /*
   * All classes and interfaces present in java.lang and default package are by default available to every java program hence we are not required to write import statement
   */
 }   
}
