package ch16_generic;

public class Type2 {
	//�ϴ� ���� ������ �ڷ����� �ٸ��ٸ�? Object�� ������ �� �ִ�. �ٵ� �� ���긶�� ����ȯ �߻�����.
	Object value;
	
	public static void main(String[] args) {
		Type2 t = new Type2();
		t.setValue("kim");
		Object obj = t.getValue();
		System.out.println(t.getValue());
		t.setValue(100);
		obj=t.getValue(); //����ȯ
		System.out.println(obj);

	}

	public Object getValue() {
		return value; //� �ڷ����� ���ϵ��� ��
	}

	public void setValue(Object value) { //� �ڷ����� �Էµ��� ��. ����ȯ�ؾߵ�.
		this.value = value; 
	}

	
}
