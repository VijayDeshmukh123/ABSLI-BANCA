package com.absli.Listner;

        import java.text.SimpleDateFormat;
        import java.util.Date;

        import com.aventstack.extentreports.ExtentReports;
        import com.aventstack.extentreports.reporter.ExtentSparkReporter;
        import com.aventstack.extentreports.reporter.configuration.Theme;


public class ExtentReporterNG {

    public static ExtentReports extent;

    public static ExtentReports extentReportGenerator(){
        SimpleDateFormat formate=new SimpleDateFormat("dd-MM-yyy HH-mm-ss");
        Date date=new Date();
        String actualdate=formate.format(date);

        String path=System.getProperty("user.dir")+"\\Report\\ExecutionReport_"+actualdate+".html";
        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        reporter.config().setReportName("ABSLI-LEAP Report");
        reporter.config().setDocumentTitle("TestResults");
        reporter.config().setTheme(Theme.DARK);

        extent = new ExtentReports();
        extent.attachReporter(reporter);
        extent.setSystemInfo("QA", "Mithil Panchal");

        return extent;
    }}

