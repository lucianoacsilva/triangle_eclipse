package triangle;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Triangle   tr = new Triangle();
        FileHand   fr = new FileHand();
        String path = "data";
        int [] side;

        ArrayList<int[]> sideTriangle = fr.readSide(path);

        for(int j =0; j < sideTriangle.size(); j++) {

            side = sideTriangle.get(j);

            if (tr.isTriangle(side[0], side[1], side[2])) {

                if (tr.isEquilateral(side[0], side[1], side[2]) == 1) {

                    System.out.println("Equilateral");

                } else {

                    if (tr.isScalene(side[0], side[1], side[2]) == 2) {

                        System.out.println("Isoscele");

                    } else {

                        if (tr.isIsosceles(side[0], side[1], side[2]) == 3) {

                            System.out.println("Scalene");

                        }

                    }

                }

            } else {

                System.out.println("It is not a Triangle.");

            }
        }
    }
}


class FileHand {

    public ArrayList<int[]> readSide (String path) {

        ArrayList<int[]> line = new ArrayList<>();
        String[] str;
        File fi = new File(path);

        try {

            BufferedReader br = new BufferedReader(new FileReader(fi));

            while (br.ready()) {

                str = br.readLine().split(",");
                int[] side = new int[3];

                for(int i = 0; i < str.length; i++) {
                    side[i] = Integer.parseInt(str[i]);
                }

                line.add(side);

            }

            br.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return line;

    }
    
    interface operation {
    	
    	public abstract int perimeter(int a, int b, int c);
    	
    	public abstract int inTriangle(int[][] A, int[][] B);
    	
    	public abstract int outTriangle(int[][] A, int[][] B);
    	
    	public abstract int overlaidTriangle(int[][] A, int[][] B);
    	
    }

}
