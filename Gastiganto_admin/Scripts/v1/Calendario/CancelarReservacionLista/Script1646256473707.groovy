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

WebUI.navigateToUrl(GlobalVariable.UrlReservaciones)

WebUI.click(findTestObject('Object Repository/Listado/Page_Gastiganto Admin/div_Listado'))

WebUI.click(findTestObject('Object Repository/Listado/Page_Gastiganto Admin/button_create'))

WebUI.click(findTestObject('Object Repository/Listado/Page_Gastiganto Admin/i_Editar reservacin_la la-arrow-left'))

WebUI.click(findTestObject('Object Repository/Listado/Page_Gastiganto Admin/div_Listado'))

WebUI.click(findTestObject('Object Repository/Listado/Page_Gastiganto Admin/mat-icon_create'))

WebUI.click(findTestObject('Object Repository/Listado/Page_Gastiganto Admin/div_Reservado_mat-select-arrow'))

WebUI.click(findTestObject('Object Repository/Listado/Page_Gastiganto Admin/span_Cancelado'))

WebUI.click(findTestObject('Listado/Page_Gastiganto Admin/span_Actualizar'))

WebUI.delay(2)

