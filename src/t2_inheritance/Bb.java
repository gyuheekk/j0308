package t2_inheritance;

public class Bb extends Aa {
	int su = item1;
	
	public Bb() {
		System.out.println("이곳은 Bb클래스의 기본생성자");
	}
	
	public Bb(int su) {
		super(10); //super()은 무조건 생성자의 첫번째에  와야한다.
		System.out.println("이곳은 Bb클래스의 사용자 정의 생성자, su = " + su);
	}
	
	public Bb(int item1, int x, int y) { // 생성자 생성
		super(item1, x, y);
	}
	
//사다리꼴 면적
	public void areaPoly(int x, int y, int z) {
		int area = (x + y) * z / 2;
		System.out.println("사다리꼴의 면적(윗변:"+x+", 아래변:"+y+", 높이:"+z+") : " + area);
	}
	
	
	// item1 = 100; 여기는 이 클래스의 필드가 들어가는 영역. 안되는 이유: 필드는 정의만 함. 동작을 시키지 못함

}
