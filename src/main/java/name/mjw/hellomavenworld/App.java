package name.mjw.hellomavenworld;

/**
 * Hello world!
 *
 */
public class App {
	/**
	 * Returns the square of an int
	 *
	 * @param i the int to be squared
	 * @return the value of i squared
	 */
	public static int square(int i) {

		return i * i;
	}

	/**
	 * Returns the cube of an int
	 *
	 * @param i the int to be cubed
	 * @return the value of i cubed
	 */
	public static int cube(int i) {

		return (int) Math.pow(i, 3);
	}

}
