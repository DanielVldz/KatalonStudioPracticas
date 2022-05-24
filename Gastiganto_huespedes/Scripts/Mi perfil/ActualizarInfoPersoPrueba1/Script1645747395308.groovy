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

WebUI.click(findTestObject('Object Repository/InformacionPersonal/Page_Gastiganto/span_Mi perfil'))

WebUI.click(findTestObject('Object Repository/InformacionPersonal/Page_Gastiganto/a_Stockholm-icons  General  User    Created_fbe02d'))

WebUI.click(findTestObject('Object Repository/InformacionPersonal/Page_Gastiganto/input_Nombre_form-control form-control-lg f_bbcb9f'))

WebUI.click(findTestObject('Object Repository/InformacionPersonal/Page_Gastiganto/div_Nombre'))

WebUI.setText(findTestObject('Object Repository/InformacionPersonal/Page_Gastiganto/input_Nombre_form-control form-control-lg f_bbcb9f'), 
    GlobalVariable.nombre1)

WebUI.click(findTestObject('Object Repository/InformacionPersonal/Page_Gastiganto/div_Apellido paterno'))

WebUI.setText(findTestObject('InformacionPersonal/Page_Gastiganto/Page_Gastiganto/input_Apellido paterno_form-control form-control-lg form-control-solid ng-dirty is-invalid ng-invalid ng-touched'), 
    GlobalVariable.apellidop1)

WebUI.click(findTestObject('Object Repository/InformacionPersonal/Page_Gastiganto/div_Apellido materno'))

WebUI.setText(findTestObject('InformacionPersonal/Page_Gastiganto/Page_Gastiganto/input_Apellido materno_form-control form-control-lg form-control-solid ng-untouched is-invalid ng-dirty ng-invalid'), 
    GlobalVariable.apellidom1)

WebUI.click(findTestObject('Object Repository/InformacionPersonal/Page_Gastiganto/button_Guardar cambios'))

WebUI.verifyElementPresent(findTestObject('Object Repository/InformacionPersonal/Page_Gastiganto/span_Informacin actualizada correctamente'), 
    1)

WebUI.delay(1)

