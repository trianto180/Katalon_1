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

WebUI.navigateToUrl('https://www.filehosting.org/')

WebUI.uploadFile(findTestObject('Object Repository/Page_filehosting.org  free easy unlimited f_4efffe/input_Select a file_upload_file'), 
    'C:\\Users\\62895\\OneDrive - STMIK AMIKOM Yogyakarta\\Kerja\\KTP.jpg')

WebUI.setText(findTestObject('Page_filehosting.org  free easy unlimited f_4efffe/input_Your email address_uploader_email'), 
    '123@gmail.com')

WebUI.click(findTestObject('Page_filehosting.org  free easy unlimited f_4efffe/input_Step 3_accept_tos'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_filehosting.org  free easy unlimited f_4efffe/input_Step 4_submit'))

