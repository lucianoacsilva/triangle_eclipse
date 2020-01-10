package triangle;

public class Triangle {

	    public boolean isTriangle(int a, int b, int c) {

	        if ((a >= b + c) || (b >= a + c) || (c >= a + b)) {

	            return false;

	        }

	        return true;

	    }

	    public  int isEquilateral (int a, int b, int c) {

	        if (a == b && b == c) {
	            return 1;
	        }

	         return -1;

	    }

	    public  int isScalene (int a, int b, int c) {

	        if (a != b && a != c && b != c) {

	            return 2;

	        }

	        return -1;

	    }

	    public  int isIsosceles (int a, int b, int c) {

	        if ((a == b && a != c) || (a == c && a != b) || (b == c &&  b != a)) {

	            return 3;

	        }

	        return -1;

	    }
	    
	    
	    public  int isRectangle (int a, int b, int c) {
	    	
	    	
	        if ((a*a == b*b + c*c) || (b*b == a*a + c*c) || (c*c == a*a + b*b)) {

	            return 4;

	        }

	        return -1;

	    }


}

