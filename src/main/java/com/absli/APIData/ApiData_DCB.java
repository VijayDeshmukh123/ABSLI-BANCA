package com.absli.APIData;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
//import org.junit.jupiter.api.Test;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.testng.annotations.Test;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import com.absli.utils.PropertiesUtils;
import com.google.gson.JsonObject;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import org.json.JSONException;
import org.json.JSONObject;
import io.restassured.path.json.JsonPath;
import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import org.testng.annotations.Test;

//import dev.failsafe.internal.util.Assert;

import org.json.JSONObject;
//import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;
import java.util.HashMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import org.json.JSONTokener;
import org.json.JSONObject;
import java.io.IOException;
import java.util.HashMap;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;

public class ApiData_DCB {
	public   static PropertiesUtils prop=new  PropertiesUtils();
	
	

	public static String encryptGCM(String data, String encryptionKey, String encryptionIV) throws Exception {
		Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
		SecretKeySpec keySpec = new SecretKeySpec(encryptionKey.getBytes(StandardCharsets.UTF_8), "AES");
		GCMParameterSpec gcmParameterSpec = new GCMParameterSpec(128, encryptionIV.getBytes(StandardCharsets.UTF_8));

		cipher.init(Cipher.ENCRYPT_MODE, keySpec, gcmParameterSpec);

		byte[] encryptedBytes = cipher.doFinal(data.getBytes(StandardCharsets.UTF_8));

		return Base64.getEncoder().encodeToString(encryptedBytes);
	}

	public static String decryptGCM(String encryptedData, String encryptionKey, String encryptionIV) throws Exception {
		byte[] encryptedBytes = Base64.getDecoder().decode(encryptedData);
		Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
		SecretKeySpec keySpec = new SecretKeySpec(encryptionKey.getBytes(StandardCharsets.UTF_8), "AES");
		GCMParameterSpec gcmParameterSpec = new GCMParameterSpec(128, encryptionIV.getBytes(StandardCharsets.UTF_8));

		cipher.init(Cipher.DECRYPT_MODE, keySpec, gcmParameterSpec);

		byte[] decryptedBytes = cipher.doFinal(encryptedBytes);

		return new String(decryptedBytes, StandardCharsets.UTF_8);
	}

    public static String EncryptData(HashMap<String, String> testData,String LeadId,String proposer_pan,String proposer_first_name,String proposer_last_name,String proposer_gender,String proposer_dob,String insured_dob,String insured_gender,String proposer_mobile_no,
    		String proposer_email_id,String bank_account_no,String bank_account_type,String address_type,String proposer_pin_code,String proposer_address_1,String proposer_address_2,String proposer_address_3,
    		String proposer_city,String proposer_state,String proposer_country,String is_proposer_same_as_insured,String bank_customer_income,String bank_customer_occupation,String insured_marital_status,String proposer_marital_status,String nominee_name,String insured_occupation,String bank_nationality,String insured_nationality) throws Exception {
    	
    	
        String encryptionKey = "7*BLpw7bO5An098s3AZL|`._,w1tfN1-";
        String encryptionIV = "em397SetqU5d5NnV";
 
        // Encrypt
        String body = "{" +
        	    "\"lead_data\": {" +
        	        "\"bank_crm_lead_id\": \""+LeadId+"\"," +
        	        "\"lg_code\": \"SP0089213530\"," +
        	        "\"proposer_first_name\": \""+proposer_first_name+"\"," +
        	        "\"proposer_last_name\": \""+proposer_last_name+"\"," +
        	        "\"proposer_gender\": \""+proposer_gender+"\"," +
        	        "\"proposer_dob\": \""+proposer_dob+"\"," +
        	        "\"insured_dob\": \""+insured_dob+"\"," +
        	        "\"insured_gender\": \""+insured_gender+"\"," +
        	        "\"proposer_mobile_no\": \""+proposer_mobile_no+"\"," +
        	        "\"proposer_pin_code\": \""+proposer_pin_code+"\"," +
        	        "\"proposer_address_1\": \""+proposer_address_1+"\"," +
        	        "\"proposer_address_2\": \""+proposer_address_2+"\"," +
        	        "\"proposer_address_3\": \""+proposer_address_3+"\"," +
        	        "\"proposer_city\": \""+proposer_city+"\"," +
        	        "\"proposer_state\": \""+proposer_state+"\"," +
        	        "\"proposer_country\": \""+proposer_country+"\"" +
        	    "}," +
        	    "\"additional_data\": {" +
        	        "\"proposer\": {" +
        	            "\"proposer_pan\": \""+proposer_pan+"\"," +
        	            "\"email_id\": \""+proposer_email_id+"\"," +
        	            "\"address_type\": \""+address_type+"\"," +
        	            "\"marital_status\": \"\"" +
        	        "}," +
        	        "\"insured\": {" +
        	            "\"marital_status\": \"\"," +
        	            "\"occupation\": \"\"," +
        	            "\"nationality\": \"\"" +
        	        "}," +
        	        "\"lead_details\": {" +
        	            "\"bank_account_no\": \""+bank_account_no+"\"," +
        	            "\"bank_account_type\": \""+bank_account_type+"\"," +
        	            "\"is_proposer_same_as_insured\": \""+is_proposer_same_as_insured+"\"," +
        	            "\"bank_customer_income\": \""+bank_customer_income+"\"," +
        	            "\"bank_customer_occupation\": \""+bank_customer_occupation+"\"," +
        	            "\"nominee_name\": null," +
        	            "\"bank_nationality\": \""+bank_nationality+"\"" +
        	        "}" +
        	    "}" +
        	"}";
       // String body = "{\"lead_data\":{\"bank_crm_lead_id\":\"2665671\",\"lg_code\":\"SP0089213530\",\"proposer_first_name\":\"Vijay\",\"proposer_last_name\":null,\"proposer_gender\":\"Male\",\"proposer_dob\":\"1990-21-09\",\"insured_dob\":\"1990-21-08\",\"insured_gender\":\"Male\",\"proposer_mobile_no\":\"7685944231\",\"proposer_pin_code\":null,\"proposer_address_1\":\"hellohouse\",\"proposer_address_2\":null,\"proposer_address_3\":null,\"proposer_city\":null,\"proposer_state\":null,\"proposer_country\":null},\"additional_data\":{\"proposer\":{\"proposer_pan\":\"JCVPS8987Q\",\"email_id\":\"\",\"address_type\":\"\",\"marital_status\":\"\"},\"insured\":{\"marital_status\":\"\",\"occupation\":\"\",\"nationality\":\"\"},\"lead_details\":{\"bank_account_no\":\"123456789011\",\"bank_account_type\":null,\"is_proposer_same_as_insured\":\"No\",\"bank_customer_income\":\"1000000\",\"bank_customer_occupation\":null,\"nominee_name\":null,\"bank_nationality\":\"NRI\"}}}";
        String encryptedPayload = encryptGCM(body, encryptionKey, encryptionIV);
        System.out.println("Encrypted Payload: " + encryptedPayload);
        return encryptedPayload;
    }

