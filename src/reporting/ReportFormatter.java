package reporting;
public class ReportFormatter {
	
	private Object object;
	private FormatType format;
	
	public ReportFormatter(Object object, FormatType format){
		this.object = object;
		this.format = format;
	}
	
	private String convertObjectToXML(Object object){
		return "<title>" + object.toString() + "</title>";
	}
	
	private String convertObjectToJSON(Object object){
		return "{\"title\" : " + object.toString() + "}";
	}
	
	private String convertObjectToCSV(Object object){
		return ",,," + object.toString() + ",,,";
	}
	
	public String getFormattedValue(){
		switch (this.format) {
		case CSV:
			return this.convertObjectToCSV(this.object);
		case XML:
			return this.convertObjectToXML(this.object);
		case JSON:
			return this.convertObjectToJSON(this.object);
		default:
			throw new IllegalArgumentException("Format not specified");
		}
	}
}
