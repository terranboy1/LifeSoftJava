package ch16_generic;

//Type3<T> : �ڷ����� ������ ����
//�������� ���� �����̰� ������ �� ������.
//�ϳ��� Ŭ������ �پ��� �ڷ����� ó��(���׸�, �Ϲ�ȭ)(�ȱ׷��� �ڷ������� Ŭ���� ������ �ϴϱ�)
public class Type3<T> {  //Ŭ������ �� �� ���������, ���� �� Ŭ������ ���� ȿ��(���࿡ Object�� ���� �ʴ� ��쿣 �ڷ������� �ٸ��� ó���� ������Ѵ�. Ŭ������ ���� ����ų�, �޼��� �����ε� ������ �ؾ��ϰŵ�. �׷��ٰ� Object���⿣ �ʹ� ��ȿ��)
	T value;
	public void setValue(T value) {
		this.value= value;
	}
	public T getValue() {
		return value;
	}
	
	public static void main(String[] args) {
		Type3<String> t = new Type3<String>(); //�������� �� �ڷ����� ������Ŵ. �̷��� < >�ȿ� Ÿ���� �����ϸ� ���� <T>�� String���� �ٲ�� ��. ��, String�ڷ����� <T>�� ���޵Ǵ� ��.
	//  Type3<String> t = new Type3<>(); //�������� ������ �� �ڷ��� ������ �����ʿ� ���� ���������� �������� ����!!
		t.setValue("300");
		System.out.println("���׸��� Ÿ�� String --> " + t.getValue());
		//t.setT(500); //����(������ �ڷ����� �Է� ����. ���⼱ String�ڷ������� ���������ϱ�.)
		
	// �ٵ� �̷��� Ÿ���� ����ÿ� �����ߴµ�, ���� �پ��� �ڷ����� �����ʹ�? �׷��� �Ʒ��Ͱ��� ���?
	// Type3<Object> t = new Type3<Object>(); �̷��� Typ2.java �������� ������� �ڷ����� Object�� �ϴ� �Ͱ� �ٸ� �ٰ� ������.(��쿡 ���� �̷��� �� ���� �ִٰ� �Ѵ�.)
	}
}

// �̷��� ���� �ڷ����� ���� �� �� ��
// Object�� ���� ó���� �� ������ �Ź� ����ȯ�� ������ؼ� ���̰� ��ȿ�����̴�.
// ���׸����� ���ø� ���� ������ �Ѵ�. 
// ���׸����� ���� ��ü�� ���� �� ������ Ÿ��(���� �������� String)���� �Էµȴ�.
// ��� �ڷ����� �Ϲ�ȭ �� ��, �װ��� �ٷ� ���׸��̴�.(�������־�)