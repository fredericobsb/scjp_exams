package exame4_pg325;
interface Plant{
	int greenness = 7;
	void grow();
}
class Grass implements Plant{
	// static int greenness = 5;//se descomentar, a saida é 6.
	// int greenness = 5;//se descomentar, a saida é 6.
	public static void main(String[] args){
		int greenness = 2;
		new Grass().grow();
	}
	public void grow(){
		System.out.println(++greenness);//variavel de interface é final por default.
	} 
}
