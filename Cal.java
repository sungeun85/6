package ojsag.ex23;

public class Cal implements ICal {
	String[] name = {"홍길동","강감찬","유관순","이순신","김갑순"};
	int score[][] = {{90,80,70},{80,90,70},{80,30,60},{80,20,60},{70,90,60}};
	int sum[] = new int[5];
	double avg[] = new double[5];
	int rank[] = new int[5];
	int sum2[] = new int[3];
	
	
	

	
	public void input() {                                  //입력값
		for(int i =0; i<score.length; i++) {        //score.length = 5
			   System.out.print(name[i]);           //name[0]~name[4]까지 출력 
			for(int j = 0; j<score[i].length; j++) {
			   System.out.print(score[i][j]);       //scorei=0 j=0,1,2 scorei=1 j=0,1,2   ... score[i]=5 될때까지 출력
			}
			   System.out.println();
		}
		
	}
	
	public void sumavgrank() {                                 //합 평균 석차
		for(int i = 0; i<score.length; i++) {           
			for(int j =0; j<score[i].length; j++) {
				sum[i] += score[i][j];                  //합
				avg[i] = (sum[i]/3);                    //평균
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
		System.out.println("2.결과");
		System.out.print("이름\tC#\tJava\tHTML5\t합\t평균\t석차");
		System.out.println();
	}
	public void result() {
		int totalsum = sum2[0]+sum2[1]+sum2[2];
		for (int i = 0; i<score.length; i++) {
			System.out.print(name[i]+ "\t");
			for(int j =0; j<score[i].length; j++) {
				System.out.print(score[i][j]+ "\t");				
			}
			System.out.printf("%d\t%.2f\t%d등", sum[i], avg[i], rank[i]);
			System.out.println();
		}
		    System.out.print("총점"+ "\t");
		    for(int i= 0; i<sum2.length; i++) {
		    	System.out.print(sum2[i] + "\t");
		    }
		    System.out.print(totalsum);
	}
	
}
