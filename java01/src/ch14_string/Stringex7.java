package ch14_string;

public class Stringex7 {

	public static void main(String[] args) {
		//���ڿ��� ������ �ٲ۴�. replace�޼���
		//(���ڿ� ������ �ٲٴ� ���� StringBuffer)
		String a = "java programming";
		System.out.println("a.replace(\"java\", \"�ڹ�\") = " + a.replace("java", "�ڹ�"));
		System.out.println("a=" + a); // ��? ������ replace�ߴµ� ����� �ȹٲ����. �� String�� ������ �۾����� �ʾ�~ �۾��ϱ� ���� �����ϰ� �װ� �ٲ�. a�� ������ ����ϴ°Ű�. ������ ���纻 ����ѰŰ�.  
		//a = a.replace("java","�ڹ�"); �̷��� ����� �ٲ���. ���纻�� ����� �װ� �ٽ� a�� �����߸�.
		
		
	}
}