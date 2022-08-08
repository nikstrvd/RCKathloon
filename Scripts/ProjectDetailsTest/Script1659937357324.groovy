import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://rankchutney.com/rcportal/login')

WebUI.setText(findTestObject('Object Repository/Page_RankChutney - Project Management/input_Get Started__username'), 'sem@2stallions.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_RankChutney - Project Management/input_Get Started__password'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Page_RankChutney - Project Management/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/Page_RankChutney - Project Management/span_100'))

WebUI.click(findTestObject('Object Repository/Page_RankChutney - Project Management/div_Whats your Business Name               _af7a68'))

WebUI.setText(findTestObject('Object Repository/Page_RankChutney - Project Management/input_Project Name_appbundle_projectprojectName'), 
    'Update Business Name')

WebUI.setText(findTestObject('Object Repository/Page_RankChutney - Project Management/input_And your Business Website_appbundle_p_af897a'), 
    'updatebusiness.com')

WebUI.setText(findTestObject('Object Repository/Page_RankChutney - Project Management/input_Who should we be talking to_appbundle_32dcde'), 
    'Update Client test')

WebUI.click(findTestObject('Object Repository/Page_RankChutney - Project Management/button_Update'))

WebUI.click(findTestObject('Object Repository/Page_RankChutney - Project Management/div_Well done Project has been updated succ_73540c'))

WebUI.closeBrowser()

