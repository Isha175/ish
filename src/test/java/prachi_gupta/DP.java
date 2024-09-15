package prachi_gupta;

import org.testng.annotations.DataProvider;

public class DP {
	@DataProvider(name="searchdataset")
	public Object[][] searchdata(){
		Object[][] searchkey=new Object[3][2];
		searchkey[0][0]="India";
		searchkey[0][1]="qutub minar";
		
		searchkey[1][0]="agra";
		searchkey[1][1]="tajmahal";
		
		searchkey[2][0]="hyderabad";
		searchkey[2][1]="charminar";
		
		return searchkey;
	}
}
