import java.util.*;

public class PrintingAllPermutations{

	public static void main(String[] args){

	}

	public static void permutations(String s, int i){
		if(i==s.length()-1){
			System.out.print(str+" ");
			return;
		}

		for(int j=i;j<s.length();j++){
			swap(s,s[i],s[j]);
			permutations(s,i+1);
			swap(s,s[i],s[j]);
		}
		
	}

	static String swap(String str, int i, int j)
    {
        if (j == str.length() - 1)
            return str.substring(0, i) + str.charAt(j)
                + str.substring(i + 1, j) + str.charAt(i);
 
        return str.substring(0, i) + str.charAt(j)
            + str.substring(i + 1, j) + str.charAt(i)
            + str.substring(j + 1, str.length());
    }
}