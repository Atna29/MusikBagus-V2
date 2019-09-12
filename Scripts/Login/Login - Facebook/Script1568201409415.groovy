import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Membuka Aplikasi'
Mobile.startApplication(GlobalVariable.apkFile, false)

'Landing page'
Mobile.takeScreenshot()

'Login dengan FB'
Mobile.tap(findTestObject('Object Repository/Landing Page/Facebook login'), 10)

'Tap email kolom'
Mobile.tap(findTestObject('Object Repository/Login with FB/Facebook (nomor ponsel atau email)'), 10)

'Input email FB'
Mobile.setText(findTestObject('Object Repository/Login with FB/Facebook (nomor ponsel atau email)'), GlobalVariable.email_fb, 10)

'Input password FB'
Mobile.setText(findTestObject('Object Repository/Login with FB/Facebook (kata sandi FB)'), GlobalVariable.pass_fb, 10)

'Tap button login'
Mobile.tap(findTestObject('Object Repository/Login with FB/Facebook (button masuk)'), 10)

'Verify berhasil login'
Mobile.verifyElementExist(findTestObject('Object Repository/Menu/Home'), 10)

'Berhasil login'
Mobile.takeScreenshot()