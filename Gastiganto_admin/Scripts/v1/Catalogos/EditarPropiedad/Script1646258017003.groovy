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

WebUI.click(findTestObject('Object Repository/CatalogoPropiedades/Page_Gastiganto Admin/span_Catlogos'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/CatalogoPropiedades/Page_Gastiganto Admin/span_Propiedades'))

WebUI.click(findTestObject('Object Repository/CatalogoPropiedades/Page_Gastiganto Admin/mat-icon_create'))

WebUI.click(findTestObject('Object Repository/CatalogoPropiedades/Page_Gastiganto Admin/div_Imagenes'))

WebUI.click(findTestObject('Object Repository/CatalogoPropiedades/Page_Gastiganto Admin/mat-icon_add_a_photo'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/CatalogoPropiedades/Page_Gastiganto Admin/div_Amenidades'))

WebUI.click(findTestObject('Object Repository/CatalogoPropiedades/Page_Gastiganto Admin/mat-expansion-panel-header_Bao'))

WebUI.click(findTestObject('Object Repository/CatalogoPropiedades/Page_Gastiganto Admin/mat-panel-title_Habitacin y lavandera'))

WebUI.click(findTestObject('Object Repository/CatalogoPropiedades/Page_Gastiganto Admin/mat-expansion-panel-header_Bao'))

WebUI.click(findTestObject('Object Repository/CatalogoPropiedades/Page_Gastiganto Admin/div_Secador de pelo_mat-checkbox-inner-cont_42d176'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/CatalogoPropiedades/Page_Gastiganto Admin/div_Archivos'))

WebUI.click(findTestObject('CatalogoPropiedades/Page_Gastiganto Admin/button_Actualizar'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/CatalogoPropiedades/Page_Gastiganto Admin/input_Archivos_mat-input-31'), 
    'Portico1')

