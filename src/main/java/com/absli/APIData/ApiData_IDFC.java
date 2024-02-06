package com.absli.APIData;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.json.simple.JSONObject;
public class ApiData_IDFC {
	
	
	
	
	public void CreatLead_IDFC() throws Exception {
		
		String encryptionKey = "pSMX^F;MK)*Ckv4WTQW2hEXt6I5~}RKZ";
		String encryptionIV = "XfNQhheC3nOeF4tx";

		String payload = data();
		// String payload = "Jxsf3PBDpDySYNmCmA+zIvlN5Rk1hA6QRGhR7ZpXcH768lsxJxGXcLTwfW+pxbWigdLgAHzuGD7N2vHATkfw6ui3CCveFAveAqFGyEySK7+xN2LgjW+BcHtg+yp+lIgMDrVrLecGT6y4TW5skguVtOv1NWpseq7yvFhT9FQPc1WPT9xGTQBh8WJS4VaKjflV/4k747f+J7OlwQhfsWvEMDW67NCh0T2X7kR3F0UgJAZOIyZZJorJtC4srKZYHf9D0CUVIUTeo+IFVaZLmoD+mMPlYG7YIypJ11SriZqFKn2bs753PUI0WUH9ydqpFd8zoMY3Bbl+0BTPpXx4Qnkid+GkSQVztDg+DgmbTXMFz4qB25N3fm8vZwie+SNbbA54o0V0FyN3e5+rlzeDajihpDLuyXpuIaSbDF1FN//hi6qm35NIxeMW8TCE0nfRCFA3EcSNtVmTvPAcNvFwe4MHXQMV5VuJvbS6fGfvyeE3rNWA/KJq74e/4Q/fgizQgNLBX/AusNT4TjnpLvqPJQvwm+lW8BeMPktDV95uCo7BX7wjPg4EZi6WwnQEOJRpBZyXpNTjVGQIWImqu9AOPNf6yvMTjzyCsko5j5wJ8EUsHjTG69Vlp0aNJXCwMPwjZcC7yqbcFgXZNDvZZmYZu92UpsPUDIrloDEe+9vVN65JXWII29SgC77yJjejMp0d1nVhSj4fJuYU1/knEdB5ztG/sUeTBenEHI4zBRX4flC1sSNT3cX2H/01aDz9PxFOOToRYPqm5v83+J9mTZK4ywY0wrBdtyOViPTS2D2uaovXc61lo6kuTJkYze2KS8nrs8goKtr8kQAP1XriNLDqFpZ5mFg+jM45dN/qjBGzD2VAYLeHZJnABZSLGbzQKUKSg+6QlHg46wUvRHnh4eiEvIwXd/jlT4kfzGNaGqVr7HLnIshNmp/YmGuWdH1Sadn/9EjQfAnb7pwlE+NyMDlPsFI6wwFHdmDX9cRX6KWTrEOdFRNtef1DpFlRNj7A1Ekpx/mgnkuRgAUJTB61kQGtEILbH5ibtkGNtDG/kijpQ1tZTORlwe6a3NtXHGwP6o7b7i/4A6Nap/Z6hcpV1Q5PBkrtFiTlX4dYqaas1+e7o9LkMhSAcpH2DNt9/aClVcDs7TN29LOuA86U9lS+GVUNNcsUav5egaF3mMVe5+V6029J5+WHIwDpg3BWXnFWdF4dB6Ia6I27mvUbgSv9CNik5ZmDhSwBtesEhjv2KDFH1JWo1wWaknz4yOj/2hGwRLdPJvKkjKpFfMQyWIGzlq2/skGdLYOsjAYgfVsmeKo=";

		Response response = RestAssured.given().contentType(ContentType.JSON)
            .contentType(ContentType.JSON)
            .header("partner_application_id", "IDFC_Banking_APP")
            .header("partner_id", "IDFC_Bank")
            .header("Authorization", "Bearer AAIkNGZlZDcwZGQtNzA0Yy00NWNhLTlmZTktZTJlMjRmMzNkOGExt1wN1lBaTlrIXTR_M8XHZoHbpDOzbiSul7y4IaZZLhEpP1V4PRXAGB6PgggGhHtUuKmFVkvVpA2Eu5kO45CnHrCHNc9Oyg_KT3dY5W53RQ4")
            .body("{\"payload\": \"" + payload + "\"}")
             .when()
            .post("https://liservicedev.adityabirlacapital.com/bsli/sb/VymoLeadCreation/getLeadCreation?client_id=4fed70dd-704c-45ca-9fe9-e2e24f33d8a1&client_secret=yR3xT7qV4nK8uS8wE6jU4aP4rR1nR8nJ0fB1rU5nF7mN6cJ0rK");

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
	  public static String data() throws Exception {
	        String encryptionKey = "pSMX^F;MK)*Ckv4WTQW2hEXt6I5~}RKZ";
	        String encryptionIV = "XfNQhheC3nOeF4tx";


	        // Assuming `body` is a JSON object
	       // String bodyJson = "{\"lead_data\":{\"bank_crm_lead_id\":\"10116\", ...}}";
	        JSONObject body = new JSONObject();

	        // lead_data
	        JSONObject leadData = new JSONObject();
	        leadData.put("bank_crm_lead_id", "1011");
	        leadData.put("sp_employee_code", "P12513");
	        leadData.put("proposer_dob", "1999-11-13");
	        leadData.put("proposer_first_name", "Ram");
	        leadData.put("proposer_mobile_no", "9012345678");
	        leadData.put("proposer_pin_code", "400078");
	        leadData.put("proposer_address_1", "Address 1");
	        leadData.put("proposer_address_2", "Address Line 2");
	        leadData.put("branch_code", "");
	        leadData.put("proposer_last_name", "");
	        leadData.put("proposer_gender", "");

	        // additional_data
	        JSONObject additionalData = new JSONObject();

	        // lead_details
	        JSONObject leadDetails = new JSONObject();
	        leadDetails.put("type_of_nri", "Resident Indian");
	        leadDetails.put("product_id", "Product 12");
	        leadDetails.put("bank_customer_id", "CUST1234");
	        leadDetails.put("bank_customer_income", "");
	        leadDetails.put("bank_customer_occupation", "");
	        leadDetails.put("bank_account_no", "");

	        additionalData.put("lead_details", leadDetails);

	        // proposer
	        JSONObject proposer = new JSONObject();
	        proposer.put("email_id", "email@test.com");
	        proposer.put("proposer_pan", "");

	        additionalData.put("proposer", proposer);

	        // other_details
	        JSONObject otherDetails = new JSONObject();
	        otherDetails.put("bank_lg_code", "");
	        otherDetails.put("sp_email", "");
	        otherDetails.put("sp_phone", "");
	        otherDetails.put("ckyc_number", "");
	        otherDetails.put("customer_segment_code", "");
	        otherDetails.put("premium", "");
	        otherDetails.put("lifestage", "");

	        additionalData.put("other_details", otherDetails);

	        // Putting lead_data and additional_data into the main body JSON object
	        body.put("lead_data", leadData);
	        body.put("additional_data", additionalData);

	        System.out.println(body.toJSONString());
	        
	        
	        
	        
	        String encryptedPayload = encryptGCM(body.toJSONString(), encryptionKey, encryptionIV);
	        System.out.println("Encrypted Payload: " + encryptedPayload);
	        return encryptedPayload;
	    }
	
	 public static String encryptGCM(String data, String encryptionKey, String encryptionIV) throws Exception {
	        byte[] keyBytes = encryptionKey.getBytes(StandardCharsets.UTF_8);
	        byte[] ivBytes = encryptionIV.getBytes(StandardCharsets.UTF_8);
	        SecretKey key = new SecretKeySpec(keyBytes, "AES");
	        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
	        GCMParameterSpec spec = new GCMParameterSpec(128, ivBytes);
	        cipher.init(Cipher.ENCRYPT_MODE, key, spec);
	        byte[] encrypted = cipher.doFinal(data.getBytes(StandardCharsets.UTF_8));
	        byte[] ivAndEncrypted = concatenateArrays(ivBytes, encrypted);
	        return Base64.getEncoder().encodeToString(ivAndEncrypted);
	    }

	    public static String decryptGCM(String data, String encryptionKey, String encryptionIV) throws Exception {
	        byte[] keyBytes = encryptionKey.getBytes(StandardCharsets.UTF_8);
	        byte[] ivAndEncrypted = Base64.getDecoder().decode(data);
	        byte[] ivBytes = getIVBytes(ivAndEncrypted);
	        byte[] encrypted = getEncryptedBytes(ivAndEncrypted);
	        SecretKey key = new SecretKeySpec(keyBytes, "AES");
	        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
	        GCMParameterSpec spec = new GCMParameterSpec(128, ivBytes);
	        cipher.init(Cipher.DECRYPT_MODE, key, spec);
	        byte[] decrypted = cipher.doFinal(encrypted);
	        return new String(decrypted, StandardCharsets.UTF_8);
	    }

	    private static byte[] concatenateArrays(byte[] a, byte[] b) {
	        byte[] result = new byte[a.length + b.length];
	        System.arraycopy(a, 0, result, 0, a.length);
	        System.arraycopy(b, 0, result, a.length, b.length);
	        return result;
	    }

	    private static byte[] getIVBytes(byte[] ivAndEncrypted) {
	        int ivLength = 12; // GCM recommended IV length
	        byte[] ivBytes = new byte[ivLength];
	        System.arraycopy(ivAndEncrypted, 0, ivBytes, 0, ivLength);
	        return ivBytes;
	    }

	    private static byte[] getEncryptedBytes(byte[] ivAndEncrypted) {
	        int ivLength = 12; // GCM recommended IV length
	        int encryptedLength = ivAndEncrypted.length - ivLength;
	        byte[] encryptedBytes = new byte[encryptedLength];
	        System.arraycopy(ivAndEncrypted, ivLength, encryptedBytes, 0, encryptedLength);
	        return encryptedBytes;
	    }

}
