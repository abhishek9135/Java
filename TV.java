 public class TV { 
      private String make; 
      private String model; 
      public TV(String make, String model) { 
                this.make = make; 
                this.model = model; 
            } 
      public boolean equals(TV other) {
      	 return make.equals(other.make)  && model.equals(other.model); 
      } 
        public int hashCode() { 
        	return make.length() * 10 + model.length(); 
        }  
      public static void main(String args[]){
      	TV a = new TV("Philips", "42PFL5603D");
      	TV b = new TV("Philips", "42PFL5603D");
      	if(a.equals(b)) {
      	    System.out.println("equal"); 
      	} else {
      	    System.out.println("not equal"); 
      	}   
      	int as = a.hashCode();
      	int ab = b.hashCode();

      	System.out.println(" hashCode value of TV A:-"+ as+ " hashCode value of TV B:- "+ ab);
      }
 }