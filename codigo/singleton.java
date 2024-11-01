public class Singleton {
	private static Singleton instance; // protegido para acceso externo y static
	private Singleton() {} // private constructor with external access protection
	public static  getInstance() { // public method, call out by code
		if (instance == null) { // only if no instance exists, then create a new
			instance = new Singleton();
		}
		return instance;
	}
}