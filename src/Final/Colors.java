package Final;

public enum Colors {
	RED("red"),
	BLUE("blue"),
	YELLOW("yellow"),
	ORANGE("orange"),
	VIOLET("violet");

	private final String colorName;

	Colors(String colorName) {
		this.colorName = colorName;
	}

	public String getColorName() {
		return colorName;
	}
}
