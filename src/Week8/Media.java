package Week8;

public abstract class Media {
	private String title, category, id, type;
	private float cost;

	public Media() {

	}

	public void getDetail() {
		System.out.println("Id: " + getId());
		System.out.println("Title: " + getTitle());
		System.out.println("Category: " + getCategory());
		System.out.println("Cost: " + getCost());
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}
}
