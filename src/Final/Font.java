package Final;

public enum Font {
	TNR("Times New Roman"),
	ARIAL("Arial");

	private final String fontName;

	Font(String fontName) {
		this.fontName = fontName;
	}

	public String getFontName() {
		return fontName;
	}
}
