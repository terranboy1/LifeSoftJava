package ch05_array;

public class IntArray {

	public static void main(String[] args) {
//		int[] num;      //�迭�������� ����
//		// new �ڷ��� => ���� �޸� �Ҵ�.
//		num=new int[5];  //�迭�� �����ǰ� ���������� ����
//		//�迭��������[�ε���]
//		num[0]=10;  //���������� ����Ű�� ù��° ���
//		num[1]=20;
//		num[2]=30;                  //�̷��� �� �� 18��° ���̶� ����. �̷��� ������ ä��� ���� ����Ͻð�.
//		num[3]=40;
//		num[4]=50;    
//		num[5]=60;  //ArrayIndexOutOfBoundsException. �������� ������ ��Ÿ�� ������ ���ܺη�. �迭���� �ʰ�.
		
//		int[] num;
//		num = new int[] {10,20,30,40,50};  �̰� �Ʒ� ���ٰ� ����.
		
		int[] num = {10,20,30,40,50};  // ��� �� ���� ���� �������.
		
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]);
		}
				
		//���� for��
		for(int tmp : num) {
			System.out.println(tmp);
		}
	}

}
