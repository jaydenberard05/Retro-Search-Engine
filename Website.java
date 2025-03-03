package engine;

public class Website {
	
	private String url;
	private String description;
	
	public Website(String url, String description) {
		this.setUrl(url); 
		this.setDescription(description);
		
		
		
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	public String toString() {
		String s = "";
		s = String.format("%s%n%s", url, description);
	    return s;
	}
	
}
