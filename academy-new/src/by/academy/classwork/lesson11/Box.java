package by.academy.classwork.lesson11;

public class Box {
	double width;
	double height;
	double depth;

	public Box() {
		System.out.println("Конструирование объекта Вох");
		width = 10;
		height = 10;
		depth = 10;
	}

	Box(double width, double h, double d) {
		this.width = width;
		height = h;
		depth = d;
	}

	Box(double len) {
		width = len;
		height = len;
		depth = len;
	}

	/**
	 * Подсчитать объем коробки
	 *
	 * @return Объем
	 */
	double getVolume() {
		return width * height * depth;
	}

	/**
	 * Установить размер коробки
	 *
	 * @param w - ширина
	 * @param h - высота
	 * @param d - глубина
	 */
	void setDim(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}
}
