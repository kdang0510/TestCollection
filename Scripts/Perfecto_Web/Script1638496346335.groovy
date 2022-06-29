import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.keyword.perfecto.PerfectoKeywords as PerfectoKeywords
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.openqa.selenium.Keys as Keys

//System.out.println("Caps: "+RunConfiguration.getDriverPreferencesProperties());
PerfectoKeywords.openBrowser('https://katalon-demo-cura.herokuapp.com/')

PerfectoKeywords.click(findTestObject('Object Repository/CURA Healthcare/Page_CURA Healthcare Service/a_Make Appointment'))

PerfectoKeywords.setText(findTestObject('Object Repository/CURA Healthcare/Page_CURA Healthcare Service/input_Username_username'), 
    'John Doe')

PerfectoKeywords.setEncryptedText(findTestObject('Object Repository/CURA Healthcare/Page_CURA Healthcare Service/input_Password_password'), 
    'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

PerfectoKeywords.click(findTestObject('Object Repository/CURA Healthcare/Page_CURA Healthcare Service/button_Login'))

PerfectoKeywords.click(findTestObject('Object Repository/CURA Healthcare/Page_CURA Healthcare Service/span_Visit Date (Required)_glyphicon glyphi_cada34'))

PerfectoKeywords.click(findTestObject('Object Repository/CURA Healthcare/Page_CURA Healthcare Service/td_14'))

PerfectoKeywords.click(findTestObject('Object Repository/CURA Healthcare/Page_CURA Healthcare Service/button_Book Appointment'))

PerfectoKeywords.click(findTestObject('Object Repository/CURA Healthcare/Page_CURA Healthcare Service/a_Go to Homepage'))

//WebUI.closeBrowser()

