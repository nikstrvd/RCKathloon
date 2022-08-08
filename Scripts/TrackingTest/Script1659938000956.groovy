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

WebUI.setText(findTestObject('Object Repository/Tracking/Page_RankChutney - Project Management/input_Get Started__username'), 
    'sem@2stallions.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Tracking/Page_RankChutney - Project Management/input_Get Started__password'), 
    'aeHFOx8jV/A=')

WebUI.sendKeys(findTestObject('Object Repository/Tracking/Page_RankChutney - Project Management/input_Get Started__password'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Tracking/Page_RankChutney - Project Management/span_100'))

WebUI.click(findTestObject('Object Repository/Tracking/Page_RankChutney - Project Management/span_Tracking'))

WebUI.click(findTestObject('Object Repository/Tracking/Page_RankChutney - Project Management/label_Access Provided'))

WebUI.click(findTestObject('Object Repository/Tracking/Page_RankChutney - Project Management/label_Access Provided'))

WebUI.click(findTestObject('Object Repository/Tracking/Page_RankChutney - Project Management/label_Do not ownhave access'))

WebUI.click(findTestObject('Object Repository/Tracking/Page_RankChutney - Project Management/button_Update'))

WebUI.closeBrowser()

