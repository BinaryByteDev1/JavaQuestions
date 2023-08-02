public class Main {
	public static void main(String[] args) {
		int n = 5;
		for(int row =1; row <= n; row++){
			for(int col = 1; col <= 5; col++){
				
				if(row == 1 || row == n || col == 1 || (row == 3 && col > 2 )|| (row == 4 && col == 5) ){
					System.out.print(" # ");
					
				}else{
					System.out.print("   ");
					
					}
				
				}
				System.out.println();
				System.out.println();
			}
	}
}