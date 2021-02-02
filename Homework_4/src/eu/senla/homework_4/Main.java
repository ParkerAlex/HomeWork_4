package eu.senla.homework_4;



public class Main {
	
	public static void main(String[] args) {
		
		final String ABC = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String symbolABC = "";
		int randomABC;
		 
///////////////////////////////////////////PART-1/////////////////////////		 
	String matrix[][] = new String [10][10];

	 for(int i = 0; i < matrix.length; i++){
		 for(int j = 0; j < matrix.length; j++){
			 	 
			 if (j % 3 == 0) {
				 matrix[i][j] = String.valueOf((double) (Math.random() * matrix.length)).substring(0,6);	 
			 }else {
				    for(int counter = 0; counter < 6; counter++){
					  randomABC = (int)(Math.random() * ABC.length());
					  symbolABC += ABC.charAt(randomABC);
				 } 
				 
				 matrix[i][j] = symbolABC;
				 symbolABC = "";
			 }
		 
		 }
     }
	
	 for(int i = 0; i < matrix.length; i++){
		 for(int j = 0; j < matrix.length; j++){
			 System.out.print(matrix[i][j] + " ");
		 }
		 System.out.println();
     }
	 System.out.println();
	 
///////////////////////////////////////////PART-2/////////////////////////	 
	 String[] diagonalMain = new String [matrix.length]; 
     int x = 0;
     
	 
	   for(int i = 0; i < matrix.length; i++){
		  
		   diagonalMain[i] =  matrix[i][i];
					  		      
			System.out.print(diagonalMain[i] + " ");
		 }
	   System.out.println();
	   
	   String[] diagonalSide = new String [matrix.length]; 
	     int y = 0;
			       
	   for(int i = 0; i < matrix.length; i++){
			 
		   diagonalSide[i] =  matrix[i][matrix.length - i - 1];
			System.out.print(diagonalSide[i] + " ");
		 }
	   System.out.println();
	   System.out.println();
	   
	   System.out.println(diagonalSide == diagonalMain);
	   
	   if(diagonalMain == diagonalSide) {
		   System.out.print("DIAGONALI RAVNI");
	   }else {
		   System.out.print("DIAGONALI NERAVNI");
	   }
	   System.out.println();
	   System.out.println();
	   
	   int z = diagonalMain.length + diagonalSide.length;
 
	   String[] diagonal = new String [z];
	   
	   System.arraycopy (diagonalMain, 0, diagonal, 0, diagonalMain.length);
	   System.arraycopy (diagonalSide, 0, diagonal, diagonalMain.length, diagonalSide.length);
	   
	   for(int xy = 0; xy < z; xy++){
		  
		   System.out.print(diagonal[xy] + " ");
		 }
	   System.out.println();
	   System.out.println();
	   Character str = 0;
	   String numberOnly = "";  
	   
	   
	  
	  	   for(int xy = 0; xy < z; xy++){
		       str = diagonal[xy].charAt(0);
		       
		      
		       
		       if (Character.isLetter(str) == true) {
		    	   StringBuffer strBuffer = new StringBuffer(diagonal[xy]);
		    	   String sb = strBuffer.substring(1,4);

		    	   System.out.print(sb + ", ");  
		    	  
		       }	       
	  	   }
	  	 System.out.println();
		   System.out.println();

	  	String number = "";
	 	
	  	 
	  	   for(int xy = 0; xy < z; xy++){
		       str = diagonal[xy].charAt(0);
		       if (Character.isDigit(str) == true) {
		    	   
		    	     number = diagonal[xy];
		    	     double dNumber = Double.parseDouble(number);  
		    	     
		    	     
		    	    if (dNumber > 1.7) {
		    	    	double result = Math.ceil(dNumber);
		    	    	System.out.print(result  + "_");  
		    	    }else {
		    	    	double result = Math.floor(dNumber);
		    	    	System.out.print(result  + "_");  
		    	    }

		       }
		      
	  	   }
	  	   
  
	}
	     	
	     }