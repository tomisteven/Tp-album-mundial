package mundial;

public class Tupla<K, V> {
	private K elem1;
	private V elem2;
	
	
	public Tupla(K e1, V e2) { // constructor
		elem1 = e1;
		elem2 = e2;
	}

	public K getElem1() {
		return elem1;
	}
	
	public V getElem2() {
		return elem2;
	}
	
	public void setElem1(K e1) {
		elem1 = e1;
	}
	
	public void setElem2(V e2) {
		elem2 = e2;
	}
	
//	@Override
//	public boolean equals(Object c) {
//		if (c == null ) {
//			return false ;
//		}
//		if (!(c instanceof Tupla)) {
//			return false ;
//		}
//		Tupla<K, V> otra = (Tupla) c;
//		if (otra.getElem1() == elem1 && otra.getElem2() == elem2) {
//			return true;
//		}
//		return false;
//	}

}
