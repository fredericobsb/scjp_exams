package exame1_pg57;

import java.util.HashSet;
import java.util.Set;

public class Drunken {
public static void main(String[] args) {
Set<Stuff> s = new HashSet<Stuff>();
s.add(new Stuff(3)); s.add(new Stuff(4)); s.add(new Stuff(4));
s.add(new Stuff(5)); s.add(new Stuff(6));
s = null;
// do more stuff
}
 }
 class Stuff {
 int value;
 Stuff(int v) { value = v; }
 }
