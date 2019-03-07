package exame4_pg325;

public class Organic<E>{
	void react(E e){}

	public static void main(String[] args) {
		// Organic<? extends Organic> compound = new Aliphatic<Organic>();
		 Organic<? super Aliphatic> compound = new Aliphatic<Organic>();
		compound.react(new Organic());
		compound.react(new Aliphatic());
		compound.react(new Hexane());
	}
}
class Aliphatic<F> extends Organic<F> { }
class Hexane<G> extends Aliphatic<G> { }
