package chapter3.ex6.oop.abtract.YBM;

import chapter3.ex6.oop.abtract.Exam;

public class YBMExam extends Exam {
	
	public int getToeic() {
		return toeic;
	}
	public void setToeic(int toeic) {
		this.toeic = toeic;
	}

	private int toeic;
	
	public YBMExam(int kor, int eng, int math, int toeic){
		super(kor,eng,math);
		this.toeic=toeic;
	}
	public YBMExam() {
		this(0, 0, 0, 0);
	}
	@Override
	public int total() {
		return baseTotal()+toeic;
	}

	@Override
	public float avg() {
		// TODO Auto-generated method stub
		return total()/4.0f;
	}

}
