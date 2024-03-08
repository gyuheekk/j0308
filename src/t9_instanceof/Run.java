package t9_instanceof;

public class Run {
	public static void main(String[] args) {
		
		//Aa aa = new Aa();
		Aa aa = new Bb();
		
		//aa객체가 과거에 Aa타입으로 업캐스팅 했었는지를 알아보고 처리해야함.(instanceof)
		if(aa instanceof Bb) {//객체(변수)명 인스턴스 타입명 //인스턴스오브 -> 업캐스팅이 됐는지를 확인하기 위해 사용
			Bb bb = (Bb)aa;
			System.out.println("Down Casting성공");
		}
		else {
			System.out.println("Down Casting불가");
		}
	}
}
