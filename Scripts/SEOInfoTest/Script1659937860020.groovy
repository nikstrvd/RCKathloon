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

WebUI.setText(findTestObject('Object Repository/SEO Information/Page_RankChutney - Project Management/input_Get Started__username'), 
    'sem@2stallions.com')

WebUI.setEncryptedText(findTestObject('Object Repository/SEO Information/Page_RankChutney - Project Management/input_Get Started__password'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/SEO Information/Page_RankChutney - Project Management/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/SEO Information/Page_RankChutney - Project Management/span_100'))

WebUI.click(findTestObject('Object Repository/SEO Information/Page_RankChutney - Project Management/span_SEO Information'))

WebUI.click(findTestObject('Object Repository/SEO Information/Page_RankChutney - Project Management/div_Project Details                        _26ac83'))

WebUI.setText(findTestObject('Object Repository/SEO Information/Page_RankChutney - Project Management/input_List your top 3 industry competitor w_a54a55'), 
    'www.seo3.com')

WebUI.setText(findTestObject('Object Repository/SEO Information/Page_RankChutney - Project Management/input_concat(What are the top keywords you,_f433d3'), 
    'seo, seo1, seo2')

WebUI.setText(findTestObject('Object Repository/SEO Information/Page_RankChutney - Project Management/input_concat(Anything else you, , d like to_ff27f7'), 
    'seo testing')

WebUI.click(findTestObject('Object Repository/SEO Information/Page_RankChutney - Project Management/button_Update'))

WebUI.closeBrowser()

