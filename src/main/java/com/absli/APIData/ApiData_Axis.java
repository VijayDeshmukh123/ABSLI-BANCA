package com.absli.APIData;
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
//import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
//import org.testng.annotations.Test;

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

import java.util.HashMap;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
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
import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;
public class ApiData_Axis {
	public static String bearerToken;
	
	 static String args = "1870007";//min 4 
	 
		public static String bearerTokenGeneration() {
			// Base URL for the token endpoint
			String tokenEndpoint = "https://liservicedev.adityabirlacapital.com/bsli/sb/oauthprovider/oauth2/token";

			// Request parameters
			String clientId = "66573fef-7165-4a6c-b8b2-9d4ffd544a47";
			String clientSecret = "C2tP2wP5pW8kG8pX6nQ8sC3tT2xF0eQ8qJ8fS8xC1jB2pJ4oH6";
			String grantType = "password";
			String username = "HGSBNGUAT092";
			String password = "pass@261023";
			String scope = "bsli";

			// Perform the request using RestAssured
			Response response = given().urlEncodingEnabled(true).param("client_id", clientId)
					.param("client_secret", clientSecret).param("grant_type", grantType).param("username", username)
					.param("password", password).param("scope", scope).contentType("application/x-www-form-urlencoded")
					.when().post(tokenEndpoint);

			// Print the response for debugging or further processing.
			System.out.println(response.asString());
			System.out.println("==================Started Creat Access Token ==============");
			String accessToken = response.jsonPath().getString("access_token");
			System.out.println("Access Token: " + accessToken);
			return accessToken;
		}
	
	  public static byte[] createRandomIV(int ivLength) {
	        byte[] iv = new byte[ivLength];
	        new java.security.SecureRandom().nextBytes(iv);
	        return iv;
	    }

	    public static byte[] encryptWithPrefixIV(String plainText, SecretKey secretKey, byte[] iv) throws Exception {
	        byte[] cipherText = encrypt(plainText, secretKey, iv);
	        return concatenateByteArrays(iv, cipherText);
	    }

	    public static byte[] encrypt(String plainText, SecretKey secretKey, byte[] iv) throws Exception {
	        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
	        GCMParameterSpec gcmParameterSpec = new GCMParameterSpec(128, iv);
	        cipher.init(Cipher.ENCRYPT_MODE, secretKey, gcmParameterSpec);
	        return cipher.doFinal(plainText.getBytes(StandardCharsets.UTF_8));
	    }

	    public static String encryptText(String text, SecretKey secretKey) throws Exception {
	        byte[] iv = createRandomIV(12);
	        byte[] cipherText = encryptWithPrefixIV(text, secretKey, iv);
	        return Base64.getEncoder().encodeToString(cipherText);
	    }

	    public static String decryptWithPrefixIV(byte[] encryptedData, SecretKey secretKey) throws Exception {
	        byte[] iv = new byte[12];
	        System.arraycopy(encryptedData, 0, iv, 0, 12);
	        byte[] cipherText = new byte[encryptedData.length - 12];
	        System.arraycopy(encryptedData, 12, cipherText, 0, encryptedData.length - 12);
	        return decrypt(cipherText, secretKey, iv);
	    }

	    public static String decrypt(byte[] cipherText, SecretKey secretKey, byte[] iv) throws Exception {
	        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
	        GCMParameterSpec gcmParameterSpec = new GCMParameterSpec(128, iv);
	        cipher.init(Cipher.DECRYPT_MODE, secretKey, gcmParameterSpec);
	        byte[] decryptedBytes = cipher.doFinal(cipherText);
	        return new String(decryptedBytes, StandardCharsets.UTF_8);
	    }

	    private static byte[] concatenateByteArrays(byte[] a, byte[] b) {
	        byte[] result = new byte[a.length + b.length];
	        System.arraycopy(a, 0, result, 0, a.length);
	        System.arraycopy(b, 0, result, a.length, b.length);
	        return result;
	    }
//=====================
	    
	    
	    
