package system;

import java.text.SimpleDateFormat;

import org.json.simple.parser.JSONParser;

public class Config {
	public static final JSONParser JPARSER = new JSONParser();
	public static final SimpleDateFormat SDF = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
	
	public static final String TIMEZONE = "Singapore";
	
	public static final String ROOT = "VI";
	
	//TODO change the inputs below
	public static final String ACCESSKEY = "AKIAI4KNTFI3L5YLROAQ";
	public static final String SECRETKEY = "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";
	public static final String BUKETNAME = "symplhrm";
	public static final String S3ROOT = "Sympl";
	public static final String S3URL = "https://s3-ap-southeast-1.amazonaws.com/";
	
}
