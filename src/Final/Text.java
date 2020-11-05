package Final;

import java.util.List;
import java.util.Arrays;

public class Text extends Element {
	private String content;
	private Font font;
	private float fontSize;
	private Colors textColor, backgroundColor;

	public Text(String content, Font font, float fontSize, Colors textColor, Colors backgroundColor) {
		this.content = content;
		this.font = font;
		this.fontSize = fontSize;
		this.textColor = textColor;
		this.backgroundColor = backgroundColor;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Font getFont() {
		return font;
	}

	public void setFont(Font font) {
		this.font = font;
	}

	public float getFontSize() {
		return fontSize;
	}

	public void setFontSize(float fontSize) {
		if (fontSize >= 8 && fontSize <= 20 && (fontSize - (int) fontSize == 0 || fontSize - (int) fontSize == 0.5)) {
			this.fontSize = fontSize;
		}
	}

	public Colors getTextColor() {
		return textColor;
	}

	public void setTextColor(Colors textColor) {
		Colors[] color = Colors.values();
		List<Colors> listColor = Arrays.asList(color);
		if (listColor.contains(textColor)) {
			this.textColor = textColor;
		}
	}

	public Colors getBackgroundColor() {
		return backgroundColor;
	}

	public void setBackgroundColor(Colors backgroundColor) {
		Colors[] colors = Colors.values();
		List<Colors> listColor = Arrays.asList(colors);
		if (listColor.contains(backgroundColor)) {
			this.backgroundColor = backgroundColor;
		}
	}
}