	    public static String CreatBodyDynamic(HashMap<String, String> testData,String Leadid,String product_id,String proposer_first_name,String proposer_last_name,String proposer_gender,String proposer_mobile_no,String proposer_pan,String proposer_address_1,String proposer_address_2,String proposer_address_3,String proposer_city,String proposer_country,String proposer_pin_code,String proposer_state,String email_id,String bank_account_type,String bank_ifsc_code,String bank_account_no,String bank_customer_occupation,String WithoutPan,String nominee_name,String address_1,String address_2,String address_3,String insured_dob,String insured_first_name,String insured_middle_name,String insured_last_name,String insured_gender,String is_nri,String proposer_investment_goal,String proposer_lifestage,String proposer_risk_profile,String proposer_dob,String bank_customer_income,String is_business_insurance,String proposer_middle_name,String proposer_qualification,String relation_with_proposer,
				String branch_code,String sp_employee_code,String sp_irdai_code,String bank_branch,String ebcc_kyc_flag,String engaged_customer,String need_for_insurance,String opportunity_to_meet,String premium_paying_capacity,String source_type,String sub_source_type) throws Exception {
	        // Example Usage:
	        String secretKeyBase64 = "vBh92Gp7qoG5Tsh/hVBR8Zydlnoo4L7HSHO/2LdMUUo=";
	        SecretKey secretKey = new SecretKeySpec(Base64.getDecoder().decode(secretKeyBase64), "AES");

	       // String plainText = "{\"bank_crm_lead_id\":\"0901202405\",\"datapush\":true,\"update_attributes\":[{\"key\":\"additional_data.lead_details.bank_account_no\",\"value\":\"123810231\"},{\"key\":\"additional_data.lead_details.bank_account_type\",\"value\":\"Savings\"},{\"key\":\"additional_data.lead_details.bank_customer_id\",\"value\":\"123691328\"},{\"key\":\"additional_data.lead_details.bank_customer_occupation\",\"value\":\"self_employed\"},{\"key\":\"additional_data.lead_details.product_id\",\"value\":\"1235162\"},{\"key\":\"additional_data.other_details.bank_account_opening_date\",\"value\":\"2023-07-05\"},{\"key\":\"additional_data.other_details.bank_ifsc_code\",\"value\":\"AXIS0001\"},{\"key\":\"additional_data.other_details.ebcc_kyc_flag\",\"value\":\"true\"},{\"key\":\"additional_data.other_details.proposer_investment_goal\",\"value\":\"Child's Marriage\"},{\"key\":\"additional_data.other_details.proposer_lifestage\",\"value\":\"SINGLE\"},{\"key\":\"additional_data.other_details.proposer_risk_profile\",\"value\":\"Conservative\"},{\"key\":\"proposer_dob\",\"value\":\"1992-10-23\"},{\"key\":\"proposer_first_name\",\"value\":\"Shyam\"},{\"key\":\"proposer_gender\",\"value\":\"Male\"},{\"key\":\"proposer_last_name\",\"value\":\"Sharma\"},{\"key\":\"proposer_mobile_no\",\"value\":\"9123456789\"},{\"key\":\"sp_employee_code\",\"value\":\"SP00012\"}]}";
	      String   plainText ="{\n"
	      		+ "  \"lead_data\": {\n"
	      		+ "    \"bank_crm_lead_id\": \""+Leadid+"\",\n"
	      		+ "    \"branch_code\": \"P\",\n"
	      		+ "    \"proposer_address_1\": \""+proposer_address_1+"\",\n"
	      		+ "    \"proposer_address_2\": \""+proposer_address_2+"\",\n"
	      		+ "    \"proposer_address_3\": \""+proposer_address_1+"\",\n"
	      		+ "    \"proposer_city\": \""+proposer_city+"\",\n"
	      		+ "    \"proposer_country\": \""+proposer_country+"\",\n"
	      		+ "    \"proposer_first_name\": \""+proposer_first_name+"\",\n"
	      		+ "    \"proposer_gender\": \""+proposer_gender+"\",\n"
	      		+ "    \"proposer_last_name\": \""+proposer_last_name+"\",\n"
	      		+ "    \"proposer_mobile_no\": \""+proposer_mobile_no+"\",\n"
	      		+ "    \"proposer_pin_code\": \"\",\n"
	      		+ "    \"proposer_state\": \"\",\n"
	      		+ "    \"sp_employee_code\": \""+sp_employee_code+"\",\n"
	      		+ "    \"sp_irdai_code\": \""+sp_irdai_code+"\"\n"
	      		+ "  },\n"
	      		+ "  \"additional_data\": {\n"
	      		+ "    \"proposer\": {\n"
	      		+ "      \"email_id\": \""+email_id+"\",\n"
	      		+ "      \"proposer_pan\": \""+proposer_pan+"\"\n"
	      		+ "    },\n"
	      		+ "    \"lead_details\": {\n"
	      		+ "      \"bank_account_type\": \""+bank_account_type+"\",\n"
	      		+ "      \"bank_customer_id\": \"\",\n"
	      		+ "      \"bank_account_no\": \""+bank_account_no+"\",\n"
	      		+ "      \"bank_customer_income\": \""+bank_customer_income+"\",\n"
	      		+ "      \"bank_customer_occupation\": \""+bank_customer_occupation+"\",\n"
	      		+ "      \"follow_up_date\": \"\",\n"
	      		+ "      \"is_proposer_same_as_insured\": \"\",\n"
	      		+ "      \"nominee_name\": \""+nominee_name+"\",\n"
	      		+ "      \"product_id\": \""+product_id+"\",\n"
	      		+ "      \"SP_comments\": \"\",\n"
	      		+ "      \"status_date\": \"\"\n"
	      		+ "    },\n"
	      		+ "    \"other_details\": {\n"
	      		+ "      \"address_1\": \""+address_1+"\",\n"
	      		+ "      \"address_2\": \""+address_2+"\",\n"
	      		+ "      \"address_3\": \""+address_3+"\",\n"
	      		+ "      \"application_identifier\": \"\",\n"
	      		+ "      \"bank_account_opening_date\": \"\",\n"
	      		+ "      \"bank_branch\": \""+bank_branch+"\",\n"
	      		+ "      \"bank_ifsc_code\": \""+bank_ifsc_code+"\",\n"
	      		+ "      \"city\": \"\",\n"
	      		+ "      \"ckyc_number\": \"\",\n"
	      		+ "      \"country\": \"\",\n"
	      		+ "      \"customer_segment\": \"\",\n"
	      		+ "      \"ebcc_kyc_flag\": \""+ebcc_kyc_flag+"\",\n"
	      		+ "      \"engaged_customer\": \""+engaged_customer+"\",\n"
	      		+ "      \"insured_middle_name\": \""+insured_middle_name+"\",\n"
	      		+ "      \"is_business_insurance\": \""+is_business_insurance+"\",\n"
	      		+ "      \"is_nri\": \""+is_nri+"\",\n"
	      		+ "      \"need_for_insurance\": \""+need_for_insurance+"\",\n"
	      		+ "      \"offer_id\": \"\",\n"
	      		+ "      \"offer_name\": \"\",\n"
	      		+ "      \"opportunity_to_meet\": \""+opportunity_to_meet+"\",\n"
	      		+ "      \"opportunity_to_meet_date\": \"2023-07-05T11:43:27.000+0000\",\n"
	      		+ "      \"partner_lead_creation_date\": \"2023-07-05T11:43:27.000+0000\",\n"
	      		+ "      \"pincode\": \"\",\n"
	      		+ "      \"premium_paying_capacity\": \""+premium_paying_capacity+"\",\n"
	      		+ "      \"premium_paying_reason\": \"For Extra Benefits\",\n"
	      		+ "      \"proposer_investment_goal\": \""+proposer_investment_goal+"\",\n"
	      		+ "      \"proposer_lifestage\": \""+proposer_lifestage+"\",\n"
	      		+ "      \"proposer_middle_name\": \""+proposer_middle_name+"\",\n"
	      		+ "      \"proposer_qualification\": \""+proposer_qualification+"\",\n"
	      		+ "      \"proposer_risk_profile\": \""+proposer_risk_profile+"\",\n"
	      		+ "      \"recommended_products\": \"\",\n"
	      		+ "      \"relation_with_proposer\": \""+relation_with_proposer+"\",\n"
	      		+ "      \"source_type\": \"17\",\n"
	      		+ "      \"state\": \"\",\n"
	      		+ "      \"sub_source_type\": \"1416\"\n"
	      		+ "    }\n"
	      		+ "  }\n"
	      		+ "}";


			// Encryption
			String encryptedText = encryptText(plainText, secretKey);
			System.out.println("Encrypted Text: " + encryptedText);
         return encryptedText;

	    }
	    
