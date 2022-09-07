import java.util.*;

public class GenerateSubsets{
	public static void main(String[] args){
		subsets("abc","");
	}

	public static void subsets(String str, String out){
		if(str.length()==0){
			System.out.println(out);
			return;
		}

		subsets(str.substring(1, str.length()),out);
		subsets(str.substring(1, str.length()),out+str.charAt(0));
	}
}