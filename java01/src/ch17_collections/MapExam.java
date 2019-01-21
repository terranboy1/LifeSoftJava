package ch17_collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class MapExam {

	public static void main(String[] args) {
		//���� ���� HashMap<String,Object> map =- new HashMap<>(); �������� ���� ����.
		//key���� �����͸� ���� ã�� ���� ����°Ű�, ���� ��� ���� ����ִ� ObjectŸ���� ���� ��.
		//map.put("kim","��ö��"); // put(key, value)
		//map.put("park","�ڹ�ȣ");
		//map.get("kim"); // key�� "kim"�� �� "��ö��" �� ã�´�.
		
		//Ǯ� �Է��� ��(�ݺ��� ��� X)
		String[] nation = {"�ѱ�", "�Ϻ�", "�߱�", "�̱�", "�±�", "����"};
		String[] city = {"����","����","�ϰ�","������","����","����"};
		
		//�ؽø� HashMap<Key�ڷ���,Value�ڷ���>
		//������ ���� ��� �ܾ�:key / ����:value
		//HashpMap key�� Integer�ָ� ����Ʈ�� �ٸ� �� ���(���� �ε����ۿ� �ȵǴϱ�. ���� ���� �ε������� �ǹ̰� �ִ°���) ���� String.
		//HashMap<String, String> map = new HashMap<String, String>();
		//HashpMap�� Map�������̽��� �����Ѵ�. ��� �������� ������ �Ʒ��ڵ尡 �ȴ�.
		Map<String, Object> map = new HashMap<>();
		//�� - index��� key(������)�� ������
		for(int i=0; i<city.length; i++) {
			//map�� �ڷ� �Է�: map��ü.put(key,value) ������, ��
			//������ �Ʒ�ó�� �����͸� �Է��ؾߵǴµ� 
			//map.put("�ѱ�","����");
			//map.put("�Ϻ�","����");
			//for���� �̿��� �ϰ��� ó��. for�� �����°� ���ϳ�.
			map.put(nation[i], city[i]);
		}
		
		//�ʿ� ����� �ڷ� ��ȸ map��ü.get(key);
		System.out.println("<<<�ʿ� ����� �ڷ� ��ȸ>>>");
		//map�� ����ϸ� map {key=value, key=value, ...} �������� ��µǴ±�.
		System.out.println(map); //�� �迭�� �ϰ��� ��µǴ±�. ������ ���̳�. ���� ������� ����Ǵ� �� �ƴ�. ������ �����Ǵ� ���� list. ������ ������ key�� �̿��� ���� ã�� �� ����.
		System.out.println(map.get("�ѱ�"));
		
		//keySet()�� key������ return��.
		System.out.println("key���� �̾ƺ���. keySet()");
		System.out.println(map.keySet()); //key����.
		System.out.println("value���� �̾ƺ���. values()");
		System.out.println(map.values()); //value����.
		
		//�Է��� ������� ������� �ʴ´�.
		System.out.println("<<<Iterator Ȱ��>>>");
		Iterator<String> iterator = map.keySet().iterator();  
		while(iterator.hasNext()) {
			String key = (String) iterator.next();
			System.out.println("key=" + key);
			System.out.println("value=" + map.get(key));
		}
		
		//map.get(key) : �ʿ� ����� �� ��ȸ
		System.out.println("<<<��ü�� ��ȸ>>>");
		for(int i=0; i<city.length; i++) {
			System.out.println(map.get(nation[i]));
		}
		//���ϰ� ��ȸ
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �̸��� �Է��ϼ���. : ");
		String str = scan.next();
		System.out.println(str+ "�� ������?" + map.get(str));
		
		//���ϰ���ȸ ����
		//���� ������. �ѱ��Ǽ�����? ����. ������ ������? ���� �̷��� ������.
		
		//��, map ����� �� ���� for�� ��� ����.
		//for(String str : map) {} �̰� �Ұ���. �����ε����� �˻��ϴ� �� �ƴ϶� �ȵ�.(�Ϲ� for���� �ǰ�)
		
	}
}
