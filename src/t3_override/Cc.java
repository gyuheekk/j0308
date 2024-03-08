package t3_override;

public class Cc extends Aa {
	
//원넓이
//	public void areaCircle(int r) {
//		double area = r * r * Math.PI;
//		System.out.println("반지름 "+r+"인 원넓이는? " + area);
//	}
	
	
//	public void areaCircle(int r) {
//		double area = r * r * 3.14;
//		System.out.println("반지름 "+r+"인 원넓이는? " + area);
//	}
	
	public void areaCircle2(int r) { // 오버라딩은 리턴타입 안 봄. 오버라이딩은 리턴타입까지도 봄
		double area = r * r * 3.14;
		System.out.println("반지름 "+r+"인 원넓이는? " + area);
	}
}
