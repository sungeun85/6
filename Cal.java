package ojsag.ex23;

public class Cal implements ICal {
	String[] name = {"ȫ�浿","������","������","�̼���","�谩��"};
	int score[][] = {{90,80,70},{80,90,70},{80,30,60},{80,20,60},{70,90,60}};
	int sum[] = new int[5];
	double avg[] = new double[5];
	int rank[] = new int[5];
	int sum2[] = new int[3];
	
	
	

	
	public void input() {                                  //�Է°�
		for(int i =0; i<score.length; i++) {        //score.length = 5
			   System.out.print(name[i]);           //name[0]~name[4]���� ��� 
			for(int j = 0; j<score[i].length; j++) {
			   System.out.print(score[i][j]);       //scorei=0 j=0,1,2 scorei=1 j=0,1,2   ... score[i]=5 �ɶ����� ���
			}
			   System.out.println();
		}
		
	}
	
	public void sumavgrank() {                                 //�� ��� ����
		for(int i = 0; i<score.length; i++) {           
			for(int j =0; j<score[i].length; j++) {
				sum[i] += score[i][j];                  //��
				avg[i] = (sum[i]/3);                    //���
			}
		}
		for(int i = 0; i<5; i++) {
			for(int j =0; j<5; j++) {
				if(avg[i] <= avg[j]) {
					rank[i]++;
				}
				
			}
		}
	}
	public void total() {
		for(int j = 0; j<3; j++) {
			for(int i=0; i<score.length; i++) {
				sum2[j] = sum2[j]+score[i][j];
			}
		}
		int totalsum = 0;
		totalsum = sum2[0]+sum2[1]+sum2[2];
	}
	public void output() {
		System.out.println("2.���");
		System.out.print("�̸�\tC#\tJava\tHTML5\t��\t���\t����");
		System.out.println();
	}
	public void result() {
		int totalsum = sum2[0]+sum2[1]+sum2[2];
		for (int i = 0; i<score.length; i++) {
			System.out.print(name[i]+ "\t");
			for(int j =0; j<score[i].length; j++) {
				System.out.print(score[i][j]+ "\t");				
			}
			System.out.printf("%d\t%.2f\t%d��", sum[i], avg[i], rank[i]);
			System.out.println();
		}
		    System.out.print("����"+ "\t");
		    for(int i= 0; i<sum2.length; i++) {
		    	System.out.print(sum2[i] + "\t");
		    }
		    System.out.print(totalsum);
	}
	
}
