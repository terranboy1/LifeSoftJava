package ch16_generic;

public class Type1 {
	int value;
	
	public static void main(String[] args) {
		Type1 t = new Type1();
		t.setValue(200);
		System.out.println(t.getValue());

	}

	public int getValue() {
		return value; //� �ڷ����� ���ϵ��� ��
	}

	public void setValue(int value) { //� ���������� �Էµ��� ��
		this.value = value;
	}

	
}