	    public static  void CreatDataDynamic(HashMap<String, String> testData,String Leadid,String product_id,String proposer_first_name,String proposer_last_name,String proposer_gender,String proposer_mobile_no,String proposer_pan,String proposer_address_1,String proposer_address_2,String proposer_address_3,String proposer_city,String proposer_country,String proposer_pin_code,String proposer_state,String email_id,String bank_account_type,String bank_ifsc_code,String bank_account_no,String bank_customer_occupation,String WithoutPan,String nominee_name,String address_1,String address_2,String address_3,String insured_dob,String insured_first_name,String insured_middle_name,String insured_last_name,String insured_gender,String is_nri,String proposer_investment_goal,String proposer_lifestage,String proposer_risk_profile,String proposer_dob,String bank_customer_income,String is_business_insurance,String proposer_middle_name,String proposer_qualification,String relation_with_proposer,
				String branch_code,String sp_employee_code,String sp_irdai_code,String bank_branch,String ebcc_kyc_flag,String engaged_customer,String need_for_insurance,String opportunity_to_meet,String premium_paying_capacity,String source_type,String sub_source_type) throws Exception {
		  	 bearerToken = bearerTokenGeneration();
		  	 Thread.sleep(2000);
		  	String a = CreatBodyDynamic(testData,Leadid,product_id,proposer_first_name,proposer_last_name,proposer_gender,proposer_mobile_no,proposer_pan,proposer_address_1,proposer_address_2,proposer_address_3,proposer_city,proposer_country,proposer_pin_code,proposer_state,email_id,bank_account_type,bank_ifsc_code,bank_account_no,bank_customer_occupation,WithoutPan,nominee_name,address_1,address_2,address_3,insured_dob,insured_first_name,insured_middle_name,insured_last_name,insured_gender,is_nri,proposer_investment_goal,proposer_lifestage,proposer_risk_profile,proposer_dob,bank_customer_income,is_business_insurance,proposer_middle_name,proposer_qualification,relation_with_proposer,branch_code,sp_employee_code,sp_irdai_code,bank_branch,ebcc_kyc_flag,engaged_customer,need_for_insurance,opportunity_to_meet,premium_paying_capacity,source_type,sub_source_type);
				String secretKeyBase64 = "vBh92Gp7qoG5Tsh/hVBR8Zydlnoo4L7HSHO/2LdMUUo=";
				SecretKey secretKey = new SecretKeySpec(Base64.getDecoder().decode(secretKeyBase64), "AES");
				String payload = "{\n" +
		                "    \"payload\": \""+a+"\"\n}";

				 Response response=given()
		                .baseUri("https://liservicedev.adityabirlacapital.com")
		                .basePath("/bsli/sb/VymoLeadCreation/getLeadCreation")
		                .header("Content-Type", "application/json")
		                .header("partner_application_id", "AXIS_BANKING_APP")
		                .header("partner_id", "AXIS_BANK")
		                .header("X-IBM-Client-Id", "66573fef-7165-4a6c-b8b2-9d4ffd544a47")
		                .header("X-IBM-Client-Secret", "C2tP2wP5pW8kG8pX6nQ8sC3tT2xF0eQ8qJ8fS8xC1jB2pJ4oH6")
		                .header("Authorization", "Bearer " + bearerToken)
		                //.header("Authorization", "Bearer AAIkNjY1NzNmZWYtNzE2NS00YTZjLWI4YjItOWQ0ZmZkNTQ0YTQ320YroALGECQaJjNPkKpL4UwqhfIaLVCo7Mk2oPZvIryu-NTnTledpLoFq1wvKyW4KKjTb4efUO1AD33z5RvIQlyunLL-0xOcdXFDgtYmah8")
		                .body(payload)
		                .contentType(ContentType.JSON)
		                .post();
				 Thread.sleep(5000);       
		    	        System.out.println(response.asString());
		    			String Payload = response.jsonPath().getString("payload");
		    			System.out.println("payload: " + Payload);
		    			String[] CA = Payload.split("payload ");
		    			String payloadOUTPUT=CA[0];
		    			System.out.println("Creat a Data: " + payloadOUTPUT);
		    			Thread.sleep(5000);
		    			  // Decryption
		              byte[] encryptedData = Base64.getDecoder().decode(payloadOUTPUT);
		              String decryptedText = decryptWithPrefixIV(encryptedData, secretKey);
		              System.out.println("Decrypted Text: " + decryptedText);

		    	      
		    	    
		    }
	    
	    
	    
	    
	    public static String PushBodyDynamic(HashMap<String, String> testData,String LeadId,String product_id,String proposer_first_name,String proposer_last_name,String proposer_gender,String proposer_mobile_no,String proposer_pan,String proposer_address_1,String proposer_address_2,String proposer_address_3,String proposer_city,String proposer_country,String proposer_pin_code,String proposer_state,String email_id,String bank_account_type,String bank_ifsc_code,String bank_account_no,String bank_customer_occupation,String WithoutPan,String nominee_name,String address_1,String address_2,String address_3,String insured_dob,String insured_first_name,String insured_middle_name,String insured_last_name,String insured_gender,String is_nri,String type_of_nri,String proposer_investment_goal,String proposer_lifestage,String proposer_risk_profile,String proposer_dob,String bank_customer_income,String is_business_insurance,String proposer_middle_name,String proposer_qualification,String relation_with_proposer,
				String branch_code,String sp_employee_code,String sp_irdai_code,String bank_branch,String ebcc_kyc_flag,String engaged_customer,String need_for_insurance,String opportunity_to_meet,String premium_paying_capacity,String source_type,String sub_source_type) throws Exception {
           
			String secretKeyBase64 = "vBh92Gp7qoG5Tsh/hVBR8Zydlnoo4L7HSHO/2LdMUUo=";
			SecretKey secretKey = new SecretKeySpec(Base64.getDecoder().decode(secretKeyBase64), "AES");
		//this body is working fine 
			String pushText="{\n"
		        		+ "    \"bank_crm_lead_id\": \""+LeadId+"\",\n"
		        		+ "    \"datapush\": true,\n"
		        		+ "    \"update_attributes\": [\n"
		        		+ "        {\n"
		        		+ "            \"key\": \"additional_data.lead_details.bank_account_no\",\n"
		        		+ "            \"value\": \""+bank_account_no+"\"\n"
		        		+ "        },\n"
		        		+ "        {\n"
		        		+ "            \"key\": \"additional_data.lead_details.bank_account_type\",\n"
		        		+ "            \"value\": \""+bank_account_type+"\"\n"
		        		+ "        },\n"
		        		+ "        {\n"
		        		+ "            \"key\": \"additional_data.lead_details.bank_customer_id\",\n"
		        		+ "            \"value\": \"123691328\"\n"
		        		+ "        },\n"
		        		+ "        {\n"
		        		+ "            \"key\": \"additional_data.lead_details.bank_customer_occupation\",\n"
		        		+ "            \"value\": \""+bank_customer_occupation+"\"\n"
		        		+ "        },\n"
		        		+ "        {\n"
		        		+ "            \"key\": \"additional_data.lead_details.product_id\",\n"
		        		+ "            \"value\": \""+product_id+"\"\n"
		        		+ "        },\n"
		        		+ "        {\n"
		        		+ "            \"key\": \"additional_data.other_details.bank_account_opening_date\",\n"
		        		+ "            \"value\": \"2023-07-05\"\n"
		        		+ "        },\n"
		        		+ "        {\n"
		        		+ "            \"key\": \"additional_data.other_details.bank_ifsc_code\",\n"
		        		+ "            \"value\": \""+bank_ifsc_code+"\"\n"
		        		+ "        },\n"
		        		+ "        {\n"
		        		+ "            \"key\": \"additional_data.other_details.ebcc_kyc_flag\",\n"
		        		+ "            \"value\": \"true\"\n"
		        		+ "        },\n"
		        		+ "        {\n"
		        		+ "            \"key\": \"additional_data.other_details.proposer_investment_goal\",\n"
		        		+ "            \"value\": \""+proposer_investment_goal+"\"\n"
		        		+ "        },\n"
		        		+ "        {\n"
		        		+ "            \"key\": \"additional_data.other_details.proposer_lifestage\",\n"
		        		+ "            \"value\": \""+proposer_lifestage+"\"\n"
		        		+ "        },\n"
		        		+ "        {\n"
		        		+ "            \"key\": \"additional_data.other_details.proposer_risk_profile\",\n"
		        		+ "            \"value\": \""+proposer_risk_profile+"\"\n"
		        		+ "        },\n"
		        		+ "        {\n"
		        		+ "            \"key\": \"proposer_dob\",\n"
		        		+ "            \"value\": \""+proposer_dob+"\"\n"
		        		+ "        },\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"additional_data.other_details.is_business_insurance\",\n"
		        		+ "			\"value\": \""+is_business_insurance+"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"additional_data.other_details.is_nri\",\n"
		        		+ "			\"value\": \""+is_nri+"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"additional_data.lead_details.type_of_nri\",\n"
		        		+ "			\"value\": \""+type_of_nri+"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"additional_data.proposer.proposer_pan\",\n"
		        		+ "			\"value\": \""+WithoutPan+"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"additional_data.other_details.proposer_middle_name\",\n"
		        		+ "			\"value\": \""+proposer_middle_name+"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"additional_data.lead_details.is_proposer_same_as_insured\",\n"
		        		+ "			\"value\": \"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"additional_data.other_details.relation_with_proposer\",\n"
		        		+ "			\"value\": \""+relation_with_proposer+"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"insured_dob\",\n"
		        		+ "			\"value\": \""+insured_dob+"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"insured_first_name\",\n"
		        		+ "			\"value\": \""+insured_first_name+"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"additional_data.other_details.insured_middle_name\",\n"
		        		+ "			\"value\": \""+insured_middle_name+"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"insured_last_name\",\n"
		        		+ "			\"value\": \""+insured_last_name+"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"insured_gender\",\n"
		        		+ "			\"value\": \""+insured_gender+"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"additional_data.lead_details.bank_customer_income\",\n"
		        		+ "			\"value\": \""+bank_customer_income+"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"additional_data.proposer.email_id\",\n"
		        		+ "			\"value\": \""+email_id+"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"proposer_pin_code\",\n"
		        		+ "			\"value\": \""+proposer_pin_code+"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"proposer_address_1\",\n"
		        		+ "			\"value\": \""+proposer_address_1+"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"proposer_address_2\",\n"
		        		+ "			\"value\": \""+proposer_address_2+"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"proposer_address_3\",\n"
		        		+ "			\"value\": \""+proposer_address_3+"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"proposer_city\",\n"
		        		+ "			\"value\": \""+proposer_city+"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"proposer_state\",\n"
		        		+ "			\"value\": \""+proposer_state+"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"proposer_country\",\n"
		        		+ "			\"value\": \""+proposer_country+"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"additional_data.other_details.pincode\",\n"
		        		+ "			\"value\": \"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"additional_data.other_details.address_1\",\n"
		        		+ "			\"value\": \""+address_1+"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"additional_data.other_details.address_2\",\n"
		        		+ "			\"value\": \""+address_2+"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"additional_data.other_details.address_3\",\n"
		        		+ "			\"value\": \""+address_3+"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"additional_data.other_details.city\",\n"
		        		+ "			\"value\": \"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"additional_data.other_details.state\",\n"
		        		+ "			\"value\": \"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"additional_data.other_details.country\",\n"
		        		+ "			\"value\": \"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"additional_data.lead_details.nominee_name\",\n"
		        		+ "			\"value\": \""+nominee_name+"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"additional_data.other_details.proposer_qualification\",\n"
		        		+ "			\"value\": \""+proposer_qualification+"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"additional_data.other_details.customer_segment\",\n"
		        		+ "			\"value\": \"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"additional_data.other_details.recommended_products\",\n"
		        		+ "			\"value\": \"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"additional_data.other_details.offer_id\",\n"
		        		+ "			\"value\": \"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"additional_data.other_details.offer_name\",\n"
		        		+ "			\"value\": \"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"additional_data.other_details.application_identifier\",\n"
		        		+ "			\"value\": \"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"additional_data.other_details.ckyc_number\",\n"
		        		+ "			\"value\": \"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"branch_code\",\n"
		        		+ "			\"value\": \""+branch_code+"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"sp_irdai_code\",\n"
		        		+ "			\"value\": \""+sp_irdai_code+"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"additional_data.lead_details.SP_comments\",\n"
		        		+ "			\"value\": \"\"\n"
		        		+ "		}\n"
		        		+ "    ]\n"
		        		+ "}";

         
	    	// Encryption
            String encryptedText = encryptText(pushText, secretKey);
            System.out.println("Encrypted Text: " + encryptedText);
            return encryptedText;
	    	
	    	
	    }
	    
	    

