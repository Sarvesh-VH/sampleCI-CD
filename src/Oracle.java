
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// write a string s="My name is Sarvesh", reverse and 
		//o/p = "hs evra Ss iemanyM"
		
		String str="My name is Sarvesh";
		String strNoSpace;
		String strRev = "";
		ArrayList<Integer> spaceIndex= new ArrayList<Integer>();
		String resultStr;
		for (int i=str.length()-1;i>=0;i--){
		     if(String.valueOf(str.charAt(i)).equals(" ")){
		         spaceIndex.add(i);
		     } else {
		         strRev += String.valueOf(str.charAt(i));
		     }
		}
		System.out.println(strRev);
		System.out.println(spaceIndex);
		String finalStr = "";
		int j =0;
		for (int i=0;i<str.length();i++){
		    if(spaceIndex.contains(i)){ 
		        finalStr += " ";
		        continue;
		    }
		    finalStr += String.valueOf(strRev.charAt(j));
		    j++;
		}
		System.out.println(finalStr);

	}

}
