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

WebUI.setText(findTestObject('Object Repository/General Inforamtion/Page_RankChutney - Project Management/input_Get Started__username'), 
    'sem@2stallions.com')

WebUI.setEncryptedText(findTestObject('Object Repository/General Inforamtion/Page_RankChutney - Project Management/input_Get Started__password'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/General Inforamtion/Page_RankChutney - Project Management/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/General Inforamtion/Page_RankChutney - Project Management/span_100'))

WebUI.click(findTestObject('Object Repository/General Inforamtion/Page_RankChutney - Project Management/span_General Information'))

WebUI.doubleClick(findTestObject('Object Repository/General Inforamtion/Page_RankChutney - Project Management/input_What industry is your business in_app_5cbab0'))

WebUI.setText(findTestObject('Object Repository/General Inforamtion/Page_RankChutney - Project Management/input_What industry is your business in_app_5cbab0'), 
    'Testing Business')

WebUI.click(findTestObject('Object Repository/General Inforamtion/Page_RankChutney - Project Management/span_Singapore'))

WebUI.click(findTestObject('Object Repository/General Inforamtion/Page_RankChutney - Project Management/span_Singapore'))

WebUI.doubleClick(findTestObject('Object Repository/General Inforamtion/Page_RankChutney - Project Management/input_Which products andor services do you _c71c75'))

WebUI.setText(findTestObject('Object Repository/General Inforamtion/Page_RankChutney - Project Management/input_Which products andor services do you _c71c75'), 
    'Testing Offer')

WebUI.setText(findTestObject('Object Repository/General Inforamtion/Page_RankChutney - Project Management/input_Where is your business headquartered__41750a'), 
    'Testing head')

WebUI.setText(findTestObject('Object Repository/General Inforamtion/Page_RankChutney - Project Management/textarea_Testing'), 
    'Testing business 1')

WebUI.click(findTestObject('Object Repository/General Inforamtion/Page_RankChutney - Project Management/button_Update'))

WebUI.closeBrowser()

