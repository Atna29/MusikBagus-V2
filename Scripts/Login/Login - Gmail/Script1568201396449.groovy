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

'Login menggunakan gmail'
Mobile.tap(findTestObject('Object Repository/Landing Page/Gmail login'), 10)

'Memilih email'
Mobile.takeScreenshot()

'Login memilih email'
Mobile.tap(findTestObject('Object Repository/Login With Gmail/Login Gmail'), 10)

'Verify berhasil login'
Mobile.verifyElementExist(findTestObject('Object Repository/Menu/Home'), 10)

'Berhasil login'
Mobile.takeScreenshot()