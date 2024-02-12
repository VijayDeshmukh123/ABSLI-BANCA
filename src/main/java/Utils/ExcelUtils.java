package Utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ExcelUtils {
//vijay
	public static ArrayList<String> getExecutionSuitesFromController(String testExcelSheet, String controlSheetName) {
		ArrayList<String> suiteData = new ArrayList<String>();
		Xls_reader reader = null;
		try {
			reader = new Xls_reader(System.getProperty("user.dir") + testExcelSheet);
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (int rowCount = 2; rowCount <= reader.getRowCount(controlSheetName); rowCount++) {

			String currentSuiteName = reader.getCellData(controlSheetName, "suitename", rowCount);
			String enableFlag = reader.getCellData(controlSheetName, "execute", rowCount);
			if (enableFlag.equalsIgnoreCase("YES")) {
				suiteData.add(currentSuiteName);
			}
		}
		System.out.println("Selected suites for execution *********" + suiteData);
		System.out.println("Selected suites for execution *********" + suiteData);
		return suiteData;
	}



	public static String getPlatformNameFromExcel(String testExcelSheet, String sheetName) {
		String platform = null;

		Xls_reader reader = null;
		try {
			reader = new Xls_reader(System.getProperty("user.dir") + testExcelSheet);
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (int rowCount = 2; rowCount <= reader.getRowCount(sheetName); rowCount++) {
			String enableFlag = reader.getCellData(sheetName, "execute", rowCount);
			if (enableFlag.equalsIgnoreCase("YES")) {
				platform = reader.getCellData(sheetName, "platform", rowCount);
				break;
			}
		}
		return platform;
	}


	public static String getURLFromExcel(String testExcelSheet, String sheetName) {

		String urlType = null;
		Xls_reader reader = null;
		try {
			reader = new Xls_reader(System.getProperty("user.dir") + testExcelSheet);
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (int rowCount = 2; rowCount <= reader.getRowCount(sheetName); rowCount++) {
			String enableFlag = reader.getCellData(sheetName, "execute", rowCount);
			if (enableFlag.equalsIgnoreCase("YES")) {
				urlType = reader.getCellData(sheetName,"URL", rowCount);
				break;
			}
		}
		return urlType;
	}
//-----------------------------------------------------------------------------------------------------------------//
	////////////////////////////////////// Proposer Same Scenario //////////////////////////////////////////////////////
	public ArrayList<HashMap<String, String>> getEndtoEndProposerSame(String testExcelSheet, String testName, String SheetName) {
		ArrayList<HashMap<String, String>> myData = new ArrayList<>();
		ArrayList<String> myColumnData = new ArrayList<String>();
		Xls_reader reader = null;

		try {
			reader = new Xls_reader(System.getProperty("user.dir") + testExcelSheet);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("dashboard Sheet row count ---------" + reader.getRowCount(SheetName));
		System.out.println(" ******* current test running method  *********" + testName);
		System.out.println("**** column count  ********" + reader.getColumnCount(SheetName));

		String[] columnHeaders = {"ChannelName","SPCode",//DBS
				//Axis
				"product_id", "proposer_first_name", "proposer_middle_name","proposer_last_name", "proposer_gender", "proposer_mobile_no", "proposer_pan",
				"proposer_address_1", "proposer_address_2", "proposer_address_3", "proposer_city", "proposer_country",
				"proposer_pin_code", "proposer_state", "email_id", "bank_account_type", "bank_ifsc_code",
				"bank_account_no", "bank_customer_occupation", "WithoutPan", "nominee_name",
				"address_1", "address_2", "address_3", "insured_dob", "insured_first_name", "insured_middle_name",
				"insured_last_name", "insured_gender", "is_nri", "proposer_investment_goal", "proposer_lifestage",
				"proposer_risk_profile", "proposer_dob", "proposer_pin_code","bank_customer_income","is_business_insurance","proposer_middle_name",
				"proposer_qualification","relation_with_proposer","branch_code","sp_employee_code","sp_irdai_code","bank_branch","ebcc_kyc_flag","engaged_customer",
				"need_for_insurance","opportunity_to_meet","premium_paying_capacity","source_type","sub_source_type","ProposerInsuredSame","TypeOfNRI","NRICountry",
				
				
				
				//DCB
				 "LeadId","proposer_pan","proposer_first_name","proposer_last_name","proposer_gender","proposer_dob","insured_dob","insured_gender","proposer_mobile_no",
				 "proposer_email_id", "bank_account_no","bank_account_type","address_type","proposer_pin_code","proposer_address_1","proposer_address_2","proposer_address_3",
				 "proposer_city","proposer_state","proposer_country","is_proposer_same_as_insured","bank_customer_income","bank_customer_occupation","insured_marital_status","proposer_marital_status",
				 "nominee_name","insured_occupation","bank_nationality", "insured_nationality",
				
				//BOM
				"username","password","BankCustID","IsProposerWithTheBankForMoreThan7Months?","LeadId","CARefBValue","SPCodeOfCABOM","CABranchCode","ProposerInsuredSame","IsNRI","TypeOfNRI","NRICountry","propNRIGSTwavier",
                "IsPanAvailable","AadharCardNo","PanNameEdit","PanDOBEdit","EditAddress","ProposerMobileNumber",
                "ProposerPanNumber","IsAadhaarCard","IsEnterManual","ProposerDOB","ProposerSalutation","ProposerName","ProposerMiddleName",
                "ProposerLastName","ProposerGender",
                
                "PlanSelectionJourney",
                "premiumValue", "occupationOption", "lifeStageValue", "riskProfileFieldValue", "investmentGoalValue", "AddExistingPolicies", "SAAmount", "SelectPlan",

				"IsselectN_AyushPlan","IsPremiumAmountN_AyushPlan","premiumamountN_AyushPlan","IsPPTOptionN_AyushPlan","pptN_AyushPlan","IspolicytermN_AyushPlan","policytermN_AyushPlan","IsPaymodeN_AyushPlan","paymodeN_AyushPlan", "IsBenefitOptionN_AyushPlan","benefitotionN_AyushPlan","IsBenefitfrequencyN_AyushPlan","benefitfreqN_AyushPlan","IsIncomeVarientN_AyushPlan","IncomeVariantN_AyushPlan","IsDefermenntPeriodN_AyushPlan","DefermentPeriodN_AyushPlan","IsSAmultiplierN_AyushPlan","SumAssuredMultiplierN_AyushPlan","IsAddRiderN_AyushPlan", "IswavierofpremiumN_AyushPlan","IsADBRiderN_AyushPlan","ADMamountN_AyushPlan","IsCIRiderN_AyushPlan","CIamountN_AyushPlan","IsSCRiderN_AyushPlan","SCamountN_AyushPlan","IsHSRiderN_AyushPlan","HCamounty",
				"IsselectGMSPlan","IsPremiumAmountGMS","premiumamountGMS","IsOptionGMS","OptionGMS","IsPaymodeGMS","paymodeGMS","IsAddRiderGMS","IswavierofpremiumGMS","IsADDRiderGMS","ADDMamountGMS","IsCIRiderGMS","CIamountGMS","IsSCRiderGMS","SCamountGMS","IsHSRiderGMS","HCamountGMS","IsADBRiderGMS","ADBamountGMS",
				"IsselectFMPPlan","IsPremiumAmountFMP","premiumamountFMP","IsPlanOptionFMP","PlanOptionFMP","IsPPTOptionFMP","pptFMP","IsPolicyTermFMP","PolicyTermFMP",
				"IsselectAIPPlan","IsPremiumAmountAIP","premiumamountAIP","IsPPTOptionAIP","pptAIP","IspolicytermAIP","policytermAIP","IsPaymodeAIP","paymodeAIP", "IsBenefitOptionAIP","benefitotionAIP","IsBenefitfrequencyAIP","benefitfreqAIP","IsBenefitPeriodAIP","benefitperiodAIP","IsAddRiderAIP", "IswavierofpremiumAIP","IsADBRiderAIP","ADMamountAIP","IsCIRiderAIP","CIamountAIP","IsSCRiderAIP","SCamountAIP","IsHSRiderAIP","HCamountAIP",
				"IsselectN_AyushPlan", "IsPremiumAmountN_AyushPlan", "premiumamountN_AyushPlan", "IsPPTOptionN_AyushPlan", "pptN_AyushPlan", "IspolicytermN_AyushPlan", "policytermN_AyushPlan", "IsPaymodeN_AyushPlan", "paymodeN_AyushPlan", "IsBenefitOptionN_AyushPlan", "benefitotionN_AyushPlan", "IsBenefitfrequencyN_AyushPlan", "benefitfreqN_AyushPlan", "IsIncomeVarientN_AyushPlan", "IncomeVariantN_AyushPlan", "IsDefermenntPeriodN_AyushPlan", "DefermentPeriodN_AyushPlan", "IsSAmultiplierN_AyushPlan", "SumAssuredMultiplierN_AyushPlan", "IsAddRiderN_AyushPlan", "IswavierofpremiumN_AyushPlan", "IsADBRiderN_AyushPlan", "ADMamountN_AyushPlan", "IsCIRiderN_AyushPlan", "CIamountN_AyushPlan", "IsSCRiderN_AyushPlan", "SCamountN_AyushPlan", "IsHSRiderN_AyushPlan", "HCamountN_AyushPlan","AddExtraRiderN_AyushPlan",
				"IsselectAkshaya", "IsPremiumAmountAkshaya", "premiumamountAkshaya", "IsBenefitOptionAkshaya", "benefitotionAkshaya", "IsPPTOptionAkshaya", "pptAkshaya", "IspolicytermAkshaya", "policytermAkshaya", "IsBenefitfrequencyAkshaya", "benefitfreqAkshaya", "IsPaymodeAkshaya", "paymodeAkshaya", "IsAddRiderAkshaya", "IswavierofpremiumAkshaya", "IsADBRiderAkshaya", "ADamountAkshaya", "IsCIRiderAkshaya", "CIamountAkshaya", "IsSCRiderAkshaya", "SCamountAkshaya", "IsHSRiderAkshaya", "HCamountAkshaya","AddExtraRiderAkshaya",
				"IsselectN_Laabh", "IsPremiumAmountN_Laabh", "premiumamountN_Laabh", "IsPlanOptionN_Laabh", "PlanOptionN_Laabh", "IsPPTOptionN_Laabh", "pptN_Laabh", "IspolicytermN_Laabh", "policytermN_Laabh", "IsPaymodeN_Laabh", "paymodeN_Laabh", "IsAddRiderN_Laabh", "IsBenefitfrequencyN_Laabh", "benefitfreqN_Laabh", "IswavierofpremiumN_Laabh", "IsADBRiderN_Laabh", "ADMamountN_Laabh", "IsCIRiderN_Laabh", "CIamountN_Laabh", "IsSCRiderN_Laabh", "SCamountN_Laabh", "IsHSRiderN_Laabh", "HCamountN_Laabh","AddExtraRiderN_Laabh",
				"IsselectASP", "IsPremiumAmountASP", "premiumamountASP", "IsPPTOptionASP", "PlanOptionASP", "IsPPTASP", "pptASP", "IspolicytermASP", "PolicyTermASP", "IsPaymodeASP", "paymodeASP", "IsAddRiderASP", "IswavierofpremiumASP", "IsADBRiderASP", "ADMamountASP", "IsCIRiderASP", "CIamountASP", "IsSCRiderASP", "SCamountASP", "IsHSRiderASP", "HCamountASP","AddExtraRiderASP",
				"IsselectVision_Endo", "Issmokerstatus", "Issmoker", "IsSumAssuredVision_Endo", "sumAssuredamountVision_Endo", "IsPPTOptionVision_Endo", "pptVision_Endo", "IspolicytermVision_Endo", "policytermVision_Endo", "IsBenefitOptionVision_Endo", "benefitotionVision_Endo", "IsPaymodeVision_Endo", "paymodeVision_Endo", "IsAddRiderVision_Endo", "IswavierofpremiumVision_Endo", "IsADBRiderVision_Endo", "ADMamountVision_Endo", "IsCIRiderVision_Endo", "CIamountVision_Endo", "IsSCRiderVision_Endo", "SCamountVision_Endo", "IsHSRiderVision_Endo", "HCamountVision_Endo","IswavierofpremiumVision_Endo",
				"IsselectFortune", "IsPremiumAmountFortune", "premiumamountFortune", "IsPPTOptionFortune", "pptFortune", "IspolicytermFortune", "policytermFortune", "IsInvestMentOptionFortune", "investMentOptionFortune", "IsUnderWritingClassFortune", "underWritingClassFortune", "transferFrequFortune", "IsPaymodeFortune", "paymodeFortune", "multiplierFortune", "magnifierFortune", "maximiserFortune", "superTwentyFortune", "liquidPlusFortune", "incomeAdvFortune", "assureFundFortune", "enhanceFortune", "CappedNintyFortune", "creatorFundFortune", "valueFundFortune", "protectorFortune", "builderFortune", "pureEquityFortune", "assetFortune", "mnuFortune", "IsAddRiderFortune", "IswavierofpremiumFortune", "IsADBRiderFortune", "ADMamountFortune","AddExtraRiderFortune",
				"IsselectN_Pension", "IsPremiumAmountN_Pension", "premiumamountN_Pension", "IsPPTOptionN_Pension", "pptN_Pension", "IspolicytermN_Pension", "policytermN_Pension", "IsPaymodeN_Pension", "paymodeN_Pension", "IsBenefitOptionN_Pension", "benefitotionN_Pension", "IsBenefitfrequencyN_Pension", "benefitfreqN_Pension", "IsIncomeVarientN_Pension", "IncomeVariantN_Pension", "IsDefermenntPeriodN_Pension", "DefermentPeriodN_Pension", "IsSAmultiplierN_Pension", "SumAssuredMultiplierN_Pension", "IsAddRiderN_Pension", "IswavierofpremiumN_Pension", "IsADBRiderN_Pension", "ADMamountN_Pension", "IsCIRiderN_Pension", "CIamountN_Pension", "IsSCRiderN_Pension", "SCamountN_Pension", "IsHSRiderN_Pension", "HCamountN_Pension",
				"IsselectPSK", "IsSmokingStatusPSK", "Issmoker", "IsSumAssured", "SumAssuredPSK", "IsSelectPlanOptionsPSK", "planOptionPSK", "IsPPTOptionPSK", "pptPSK", "IsPolicyTermPSK", "PolicyTermPSK", "IsPaymodePSK", "paymodePSK", "IsACIPSK", "ACIumAssuredamountPSK", "IsAddRiderPSK", "IswavierofpremiumPSK", "IsADDRiderPSK", "ADDMamountPSK", "IsCIRiderPSK", "CIamountPSK", "IsSCRiderPSK", "SCamountPSK", "IsHSRiderPSK", "HCamountPSK", "IsADBRiderPSK", "ADBamountPSK","AddExtraRidePSK",
				"IsselectWealth_secure", "IsPremiumAmountWealth_secure", "premiumamountWealth_secure", "IsPPTWealth_secure", "PayingTermWealth_secure", "IsInvestmentOptionWealth_secure", "InvestOptionWealth_secure", "IsUnderWritingClassWealth_secure", "underWritingClassWealth_secure", "RiskProfile_Wealth_secure", "IsPaymodeWealth_secure", "paymodeWealth_secure", "magnifierWealth_secure", "maximiserWealth_secure", "superTwentyWealth_secure", "CappedNintyWealth_secure", "assetWealth_secure", "liquidPlusWealth_secure", "incomeAdvWealth_secure", "assureFundWealth_secure", "enhanceWealth_secure", "multiplierWealth_secure", "valueFundWealth_secure", "builderWealth_secure", "protectorWealth_secure", "pureEquityWealth_secure", "creatorFundWealth_secure", "mnuWealth_secure", "IsAddRiderWealth_secure", "IswavierofpremiumWealth_secure", "IsADDRiderWealth_secure", "ADDMamountWealth_secure","AddExtraRiderWealth_secure",
				"IsselectWealth_aspire", "premiumamountWealth_aspire", "IsPPTWealth_aspire", "PayingTermWealth_aspire", "IsPTWealth_aspire", "PolicyTermAWSWealth_aspire", "IsPlanOptionWealth_aspire", "PlanOptionWealth_aspire", "IsInvestmentOptionWealth_aspire", "InvestOptionWealth_aspire", "IsUnderWritingClassWealth_aspire", "underWritingClassWealth_aspire", "transferFrequWealth_aspire", "RiskProfileWealth_aspire", "IsPaymodeWealth_aspire", "paymodeWealth_aspire", "magnifierWealth_aspire", "maximiserWealth_aspire", "superTwentyWealth_aspire", "CappedNintyWealth_aspire", "assetWealth_aspire", "liquidPlusWealth_aspire", "incomeAdvWealth_aspire", "assureFundWealth_aspire", "enhanceWealth_aspire", "multiplierWealth_aspire", "valueFundWealth_aspire", "builderWealth_aspire", "protectorWealth_aspire", "pureEquityWealth_aspire", "creatorFundWealth_aspire", "mnuWealth_aspire", "IsAddRiderWealth_aspire", "IswavierofpremiumWealth_aspire", "IsADDRiderWealth_aspire", "ADDMamountWealth_aspire","AddExtraRiderWealth_aspire",
				"IsselectASK", "IsSmokingStatusASK", "IssmokerASK", "IsSumAssuredASK", "SumAssuredASK", "IsPPTOptionASK", "pptASK", "IspolicytermASK", "policytermASK", "IsPaymodeASK", "paymodeASK",
				"IsselectChild_future", "ISPlanBasedOnChild_future", "PlanBasedOnChild_future", "SumassuredACFChild_future", "premiumamountChild_future", "ChildNomineeChild_future", "ChildAgeChild_future", "ISassuredbeneoptionChild_future", "AssuredBeneOptionChild_future", "EduBenePeriodChild_future", "AssuredBeneTermChild_future", "MarraigeAssuredAgeChild_future", "MarraigeMultipleChild_future", "MarraigeBeneTermChild_future", "pptChild_future", "paymodeChild_future", "IsAddRiderChild_future", "IswavierofpremiumChild_future", "IsADDRiderChild_future", "ADDMamountChild_future", "IsCIRiderChild_future", "CIamountChild_future", "IsSCRiderChild_future", "SCamountChild_future", "IsHSRiderChild_future", "HCamountChild_future", "IsADBRiderChild_future", "ADBamountChild_future","AddExtraRiderChild_future",
				"IsselectDigi", "Issmokerstatus", "Issmoker", "IsSumAssuredDigi", "sumAssuredamountDigi", "IsSelectPlanOptionsDigi", "planOptionDigi", "pptDigi", "policytermDigi", "increasingCoverDigi", "retiredAgeDigi", "reductionFactorDigi", "retiredAgeDigi", "reductionFactorDigi", "paymodeDigi", "IsAddRiderDigi", "IsADBRiderDigi", "ADMamountDigi", "IsCIRiderDigi", "CIamountDigi", "IsSCRiderDigi", "SCamountDigi", "IsHSRiderDigi", "HCamountDigi","AddExtraRiderDigi",
				"IsselectCancer", "IsPlanOptionCancer", "PlanOptionCancer", "IsPolicyTermCancer", "termCancer", "IsPaymodeCancer", "paymodeCancer", "IsIncomeBenefitCancer", "IsAddRiderCancer", "IswavierofpremiumCancer", "IsADBRiderCancer", "ADMamountCancer", "IsCIRiderCancer", "CIamountCancer", "IsSCRiderCancer", "SCamountCancer", "IsHSRiderCancer", "HCamountCancer",
				"IsselectSalaried", "Issmokerstatus", "Issmoker", "SumAssuredAmountSalaried", "IsPlanOptionSalaried", "PlanOptionSalaried", "IsPPTOptionSalaried", "pptOptionSalaried", "IsPolicyTermSalaried", "PolicytermSalaried", "IncomeBenefitPeriodSalaried", "IncomeEscalationRateSalaried", "NameOfEmployerSalaried", "IsPaymodeSalaried", "paymodeSalaried", "IsACIAST", "SumAssuredACIAST", "IsAddRiderAST", "IswavierofpremiumAST", "IsADDRiderAST", "ADDMamountAST", "IsCIRiderAST", "CIamountAST", "IsSCRiderAST", "SCamountAST", "IsHSRiderAST", "HCamountAST", "IsADBRiderAST", "ADBamountAST", "IsCompanySalaried", "companysalaried","AddExtraRiderAST",
				"IsselectVisionlife", "IsSumAssuredvisionlife", "SumAssuredvisionlife", "IsPayingTerplanoptionassureplusmvisionlife", "PayingTermvisionlife", "IsPaymodevisionlife", "paymodevisionlife", "IsAddRidervisionlife", "Iswavierofpremiumvisionlife", "IsADDRidervisionlife", "ADDMamountvisionlife", "IsCIRidervisionlife", "CIamountvisionlife", "IsSCRidervisionlife", "SCamountvisionlife", "IsHSRidervisionlife", "HCamountvisionlife", "IsADBRidervisionlife", "ADBamountvisionlife","AddExtraRidervisionlife",
				"IsselectVisionlifeplus", "IsPremiumvisionlifeplus", "PremiumAmountvisionlifeplus", "IsBenifitOptionvisionlifeplus", "BenifitOptionvisionlifeplus", "IsPPTOptionvisionlifeplus", "pptOptionvisionlifeplus", "IsBenifitPayoutPeriodvisionlifeplus", "BenifitPayoutPeriodvisionlifeplus", "IsBenifitPayoutvisionlifeplus", "BenifitPayoutvisionlifeplus", "IsBonusUtilizationOptionvisionlifeplus", "bonusUtilizationOptionvisionlifeplus", "IsPaymodevisionlifeplus", "paymodevisionlifeplus", "IsAddRidervisionlifeplus", "Iswavierofpremiumvisionlifeplus", "IsCIRidervisionlifeplus", "CIamountvisionlifeplus", "IsSCRidervisionlifeplus", "SCamountvisionlifeplus", "IsHSRidervisionlifeplus", "HCamountvisionlifeplus", "IsADBRidervisionlifeplus", "ADBamountvisionlifeplus","AddExtraRidervisionlifeplus",
				"IsselectVisionstar", "Issumaasuredstar", "SumAssuredAmountstar", "IsPlanOptionstar", "PlanOptionstar", "IsPPTOptionstar", "pptOptionstar", "IsPaymodestar", "paymodestar", "IsAddRiderstar", "Iswavierofpremiumstar", "IsADDRiderstar", "ADDMamountstar", "IsCIRiderstar", "CIamountstar", "IsSCRiderstar", "SCamountstar", "IsHSRiderstar", "HCamountstar", "IsADBRiderstar", "ADBamountstar","AddExtraRiderstar",
				"IsselectCriti_Shield", "IsPolicyTermCriti", "termCriti", "IsbeneoptionCriti", "beneCritioption", "IsPaymodeCriti", "paymodeCriti",
				"IsselectAssured_flexi", "IsPremiumAmountflexi", "premiumamountflexi", "IsPPTOptionflexi", "pptflexi", "IsPaymodeflexi", "paymodeflexi", "IsAddRiderflexi", "Iswavierofpremiumflexi", "IsADBRiderflexi", "ADMamountflexi", "IsCIRiderflexi", "CIamountflexi", "IsSCRiderflexi", "SCamountflexi", "IsHSRiderflexi", "HCamountflexi","AddExtraRiderflexi",
				"IsselectPlatinum", "IsPremiumAmountplatinum", "premiumamountplatinum", "IsPPTOptionplatinum", "pptplatinum", "IsPolicytermplatinum", "poltermplatinum", "IsSAMultiplierplatinum", "SAmultiplatinum", "Isinvestmentoptplatinum", "Invoptionplatinum", "uclassplatinum", "ProfilePlatinum", "IsPaymodeplatinum", "paymodeplatinum", "magnifierplatinum", "maximiserplatinum", "superTwentyplatinum", "CappedNintyplatinum", "assetplatinum", "liquidPlusplatinum", "incomeAdvplatinum", "assureFundplatinum", "enhanceplatinum", "multiplierplatinum", "valueFundplatinum", "builderplatinum", "protectorplatinum", "pureEquityplatinum", "creatorFundplatinum", "mnuplatinum", "IsAddRiderplatinum", "Iswavierofpremiumplatinum", "IsADDRiderplatinum", "ADDMamountplatinum","AddExtraRiderplatinum",
				"IsselectWealth_infinia","IsPremiumAmountinfinia","premiumamountinfinia","IsPPTinfinia","pptinfinia","IsPlanOptioninfinia","planoptioninfinia","policyterminfinia","IsSAmultiplierinfinia","samultiplierinfinia","IsInvestmentOptioninfinia","InvestOptioninfinia","IsPaymodeinfinia","paymodeinfinia","underWritingClassinfinia","RiskProfileinfinia","magnifierinfina","maximiserinfina","superTwentyinfina","CappedNintyinfina","assetinfina","liquidPlusinfina","incomeAdvinfina","assureFundinfina","enhanceinfina","multiplierinfina","valueFundinfina","builderinfina","protectorinfina","pureEquityinfina","creatorFundinfina","mnuinfina","IsAddRiderinfinia","Iswavierofpremiuminfinia","AddExtraRiderinfinia","IsADDRiderinfinia","ADDMamountinfinia",
				"IsselectWealth_Assureplus","IsPremiumAmountassureplus","premiumamountassureplus","IsPPTOptionassureplus","pptassureplus","IsPoltermOptionassureplus","policytermassureplus","Isplanoptionassureplus","planoptionassureplus","IsInvestmentOptionassureplus","InvestOptionassureplus","underWritingClassassureplus","Transferassureplus","RiskProfileassureplus","IsPaymodeassureplus","paymodeassureplus","liquidPlusassureplus","incomeAdvassureplus","assureFundassureplus","enhanceassureplus","magnifierassureplus","creatorFundassureplus","multiplierassureplus","protectorassureplus","builderassureplus","maximiserassureplus","superTwentyassureplus","CappedNintyassureplus","assetassureplus","pureEquityassureplus","valueFundassureplus","mnuassureplus","IsAddRiderassureplus","Iswavierofpremiumassureplus","AddExtraRiderassureplus","IsADDRiderassureplus","ADDMamountassureplus",
				"IsselectWealth_Max","IsPremiumAmountwealthmax","premiumamountwealthmax","IsPoltermOptionwealthmax","policytermwealthmax","IsInvestmentOptionwealthmax","InvestOptionwealthmax","TransferFundwealthmax","SumAssuredMultiplierwealthmax","underWritingClasswealthmax","creatorFundwealthmax","magnifierwealthmax","maximiserwealthmax","multiplierwealthmax","superTwentywealthmax","pureEquitywealthmax","valueFundwealthmax","CappedNintywealthmax","incomeAdvwealthmax","assureFundwealthmax","enhancewealthmax","mnuwealthmax","IsAddRiderwealthmax","IsADDRiderwealthmax","ADDMamountwealthmax",
				"IsselectAnnuityPlus","Newproposal","annuitypremium","annuitymode","Isannuitypremiumfield","annuitypremiumfield","amt","annuityopts","levelincreasingannuity","IncomeEscalationRateSalariedGAP","singlejointlife","jointliferel","jointlifenri","JointlifePAN","Jointlifeday","Jointlifemonth","Jointlifeyear","annuitycurtain","rop","pptGAP","DefermentPeriod","paymodeGAP",
				
				"ProposerMobileNumber", "ProposerEmailId", "PreferredLang", "AlternateNumber", "ResidenceNumber",
				"addressType", "AddressLocation1", "CityAddress", "StateAddress", "AddressLocation2", "pinCode",
				"addressOne", "addressTwo", "addressThree", "IsPermanentAddressSame", "PinCodeTwo", "AddressFour",

				"IFSCCode", "AccountNo", "AccountType", "PaymentMethod", "PreferredDrawDate", "SourceOfFunds",

				"nomineeFirstName", "nomineeLastName", "day", "month", "year",
				"nomineegender", "relationship", "nomineeshare","appointeefname","appointeelname","apointeeday","apointeemonth","apointeeyear","appointeegender","apointeerelationship",

				"Insumarital","maidenname","fatherSpouse","mothername","InsurerBirthPlace","IsHaveEIA","PreferredIR","IsInsuPolitical","PoliticalDetails","qualification","occupationOption","NameOfEmployer","natureofbusiness","TypeOfOrganisation","Designation","nameofbusiness","AnnualIncome",
				"IsAreYouRegisterPerson","GSTnumber","AddexistingPolicy","InsurerName","SumAssured","AddrefusedPolicy","PolicyType","InsurerNameRef","SumAssuredref","ReasonRef","InsurancePurpose1","InsurancePurpose2","InsurancePurpose3",
				
				"HeightFeet","HeightInch","weight","Isweightgainlost","Weightgainlost",
				"IsLifeStyleDetails","IsNarcoticsDetails","ProvideDetails","IsAlcoholConsumptionDetails","TypeOfAlcohal","Quantity","Frequency","AlcoholAdviseQ1","Hospital","Reason","VisitDate","VisitMonth","VisitYear","AlcoholAddictsQ2","AlcoholAddinfoQ3","Addinfo",
				"IsTobaccoNicotine","MonthDuration","Tobaccotype","quantity","noofyear","Advicetostop","SpecifyReason","IsHazardousActivities","Hazardactivity","MentionYears","HazardActivityBy","IsTravel","Country","City","DateofDept","DateofArrvl","Visatype",
				"IsFamilyMedical","IsFamilyMedicalMHBS","IsFamilyMedicalHD","IsFamilyMedicalCD","IsFamilyMedicalHA","IsFamilyMedicalStroke","IsFamilyMedicalHBP","IsFamilyMedicalCncr","IsFamilyMedicalDiab","IsFamilyMedicalKS","IsFamilyMedicalPyr","Providemeddetails",
				"FMBSLivingDemise","FMBSAgeDeath","FMBSStateAndCause","IsBrother","IsSister","BSLivingDeceased","BrotherSisAge", "BrotherSisStateOfHealth", 
			    "IsCoviddetails","DiagnosisDate","RecoveryDate","IsTreatmentTaken","IsCoviddetailsAsymptomatic","IsCoviddetailsHomeQ","IsCoviddetailsHospitalized",
				"IsFamilyMedicaldetails","IsAbsentFromWork","AFWcurrentsymptoms","AFWdoctordetails","AFWLCday","AFWLCmonth","AFWLCyear","AFWDDday","AFWDDmonth","AFWDDyear","AFWdetails","IsHospitalization","IsAilments","IsDisorder","IsSpouseHealth","IsOtherSymptoms","IsPregnant","NoofWeeeks","IsGynaecological",
				
			
				
				
				"isIndianOrigin","pResidence","datePR","lastVisitedIndiaDate","passportNumber","placeOfSigningApplication","DoYouStayInIndia","durationInYrs","durationInMonths","natureOfVisaHeld",
				"purposeOfStayFNIO_PIO","natureOfStayFNIO_PIO","specificReasonFNIO_PIO","selectPIO_OCICard","purposeOfStayAbroad","studentNatureOfStayAbroad","stayAbroadSpecificReason","intendedDurationYear","intendedDurationMonth","nriAddressType","address1Nri","address2Nri","address3Nri","areaNri","cityNri","stateNri","pinCodeNri","teleNumberResidenceNri","teleNumberOfficeNri","travelledOverLast12Months","countryTravelledLast12Months",
				"last12MonthCity","lastTravelled12MonthsDepartDate","lastTravelled12MonthsArrivalDate","lastTravelled12MonthsVisaType","travelledOverNext12Months","countryTravelledNext12Months","Next12MonthCity","nextTravelled12MonthsDepartDate","nextTravelled12MonthsArrivalDate","nextTravelled12MonthsVisaType","haveNriAccount","nriAccountType","nriMicrCode","exchangeFacility","rbiPermitNumber","rbiPermitDetail","rbiOfficeName","nriPaymentDetails","providePaymentDetail",
				"isIndianOrigin", "pResidence", "datePR", "lastVisitedIndiaDate", "passportNumber", "placeOfSigningApplication", "FNIOPIOButton", "durationInYrs", "durationInMonths", "natureOfVisaHeld", "purposeOfStayFNIO_PIO", "natureOfStayFNIO_PIO", "specificReasonFNIO_PIO", "selectPIO_OCICard", "purposeOfStayAbroad", "studentNatureOfStayAbroad", "stayAbroadSpecificReason", "intendedDurationYear", "intendedDurationMonth", "nriAddressType", "address1Nri", "address2Nri", "address3Nri", "areaNri", "cityNri", "stateNri", "pinCodeNri",
				"teleNumberResidenceNri", "teleNumberOfficeNri", "travelledOverLast12Months", "countryTravelledLast12Months", "last12MonthCity", "lastTravelled12MonthsDepartDate", "lastTravelled12MonthsArrivalDate", "lastTravelled12MonthsVisaType", "travelledOverNext12Months", "countryTravelledNext12Months", "Next12MonthCity", "nextTravelled12MonthsDepartDate", "nextTravelled12MonthsArrivalDate", "nextTravelled12MonthsVisaType", "nriAccountType", "nriMicrCode", "nriPaymentDetails", "providePaymentDetail","SelectRelationECCD","ModeofPaymentECCD",
				"TDSDeclaration",
				"IsPayment","PaymentType","selectChequeORDemandDraft","ChequeDDNo","CDDday","CDDMonth","CDDYear","CDDIFSCcode",
                "IsSelectWinBackPayment","WBplicyNo","Wbamount",
				"IsECDF",
				"SelectTypeOfDocument","SelectTypeOfDocAgeProof","SelectTypeOfDocIncomeProof"};


		for (int rowCount = 3; rowCount <= reader.getRowCount(SheetName); rowCount++) {
			String currentTestMethod = reader.getCellData(SheetName, "testCaseName", rowCount);
			if (currentTestMethod.equalsIgnoreCase(testName)) {
				HashMap<String, String> testDataMap = new HashMap<>();
				for (String header : columnHeaders) {
					String cellValue = reader.getCellData(SheetName, header, rowCount);
					testDataMap.put(header, cellValue.trim());
				}
				myData.add(testDataMap);
			}
		}
		System.out.println("mydata rows value **********" + myData);
		return myData;
	}
	//------------------------------------------------------------------------------------------------------------------------------------//
		/////////////////////////////////////////// Major Different Scenario ////////////////////////////////////////////////////////////////////

	public ArrayList<HashMap<String, String>> getEndtoEndMajorDiffTestFromExcel(String testExcelSheet, String testName, String SheetName) {
		ArrayList<HashMap<String, String>> myData = new ArrayList<>();
		ArrayList<String> myColumnData = new ArrayList<String>();
		Xls_reader reader = null;

		try {
			reader = new Xls_reader(System.getProperty("user.dir") + testExcelSheet);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("dashboard Sheet row count ---------" + reader.getRowCount(SheetName));
		System.out.println(" ******* current test running method  *********" + testName);
		System.out.println("**** column count  ********" + reader.getColumnCount(SheetName));

		String[] columnHeaders = {"ChannelName",
				
				"SPCode",//DBS_Bank
				
				//Axis_Bank
				"product_id", "proposer_first_name", "proposer_middle_name","proposer_last_name", "proposer_gender", "proposer_mobile_no", "proposer_pan",
				"proposer_address_1", "proposer_address_2", "proposer_address_3", "proposer_city", "proposer_country",
				"proposer_pin_code", "proposer_state", "email_id", "bank_account_type", "bank_ifsc_code",
				"bank_account_no", "bank_customer_occupation", "WithoutPan", "nominee_name",
				"address_1", "address_2", "address_3", "insured_dob", "insured_first_name", "insured_middle_name",
				"insured_last_name", "insured_gender", "is_nri", "proposer_investment_goal", "proposer_lifestage",
				"proposer_risk_profile", "proposer_dob", "proposer_pin_code","bank_customer_income","is_business_insurance","proposer_middle_name",
				"proposer_qualification","relation_with_proposer","branch_code","sp_employee_code","sp_irdai_code","bank_branch","ebcc_kyc_flag","engaged_customer",
				"need_for_insurance","opportunity_to_meet","premium_paying_capacity","source_type","sub_source_type","ProposerInsuredSame","TypeOfNRI","NRICountry",
				
				
				
				//DCB_Bank
				 "LeadId","proposer_pan","proposer_first_name","proposer_last_name","proposer_gender","proposer_dob","insured_dob","insured_gender","proposer_mobile_no",
				 "proposer_email_id", "bank_account_no","bank_account_type","address_type","proposer_pin_code","proposer_address_1","proposer_address_2","proposer_address_3",
				 "proposer_city","proposer_state","proposer_country","is_proposer_same_as_insured","bank_customer_income","bank_customer_occupation","insured_marital_status","proposer_marital_status",
				 "nominee_name","insured_occupation","bank_nationality", "insured_nationality",
				
				//BOM_Bank
				"username","password","BankCustID","IsProposerWithTheBankForMoreThan7Months?","LeadId","CARefBValue","SPCodeOfCABOM","CABranchCode","ProposerInsuredSame","RelationWithInsured","IsInsuredMinor","IsNRI","TypeOfNRI","NRICountry","propNRIGSTwavier","IsPanAvailable", "AadharCardNo", "PanNameEdit",
				"PanDOBEdit", "EditAddress", "ProposerMobileNumber", "ProposerPanNumber", "IsAadhaarCard", "IsEnterManual",
				"ProposerDOB", "ProposerSalutation", "ProposerName", "ProposerMiddleName", "ProposerLastName", "ProposerGender",
				"ExistingPolicyNo","IsNRIInsured","TypeOfNRIInsured","NRICountryInsured", "InsuredMobileNo", "InsuredWithPan",
				"InsuredPanNo", "InsuredSalutation", "InsuredName",
				"InsuredMiddleName", "InsuredLastName", "InsuredGender", "InsuredDOB","PlanSelectionJourney",
				"premiumValue","occupationOption","lifeStageValue","riskProfileFieldValue","investmentGoalValue","AddExistingPolicies","SAAmount",
				"SelectPlan",


				"IsPremiumAmountGMS","premiumamountGMS","IsOptionGMS","OptionGMS","IsPaymodeGMS","paymodeGMS","IsAddRiderGMS","IswavierofpremiumGMS","IsADDRiderGMS","ADDMamountGMS","IsCIRiderGMS","CIamountGMS","IsSCRiderGMS","SCamountGMS","IsHSRiderGMS","HCamountGMS","IsADBRiderGMS","ADBamountGMS",
				"IsPremiumAmountFMP","premiumamountFMP","IsPlanOptionFMP","PlanOptionFMP","IsPPTOptionFMP","pptFMP","IsPolicyTermFMP","PolicyTermFMP",
				"IsPremiumAmountAIP","premiumamountAIP","IsPPTOptionAIP","pptAIP","IspolicytermAIP","policytermAIP","IsPaymodeAIP","paymodeAIP", "IsBenefitOptionAIP","benefitotionAIP","IsBenefitfrequencyAIP","benefitfreqAIP","IsBenefitPeriodAIP","benefitperiodAIP","IsAddRiderAIP", "IswavierofpremiumAIP","IsADBRiderAIP","ADMamountAIP","IsCIRiderAIP","CIamountAIP","IsSCRiderAIP","SCamountAIP","IsHSRiderAIP","HCamountAIP",
				"IsPremiumAmountN_AyushPlan","premiumamountN_AyushPlan","IsPPTOptionN_AyushPlan","pptN_AyushPlan","IspolicytermN_AyushPlan","policytermN_AyushPlan","IsPaymodeN_AyushPlan","paymodeN_AyushPlan", "IsBenefitOptionN_AyushPlan","benefitotionN_AyushPlan","IsBenefitfrequencyN_AyushPlan","benefitfreqN_AyushPlan","IsIncomeVarientN_AyushPlan","IncomeVariantN_AyushPlan","IsDefermenntPeriodN_AyushPlan","DefermentPeriodN_AyushPlan","IsSAmultiplierN_AyushPlan","SumAssuredMultiplierN_AyushPlan","IsAddRiderN_AyushPlan", "IswavierofpremiumN_AyushPlan","IsADBRiderN_AyushPlan","ADMamountN_AyushPlan","IsCIRiderN_AyushPlan","CIamountN_AyushPlan","IsSCRiderN_AyushPlan","SCamountN_AyushPlan","IsHSRiderN_AyushPlan","HCamounty",
				"IsPremiumAmountAkshaya","premiumamountAkshaya","IsBenefitOptionAkshaya","benefitotionAkshaya","IsPPTOptionAkshaya","pptAkshaya","IspolicytermAkshaya","policytermAkshaya","IsBenefitfrequencyAkshaya","benefitfreqAkshaya","IsPaymodeAkshaya","paymodeAkshaya","IsAddRiderAkshaya", "IswavierofpremiumAkshaya","IsADBRiderAkshaya","ADMamountAkshaya","IsCIRiderAkshaya","CIamountAkshaya","IsSCRiderAkshaya","SCamountAkshaya","IsHSRiderAkshaya","HCamountAkshaya",
				"IsPremiumAmountN_Laabh","premiumamountN_Laabh","IsPlanOptionN_Laabh","PlanOptionN_Laabh","IsPPTOptionN_Laabh","pptN_Laabh","IspolicytermN_Laabh","policytermN_Laabh","IsPaymodeN_Laabh","paymodeN_Laabh","IsAddRiderN_Laabh","IsBenefitfrequencyN_Laabh","benefitfreqN_Laabh", "IswavierofpremiumN_Laabh","IsADBRiderN_Laabh","ADMamountN_Laabh","IsCIRiderN_Laabh","CIamountN_Laabh","IsSCRiderN_Laabh","SCamountN_Laabh","IsHSRiderN_Laabh","HCamountN_Laabh",
				"IsPremiumAmountASP", "premiumamountASP", "IsPPTOptionASP", "PlanOptionASP","IsPPTASP","pptASP", "IspolicytermASP", "PolicyTermASP", "IsPaymodeASP", "paymodeASP","IsAddRiderASP", "IswavierofpremiumASP","IsADBRiderASP","ADMamountASP","IsCIRiderASP","CIamountASP","IsSCRiderASP","SCamountASP","IsHSRiderASP","HCamountASP",
				"IsSumAssuredVision_Endo","sumAssuredamountVision_Endo","IsPPTOptionVision_Endo","pptVision_Endo","IspolicytermVision_Endo","policytermVision_Endo","IsBenefitOptionVision_Endo","benefitotionVision_Endo","IsPaymodeVision_Endo","paymodeVision_Endo","IsAddRiderVision_Endo", "IswavierofpremiumVision_Endo","IsADBRiderVision_Endo","ADMamountVision_Endo","IsCIRiderVision_Endo","CIamountVision_Endo","IsSCRiderVision_Endo","SCamountVision_Endo","IsHSRiderVision_Endo","HCamountVision_Endo",
				"IsPremiumAmountFortune","premiumamountFortune","IsPPTOptionFortune","pptFortune", "IspolicytermFortune",  "policytermFortune", "IsInvestMentOptionFortune", "investMentOptionFortune", "IsUnderWritingClassFortune", "underWritingClassFortune" , "transferFrequFortune", "IsPaymodeFortune",  "paymodeFortune", "multiplierFortune", "magnifierFortune", "maximiserFortune", "superTwentyFortune", "liquidPlusFortune", "incomeAdvFortune", "assureFundFortune", "enhanceFortune", "CappedNintyFortune", "creatorFundFortune", "valueFundFortune", "protectorFortune", "builderFortune", "pureEquityFortune", "assetFortune", "mnuFortune","IsAddRiderFortune", "IswavierofpremiumFortune","IsADBRiderFortune","ADMamountFortune",
				"IsPremiumAmountN_Pension","premiumamountN_Pension","IsPPTOptionN_Pension","pptN_Pension","IspolicytermN_Pension","policytermN_Pension","IsPaymodeN_Pension","paymodeN_Pension", "IsBenefitOptionN_Pension","benefitotionN_Pension","IsBenefitfrequencyN_Pension","benefitfreqN_Pension","IsIncomeVarientN_Pension","IncomeVariantN_Pension","IsDefermenntPeriodN_Pension","DefermentPeriodN_Pension","IsSAmultiplierN_Pension","SumAssuredMultiplierN_Pension","IsAddRiderN_Pension", "IswavierofpremiumN_Pension","IsADBRiderN_Pension","ADMamountN_Pension","IsCIRiderN_Pension","CIamountN_Pension","IsSCRiderN_Pension","SCamountN_Pension","IsHSRiderN_Pension","HCamountN_Pension",
				"IsSmokingStatusPSK","Issmoker","IsSumAssured","SumAssuredPSK","IsSelectPlanOptionsPSK","planOptionPSK","IsPPTOptionPSK","pptPSK","IsPolicyTermPSK","PolicyTermPSK","IsPaymodePSK","paymodePSK","IsACIPSK","ACIumAssuredamountPSK", "IsAddRiderPSK","IswavierofpremiumPSK","IsADDRiderPSK","ADDMamountPSK","IsCIRiderPSK","CIamountPSK","IsSCRiderPSK","SCamountPSK","IsHSRiderPSK","HCamountPSK","IsADBRiderPSK","ADBamountPSK",
				"IsSmokingStatusASK","IssmokerASK","IsSumAssuredASK","SumAssuredASK","IsPPTOptionASK","pptASK","IspolicytermASK","policytermASK","IsPaymodeASK","paymodeASK",
				"ISPlanBasedOnChild_future","PlanBasedOnChild_future","SumassuredACFChild_future","ChildNomineeChild_future","ChildAgeChild_future","ISassuredbeneoptionChild_future","AssuredBeneOptionChild_future","EduBenePeriodChild_future","AssuredBeneTermChild_future","MarraigeAssuredAgeChild_future","MarraigeMultipleChild_future","MarraigeBeneTermChild_future","pptChild_future","paymodeChild_future", "IsAddRiderChild_future","IswavierofpremiumChild_future","IsADDRiderChild_future","ADDMamountChild_future","IsCIRiderChild_future","CIamountChild_future","IsSCRiderChild_future","SCamountChild_future","IsHSRiderChild_future","HCamountChild_future","IsADBRiderChild_future","ADBamountChild_future",
				"IsPlanOptionCancer", "PlanOptionCancer", "IsPolicyTermCancer", "termCancer", "IsPaymodeCancer","paymodeCancer","IsIncomeBenefitCancer","IsAddRiderCancer", "IswavierofpremiumCancer","IsADBRiderCancer","ADMamountCancer","IsCIRiderCancer","CIamountCancer","IsSCRiderCancer","SCamountCancer","IsHSRiderCancer","HCamountCancer",
				"IsSmokerSalaried","SumAssuredAmountSalaried","IsPlanOptionSalaried","PlanOptionSalaried","IsPPTOptionSalaried", "pptOptionSalaried","IsPolicyTermSalaried", "PolicytermSalaried","IncomeBenefitPeriodSalaried","IncomeEscalationRateSalaried","NameOfEmployerSalaried","IsPaymodeSalaried","paymodeSalaried",
				"IsSumAssuredVisionlifeVisionlife",  "SumAssuredAmountVisionlife", "IsPPTOptionVisionlife", "pptOptionVisionlife","IsPaymodeVisionlife", "paymodeVisionlife", "IsBenifitOptionVisionlife", "BenifitOptionVisionlife", "IsIncomeBenifitPayoutFrequencyVisionlife", "IncomeBenifitPayoutFrequencyVisionlife", "IsBenifitPayoutPeriodVisionlife", "BenifitPayoutPeriodVisionlife", "IsRiderAvailableVisionlife", "AddRiderVisionlife", "RideramountVisionlife", "IsABGEmployeeVisionlife", "ABGEmployeeDscountVisionlife",
				"IsPremiumVisionlifeplus", "PremiumAmountVisionlifeplus", "IsPPTOptionVisionlifeplus", "pptOptionVisionlifeplus", "IsPaymodeVisionlifeplus", "paymodeVisionlifeplus", "IsBenifitOptionVisionlifeplus", "BenifitOptionVisionlifeplus", "IsIncomeBenifitPayoutFrequencyVisionlifeplus", "IncomeBenifitPayoutFrequencyVisionlifeplus", "IsBenifitPayoutPeriodVisionlifeplus", "BenifitPayoutPeriodVisionlifeplus", "IsBenifitPayoutVisionlifeplus", "BenifitPayoutVisionlifeplus", "IsBonusUtilizationOptionVisionlifeplus", "bonusUtilizationOptionVisionlifeplus", "IsRiderAvailableVisionlifeplus", "AddRiderVisionlifeplus", "RideramountVisionlifeplus",
				"SumAssuredAmountVisionstar","IsPlanOptionVisionstar","PlanOptionVisionstarv","IsPPTOptionVisionstar", "pptOptionVisionstar","IsPaymodeVisionstar","paymodeVisionstar","IsRiderAvailableVisionstar","AddRiderVisionstar","RideramountVisionstar",



				"ProposerMobileNumber", "ProposerEmailId","PreferredLang","AlternateNumber","ResidenceNumber","InsuredMobno","Insuemail","addressType", "AddressLocation1", "CityAddress", "StateAddress", "AddressLocation2",
				"pinCode", "addressOne", "addressTwo", "addressThree", "IsPermanentAddressSame", "PinCodeTwo",
				"AddressFour", "IFSCCode", "AccountNo", "IsAccountType", "AccountType", "PaymentMethod","PreferredDrawDate", "SourceOfFunds",

				"Propmarital","propMaidenName","PropfatherSpouse","Propmothername","ProposerBirthPlace","IsHaveEIA","PreferredIR","IsPropPolitical","PoliticalDetails",
				"Propqualification","PropoccupationOption","Propnameofemployee","Propnatureofbusiness","Proptypeoforganisation","PropDesignation","Propnameofbusiness","IsAreYouRegisterPerson","GSTnumber","Insumarital","maidenname","fatherSpouse","mothername","InsurerBirthPlace","IsInsuPolitical",
				"qualification","occupationOption","NameOfEmployer","natureofbusiness","TypeOfOrganisation","Designation","nameofbusiness","AnnualIncome","IsinsurerRegisterPerson","insurerGSTnumber","AddexistingPolicy","InsurerName","SumAssured","AddrefusedPolicy","PolicyType","InsurerNameRef","SumAssuredref","ReasonRef","InsurancePurpose1","InsurancePurpose2","InsurancePurpose3",


				"HeightFeet", "HeightInch", "weight", "Isweightgainlost", "Weightgainlost",
				"IsLifeStyleDetails","IsNarcoticsDetails","ProvideDetails","IsAlcoholConsumptionDetails","TypeOfAlcohal","Quantity","Frequency","AlcoholAdviseQ1","Hospital","Reason","VisitDate","VisitMonth","VisitYear","AlcoholAddictsQ2","AlcoholAddinfoQ3","Addinfo",
				"IsTobaccoNicotine","MonthDuration","Tobaccotype","quantity","noofyear","Advicetostop","SpecifyReason","IsHazardousActivities","Hazardactivity","MentionYears","HazardActivityBy","IsTravel","Country","City","DateofDept","DateofArrvl","Visatype",
				"IsFamilyMedical","IsFamilyMedicalMHBS","IsFamilyMedicalHD","IsFamilyMedicalCD","IsFamilyMedicalHA","IsFamilyMedicalStroke","IsFamilyMedicalHBP","IsFamilyMedicalCncr","IsFamilyMedicalDiab","IsFamilyMedicalKS","IsFamilyMedicalPyr","Providemeddetails",
				"FMBSLivingDemise","FMBSAgeDeath","FMBSStateAndCause","IsBrother","IsSister","BSLivingDeceased","BrotherSisAge", "BrotherSisStateOfHealth", 
			    "IsCoviddetails","DiagnosisDate","RecoveryDate","IsTreatmentTaken","IsCoviddetailsAsymptomatic","IsCoviddetailsHomeQ","IsCoviddetailsHospitalized",
				"IsFamilyMedicaldetails","IsAbsentFromWork","AFWcurrentsymptoms","AFWdoctordetails","AFWLCday","AFWLCmonth","AFWLCyear","AFWDDday","AFWDDmonth","AFWDDyear","AFWdetails","IsHospitalization","IsAilments","IsDisorder","IsSpouseHealth","IsOtherSymptoms","IsPregnant","NoofWeeeks","IsGynaecological",
				
			
				
				"isIndianOrigin","pResidence","datePR","lastVisitedIndiaDate","passportNumber","placeOfSigningApplication","DoYouStayInIndia","durationInYrs","durationInMonths","natureOfVisaHeld",
				"purposeOfStayFNIO_PIO","natureOfStayFNIO_PIO","specificReasonFNIO_PIO","selectPIO_OCICard","purposeOfStayAbroad","studentNatureOfStayAbroad","stayAbroadSpecificReason","intendedDurationYear","intendedDurationMonth","nriAddressType","address1Nri","address2Nri","address3Nri","areaNri","cityNri","stateNri","pinCodeNri","teleNumberResidenceNri","teleNumberOfficeNri","travelledOverLast12Months","countryTravelledLast12Months",
				"last12MonthCity","lastTravelled12MonthsDepartDate","lastTravelled12MonthsArrivalDate","lastTravelled12MonthsVisaType","travelledOverNext12Months","countryTravelledNext12Months","Next12MonthCity","nextTravelled12MonthsDepartDate","nextTravelled12MonthsArrivalDate","nextTravelled12MonthsVisaType","haveNriAccount","nriAccountType","nriMicrCode","exchangeFacility","rbiPermitNumber","rbiPermitDetail","rbiOfficeName","nriPaymentDetails","providePaymentDetail",
				"isIndianOrigin", "pResidence", "datePR", "lastVisitedIndiaDate", "passportNumber", "placeOfSigningApplication", "FNIOPIOButton", "durationInYrs", "durationInMonths", "natureOfVisaHeld", "purposeOfStayFNIO_PIO", "natureOfStayFNIO_PIO", "specificReasonFNIO_PIO", "selectPIO_OCICard", "purposeOfStayAbroad", "studentNatureOfStayAbroad", "stayAbroadSpecificReason", "intendedDurationYear", "intendedDurationMonth", "nriAddressType", "address1Nri", "address2Nri", "address3Nri", "areaNri", "cityNri", "stateNri", "pinCodeNri",
				"teleNumberResidenceNri", "teleNumberOfficeNri", "travelledOverLast12Months", "countryTravelledLast12Months", "last12MonthCity", "lastTravelled12MonthsDepartDate", "lastTravelled12MonthsArrivalDate", "lastTravelled12MonthsVisaType", "travelledOverNext12Months", "countryTravelledNext12Months", "Next12MonthCity", "nextTravelled12MonthsDepartDate", "nextTravelled12MonthsArrivalDate", "nextTravelled12MonthsVisaType", "nriAccountType", "nriMicrCode", "nriPaymentDetails", "providePaymentDetail","SelectRelationECCD","ModeofPaymentECCD",
				
				
				"isIndianOriginInsur","pResidenceInsur","datePRInsur","lastVisitedIndiaDateInsur","passportNumberInsur","placeOfSigningApplicationInsur","FNIOPIOButtonInsur","durationInYrsInsur","durationInMonthsInsur","natureOfVisaHeldInsur","purposeOfStayFNIO_PIOInsur","natureOfStayFNIO_PIOInsur","specificReasonFNIO_PIOInsur","selectPIO_OCICardInsur","isAddSameAsPrimary","indianAddress1","indianAddress2","indianAddress3","IndianAr","indianCity","indianState","indianPincode","purposeOfStayAbroadInsur","studentNatureOfStayAbroadInsur","stayAbroadSpecificReasonInsur",
				"intendedDurationYearInsur","intendedDurationMonthInsur","nriAddressTypeInsur","address1NriInsur","address2NriInsur","address3NriInsur","areaNriInsur","cityNriInsur","stateNriInsur","pinCodeNriInsur","mobilenumberNri","teleNumberResidenceNriInsur","teleNumberOfficeNriInsur","travelledOverLast12MonthsInsur","countryTravelledLast12MonthsInsur","last12MonthCityInsur","lastTravelled12MonthsDepartDateInsur","lastTravelled12MonthsArrivalDateInsur","lastTravelled12MonthsVisaTypeInsur","travelledOverNext12MonthsInsur","countryTravelledNext12MonthsInsur","Next12MonthCityInsur",
				"nextTravelled12MonthsDepartDateInsur","nextTravelled12MonthsArrivalDateInsur","nextTravelled12MonthsVisaTypeInsur","IsECCD","SelectRelationECCD","ModeofPaymentECCD","ProposerOTP","IsSelectChequeORDDPayment","selectChequeORDemandDraft", "ChequeDDNo","CDDday","CDDMonth","CDDYear","CDDIFSCcode","PolicyNumber"
				,"TDSDeclaration",
				"IsPayment","PaymentType","selectChequeORDemandDraft","ChequeDDNo","CDDday","CDDMonth","CDDYear","CDDIFSCcode",
                "IsSelectWinBackPayment","WBplicyNo","Wbamount",
				"IsECDF",
				
			

				"SelectTypeOfDocument","SelectTypeOfDocAgeProof","SelectTypeOfDocIncomeProof"
				
				};


		for (int rowCount = 3; rowCount <= reader.getRowCount(SheetName); rowCount++) {
			String currentTestMethod = reader.getCellData(SheetName, "testCaseName", rowCount);
			if (currentTestMethod.equalsIgnoreCase(testName)) {
				HashMap<String, String> testDataMap = new HashMap<>();
				for (String header : columnHeaders) {
					String cellValue = reader.getCellData(SheetName, header, rowCount);
					testDataMap.put(header, cellValue.trim());
				}
				myData.add(testDataMap);
			}
		}
		System.out.println("mydata rows value **********" + myData);
		return myData;
	}
	//--------------------------------------------------------------------------------------------------------------------------------------//
	//////////////////////////////////////////////////// Minor Scenario //////////////////////////////////////////////////////////////////////////

		public ArrayList<HashMap<String, String>> getEndtoEndMinorTestFromExcel(String testExcelSheet, String testName, String SheetName) {
			ArrayList<HashMap<String, String>> myData = new ArrayList<>();
			ArrayList<String> myColumnData = new ArrayList<String>();
			Xls_reader reader = null;

			try {
				reader = new Xls_reader(System.getProperty("user.dir") + testExcelSheet);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Proposer Minor Sheet row count ---------" + reader.getRowCount(SheetName));
			System.out.println(" ******* current test running method  *********" + testName);
			System.out.println("**** column count  ********" + reader.getColumnCount(SheetName));

			String[] columnHeaders = {"ChannelName",
					"SPCode",//DBS
					
					//Axis
					"product_id", "proposer_first_name", "proposer_middle_name","proposer_last_name", "proposer_gender", "proposer_mobile_no", "proposer_pan",
					"proposer_address_1", "proposer_address_2", "proposer_address_3", "proposer_city", "proposer_country",
					"proposer_pin_code", "proposer_state", "email_id", "bank_account_type", "bank_ifsc_code",
					"bank_account_no", "bank_customer_occupation", "WithoutPan", "nominee_name",
					"address_1", "address_2", "address_3", "insured_dob", "insured_first_name", "insured_middle_name",
					"insured_last_name", "insured_gender", "is_nri", "proposer_investment_goal", "proposer_lifestage",
					"proposer_risk_profile", "proposer_dob", "proposer_pin_code","bank_customer_income","is_business_insurance","proposer_middle_name",
					"proposer_qualification","relation_with_proposer","branch_code","sp_employee_code","sp_irdai_code","bank_branch","ebcc_kyc_flag","engaged_customer",
					"need_for_insurance","opportunity_to_meet","premium_paying_capacity","source_type","sub_source_type","ProposerInsuredSame","TypeOfNRI","NRICountry",
					
					
					
					//DCB
					 "LeadId","proposer_pan","proposer_first_name","proposer_last_name","proposer_gender","proposer_dob","insured_dob","insured_gender","proposer_mobile_no",
					 "proposer_email_id", "bank_account_no","bank_account_type","address_type","proposer_pin_code","proposer_address_1","proposer_address_2","proposer_address_3",
					 "proposer_city","proposer_state","proposer_country","is_proposer_same_as_insured","bank_customer_income","bank_customer_occupation","insured_marital_status","proposer_marital_status",
					 "nominee_name","insured_occupation","bank_nationality", "insured_nationality",
					
					
					
					
					
					"username","password","BankCustID","IsProposerWithTheBankForMoreThan7Months?","LeadId","CARefBValue","SPCodeOfCABOM","CABranchCode","ProposerInsuredSame","RelationWithInsured","IsInsuredMinor","IsNRI","TypeOfNRI","NRICountry","propNRIGSTwavier","IsPanAvailable", "AadharCardNo", "PanNameEdit",
	                "PanDOBEdit", "EditAddress", "ProposerMobileNumber", "ProposerPanNumber", "IsAadhaarCard", "IsEnterManual",
	                "ProposerDOB", "ProposerSalutation", "ProposerName", "ProposerMiddleName", "ProposerLastName", "ProposerGender",
	                "ExistingPolicyNo","IsNRIInsured","TypeOfNRIInsured","NRICountryInsured", "InsuredMobileNo", "InsuredWithPan",
	                "InsuredPanNo", "InsuredSalutation", "InsuredName",
	                "InsuredMiddleName", "InsuredLastName", "InsuredGender", "InsuredDOB", 
	                
	                "PlanSelectionJourney","premiumValue","occupationOption","lifeStageValue","riskProfileFieldValue","investmentGoalValue","AddExistingPolicies","SAAmount","SelectPlan",
					


					"IsselectGMSPlan","IsPremiumAmountGMS","premiumamountGMS","IsOptionGMS","OptionGMS","IsPaymodeGMS","paymodeGMS","IsAddRiderGMS","IswavierofpremiumGMS","IsADDRiderGMS","ADDMamountGMS","IsCIRiderGMS","CIamountGMS","IsSCRiderGMS","SCamountGMS","IsHSRiderGMS","HCamountGMS","IsADBRiderGMS","ADBamountGMS",
					"IsselectFMPPlan","IsPremiumAmountFMP","premiumamountFMP","IsPlanOptionFMP","PlanOptionFMP","IsPPTOptionFMP","pptFMP","IsPolicyTermFMP","PolicyTermFMP",
					"IsselectAIPPlan","IsPremiumAmountAIP","premiumamountAIP","IsPPTOptionAIP","pptAIP","IspolicytermAIP","policytermAIP","IsPaymodeAIP","paymodeAIP", "IsBenefitOptionAIP","benefitotionAIP","IsBenefitfrequencyAIP","benefitfreqAIP","IsBenefitPeriodAIP","benefitperiodAIP","IsAddRiderAIP", "IswavierofpremiumAIP","IsADBRiderAIP","ADMamountAIP","IsCIRiderAIP","CIamountAIP","IsSCRiderAIP","SCamountAIP","IsHSRiderAIP","HCamountAIP",
					"IsselectN_AyushPlan","IsPremiumAmountN_AyushPlan","premiumamountN_AyushPlan","IsPPTOptionN_AyushPlan","pptN_AyushPlan","IspolicytermN_AyushPlan","policytermN_AyushPlan","IsPaymodeN_AyushPlan","paymodeN_AyushPlan", "IsBenefitOptionN_AyushPlan","benefitotionN_AyushPlan","IsBenefitfrequencyN_AyushPlan","benefitfreqN_AyushPlan","IsIncomeVarientN_AyushPlan","IncomeVariantN_AyushPlan","IsDefermenntPeriodN_AyushPlan","DefermentPeriodN_AyushPlan","IsSAmultiplierN_AyushPlan","SumAssuredMultiplierN_AyushPlan","IsAddRiderN_AyushPlan", "IswavierofpremiumN_AyushPlan","IsADBRiderN_AyushPlan","ADMamountN_AyushPlan","IsCIRiderN_AyushPlan","CIamountN_AyushPlan","IsSCRiderN_AyushPlan","SCamountN_AyushPlan","IsHSRiderN_AyushPlan","HCamounty",
					"IsselectAkshaya","IsPremiumAmountAkshaya","premiumamountAkshaya","IsBenefitOptionAkshaya","benefitotionAkshaya","IsPPTOptionAkshaya","pptAkshaya","IspolicytermAkshaya","policytermAkshaya","IsBenefitfrequencyAkshaya","benefitfreqAkshaya","IsPaymodeAkshaya","paymodeAkshaya","IsAddRiderAkshaya", "IswavierofpremiumAkshaya","IsADBRiderAkshaya","ADMamountAkshaya","IsCIRiderAkshaya","CIamountAkshaya","IsSCRiderAkshaya","SCamountAkshaya","IsHSRiderAkshaya","HCamountAkshaya",
					"IsselectN_Laabh","IsPremiumAmountN_Laabh","premiumamountN_Laabh","IsPlanOptionN_Laabh","PlanOptionN_Laabh","IsPPTOptionN_Laabh","pptN_Laabh","IspolicytermN_Laabh","policytermN_Laabh","IsPaymodeN_Laabh","paymodeN_Laabh","IsAddRiderN_Laabh","IsBenefitfrequencyN_Laabh","benefitfreqN_Laabh", "IswavierofpremiumN_Laabh","IsADBRiderN_Laabh","ADMamountN_Laabh","IsCIRiderN_Laabh","CIamountN_Laabh","IsSCRiderN_Laabh","SCamountN_Laabh","IsHSRiderN_Laabh","HCamountN_Laabh",
					"IsselectASP","IsPremiumAmountASP", "premiumamountASP", "IsPPTOptionASP", "PlanOptionASP","IsPPTASP","pptASP", "IspolicytermASP", "PolicyTermASP", "IsPaymodeASP", "paymodeASP","IsAddRiderASP", "IswavierofpremiumASP","IsADBRiderASP","ADMamountASP","IsCIRiderASP","CIamountASP","IsSCRiderASP","SCamountASP","IsHSRiderASP","HCamountASP",
					"IsselectVision_Endo","IsSumAssuredVision_Endo","sumAssuredamountVision_Endo","IsPPTOptionVision_Endo","pptVision_Endo","IspolicytermVision_Endo","policytermVision_Endo","IsBenefitOptionVision_Endo","benefitotionVision_Endo","IsPaymodeVision_Endo","paymodeVision_Endo","IsAddRiderVision_Endo", "IswavierofpremiumVision_Endo","IsADBRiderVision_Endo","ADMamountVision_Endo","IsCIRiderVision_Endo","CIamountVision_Endo","IsSCRiderVision_Endo","SCamountVision_Endo","IsHSRiderVision_Endo","HCamountVision_Endo",
					"IsselectFortune","IsPremiumAmountFortune","premiumamountFortune","IsPPTOptionFortune","pptFortune", "IspolicytermFortune",  "policytermFortune", "IsInvestMentOptionFortune", "investMentOptionFortune", "IsUnderWritingClassFortune", "underWritingClassFortune" , "transferFrequFortune", "IsPaymodeFortune",  "paymodeFortune", "multiplierFortune", "magnifierFortune", "maximiserFortune", "superTwentyFortune", "liquidPlusFortune", "incomeAdvFortune", "assureFundFortune", "enhanceFortune", "CappedNintyFortune", "creatorFundFortune", "valueFundFortune", "protectorFortune", "builderFortune", "pureEquityFortune", "assetFortune", "mnuFortune","IsAddRiderFortune", "IswavierofpremiumFortune","IsADBRiderFortune","ADMamountFortune",
					"IsselectN_Pension","IsPremiumAmountN_Pension","premiumamountN_Pension","IsPPTOptionN_Pension","pptN_Pension","IspolicytermN_Pension","policytermN_Pension","IsPaymodeN_Pension","paymodeN_Pension", "IsBenefitOptionN_Pension","benefitotionN_Pension","IsBenefitfrequencyN_Pension","benefitfreqN_Pension","IsIncomeVarientN_Pension","IncomeVariantN_Pension","IsDefermenntPeriodN_Pension","DefermentPeriodN_Pension","IsSAmultiplierN_Pension","SumAssuredMultiplierN_Pension","IsAddRiderN_Pension", "IswavierofpremiumN_Pension","IsADBRiderN_Pension","ADMamountN_Pension","IsCIRiderN_Pension","CIamountN_Pension","IsSCRiderN_Pension","SCamountN_Pension","IsHSRiderN_Pension","HCamountN_Pension",
					"IsselectPSK","IsSmokingStatusPSK","Issmoker","IsSumAssured","SumAssuredPSK","IsSelectPlanOptionsPSK","planOptionPSK","IsPPTOptionPSK","pptPSK","IsPolicyTermPSK","PolicyTermPSK","IsPaymodePSK","paymodePSK","IsACIPSK","ACIumAssuredamountPSK", "IsAddRiderPSK","IswavierofpremiumPSK","IsADDRiderPSK","ADDMamountPSK","IsCIRiderPSK","CIamountPSK","IsSCRiderPSK","SCamountPSK","IsHSRiderPSK","HCamountPSK","IsADBRiderPSK","ADBamountPSK",
					"IsselectASK","IsSmokingStatusASK","IssmokerASK","IsSumAssuredASK","SumAssuredASK","IsPPTOptionASK","pptASK","IspolicytermASK","policytermASK","IsPaymodeASK","paymodeASK",
					"IsselectChild_future","ISPlanBasedOnChild_future","PlanBasedOnChild_future","SumassuredACFChild_future","ChildNomineeChild_future","ChildAgeChild_future","ISassuredbeneoptionChild_future","AssuredBeneOptionChild_future","EduBenePeriodChild_future","AssuredBeneTermChild_future","MarraigeAssuredAgeChild_future","MarraigeMultipleChild_future","MarraigeBeneTermChild_future","pptChild_future","paymodeChild_future", "IsAddRiderChild_future","IswavierofpremiumChild_future","IsADDRiderChild_future","ADDMamountChild_future","IsCIRiderChild_future","CIamountChild_future","IsSCRiderChild_future","SCamountChild_future","IsHSRiderChild_future","HCamountChild_future","IsADBRiderChild_future","ADBamountChild_future",
					"IsselectCancer","IsPlanOptionCancer", "PlanOptionCancer", "IsPolicyTermCancer", "termCancer", "IsPaymodeCancer","paymodeCancer","IsIncomeBenefitCancer","IsAddRiderCancer", "IswavierofpremiumCancer","IsADBRiderCancer","ADMamountCancer","IsCIRiderCancer","CIamountCancer","IsSCRiderCancer","SCamountCancer","IsHSRiderCancer","HCamountCancer",
					"IsselectSalaried","IsSmokerSalaried","SumAssuredAmountSalaried","IsPlanOptionSalaried","PlanOptionSalaried","IsPPTOptionSalaried", "pptOptionSalaried","IsPolicyTermSalaried", "PolicytermSalaried","IncomeBenefitPeriodSalaried","IncomeEscalationRateSalaried","NameOfEmployerSalaried","IsPaymodeSalaried","paymodeSalaried",
					"IsselectVisionlife","IsSumAssuredVisionlifeVisionlife",  "SumAssuredAmountVisionlife", "IsPPTOptionVisionlife", "pptOptionVisionlife","IsPaymodeVisionlife", "paymodeVisionlife", "IsBenifitOptionVisionlife", "BenifitOptionVisionlife", "IsIncomeBenifitPayoutFrequencyVisionlife", "IncomeBenifitPayoutFrequencyVisionlife", "IsBenifitPayoutPeriodVisionlife", "BenifitPayoutPeriodVisionlife", "IsRiderAvailableVisionlife", "AddRiderVisionlife", "RideramountVisionlife", "IsABGEmployeeVisionlife", "ABGEmployeeDscountVisionlife",
					"IsselectVisionlifeplus","IsPremiumVisionlifeplus", "PremiumAmountVisionlifeplus", "IsPPTOptionVisionlifeplus", "pptOptionVisionlifeplus", "IsPaymodeVisionlifeplus", "paymodeVisionlifeplus", "IsBenifitOptionVisionlifeplus", "BenifitOptionVisionlifeplus", "IsIncomeBenifitPayoutFrequencyVisionlifeplus", "IncomeBenifitPayoutFrequencyVisionlifeplus", "IsBenifitPayoutPeriodVisionlifeplus", "BenifitPayoutPeriodVisionlifeplus", "IsBenifitPayoutVisionlifeplus", "BenifitPayoutVisionlifeplus", "IsBonusUtilizationOptionVisionlifeplus", "bonusUtilizationOptionVisionlifeplus", "IsRiderAvailableVisionlifeplus", "AddRiderVisionlifeplus", "RideramountVisionlifeplus",
					"IsselectVisionstar","SumAssuredAmountVisionstar","IsPlanOptionVisionstar","PlanOptionVisionstarv","IsPPTOptionVisionstar", "pptOptionVisionstar","IsPaymodeVisionstar","paymodeVisionstar","IsRiderAvailableVisionstar","AddRiderVisionstar","RideramountVisionstar",
					
					"ProposerMobileNumber", "ProposerEmailId", "PreferredLang", "AlternateNumber", "ResidenceNumber",
					"InsuredMobno", "addressType", "AddressLocation1", "CityAddress", "StateAddress", "AddressLocation2",
					"pinCode", "addressOne", "addressTwo", "addressThree", "IsPermanentAddressSame", "PinCodeTwo",
					"AddressFour", "IFSCCode", "AccountNo", "IsAccountType", "AccountType", "PaymentMethod","PreferredDrawDate", "SourceOfFunds",

					"Propmarital","propMaidenName","PropfatherSpouse","Propmothername","ProposerBirthPlace","IsHaveEIA","PreferredIR","IsPropPolitical","PoliticalDetails",
					"Propqualification","PropoccupationOption","Propnameofemployee","Propnatureofbusiness","Proptypeoforganisation","PropDesignation","Propnameofbusiness","IsAreYouRegisterPerson","GSTnumber","AnnualIncome",
					"MinorFatherName","MinorMotherName","MinorLivingWith","MinorBirthPlace","IsInsuPolitical","Stage","Studying","CollegeStudy","IsFamilyInsuHistory","BrotherSibling","SisterSibling","AreChildrenInsured","childrenDetails","EXistingFather","FinurerName","Fsumassured","Fpolnumber","Fdate","Fmonth","Fyear","Fissueyear",
					"EXistingMother","MinurerName","Msumassured","Mpolnumber","Mdate","Mmonth","Myear","Missueyear","EXistingBrother","BinurerName","Bsumassured","Bpolnumber","Bdate","Bmonth","Byear","Bissueyear","EXistingSister","SinurerName","Ssumassured","Spolnumber","Sdate","Smonth","Syear","Sissueyear","AddexistingPolicy","InsurerName","SumAssured","AddrefusedPolicy","PolicyType","InsurerNameRef","SumAssuredref","ReasonRef","InsurancePurpose1","InsurancePurpose2","InsurancePurpose3",


					"HeightFeet", "HeightInch", "weight", "Isweightgainlost", "Weightgainlost",
					"IsLifeStyleDetails","IsNarcoticsDetails","ProvideDetails","IsAlcoholConsumptionDetails","TypeOfAlcohal","Quantity","Frequency","AlcoholAdviseQ1","Hospital","Reason","VisitDate","VisitMonth","VisitYear","AlcoholAddictsQ2","AlcoholAddinfoQ3","Addinfo",
					"IsTobaccoNicotine","MonthDuration","Tobaccotype","quantity","noofyear","Advicetostop","SpecifyReason","IsHazardousActivities","Hazardactivity","MentionYears","HazardActivityBy","IsTravel","Country","City","DateofDept","DateofArrvl","Visatype",
					"IsFamilyMedical","IsFamilyMedicalMHBS","IsFamilyMedicalHD","IsFamilyMedicalCD","IsFamilyMedicalHA","IsFamilyMedicalStroke","IsFamilyMedicalHBP","IsFamilyMedicalCncr","IsFamilyMedicalDiab","IsFamilyMedicalKS","IsFamilyMedicalPyr","Providemeddetails",
					"FMBSLivingDemise","FMBSAgeDeath","FMBSStateAndCause","IsBrother","IsSister","BSLivingDeceased","BrotherSisAge", "BrotherSisStateOfHealth", 
				    "IsCoviddetails","DiagnosisDate","RecoveryDate","IsTreatmentTaken","IsCoviddetailsAsymptomatic","IsCoviddetailsHomeQ","IsCoviddetailsHospitalized",
					"IsFamilyMedicaldetails","IsAbsentFromWork","AFWcurrentsymptoms","AFWdoctordetails","AFWLCday","AFWLCmonth","AFWLCyear","AFWDDday","AFWDDmonth","AFWDDyear","AFWdetails","IsHospitalization","IsAilments","IsDisorder","IsSpouseHealth","IsOtherSymptoms","IsPregnant","NoofWeeeks","IsGynaecological",
					
				
					"MinorHeightFeet", "MinorHeightInch", "Minorweight", "IsMinorweightgainlost", "MinorWeightgainlost",

					"IsMinorCoviddetails", "IsInsurabiltityDecleration", "IsHospital", "IsDiagnosis1", "IsDiagnosis2", "IsOtherSympt", "currentsymptoms", "doctordetails", "LCday", "LCmonth", "LCyear", "DDday", "DDmonth", "DDyear", "details",
					"MinorHeightFeet","MinorHeightInch","Minorweight","IsMinorweightgainlost","MinorWeightgainlost","IsCovid19SymptomsMinor", "Covid19SymtomsMinor", "IsCovid19PlanMinor", "Covid19PlanMinor", "covidDDMinor", "covidMMMinor", "covidYYMinor", 
					"IsInsurabiltityDecleration","IsHospital","IsDiagnosis1","IsDiagnosis2","IsOtherSympt","currentsymptoms","doctordetails","LCday","LCmonth","LCyear","DDday","DDmonth","DDyear","details",
					
					"isIndianOrigin","pResidence","datePR","lastVisitedIndiaDate","passportNumber","placeOfSigningApplication","DoYouStayInIndia","durationInYrs","durationInMonths","natureOfVisaHeld",
					"purposeOfStayFNIO_PIO","natureOfStayFNIO_PIO","specificReasonFNIO_PIO","selectPIO_OCICard","purposeOfStayAbroad","studentNatureOfStayAbroad","stayAbroadSpecificReason","intendedDurationYear","intendedDurationMonth","nriAddressType","address1Nri","address2Nri","address3Nri","areaNri","cityNri","stateNri","pinCodeNri","teleNumberResidenceNri","teleNumberOfficeNri","travelledOverLast12Months","countryTravelledLast12Months",
					"last12MonthCity","lastTravelled12MonthsDepartDate","lastTravelled12MonthsArrivalDate","lastTravelled12MonthsVisaType","travelledOverNext12Months","countryTravelledNext12Months","Next12MonthCity","nextTravelled12MonthsDepartDate","nextTravelled12MonthsArrivalDate","nextTravelled12MonthsVisaType","haveNriAccount","nriAccountType","nriMicrCode","exchangeFacility","rbiPermitNumber","rbiPermitDetail","rbiOfficeName","nriPaymentDetails","providePaymentDetail",
					"isIndianOrigin", "pResidence", "datePR", "lastVisitedIndiaDate", "passportNumber", "placeOfSigningApplication", "FNIOPIOButton", "durationInYrs", "durationInMonths", "natureOfVisaHeld", "purposeOfStayFNIO_PIO", "natureOfStayFNIO_PIO", "specificReasonFNIO_PIO", "selectPIO_OCICard", "purposeOfStayAbroad", "studentNatureOfStayAbroad", "stayAbroadSpecificReason", "intendedDurationYear", "intendedDurationMonth", "nriAddressType", "address1Nri", "address2Nri", "address3Nri", "areaNri", "cityNri", "stateNri", "pinCodeNri",
					"teleNumberResidenceNri", "teleNumberOfficeNri", "travelledOverLast12Months", "countryTravelledLast12Months", "last12MonthCity", "lastTravelled12MonthsDepartDate", "lastTravelled12MonthsArrivalDate", "lastTravelled12MonthsVisaType", "travelledOverNext12Months", "countryTravelledNext12Months", "Next12MonthCity", "nextTravelled12MonthsDepartDate", "nextTravelled12MonthsArrivalDate", "nextTravelled12MonthsVisaType", "nriAccountType", "nriMicrCode", "nriPaymentDetails", "providePaymentDetail","SelectRelationECCD","ModeofPaymentECCD",
					
					"isIndianOriginInsur","pResidenceInsur","datePRInsur","lastVisitedIndiaDateInsur","passportNumberInsur","placeOfSigningApplicationInsur","FNIOPIOButtonInsur","durationInYrsInsur","durationInMonthsInsur","natureOfVisaHeldInsur","purposeOfStayFNIO_PIOInsur","natureOfStayFNIO_PIOInsur","specificReasonFNIO_PIOInsur","selectPIO_OCICardInsur","isAddSameAsPrimary","indianAddress1","indianAddress2","indianAddress3","IndianAr","indianCity","indianState","indianPincode","purposeOfStayAbroadInsur","studentNatureOfStayAbroadInsur","stayAbroadSpecificReasonInsur",
					"intendedDurationYearInsur","intendedDurationMonthInsur","nriAddressTypeInsur","address1NriInsur","address2NriInsur","address3NriInsur","areaNriInsur","cityNriInsur","stateNriInsur","pinCodeNriInsur","mobilenumberNri","teleNumberResidenceNriInsur","teleNumberOfficeNriInsur","travelledOverLast12MonthsInsur","countryTravelledLast12MonthsInsur","last12MonthCityInsur","lastTravelled12MonthsDepartDateInsur","lastTravelled12MonthsArrivalDateInsur","lastTravelled12MonthsVisaTypeInsur","travelledOverNext12MonthsInsur","countryTravelledNext12MonthsInsur","Next12MonthCityInsur",
					"nextTravelled12MonthsDepartDateInsur","nextTravelled12MonthsArrivalDateInsur","nextTravelled12MonthsVisaTypeInsur","IsECCD","SelectRelationECCD","ModeofPaymentECCD","ProposerOTP","IsSelectChequeORDDPayment","selectChequeORDemandDraft", "ChequeDDNo","CDDday","CDDMonth","CDDYear","CDDIFSCcode","PolicyNumber"
					,"TDSDeclaration",
					"IsPayment","PaymentType","selectChequeORDemandDraft","ChequeDDNo","CDDday","CDDMonth","CDDYear","CDDIFSCcode",
	                "IsSelectWinBackPayment","WBplicyNo","Wbamount",
					"IsECDF",
					"SelectTypeOfDocument","SelectTypeOfDocAgeProof","SelectTypeOfDocIncomeProof"
			};



			for (int rowCount = 3; rowCount <= reader.getRowCount(SheetName); rowCount++) {
				String currentTestMethod = reader.getCellData(SheetName, "testCaseName", rowCount);
				if (currentTestMethod.equalsIgnoreCase(testName)) {
					HashMap<String, String> testDataMap = new HashMap<>();
					for (String header : columnHeaders) {
						String cellValue = reader.getCellData(SheetName, header, rowCount);
						testDataMap.put(header, cellValue.trim());
					}
					myData.add(testDataMap);
				}
			}
			System.out.println("mydata rows value **********" + myData);
			return myData;
		}

	//---------------------------------------------------------------------------------------------------//
	//////////////////////////////Company Scenario///////////////////////////////////////////////////////////
	public ArrayList<HashMap<String, String>> getEndtoEndCompanyTestFromExcel(String testExcelSheet, String testName, String SheetName) {
		ArrayList<HashMap<String, String>> myData = new ArrayList<>();
		ArrayList<String> myColumnData = new ArrayList<String>();
		Xls_reader reader = null;

		try {
			reader = new Xls_reader(System.getProperty("user.dir") + testExcelSheet);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Proposer Minor Sheet row count ---------" + reader.getRowCount(SheetName));
		System.out.println(" ******* current test running method  *********" + testName);
		System.out.println("**** column count  ********" + reader.getColumnCount(SheetName));

		String[] columnHeaders = {"ChannelName","username","password","BankCustID","IsProposerWithTheBankForMoreThan7Months?","CARefAValue","SPCodeOfCABOM","CABranchCode",
				"AdvisorState","proposertype","Ispropsame","CompanyPolicyType","Entity", "CompanyPAN","CompanyDOI",
				"InsuNRI","insurNriType","insurNriCountryResidence","InsurerDOB","InsuredTitle","InsuredFirstname","InsuredLastname","InsuredGender",

				"PlanSelectionJourney","premiumValue","occupationOption","lifeStageValue","riskProfileFieldValue","investmentGoalValue","AddExistingPolicies","SAAmount","SelectPlan",

				"IsselectGMSPlan", "IsPremiumAmountGMS", "premiumamountGMS", "IsOptionGMS", "OptionGMS", "IsPaymodeGMS", "paymodeGMS", "IsAddRiderGMS", "IswavierofpremiumGMS", "IsADDRiderGMS", "ADDMamountGMS", "IsCIRiderGMS", "CIamountGMS", "IsSCRiderGMS", "SCamountGMS", "IsHSRiderGMS", "HCamountGMS", "IsADBRiderGMS", "ADBamountGMS","AddExtraRiderGMS",
				"IsselectFMPPlan", "IsPremiumAmountFMP", "premiumamountFMP", "IsPlanOptionFMP", "PlanOptionFMP", "IsPPTOptionFMP", "pptFMP", "IsPolicyTermFMP", "PolicyTermFMP",
				"IsselectAIPPlan", "IsPremiumAmountAIP", "premiumamountAIP", "IsPPTOptionAIP", "pptAIP", "IspolicytermAIP", "policytermAIP", "IsPaymodeAIP", "paymodeAIP", "IsBenefitOptionAIP", "benefitotionAIP", "IsBenefitfrequencyAIP", "benefitfreqAIP", "IsBenefitPeriodAIP", "benefitperiodAIP", "IsAddRiderAIP", "IswavierofpremiumAIP", "IsADBRiderAIP", "ADMamountAIP", "IsCIRiderAIP", "CIamountAIP", "IsSCRiderAIP", "SCamountAIP", "IsHSRiderAIP", "HCamountAIP","AddExtraRiderAIP",
				"IsselectN_AyushPlan", "IsPremiumAmountN_AyushPlan", "premiumamountN_AyushPlan", "IsPPTOptionN_AyushPlan", "pptN_AyushPlan", "IspolicytermN_AyushPlan", "policytermN_AyushPlan", "IsPaymodeN_AyushPlan", "paymodeN_AyushPlan", "IsBenefitOptionN_AyushPlan", "benefitotionN_AyushPlan", "IsBenefitfrequencyN_AyushPlan", "benefitfreqN_AyushPlan", "IsIncomeVarientN_AyushPlan", "IncomeVariantN_AyushPlan", "IsDefermenntPeriodN_AyushPlan", "DefermentPeriodN_AyushPlan", "IsSAmultiplierN_AyushPlan", "SumAssuredMultiplierN_AyushPlan", "IsAddRiderN_AyushPlan", "IswavierofpremiumN_AyushPlan", "IsADBRiderN_AyushPlan", "ADMamountN_AyushPlan", "IsCIRiderN_AyushPlan", "CIamountN_AyushPlan", "IsSCRiderN_AyushPlan", "SCamountN_AyushPlan", "IsHSRiderN_AyushPlan", "HCamountN_AyushPlan","AddExtraRiderN_AyushPlan",
				"IsselectAkshaya", "IsPremiumAmountAkshaya", "premiumamountAkshaya", "IsBenefitOptionAkshaya", "benefitotionAkshaya", "IsPPTOptionAkshaya", "pptAkshaya", "IspolicytermAkshaya", "policytermAkshaya", "IsBenefitfrequencyAkshaya", "benefitfreqAkshaya", "IsPaymodeAkshaya", "paymodeAkshaya", "IsAddRiderAkshaya", "IswavierofpremiumAkshaya", "IsADBRiderAkshaya", "ADamountAkshaya", "IsCIRiderAkshaya", "CIamountAkshaya", "IsSCRiderAkshaya", "SCamountAkshaya", "IsHSRiderAkshaya", "HCamountAkshaya","AddExtraRiderAkshaya",
				"IsselectN_Laabh", "IsPremiumAmountN_Laabh", "premiumamountN_Laabh", "IsPlanOptionN_Laabh", "PlanOptionN_Laabh", "IsPPTOptionN_Laabh", "pptN_Laabh", "IspolicytermN_Laabh", "policytermN_Laabh", "IsPaymodeN_Laabh", "paymodeN_Laabh", "IsAddRiderN_Laabh", "IsBenefitfrequencyN_Laabh", "benefitfreqN_Laabh", "IswavierofpremiumN_Laabh", "IsADBRiderN_Laabh", "ADBMamountN_Laabh", "IsCIRiderN_Laabh", "CIamountN_Laabh", "IsSCRiderN_Laabh", "SCamountN_Laabh", "IsHSRiderN_Laabh", "HCamountN_Laabh","AddExtraRiderN_Laabh",
				"IsselectASP", "IsPremiumAmountASP", "premiumamountASP", "IsPPTOptionASP", "PlanOptionASP", "IsPPTASP", "pptASP", "IspolicytermASP", "PolicyTermASP", "IsPaymodeASP", "paymodeASP", "IsAddRiderASP", "IswavierofpremiumASP", "IsADBRiderASP", "ADMamountASP", "IsCIRiderASP", "CIamountASP", "IsSCRiderASP", "SCamountASP", "IsHSRiderASP", "HCamountASP","AddExtraRiderASP",
				"IsselectVision_Endo", "Issmokerstatus", "Issmoker", "IsSumAssuredVision_Endo", "sumAssuredamountVision_Endo", "IsPPTOptionVision_Endo", "pptVision_Endo", "IspolicytermVision_Endo", "policytermVision_Endo", "IsBenefitOptionVision_Endo", "benefitotionVision_Endo", "IsPaymodeVision_Endo", "paymodeVision_Endo", "IsAddRiderVision_Endo", "IswavierofpremiumVision_Endo", "IsADBRiderVision_Endo", "ADMamountVision_Endo", "IsCIRiderVision_Endo", "CIamountVision_Endo", "IsSCRiderVision_Endo", "SCamountVision_Endo", "IsHSRiderVision_Endo", "HCamountVision_Endo","IswavierofpremiumVision_Endo",
				"IsselectFortune", "IsPremiumAmountFortune", "premiumamountFortune", "IsPPTOptionFortune", "pptFortune", "IspolicytermFortune", "policytermFortune", "IsInvestMentOptionFortune", "investMentOptionFortune", "IsUnderWritingClassFortune", "underWritingClassFortune", "transferFrequFortune", "IsPaymodeFortune", "paymodeFortune", "multiplierFortune", "magnifierFortune", "maximiserFortune", "superTwentyFortune", "liquidPlusFortune", "incomeAdvFortune", "assureFundFortune", "enhanceFortune", "CappedNintyFortune", "creatorFundFortune", "valueFundFortune", "protectorFortune", "builderFortune", "pureEquityFortune", "assetFortune", "mnuFortune", "IsAddRiderFortune", "IswavierofpremiumFortune", "IsADBRiderFortune", "ADMamountFortune","AddExtraRiderFortune",
				"IsselectN_Pension", "IsPremiumAmountN_Pension", "premiumamountN_Pension", "IsPPTOptionN_Pension", "pptN_Pension", "IspolicytermN_Pension", "policytermN_Pension", "IsPaymodeN_Pension", "paymodeN_Pension", "IsBenefitOptionN_Pension", "benefitotionN_Pension", "IsBenefitfrequencyN_Pension", "benefitfreqN_Pension", "IsIncomeVarientN_Pension", "IncomeVariantN_Pension", "IsDefermenntPeriodN_Pension", "DefermentPeriodN_Pension", "IsSAmultiplierN_Pension", "SumAssuredMultiplierN_Pension", "IsAddRiderN_Pension", "IswavierofpremiumN_Pension", "IsADBRiderN_Pension", "ADMamountN_Pension", "IsCIRiderN_Pension", "CIamountN_Pension", "IsSCRiderN_Pension", "SCamountN_Pension", "IsHSRiderN_Pension", "HCamountN_Pension",
				"IsselectPSK", "IsSmokingStatusPSK", "Issmoker", "IsSumAssured", "SumAssuredPSK", "IsSelectPlanOptionsPSK", "planOptionPSK", "IsPPTOptionPSK", "pptPSK", "IsPolicyTermPSK", "PolicyTermPSK", "IsPaymodePSK", "paymodePSK", "IsACIPSK", "ACIumAssuredamountPSK", "IsAddRiderPSK", "IswavierofpremiumPSK", "IsADDRiderPSK", "ADDMamountPSK", "IsCIRiderPSK", "CIamountPSK", "IsSCRiderPSK", "SCamountPSK", "IsHSRiderPSK", "HCamountPSK", "IsADBRiderPSK", "ADBamountPSK","AddExtraRidePSK",
				"IsselectWealth_secure", "IsPremiumAmountWealth_secure", "premiumamountWealth_secure", "IsPPTWealth_secure", "PayingTermWealth_secure", "IsInvestmentOptionWealth_secure", "InvestOptionWealth_secure", "IsUnderWritingClassWealth_secure", "underWritingClassWealth_secure", "RiskProfile_Wealth_secure", "IsPaymodeWealth_secure", "paymodeWealth_secure", "magnifierWealth_secure", "maximiserWealth_secure", "superTwentyWealth_secure", "CappedNintyWealth_secure", "assetWealth_secure", "liquidPlusWealth_secure", "incomeAdvWealth_secure", "assureFundWealth_secure", "enhanceWealth_secure", "multiplierWealth_secure", "valueFundWealth_secure", "builderWealth_secure", "protectorWealth_secure", "pureEquityWealth_secure", "creatorFundWealth_secure", "mnuWealth_secure", "IsAddRiderWealth_secure", "IswavierofpremiumWealth_secure", "IsADDRiderWealth_secure", "ADDMamountWealth_secure","AddExtraRiderWealth_secure",
				"IsselectWealth_aspire","IsPremiumAmountWealth_aspire", "premiumamountWealth_aspire", "IsPPTWealth_aspire", "PayingTermWealth_aspire", "IsPTWealth_aspire", "PolicyTermAWSWealth_aspire", "IsPlanOptionWealth_aspire", "PlanOptionWealth_aspire", "IsInvestmentOptionWealth_aspire", "InvestOptionWealth_aspire", "IsUnderWritingClassWealth_aspire", "underWritingClassWealth_aspire", "transferFrequWealth_aspire", "RiskProfileWealth_aspire", "IsPaymodeWealth_aspire", "paymodeWealth_aspire", "magnifierWealth_aspire", "maximiserWealth_aspire", "superTwentyWealth_aspire", "CappedNintyWealth_aspire", "assetWealth_aspire", "liquidPlusWealth_aspire", "incomeAdvWealth_aspire", "assureFundWealth_aspire", "enhanceWealth_aspire", "multiplierWealth_aspire", "valueFundWealth_aspire", "builderWealth_aspire", "protectorWealth_aspire", "pureEquityWealth_aspire", "creatorFundWealth_aspire", "mnuWealth_aspire", "IsAddRiderWealth_aspire", "IswavierofpremiumWealth_aspire", "IsADDRiderWealth_aspire", "ADDMamountWealth_aspire","AddExtraRiderWealth_aspire",
				"IsselectASK", "IsSmokingStatusASK", "IssmokerASK", "IsSumAssuredASK", "SumAssuredASK", "IsPPTOptionASK", "pptASK", "IspolicytermASK", "policytermASK", "IsPaymodeASK", "paymodeASK",
				"IsselectChild_future", "ISPlanBasedOnChild_future", "PlanBasedOnChild_future", "SumassuredACFChild_future", "premiumamountChild_future", "ChildNomineeChild_future", "ChildAgeChild_future", "ISassuredbeneoptionChild_future", "AssuredBeneOptionChild_future", "EduBenePeriodChild_future", "AssuredBeneTermChild_future", "MarraigeAssuredAgeChild_future", "MarraigeMultipleChild_future", "MarraigeBeneTermChild_future", "pptChild_future", "paymodeChild_future", "IsAddRiderChild_future", "IswavierofpremiumChild_future", "IsADDRiderChild_future", "ADDMamountChild_future", "IsCIRiderChild_future", "CIamountChild_future", "IsSCRiderChild_future", "SCamountChild_future", "IsHSRiderChild_future", "HCamountChild_future", "IsADBRiderChild_future", "ADBamountChild_future","AddExtraRiderChild_future",
				"IsselectDigi", "Issmokerstatus", "Issmoker", "IsSumAssuredDigi", "sumAssuredamountDigi", "IsSelectPlanOptionsDigi", "planOptionDigi", "pptDigi", "policytermDigi", "increasingCoverDigi", "retiredAgeDigi", "reductionFactorDigi", "retiredAgeDigi", "reductionFactorDigi", "paymodeDigi","IsELCDigi","IsACIDigi","ACIumAssuredamountDigi", "IsAddRiderDigi", "IsADBRiderDigi", "ADMamountDigi", "IsCIRiderDigi", "CIamountDigi", "IsSCRiderDigi", "SCamountDigi", "IsHSRiderDigi", "HCamountDigi","AddExtraRiderDigi",
				"IsselectCancer", "IsPlanOptionCancer", "PlanOptionCancer", "IsPolicyTermCancer", "termCancer", "IsPaymodeCancer", "paymodeCancer", "IsIncomeBenefitCancer", "IsAddRiderCancer", "IswavierofpremiumCancer", "IsADBRiderCancer", "ADMamountCancer", "IsCIRiderCancer", "CIamountCancer", "IsSCRiderCancer", "SCamountCancer", "IsHSRiderCancer", "HCamountCancer",
				"IsselectSalaried", "Issmokerstatus", "Issmoker", "SumAssuredAmountSalaried", "IsPlanOptionSalaried", "PlanOptionSalaried", "IsPPTOptionSalaried", "pptOptionSalaried", "IsPolicyTermSalaried", "PolicytermSalaried", "IncomeBenefitPeriodSalaried", "IncomeEscalationRateSalaried", "NameOfEmployerSalaried", "IsPaymodeSalaried", "paymodeSalaried", "IsACIAST", "SumAssuredACIAST", "IsAddRiderAST", "IswavierofpremiumAST", "IsADDRiderAST", "ADDMamountAST", "IsCIRiderAST", "CIamountAST", "IsSCRiderAST", "SCamountAST", "IsHSRiderAST", "HCamountAST", "IsADBRiderAST", "ADBamountAST", "IsCompanySalaried", "companysalaried","AddExtraRiderAST",
				"IsselectVisionlife", "IsSumAssuredvisionlife", "SumAssuredvisionlife", "IsPayingTermvisionlife", "PayingTermvisionlife", "IsPaymodevisionlife", "paymodevisionlife", "IsAddRidervisionlife", "Iswavierofpremiumvisionlife", "IsADDRidervisionlife", "ADDMamountvisionlife", "IsCIRidervisionlife", "CIamountvisionlife", "IsSCRidervisionlife", "SCamountvisionlife", "IsHSRidervisionlife", "HCamountvisionlife", "IsADBRidervisionlife", "ADBamountvisionlife","AddExtraRidervisionlife",
				"IsselectVisionlifeplus", "IsPremiumvisionlifeplus", "PremiumAmountvisionlifeplus", "IsBenifitOptionvisionlifeplus", "BenifitOptionvisionlifeplus", "IsPPTOptionvisionlifeplus", "pptOptionvisionlifeplus", "IsBenifitPayoutPeriodvisionlifeplus", "BenifitPayoutPeriodvisionlifeplus", "IsBenifitPayoutvisionlifeplus", "BenifitPayoutvisionlifeplus", "IsBonusUtilizationOptionvisionlifeplus", "bonusUtilizationOptionvisionlifeplus", "IsPaymodevisionlifeplus", "paymodevisionlifeplus", "IsAddRidervisionlifeplus", "Iswavierofpremiumvisionlifeplus", "IsCIRidervisionlifeplus", "CIamountvisionlifeplus", "IsSCRidervisionlifeplus", "SCamountvisionlifeplus", "IsHSRidervisionlifeplus", "HCamountvisionlifeplus", "IsADBRidervisionlifeplus", "ADBamountvisionlifeplus","AddExtraRidervisionlifeplus",
				"IsselectVisionstar", "Issumaasuredstar", "SumAssuredAmountstar", "IsPlanOptionstar", "PlanOptionstar", "IsPPTOptionstar", "pptOptionstar", "IsPaymodestar", "paymodestar", "IsAddRiderstar", "Iswavierofpremiumstar", "IsADDRiderstar", "ADDMamountstar", "IsCIRiderstar", "CIamountstar", "IsSCRiderstar", "SCamountstar", "IsHSRiderstar", "HCamountstar", "IsADBRiderstar", "ADBamountstar","AddExtraRiderstar",
				"IsselectCriti_Shield", "IsPolicyTermCriti", "termCriti", "IsbeneoptionCriti", "beneCritioption", "IsPaymodeCriti", "paymodeCriti",
				"IsselectAssured_flexi", "IsPremiumAmountflexi", "premiumamountflexi", "IsPPTOptionflexi", "pptflexi", "IsPaymodeflexi", "paymodeflexi", "IsAddRiderflexi", "Iswavierofpremiumflexi", "IsADBRiderflexi", "ADMamountflexi", "IsCIRiderflexi", "CIamountflexi", "IsSCRiderflexi", "SCamountflexi", "IsHSRiderflexi", "HCamountflexi","AddExtraRiderflexi",
				"IsselectPlatinum", "IsPremiumAmountplatinum", "premiumamountplatinum", "IsPPTOptionplatinum", "pptplatinum", "IsPolicytermplatinum", "poltermplatinum", "IsSAMultiplierplatinum", "SAmultiplatinum", "Isinvestmentoptplatinum", "Invoptionplatinum", "uclassplatinum", "ProfilePlatinum", "IsPaymodeplatinum", "paymodeplatinum", "magnifierplatinum", "maximiserplatinum", "superTwentyplatinum", "CappedNintyplatinum", "assetplatinum", "liquidPlusplatinum", "incomeAdvplatinum", "assureFundplatinum", "enhanceplatinum", "multiplierplatinum", "valueFundplatinum", "builderplatinum", "protectorplatinum", "pureEquityplatinum", "creatorFundplatinum", "mnuplatinum", "IsAddRiderplatinum", "Iswavierofpremiumplatinum", "IsADDRiderplatinum", "ADDMamountplatinum","AddExtraRiderplatinum",


				"ProposerMobileNumber", "ProposerEmailId","PreferredLang","AlternateNumber","ResidenceNumber","InsuredMobno","Insuemail","addressType", "AddressLocation1", "CityAddress", "StateAddress", "AddressLocation2",
				"pinCode", "addressOne", "addressTwo", "addressThree", "IsPermanentAddressSame", "PinCodeTwo",
				"AddressFour", "IFSCCode", "AccountNo", "IsAccountType", "AccountType", "PaymentMethod","PreferredDrawDate", "SourceOfFunds",

				"nomineeFirstName","nomineeLastName","day","month","year","nomineegender","relationship","nomineeshare",

				"CompanyNatureofbuss", "Orgtypecompany", "IsGSTregistered", "CompanyGSTnumber", "Propmarital", "fatherSpouse", "mothername", "IsPropPolitical", "PoliticalDetails", "Propqualification", "PropoccupationOption", "Propnameofemployee", "Propnatureofbusiness", "Proptypeoforganisation",
				"PropDesignation", "Propnameofbusiness", "AnnualIncome",
				"Propmarital","propMaidenName","PropfatherSpouse","Propmothername","ProposerBirthPlace","IsHaveEIA","PreferredIR","IsPropPolitical","PoliticalDetails",
				"Propqualification","PropoccupationOption","Propnameofemployee","Propnatureofbusiness","Proptypeoforganisation","PropDesignation","Propnameofbusiness","IsAreYouRegisterPerson","GSTnumber","Insumarital","maidenname","fatherSpouse","mothername","InsurerBirthPlace","IsInsuPolitical",
				"qualification","occupationOption","NameOfEmployer","natureofbusiness","TypeOfOrganisation","Designation","nameofbusiness","AnnualIncome",
				"IsinsurerRegisterPerson","insurerGSTnumber","AddexistingPolicy","InsurerName","SumAssured","AddrefusedPolicy","PolicyType","InsurerNameRef","SumAssuredref","ReasonRef",
				"InsurancePurpose1","InsurancePurpose2","InsurancePurpose3",

				"addressType", "AddressLocation1", "CityAddress", "StateAddress", "AddressLocation2", "pinCode",
				"addressOne", "addressTwo", "addressThree", "IsPermanentAddressSame", "PinCodeTwo", "AddressFour",


				"HeightFeet", "HeightInch", "weight", "Isweightgainlost", "Weightgainlost",

				"IsLifeStyleDetails", "LifeStyleDetailsN", "ProvideDetails", "LifeStyleDetailsA", "TypeOfAlcohal", "Quantity", "Frequency", "AlcoholAdvise", "Hospital", "Reason", "VisitDate", "VisitMonth", "VisitYear", "AlcoholAddicts", "AlcoholAddinfo", "Addinfo",
				"LifeStyleDetailsTN", "MonthDuration", "Tobaccotype", "quantity", "noofyear", "Advicetostop", "SpecifyReason", "LifeStyleDetailsHZ", "Hazardactivity", "MentionYears", "HazardActivityBy", "LifeStyleDetailsTrv", "Country", "City", "DateofDept", "DateofArrvl", "Visatype",

				"IsFamilyMedical", "IsFamilyMedicalMHBS", "IsFamilyMedicalHD", "IsFamilyMedicalCD", "IsFamilyMedicalHA", "IsFamilyMedicalStroke", "IsFamilyMedicalHBP", "IsFamilyMedicalCncr", "IsFamilyMedicalDiab", "IsFamilyMedicalKS", "IsFamilyMedicalPyr", "Providemeddetails",
				"IsFMBSstatus", "FatherStatus", "FAge", "FHealthState", "FDeathage", "FDeathcause", "MotherStatus", "MAge", "MHealthState", "MDeathage", "MDeathcause", "IsAddBrother", "BrotherStatus", "BAge", "BHealthState", "BDeathage", "BDeathcause", "IsAddSister", "SisterStatus", "SAge", "SHealthState", "SDeathage", "SDeathcause",

				"IsCoviddetails", "CovidDiagnosisDate", "CovidRecoveryDate", "IsTreatmentTaken", "IsCoviddetailsAsymptomatic", "IsCoviddetailsHomeQ", "IsCoviddetailsHospitalized",

				"IsFamilyMedicaldetails", "IsAbsentFromWork", "AFWcurrentsymptoms", "AFWdoctordetails", "AFWLCday", "AFWLCmonth", "AFWLCyear", "AFWDDday", "AFWDDmonth", "AFWDDyear", "AFWdetails", "IsHospitalization", "IsAilments", "HeartIssue", "HeartIssueType", "BreathingIssue", "BreathIssueType", "Diabetes", "DiabetesType", "DiabDay", "DiabMonth", "DiabYear", "Ulcer", "UlcerType", "Paralysis", "ParalysisType", "Kidney", "KidneyType", "Arthritis", "ArthritisType", "EyeEar", "EyeEarType", "Tumor", "TumorType", "Others", "OtherType", "LastConsultantDate", "DiagnosisDate", "IsDisorder", "IsSpouseHealth", "IsOtherSymptoms", "IsPregnant", "NoofWeeeks", "IsGynaecological",
				"isIndianOrigin","pResidence","datePR","lastVisitedIndiaDate","passportNumber","placeOfSigningApplication","DoYouStayInIndia","durationInYrs","durationInMonths","natureOfVisaHeld",
				"purposeOfStayFNIO_PIO","natureOfStayFNIO_PIO","specificReasonFNIO_PIO","selectPIO_OCICard","purposeOfStayAbroad","studentNatureOfStayAbroad","stayAbroadSpecificReason","intendedDurationYear","intendedDurationMonth","nriAddressType","address1Nri","address2Nri","address3Nri","areaNri","cityNri","stateNri","pinCodeNri","teleNumberResidenceNri","teleNumberOfficeNri","travelledOverLast12Months","countryTravelledLast12Months",
				"last12MonthCity","lastTravelled12MonthsDepartDate","lastTravelled12MonthsArrivalDate","lastTravelled12MonthsVisaType","travelledOverNext12Months","countryTravelledNext12Months","Next12MonthCity","nextTravelled12MonthsDepartDate","nextTravelled12MonthsArrivalDate","nextTravelled12MonthsVisaType","haveNriAccount","nriAccountType","nriMicrCode","exchangeFacility","rbiPermitNumber","rbiPermitDetail","rbiOfficeName","nriPaymentDetails","providePaymentDetail",
				"isIndianOrigin", "pResidence", "datePR", "lastVisitedIndiaDate", "passportNumber", "placeOfSigningApplication", "FNIOPIOButton", "durationInYrs", "durationInMonths", "natureOfVisaHeld", "purposeOfStayFNIO_PIO", "natureOfStayFNIO_PIO", "specificReasonFNIO_PIO", "selectPIO_OCICard", "purposeOfStayAbroad", "studentNatureOfStayAbroad", "stayAbroadSpecificReason", "intendedDurationYear", "intendedDurationMonth", "nriAddressType", "address1Nri", "address2Nri", "address3Nri", "areaNri", "cityNri", "stateNri", "pinCodeNri",
				"teleNumberResidenceNri", "teleNumberOfficeNri", "travelledOverLast12Months", "countryTravelledLast12Months", "last12MonthCity", "lastTravelled12MonthsDepartDate", "lastTravelled12MonthsArrivalDate", "lastTravelled12MonthsVisaType", "travelledOverNext12Months", "countryTravelledNext12Months", "Next12MonthCity", "nextTravelled12MonthsDepartDate", "nextTravelled12MonthsArrivalDate", "nextTravelled12MonthsVisaType", "nriAccountType", "nriMicrCode", "nriPaymentDetails", "providePaymentDetail","SelectRelationECCD","ModeofPaymentECCD",
				"TDSDeclaration",
				"IsSelectPayment","PaymentType","selectChequeORDemandDraft","ChequeDDNo","CDDday","CDDMonth","CDDYear","CDDIFSCcode",
                "IsSelectWinBackPayment","WBplicyNo","Wbamount",
				"IsECDF",
				"SelectTypeOfDocument","SelectTypeOfDocAgeProof","SelectTypeOfDocIncomeProof"

		};

		for (int rowCount = 3; rowCount <= reader.getRowCount(SheetName); rowCount++) {
			String currentTestMethod = reader.getCellData(SheetName, "testCaseName", rowCount);
			if (currentTestMethod.equalsIgnoreCase(testName)) {
				HashMap<String, String> testDataMap = new HashMap<>();
				for (String header : columnHeaders) {
					String cellValue = reader.getCellData(SheetName, header, rowCount);
					testDataMap.put(header, cellValue.trim());
				}
				myData.add(testDataMap);
			}
		}
		System.out.println("mydata rows value **********" + myData);
		return myData;
	}

	//---------------------------------------------------------------------------------------------------------//
	////////////////////////////////////// Joint Life Scenario ///////////////////////////////////////////
	public ArrayList<HashMap<String, String>> getEndtoEndJointLifeTestFromExcel(String testExcelSheet, String testName, String SheetName) {
		ArrayList<HashMap<String, String>> myData = new ArrayList<>();
		ArrayList<String> myColumnData = new ArrayList<String>();
		Xls_reader reader = null;

		try {
			reader = new Xls_reader(System.getProperty("user.dir") + testExcelSheet);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("dashboard Sheet row count ---------" + reader.getRowCount(SheetName));
		System.out.println(" ******* current test running method  *********" + testName);
		System.out.println("**** column count  ********" + reader.getColumnCount(SheetName));

		String[] columnHeaders = {"ChannelName","username","password","BankCustID","IsProposerWithTheBankForMoreThan7Months?","LeadId","CARefBValue","SPCodeOfCABOM","CABranchCode","ProposerInsuredSame", "IsProposerRelationshipWithBank", "propNRI", "nriType", "nriCountryResidence","propNRIGSTwavier", "IsPanAvailable",  "IsPanAvailable","AadharCardNo","PanNameEdit","PanDOBEdit","EditAddress","ProposerMobileNumber",
				"ProposerPanNumber","IsAadhaarCard","IsEnterManual","ProposerDOB","ProposerSalutation","ProposerName","ProposerMiddleName",
				"ProposerLastName","ProposerGender","PlanSelectionJourney",
				"premiumValue", "occupationOption", "lifeStageValue", "riskProfileFieldValue", "investmentGoalValue", "AddExistingPolicies", "SAAmount", "SelectPlan",

				"IsselectGMSPlan", "IsPremiumAmountGMS", "premiumamountGMS", "IsOptionGMS", "OptionGMS", "IsPaymodeGMS", "paymodeGMS", "GMSJointlifePAN", "GMSJointlifeday", "GMSJointlifemonth", "GMSJointlifeyear", "GMSJointlifegender",
				"IsselectASP", "IsPremiumAmountASP", "premiumamountASP", "IsPPTASP", "pptASP", "IspolicytermASP", "PolicyTermASP", "IsPaymodeASP", "paymodeASP", "ASPJointlifePAN", "ASPJointlifeday", "ASPJointlifemonth", "ASPJointlifeyear", "ASPJointlifegender",
				"IsselectDigi", "Issmokerstatus", "Issmoker", "IsSumAssuredDigi", "sumAssuredamountDigi", "IsSelectPlanOptionsDigi", "planOptionDigi", "pptDigi", "policytermDigi", "incomeBeOptDigi", "increasingCoverDigi", "incomeper", "retiredAgeDigi", "reductionFactorDigi", "retiredAgeDigi", "reductionFactorDigi", "paymodeDigi", "DGJointlifePAN", "DGJointlifeday", "DGJointlifemonth", "DGJointlifeyear", "DGJointlifegender",
				"IsselectAnnuityPlus","Newproposal","annuitypremium","annuitymode","Isannuitypremiumfield","annuitypremiumfield","amt","annuityopts","levelincreasingannuity","IncomeEscalationRateSalariedGAP","singlejointlife","jointliferel","jointlifenri","JointlifePAN","Jointlifeday","Jointlifemonth","Jointlifeyear","annuitycurtain","rop","pptGAP","DefermentPeriod","paymodeGAP",

				"PreferredLang", "AlternateNumber", "ResidenceNumber", "SpouseMobno", "SpouseEmail", "CommAddressType", "IfPermantAddress", "PermanentAddress", "PinCode", "PermanentAddress1", "PermanentAddress2", "PermanentAddress3", "PermanentLandmark", "NRIAddressLocation",
				"SelectRelationECCD", "ModeofPaymentECCD",

				"IFSCCode", "AccountNo", "TypeAccount", "paymentmethod", "sourceFund", "IFSCcode", "AccountNumber", "AccountType", "PaymentType",

				"MWPAct", "beneFirstName", "beneLastName", "daybene", "monthbene", "yearbene", "benegender", "benerelationship", "beneshare", "nomineeFirstName", "nomineeLastName", "day", "month", "year", "nomineegender", "relationship", "nomineeshare", "Addnominee2", "nomineetwoFirstName", "nomineetwoLastName", "daynomtwo", "monthomtwo", "yearomtwo", "nomineetwogender", "relationshipnomtwo", "nomineetwoshare", "Addnominee3", "nomineethreeFirstName", "nomineethreeLastName", "daynomthree", "monthomthree", "yearomthree", "nomineethreegender", "relationshipnomthree", "nomineethreeshare", "Addnominee4", "nomineefourFirstName", "nomineefourLastName", "daynomfour", "monthomfour", "yearomfour", "nomineefourgender", "relationshipnomfour", "nomineefourshare", "Addnominee5", "nomineefiveFirstName", "nomineefiveLastName", "daynomfive", "monthomfive", "yearomfive", "nomineefivegender", "relationshipnomfive", "nomineefiveshare",

				"Propmarital", "propMaidenName", "PropfatherSpouse", "Propmothername", "ProposerBirthPlace", "IsHaveEIA", "PreferredIR", "IsPropPolitical", "PoliticalDetails",
				"Propqualification", "Propnameofemployee", "Propnatureofbusiness", "Proptypeoforganisation", "PropDesignation", "Propnameofbusiness", "PropSpouseAnnualIncome", "PropParentsAnnualIncome", "PropParentsCover", "PropSpouseCover", "IsAreYouRegisterPerson", "GSTnumber", "Spousemarital", "SpousefatherSpouse", "Spousemothername","maidenname", "SpouseBirthPlace", "IsSpousePolitical", "Spousequalification", "SpouseoccupationOption", "SpouseNameOfEmployer", "Spousenatureofbusiness", "SpouseTypeOfOrganisation", "SpouseDesignation", "Spousenameofbusiness", "AnnualIncome", "SpouseAnnualIncome", "ParentsAnnualIncome", "ParentsCoverSpouseCover", "SpouseCover",

				"AddexistingPolicy", "InsurerName", "SumAssured", "AddrefusedPolicy", "PolicyType", "InsurerNameRef", "SumAssuredref", "ReasonRef",

				"InsurancePurpose1", "InsurancePurpose2",
				"HeightFeet", "HeightInch", "weight", "Isweightgainlost", "Weightgainlost",

				"HeightFeet", "HeightInch", "weight", "Isweightgainlost", "Weightgainlost",

				"IsLifeStyleDetails", "LifeStyleDetailsN", "ProvideDetails", "LifeStyleDetailsA", "TypeOfAlcohal", "Quantity", "Frequency", "AlcoholAdvise", "Hospital", "Reason", "VisitDate", "VisitMonth", "VisitYear", "AlcoholAddicts", "AlcoholAddinfo", "Addinfo", "LifeStyleDetailsTN", "MonthDuration", "Tobaccotype", "quantity", "noofyear", "Advicetostop", "SpecifyReason", "LifeStyleDetailsHZ", "Hazardactivity", "MentionYears", "HazardActivityBy", "LifeStyleDetailsTrv", "Country", "City", "DateofDept", "DateofArrvl", "Visatype",
				"IsFamilyMedical", "IsFamilyMedicalMHBS", "IsFamilyMedicalHD", "IsFamilyMedicalCD", "IsFamilyMedicalHA", "IsFamilyMedicalStroke", "IsFamilyMedicalHBP", "IsFamilyMedicalCncr", "IsFamilyMedicalDiab", "IsFamilyMedicalKS", "IsFamilyMedicalPyr", "Providemeddetails", "IsFMBSstatus", "FatherStatus", "FAge", "FHealthState", "FDeathage", "FDeathcause", "MotherStatus", "MAge", "MHealthState", "MDeathage", "MDeathcause", "IsAddBrother", "BrotherStatus", "BAge", "BHealthState", "BDeathage", "BDeathcause", "IsAddSister", "SisterStatus", "SAge", "SHealthState", "SDeathage", "SDeathcause",
				"IsCoviddetails", "CovidDiagnosisDate", "CovidRecoveryDate", "IsTreatmentTaken", "IsCoviddetailsAsymptomatic", "IsCoviddetailsHomeQ", "IsCoviddetailsHospitalized",
				"IsFamilyMedicaldetails", "IsAbsentFromWork", "AFWcurrentsymptoms", "AFWdoctordetails", "AFWLCday", "AFWLCmonth", "AFWLCyear", "AFWDDday", "AFWDDmonth", "AFWDDyear", "AFWdetails",
				"IsHospitalization", "IsAilments", "HeartIssue", "HeartIssueType", "BreathingIssue", "BreathIssueType", "Diabetes", "DiabetesType", "DiabDay", "DiabMonth", "DiabYear", "Ulcer", "UlcerType", "Paralysis", "ParalysisType", "Kidney", "KidneyType", "Arthritis", "ArthritisType", "EyeEar", "EyeEarType", "Tumor", "TumorType", "Others", "OtherType", "LastConsultantDate", "DiagnosisDate", "IsDisorder", "IsSpouseHealth", "IsOtherSymptoms", "IsPregnant", "NoofWeeeks", "IsGynaecological", "MinorHeightFeet", "MinorHeightInch", "Minorweight", "IsMinorweightgainlost", "MinorWeightgainlost",
				"TDSdeclaration",

				"last12MonthCity", "lastTravelled12MonthsDepartDate", "lastTravelled12MonthsArrivalDate", "lastTravelled12MonthsVisaType", "travelledOverNext12Months", "countryTravelledNext12Months", "Next12MonthCity", "nextTravelled12MonthsDepartDate", "nextTravelled12MonthsArrivalDate", "nextTravelled12MonthsVisaType", "haveNriAccount", "nriAccountType", "nriMicrCode", "exchangeFacility", "rbiPermitNumber", "rbiPermitDetail", "rbiOfficeName", "nriPaymentDetails", "providePaymentDetail",
				"isIndianOrigin", "pResidence", "datePR", "lastVisitedIndiaDate", "passportNumber", "placeOfSigningApplication", "durationInYrs", "durationInMonths", "natureOfVisaHeld",
				"purposeOfStayFNIO_PIO", "natureOfStayFNIO_PIO", "specificReasonFNIO_PIO", "selectPIO_OCICard", "purposeOfStayAbroad", "studentNatureOfStayAbroad", "stayAbroadSpecificReason", "intendedDurationYear", "intendedDurationMonth", "nriAddressType", "address1Nri", "address2Nri", "address3Nri", "areaNri", "cityNri", "stateNri", "pinCodeNri", "teleNumberResidenceNri", "teleNumberOfficeNri", "travelledOverLast12Months", "countryTravelledLast12Months",

				"isIndianOriginInsur", "pResidenceInsur", "datePRInsur", "lastVisitedIndiaDateInsur", "passportNumberInsur", "placeOfSigningApplicationInsur", "FNIOPIOButtonInsur", "durationInYrsInsur", "durationInMonthsInsur", "natureOfVisaHeldInsur", "purposeOfStayFNIO_PIOInsur", "natureOfStayFNIO_PIOInsur", "specificReasonFNIO_PIOInsur", "selectPIO_OCICardInsur", "isAddSameAsPrimary", "indianAddress1", "indianAddress2", "indianAddress3", "IndianAr", "indianCity", "indianState", "indianPincode",
				"purposeOfStayAbroadInsur", "studentNatureOfStayAbroadInsur", "stayAbroadSpecificReasonInsur", "intendedDurationYearInsur", "intendedDurationMonthInsur", "nriAddressTypeInsur", "address1NriInsur", "address2NriInsur", "address3NriInsur", "areaNriInsur", "cityNriInsur", "stateNriInsur", "pinCodeNriInsur", "mobilenumberNri", "teleNumberResidenceNriInsur", "teleNumberOfficeNriInsur", "travelledOverLast12MonthsInsur", "countryTravelledLast12MonthsInsur", "last12MonthCityInsur", "lastTravelled12MonthsDepartDateInsur", "lastTravelled12MonthsArrivalDateInsur", "lastTravelled12MonthsVisaTypeInsur",
				"travelledOverNext12MonthsInsur", "countryTravelledNext12MonthsInsur", "Next12MonthCityInsur", "nextTravelled12MonthsDepartDateInsur", "nextTravelled12MonthsArrivalDateInsur", "nextTravelled12MonthsVisaTypeInsur"

		};


		for (int rowCount = 3; rowCount <= reader.getRowCount(SheetName); rowCount++) {
			String currentTestMethod = reader.getCellData(SheetName, "testCaseName", rowCount);
			if (currentTestMethod.equalsIgnoreCase(testName)) {
				HashMap<String, String> testDataMap = new HashMap<>();
				for (String header : columnHeaders) {
					String cellValue = reader.getCellData(SheetName, header, rowCount);
					testDataMap.put(header, cellValue.trim());
				}
				myData.add(testDataMap);
			}
		}
		System.out.println("mydata rows value **********" + myData);
		return myData;
	}
}

//------------------------------------------------------------------------------------------------------------------------------------//


