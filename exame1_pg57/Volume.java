package exame1_pg57;

public class Volume {
	Volume v;
	int size;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Volume myV = new Volume();
		final Volume v2;
		v2 = myV.doStuff(myV);
		v2.v.size = 7;
		System.out.println(v2.size);
	}
	Volume doStuff(Volume v3){
		v3.size = 5;
		v3.v = new Volume();
		return v3;
	}

}
