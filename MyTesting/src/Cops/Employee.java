package Cops;

public class Employee {
	
	
	int  eid;
	String name;
	int exp;
	int sal;
	//Methods
	void dispaly(){
		System.out.println(eid);
		System.out.println(name);
		System.out.println(exp);
		System.out.println(sal);
	}
	
	//we can take data and store as method
	
	void setData (int id, String nam, int exp1 , int sal1) {
	    eid = id;
	    name= nam;
	    exp = exp1;
	    sal = sal1;
	    System.out.println(eid+" "+name+" "+" "+exp+" "+" "+sal);
	}
	    
	    //constructor must same name  for  method nama as class name 
	    // never return any value
	    //syntax : Employe() it can take parameters, as normal
  // these contructors can call while creating object 
	    /* used for only intializes data into variables 
	     * but for method we can write loos,conditinal,etc..it may retrun or may not
	     * 
	     *  we can store data into varaibles 
	     *  
	     *  !) by using object reference 
	     *  method
	     *  constructor
	     *  types of c :- default 
	     *                parameterized
	     */
	    
	    Employee(int id, String nam, int exp1 , int sal1) 
	    {
	    	eid = id;
	 	    name= nam;
	 	    exp = exp1;
	 	    sal = sal1;
	 	    
	    }

	public static void main(String[] args) {
		/*Employee emp1 =new Employee();
		emp1.name = "Sindhu";
		emp1.eid= 1;
		emp1.sal = 2;
		emp1.exp = 3;
		emp1.dispaly();
		
		Employee emp2 =new Employee();
		emp2.name = "Jashu";
		emp2.eid= 1;
		emp2.sal = 2;
		emp2.exp = 3;
		
		Employee emp3 = new Employee();
		emp3.setData(1, "Sindhuja", 2 ,3);
		emp2.dispaly();*/
		
		Employee emp4 = new Employee(101,"banti" ,1,3);
		emp4.dispaly();
		
	}

}
