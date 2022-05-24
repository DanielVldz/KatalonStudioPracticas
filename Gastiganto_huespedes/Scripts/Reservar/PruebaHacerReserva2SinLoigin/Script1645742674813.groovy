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

WebUI.navigateToUrl('http://10.112.32.138:8073/gastiganto/huespedes/tablero/reservar')

WebUI.click(findTestObject('Object Repository/Reservar/Page_Gastiganto/span_7'))

WebUI.click(findTestObject('Object Repository/Reservar/Page_Gastiganto/div_Selecciona tu destino_mat-select-arrow-_11b297'))

WebUI.click(findTestObject('Object Repository/Reservar/Page_Gastiganto/span_Altata'))

WebUI.click(findTestObject('Object Repository/Reservar/Page_Gastiganto/span_15'))

WebUI.click(findTestObject('Object Repository/Reservar/Page_Gastiganto/mat-icon_price_check'))

WebUI.click(findTestObject('Object Repository/Reservar/Page_Gastiganto/span_Trminos y condiciones_mat-checkbox-inn_de5857'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Reservar/Page_Gastiganto/span_Aceptar'))

WebUI.delay(3)