		   public static  String pushDataDynamic(HashMap<String, String> testData,String LeadId,String product_id,String proposer_first_name,String proposer_last_name,String proposer_gender,String proposer_mobile_no,String proposer_pan,String proposer_address_1,String proposer_address_2,String proposer_address_3,String proposer_city,String proposer_country,String proposer_pin_code,String proposer_state,String email_id,String bank_account_type,String bank_ifsc_code,String bank_account_no,String bank_customer_occupation,String WithoutPan,String nominee_name,String address_1,String address_2,String address_3,String insured_dob,String insured_first_name,String insured_middle_name,String insured_last_name,String insured_gender,String is_nri,String type_of_nri,String proposer_investment_goal,String proposer_lifestage,String proposer_risk_profile,String proposer_dob,String bank_customer_income,String is_business_insurance,String proposer_middle_name,String proposer_qualification,String relation_with_proposer,
					String branch_code,String sp_employee_code,String sp_irdai_code,String bank_branch,String ebcc_kyc_flag,String engaged_customer,String need_for_insurance,String opportunity_to_meet,String premium_paying_capacity,String source_type,String sub_source_type) throws Exception {
				String secretKeyBase64 = "vBh92Gp7qoG5Tsh/hVBR8Zydlnoo4L7HSHO/2LdMUUo=";
				SecretKey secretKey = new SecretKeySpec(Base64.getDecoder().decode(secretKeyBase64), "AES");
				CreatDataDynamic(testData,LeadId,product_id,proposer_first_name,proposer_last_name,proposer_gender,proposer_mobile_no,proposer_pan,proposer_address_1,proposer_address_2,proposer_address_3,proposer_city,proposer_country,proposer_pin_code,proposer_state,email_id,bank_account_type,bank_ifsc_code,bank_account_no,bank_customer_occupation,WithoutPan,nominee_name,address_1,address_2,address_3,insured_dob,insured_first_name,insured_middle_name,insured_last_name,insured_gender,is_nri,proposer_investment_goal,proposer_lifestage,proposer_risk_profile,proposer_dob,bank_customer_income,is_business_insurance,proposer_middle_name,proposer_qualification,relation_with_proposer,branch_code,sp_employee_code,sp_irdai_code,bank_branch,ebcc_kyc_flag,engaged_customer,need_for_insurance,opportunity_to_meet,premium_paying_capacity,source_type,sub_source_type);
				Thread.sleep(2000);
				String encryptedText=PushBodyDynamic(testData,LeadId,product_id,proposer_first_name,proposer_last_name,proposer_gender,proposer_mobile_no,proposer_pan,proposer_address_1,proposer_address_2,proposer_address_3,proposer_city,proposer_country,proposer_pin_code,proposer_state,email_id,bank_account_type,bank_ifsc_code,bank_account_no,bank_customer_occupation,WithoutPan,nominee_name,address_1,address_2,address_3,insured_dob,insured_first_name,insured_middle_name,insured_last_name,insured_gender,is_nri,type_of_nri,proposer_investment_goal,proposer_lifestage,proposer_risk_profile,proposer_dob,bank_customer_income,is_business_insurance,proposer_middle_name,proposer_qualification,relation_with_proposer,branch_code,sp_employee_code,sp_irdai_code,bank_branch,ebcc_kyc_flag,engaged_customer,need_for_insurance,opportunity_to_meet,premium_paying_capacity,source_type,sub_source_type);
	             System.out.println(encryptedText);
	             Thread.sleep(5000);
				
	             String payload = "{\n" +
	                     "    \"payload\": \""+encryptedText+"\"\n}";

	     		 Response response=given()
	                    .baseUri("https://liservicedev.adityabirlacapital.com")
	                    .basePath("/bsli/sb/dcb/updateleaddetails")
	                    .header("Content-Type", "application/json")
	                    .header("partner_application_id", "AXIS_BANKING_APP")
	                    .header("partner_id", "AXIS_BANK")
	                    .header("X-IBM-Client-Id", "66573fef-7165-4a6c-b8b2-9d4ffd544a47")
	                    .header("X-IBM-Client-Secret", "C2tP2wP5pW8kG8pX6nQ8sC3tT2xF0eQ8qJ8fS8xC1jB2pJ4oH6")
	                    .header("Authorization", "Bearer " + bearerToken)
	                   // .header("Authorization", "Bearer AAIkNjY1NzNmZWYtNzE2NS00YTZjLWI4YjItOWQ0ZmZkNTQ0YTQ320YroALGECQaJjNPkKpL4UwqhfIaLVCo7Mk2oPZvIryu-NTnTledpLoFq1wvKyW4KKjTb4efUO1AD33z5RvIQlyunLL-0xOcdXFDgtYmah8")
	                    .body(payload)
	                    .contentType(ContentType.JSON)
	                    .post();
	     		    Thread.sleep(5000);
	        	              
	        	        System.out.println(response.asString());
	        			String Payload = response.jsonPath().getString("payload");
	        			System.out.println("payload: " + Payload);
	        			String[] CA = Payload.split("payload ");
	        			String payloadOUTPUT=CA[0];
	        			System.out.println("Creat a Data: " + payloadOUTPUT);
	        			//  Decryption
	                  byte[] encryptedData = Base64.getDecoder().decode(payloadOUTPUT);
	                  String decryptedText = decryptWithPrefixIV(encryptedData, secretKey);
	                  System.out.println("Decrypted Text: " + decryptedText);
				
//			  //=========Started Creat Url & LeadID  ==============");
	                  Thread.sleep(5000);
				String[] resq = decryptedText.split(",");
				String update1 = resq[3];
				String update = update1.replaceAll("redirectionURL", "");
				String update2 = update.replaceFirst(":", "");
				//System.out.println(update2);
				String URL = update2.replace("\"", "");
				String Leapurl=URL.replaceFirst("}", "");
				
				System.out.println("==================Successfully  Creat  Url Of Axis Bank========================");
				System.out.println(Leapurl);
				return Leapurl;
		    	
		    } 
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    //================================================================================
		   /*
	    public static String CreatBody() throws Exception {
	        // Example Usage:
	        String secretKeyBase64 = "vBh92Gp7qoG5Tsh/hVBR8Zydlnoo4L7HSHO/2LdMUUo=";
	        SecretKey secretKey = new SecretKeySpec(Base64.getDecoder().decode(secretKeyBase64), "AES");

	       // String plainText = "{\"bank_crm_lead_id\":\"0901202405\",\"datapush\":true,\"update_attributes\":[{\"key\":\"additional_data.lead_details.bank_account_no\",\"value\":\"123810231\"},{\"key\":\"additional_data.lead_details.bank_account_type\",\"value\":\"Savings\"},{\"key\":\"additional_data.lead_details.bank_customer_id\",\"value\":\"123691328\"},{\"key\":\"additional_data.lead_details.bank_customer_occupation\",\"value\":\"self_employed\"},{\"key\":\"additional_data.lead_details.product_id\",\"value\":\"1235162\"},{\"key\":\"additional_data.other_details.bank_account_opening_date\",\"value\":\"2023-07-05\"},{\"key\":\"additional_data.other_details.bank_ifsc_code\",\"value\":\"AXIS0001\"},{\"key\":\"additional_data.other_details.ebcc_kyc_flag\",\"value\":\"true\"},{\"key\":\"additional_data.other_details.proposer_investment_goal\",\"value\":\"Child's Marriage\"},{\"key\":\"additional_data.other_details.proposer_lifestage\",\"value\":\"SINGLE\"},{\"key\":\"additional_data.other_details.proposer_risk_profile\",\"value\":\"Conservative\"},{\"key\":\"proposer_dob\",\"value\":\"1992-10-23\"},{\"key\":\"proposer_first_name\",\"value\":\"Shyam\"},{\"key\":\"proposer_gender\",\"value\":\"Male\"},{\"key\":\"proposer_last_name\",\"value\":\"Sharma\"},{\"key\":\"proposer_mobile_no\",\"value\":\"9123456789\"},{\"key\":\"sp_employee_code\",\"value\":\"SP00012\"}]}";
	      String   plainText ="{\n"
	      		+ "  \"lead_data\": {\n"
	      		+ "    \"bank_crm_lead_id\": \""+args+"\",\n"
	      		+ "    \"branch_code\": \"P\",\n"
	      		+ "    \"proposer_address_1\": \"\",\n"
	      		+ "    \"proposer_address_2\": \"\",\n"
	      		+ "    \"proposer_address_3\": \"\",\n"
	      		+ "    \"proposer_city\": \"\",\n"
	      		+ "    \"proposer_country\": \"\",\n"
	      		+ "    \"proposer_first_name\": \"Ram\",\n"
	      		+ "    \"proposer_gender\": \"Male\",\n"
	      		+ "    \"proposer_last_name\": \"Prasad\",\n"
	      		+ "    \"proposer_mobile_no\": \"9012345678\",\n"
	      		+ "    \"proposer_pin_code\": \"\",\n"
	      		+ "    \"proposer_state\": \"\",\n"
	      		+ "    \"sp_employee_code\": \"C5435\",\n"
	      		+ "    \"sp_irdai_code\": \"SP0010688948\"\n"
	      		+ "  },\n"
	      		+ "  \"additional_data\": {\n"
	      		+ "    \"proposer\": {\n"
	      		+ "      \"email_id\": \"apoorv.gaurav-v@adityabirlacapital.com\",\n"
	      		+ "      \"proposer_pan\": \"AGYPM101D\"\n"
	      		+ "    },\n"
	      		+ "    \"lead_details\": {\n"
	      		+ "      \"bank_account_type\": \"\",\n"
	      		+ "      \"bank_customer_id\": \"\",\n"
	      		+ "      \"bank_account_no\": \"\",\n"
	      		+ "      \"bank_customer_income\": \"\",\n"
	      		+ "      \"bank_customer_occupation\": \"\",\n"
	      		+ "      \"follow_up_date\": \"\",\n"
	      		+ "      \"is_proposer_same_as_insured\": \"\",\n"
	      		+ "      \"nominee_name\": \"\",\n"
	      		+ "      \"product_id\": \"1000174\",\n"
	      		+ "      \"SP_comments\": \"\",\n"
	      		+ "      \"status_date\": \"\"\n"
	      		+ "    },\n"
	      		+ "    \"other_details\": {\n"
	      		+ "      \"address_1\": \"\",\n"
	      		+ "      \"address_2\": \"\",\n"
	      		+ "      \"address_3\": \"\",\n"
	      		+ "      \"application_identifier\": \"\",\n"
	      		+ "      \"bank_account_opening_date\": \"\",\n"
	      		+ "      \"bank_branch\": \"\",\n"
	      		+ "      \"bank_ifsc_code\": \"AXIS12345\",\n"
	      		+ "      \"city\": \"\",\n"
	      		+ "      \"ckyc_number\": \"\",\n"
	      		+ "      \"country\": \"\",\n"
	      		+ "      \"customer_segment\": \"\",\n"
	      		+ "      \"ebcc_kyc_flag\": \"\",\n"
	      		+ "      \"engaged_customer\": \"Account opened in last 3 months\",\n"
	      		+ "      \"insured_middle_name\": \"\",\n"
	      		+ "      \"is_business_insurance\": \"\",\n"
	      		+ "      \"is_nri\": \"\",\n"
	      		+ "      \"need_for_insurance\": \"Child education or marriage\",\n"
	      		+ "      \"offer_id\": \"\",\n"
	      		+ "      \"offer_name\": \"\",\n"
	      		+ "      \"opportunity_to_meet\": \"Meeting scheduled by SP\",\n"
	      		+ "      \"opportunity_to_meet_date\": \"2023-07-05T11:43:27.000+0000\",\n"
	      		+ "      \"partner_lead_creation_date\": \"2023-07-05T11:43:27.000+0000\",\n"
	      		+ "      \"pincode\": \"\",\n"
	      		+ "      \"premium_paying_capacity\": \"Monthly average balance\",\n"
	      		+ "      \"premium_paying_reason\": \"For Extra Benefits\",\n"
	      		+ "      \"proposer_investment_goal\": \"\",\n"
	      		+ "      \"proposer_lifestage\": \"\",\n"
	      		+ "      \"proposer_middle_name\": \"\",\n"
	      		+ "      \"proposer_qualification\": \"\",\n"
	      		+ "      \"proposer_risk_profile\": \"\",\n"
	      		+ "      \"recommended_products\": \"\",\n"
	      		+ "      \"relation_with_proposer\": \"\",\n"
	      		+ "      \"source_type\": \"17\",\n"
	      		+ "      \"state\": \"\",\n"
	      		+ "      \"sub_source_type\": \"1416\"\n"
	      		+ "    }\n"
	      		+ "  }\n"
	      		+ "}";


	            // Encryption
	            String encryptedText = encryptText(plainText, secretKey);
	            System.out.println("Encrypted Text: " + encryptedText);
	            return encryptedText;

	    }
	    
	   
	    public static  void CreatData() throws Exception {
	  	 bearerToken = bearerTokenGeneration();
	  	String a = CreatBody();
			String secretKeyBase64 = "vBh92Gp7qoG5Tsh/hVBR8Zydlnoo4L7HSHO/2LdMUUo=";
			SecretKey secretKey = new SecretKeySpec(Base64.getDecoder().decode(secretKeyBase64), "AES");
			String payload = "{\n" +
	                "    \"payload\": \""+a+"\"\n}";

			 Response response=given()
	                .baseUri("https://liservicedev.adityabirlacapital.com")
	                .basePath("/bsli/sb/VymoLeadCreation/getLeadCreation")
	                .header("Content-Type", "application/json")
	                .header("partner_application_id", "AXIS_BANKING_APP")
	                .header("partner_id", "AXIS_BANK")
	                .header("X-IBM-Client-Id", "66573fef-7165-4a6c-b8b2-9d4ffd544a47")
	                .header("X-IBM-Client-Secret", "C2tP2wP5pW8kG8pX6nQ8sC3tT2xF0eQ8qJ8fS8xC1jB2pJ4oH6")
	               // .header("Authorization", "Bearer " + bearerToken)
	                .header("Authorization", "Bearer AAIkNjY1NzNmZWYtNzE2NS00YTZjLWI4YjItOWQ0ZmZkNTQ0YTQ320YroALGECQaJjNPkKpL4UwqhfIaLVCo7Mk2oPZvIryu-NTnTledpLoFq1wvKyW4KKjTb4efUO1AD33z5RvIQlyunLL-0xOcdXFDgtYmah8")
	                .body(payload)
	                .contentType(ContentType.JSON)
	                .post();
			 Thread.sleep(5000);       
	    	        System.out.println(response.asString());
	    			String Payload = response.jsonPath().getString("payload");
	    			System.out.println("payload: " + Payload);
	    			String[] CA = Payload.split("payload ");
	    			String payloadOUTPUT=CA[0];
	    			System.out.println("Creat a Data: " + payloadOUTPUT);
	    			Thread.sleep(5000);
	    			  // Decryption
	              byte[] encryptedData = Base64.getDecoder().decode(payloadOUTPUT);
	              String decryptedText = decryptWithPrefixIV(encryptedData, secretKey);
	              System.out.println("Decrypted Text: " + decryptedText);

	    	      
	    	    
	    }
	    //==============
	    
	    public static String PushBody() throws Exception {
            // Decryption
			String secretKeyBase64 = "vBh92Gp7qoG5Tsh/hVBR8Zydlnoo4L7HSHO/2LdMUUo=";
			SecretKey secretKey = new SecretKeySpec(Base64.getDecoder().decode(secretKeyBase64), "AES");
		//this body is working fine 
			String pushText="{\n"
		        		+ "    \"bank_crm_lead_id\": \""+args+"\",\n"
		        		+ "    \"datapush\": true,\n"
		        		+ "    \"update_attributes\": [\n"
		        		+ "        {\n"
		        		+ "            \"key\": \"additional_data.lead_details.bank_account_no\",\n"
		        		+ "            \"value\": \"123810231\"\n"
		        		+ "        },\n"
		        		+ "        {\n"
		        		+ "            \"key\": \"additional_data.lead_details.bank_account_type\",\n"
		        		+ "            \"value\": \"Savings\"\n"
		        		+ "        },\n"
		        		+ "        {\n"
		        		+ "            \"key\": \"additional_data.lead_details.bank_customer_id\",\n"
		        		+ "            \"value\": \"123691328\"\n"
		        		+ "        },\n"
		        		+ "        {\n"
		        		+ "            \"key\": \"additional_data.lead_details.bank_customer_occupation\",\n"
		        		+ "            \"value\": \"Driver\"\n"
		        		+ "        },\n"
		        		+ "        {\n"
		        		+ "            \"key\": \"additional_data.lead_details.product_id\",\n"
		        		+ "            \"value\": \"1235162\"\n"
		        		+ "        },\n"
		        		+ "        {\n"
		        		+ "            \"key\": \"additional_data.other_details.bank_account_opening_date\",\n"
		        		+ "            \"value\": \"2023-07-05\"\n"
		        		+ "        },\n"
		        		+ "        {\n"
		        		+ "            \"key\": \"additional_data.other_details.bank_ifsc_code\",\n"
		        		+ "            \"value\": \"AXIS0001\"\n"
		        		+ "        },\n"
		        		+ "        {\n"
		        		+ "            \"key\": \"additional_data.other_details.ebcc_kyc_flag\",\n"
		        		+ "            \"value\": \"true\"\n"
		        		+ "        },\n"
		        		+ "        {\n"
		        		+ "            \"key\": \"additional_data.other_details.proposer_investment_goal\",\n"
		        		+ "            \"value\": \"Child's Marriage\"\n"
		        		+ "        },\n"
		        		+ "        {\n"
		        		+ "            \"key\": \"additional_data.other_details.proposer_lifestage\",\n"
		        		+ "            \"value\": \"SINGLE\"\n"
		        		+ "        },\n"
		        		+ "        {\n"
		        		+ "            \"key\": \"additional_data.other_details.proposer_risk_profile\",\n"
		        		+ "            \"value\": \"Conservative\"\n"
		        		+ "        },\n"
		        		+ "        {\n"
		        		+ "            \"key\": \"proposer_dob\",\n"
		        		+ "            \"value\": \"1992-10-23\"\n"
		        		+ "        },\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"additional_data.other_details.is_business_insurance\",\n"
		        		+ "			\"value\": \"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"additional_data.other_details.is_nri\",\n"
		        		+ "			\"value\": \"Yes\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"additional_data.lead_details.type_of_nri\",\n"
		        		+ "			\"value\": \"1\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"additional_data.proposer.proposer_pan\",\n"
		        		+ "			\"value\": \"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"additional_data.other_details.proposer_middle_name\",\n"
		        		+ "			\"value\": \"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"additional_data.lead_details.is_proposer_same_as_insured\",\n"
		        		+ "			\"value\": \"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"additional_data.other_details.relation_with_proposer\",\n"
		        		+ "			\"value\": \"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"insured_dob\",\n"
		        		+ "			\"value\": \"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"insured_first_name\",\n"
		        		+ "			\"value\": \"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"additional_data.other_details.insured_middle_name\",\n"
		        		+ "			\"value\": \"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"insured_last_name\",\n"
		        		+ "			\"value\": \"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"insured_gender\",\n"
		        		+ "			\"value\": \"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"additional_data.lead_details.bank_customer_income\",\n"
		        		+ "			\"value\": \"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"additional_data.proposer.email_id\",\n"
		        		+ "			\"value\": \"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"proposer_pin_code\",\n"
		        		+ "			\"value\": \"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"proposer_address_1\",\n"
		        		+ "			\"value\": \"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"proposer_address_2\",\n"
		        		+ "			\"value\": \"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"proposer_address_3\",\n"
		        		+ "			\"value\": \"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"proposer_city\",\n"
		        		+ "			\"value\": \"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"proposer_state\",\n"
		        		+ "			\"value\": \"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"proposer_country\",\n"
		        		+ "			\"value\": \"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"additional_data.other_details.pincode\",\n"
		        		+ "			\"value\": \"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"additional_data.other_details.address_1\",\n"
		        		+ "			\"value\": \"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"additional_data.other_details.address_2\",\n"
		        		+ "			\"value\": \"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"additional_data.other_details.address_3\",\n"
		        		+ "			\"value\": \"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"additional_data.other_details.city\",\n"
		        		+ "			\"value\": \"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"additional_data.other_details.state\",\n"
		        		+ "			\"value\": \"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"additional_data.other_details.country\",\n"
		        		+ "			\"value\": \"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"additional_data.lead_details.nominee_name\",\n"
		        		+ "			\"value\": \"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"additional_data.other_details.proposer_qualification\",\n"
		        		+ "			\"value\": \"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"additional_data.other_details.customer_segment\",\n"
		        		+ "			\"value\": \"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"additional_data.other_details.recommended_products\",\n"
		        		+ "			\"value\": \"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"additional_data.other_details.offer_id\",\n"
		        		+ "			\"value\": \"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"additional_data.other_details.offer_name\",\n"
		        		+ "			\"value\": \"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"additional_data.other_details.application_identifier\",\n"
		        		+ "			\"value\": \"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"additional_data.other_details.ckyc_number\",\n"
		        		+ "			\"value\": \"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"branch_code\",\n"
		        		+ "			\"value\": \"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"sp_irdai_code\",\n"
		        		+ "			\"value\": \"\"\n"
		        		+ "		},\n"
		        		+ "		{\n"
		        		+ "			\"key\": \"additional_data.lead_details.SP_comments\",\n"
		        		+ "			\"value\": \"\"\n"
		        		+ "		}\n"
		        		+ "    ]\n"
		        		+ "}";

         
	    	// Encryption
            String encryptedText = encryptText(pushText, secretKey);
            System.out.println("Encrypted Text: " + encryptedText);
            return encryptedText;
	    	
	    	
	    }
	    
	    
	   public static  void pushData() throws Exception {
			String secretKeyBase64 = "vBh92Gp7qoG5Tsh/hVBR8Zydlnoo4L7HSHO/2LdMUUo=";
			SecretKey secretKey = new SecretKeySpec(Base64.getDecoder().decode(secretKeyBase64), "AES");

			String encryptedText=PushBody();
             System.out.println(encryptedText);
             Thread.sleep(5000);
			
             String payload = "{\n" +
                     "    \"payload\": \""+encryptedText+"\"\n}";

     		 Response response=given()
                    .baseUri("https://liservicedev.adityabirlacapital.com")
                    .basePath("/bsli/sb/dcb/updateleaddetails")
                    .header("Content-Type", "application/json")
                    .header("partner_application_id", "AXIS_BANKING_APP")
                    .header("partner_id", "AXIS_BANK")
                    .header("X-IBM-Client-Id", "66573fef-7165-4a6c-b8b2-9d4ffd544a47")
                    .header("X-IBM-Client-Secret", "C2tP2wP5pW8kG8pX6nQ8sC3tT2xF0eQ8qJ8fS8xC1jB2pJ4oH6")
                   // .header("Authorization", "Bearer " + bearerToken)
                    .header("Authorization", "Bearer AAIkNjY1NzNmZWYtNzE2NS00YTZjLWI4YjItOWQ0ZmZkNTQ0YTQ320YroALGECQaJjNPkKpL4UwqhfIaLVCo7Mk2oPZvIryu-NTnTledpLoFq1wvKyW4KKjTb4efUO1AD33z5RvIQlyunLL-0xOcdXFDgtYmah8")
                    .body(payload)
                    .contentType(ContentType.JSON)
                    .post();
     		    Thread.sleep(5000);
        	              
        	        System.out.println(response.asString());
        			String Payload = response.jsonPath().getString("payload");
        			System.out.println("payload: " + Payload);
        			String[] CA = Payload.split("payload ");
        			String payloadOUTPUT=CA[0];
        			System.out.println("Creat a Data: " + payloadOUTPUT);
        			//  Decryption
                  byte[] encryptedData = Base64.getDecoder().decode(payloadOUTPUT);
                  String decryptedText = decryptWithPrefixIV(encryptedData, secretKey);
                  System.out.println("Decrypted Text: " + decryptedText);
			
//		  //=========Started Creat Url & LeadID  ==============");
                  Thread.sleep(5000);
			String[] resq = decryptedText.split(",");
			String update1 = resq[3];
			String update = update1.replaceAll("redirectionURL", "");
			String update2 = update.replaceFirst(":", "");
			//System.out.println(update2);
			String stringWithoutDoubleQuotes = update2.replace("\"", "");
			String stringWithoutDoubleQuotes1=stringWithoutDoubleQuotes.replaceFirst("}", "");
			
			System.out.println("==================Successfully  Creat  Url Of Axis Bank========================");
			System.out.println(stringWithoutDoubleQuotes1);
	    	
	    } 
	    */
	    
}
