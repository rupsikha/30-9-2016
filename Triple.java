public class Triple {
	public int countTriple(String s) {
		int count=0,n;
		n=s.length();
		for(int i=0; i<n-2; i++)
		{
			
			if(s.charAt(i) == s.charAt(i+1)){
				if(s.charAt(i) == s.charAt(i+2))
				{
				count++;
			}
			}
			
		}
			return count;	
		
	}
}
