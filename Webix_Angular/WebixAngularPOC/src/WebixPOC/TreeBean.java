package WebixPOC;

import java.util.List;


public class TreeBean {

	private String id;
	private String value;
	List<TreeBean> data;
	private boolean webix_kids;
	private String link;
//	private String ui-sref;
	
	public void setId(String id){
		this.id = id;
	}
	
	public String getId(){
		return id;
	}
	
	public void setValue(String value){
		this.value = value;
	}
	
	public String getValue(){
		return value;
	}
	
	public void setData(List<TreeBean> data){
		this.data = data;
	}
	
	public List<TreeBean> getData(){
		return data;
	}

	public boolean isWebix_kids() {
		return webix_kids;
	}

	public void setWebix_kids(boolean webix_kids) {
		this.webix_kids = webix_kids;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	@Override
	public String toString() {
		return "TreeBean [id=" + id + ", value=" + value + ", data=" + data + ", webix_kids=" + webix_kids + ", link="
				+ link + "]";
	}
}
