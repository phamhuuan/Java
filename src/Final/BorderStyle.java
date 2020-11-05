package Final;

public enum BorderStyle {
	SOLID("solid"),
	DASHED("dashed"),
	DOTTED("dotted");

	private final String borderStyleName;

	BorderStyle(String borderStyleName) {
		this.borderStyleName = borderStyleName;
	}

	public String getBorderStyleName() {
		return borderStyleName;
	}
}