	public static String getToken() {

		RestAssured.baseURI = "https://liservicedev.adityabirlacapital.com/bsli/sb/oauthprovider/oauth2/token";

		Response response = RestAssured.given().param("client_id", "ebe46197-7ebc-47dd-9cb4-6a856937d1ad")
				.param("client_secret", "W0mX5vO0iN1eE4qI8oI2xS5pS2bK3jP6fC3eU3dC6lU0vF2rG7")
				.param("grant_type", "password").param("username", "HGSBNGUAT092").param("password", "pass@261023")
				.param("scope", "bsli").contentType(ContentType.URLENC).post();
		// .asString();

		// Print the response for debugging or further processing.
		System.out.println(response.asString());
		System.out.println("==================Started Creat Access Token ==============");
		String accessToken = response.jsonPath().getString("access_token");
		System.out.println("Access Token: " + accessToken);
		return accessToken;
	}

public static void DCB_get_Lead(HashMap<String, String> testData,String LeadId,String proposer_pan,String proposer_first_name,String proposer_last_name,String proposer_gender,String proposer_dob,String insured_dob,String insured_gender,String proposer_mobile_no,
		String proposer_email_id,String bank_account_no,String bank_account_type,String address_type,String proposer_pin_code,String proposer_address_1,String proposer_address_2,String proposer_address_3,
		String proposer_city,String proposer_state,String proposer_country,String is_proposer_same_as_insured,String bank_customer_income,String bank_customer_occupation,String insured_marital_status,String proposer_marital_status,
		String nominee_name,String insured_occupation,String bank_nationality,String insured_nationality) throws Exception {
	String Token=getToken();

	String encryptionKey = "7*BLpw7bO5An098s3AZL|`._,w1tfN1-";
	String encryptionIV = "em397SetqU5d5NnV";
     
	String payload =  EncryptData(testData,LeadId,proposer_pan,proposer_first_name,proposer_last_name,proposer_gender,proposer_dob,insured_dob,insured_gender,proposer_mobile_no,
			 proposer_email_id, bank_account_no,bank_account_type,address_type,proposer_pin_code,proposer_address_1,proposer_address_2,proposer_address_3,
			 proposer_city,proposer_state,proposer_country,is_proposer_same_as_insured,bank_customer_income,bank_customer_occupation,insured_marital_status,proposer_marital_status,
			 nominee_name,insured_occupation,bank_nationality, insured_nationality);
	RestAssured.baseURI = "https://liservicedev.adityabirlacapital.com";

	Thread.sleep(5000);
	Response response = RestAssured.given().contentType(ContentType.JSON)
			.header("partner_application_id", "DCB_BANKING_PORTAL").header("partner_id", "DCB_BANK")
			.header("Content-Type", "application/json")
			.header("Authorization", "Bearer " + Token)
			//.header("Authorization","Bearer AAIkZWJlNDYxOTctN2ViYy00N2RkLTljYjQtNmE4NTY5MzdkMWFkgj99bIN8Y17YE-V9GcsleCUoyHPaed6eNjXAS3muDypx9VP2JlgKMekpr61iHjdRoNvX9PSCMcfWflxLOcz9AvrjDMFbwP2S--1WUlPXdGE")
			.body("{ \"payload\" : \"" + payload + "\" }")
			.post("https://liservicedev.adityabirlacapital.com/bsli/sb/VymoLeadCreation/getLeadCreation?client_id=ebe46197-7ebc-47dd-9cb4-6a856937d1ad&client_secret=W0mX5vO0iN1eE4qI8oI2xS5pS2bK3jP6fC3eU3dC6lU0vF2rG7");
	Thread.sleep(5000);
	System.out.println(response.asString());

	String encryptedData = response.jsonPath().getString("payload");
	System.out.println("payload: " + encryptedData);
	Thread.sleep(5000);
	String[] CA = encryptedData.split("payload ");
	String payloadOUTPUT = CA[0];
	System.out.println("Creat a Data: " + payloadOUTPUT);
	// Decrypt
	String decryptedBody = decryptGCM(payloadOUTPUT, encryptionKey, encryptionIV);
	System.out.println("Decrypted Body: " + decryptedBody);

}
	
	
}