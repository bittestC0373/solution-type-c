package problem02;

public class MyService extends BaseService {
	
	public String afternoon() {
		return "오후";
		return null;
	}
	
	public void service(String state) {
		String result = state.equals("오후") ? afternoon() : result ;
		System.out.println(result+"서비스시작");
	}
	
	
}
