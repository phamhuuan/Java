package Week10;

public class Media {
	private String title;

	private String category;

	private float cost;
	private Object object;

	/**
	 *  
	 */
	public Media() {
		super();
	}

	/**
	 * Returns the category.
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * Returns the cost.
	 */
	public float getCost() {
		return cost;
	}

	/**
	 * Returns the title.
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the category.
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * Sets the cost.
	 */
	public void setCost(float cost) {
		this.cost = cost;
	}

	/**
	 * Sets the title.
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public boolean equals(Object object) {
		try {
			Media media = (Media) object;
			return media.getTitle().equals(title) && media.getCost() == cost;
		} catch (NullPointerException | ClassCastException e) {
			e.printStackTrace();
			return false;
		}
	}
}