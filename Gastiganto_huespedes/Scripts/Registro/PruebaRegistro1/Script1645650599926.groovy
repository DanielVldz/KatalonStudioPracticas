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

WebUI.navigateToUrl('http://10.112.32.138:8073/gastiganto/huespedes/auth/login')

WebUI.click(findTestObject('Object Repository/Registro/Page_Gastiganto/a_Regstrate'))

WebUI.setText(findTestObject('Object Repository/Registro/Page_Gastiganto/input_Nombre(s)_nombre'), 'Daniel')

WebUI.setText(findTestObject('Object Repository/Registro/Page_Gastiganto/input_Apellido paterno_apellido_paterno'), 'Valdez')

WebUI.setText(findTestObject('Object Repository/Registro/Page_Gastiganto/input_Apellido materno_apellido_materno'), 'Padilla')

WebUI.setText(findTestObject('Object Repository/Registro/Page_Gastiganto/input_Telfono_telefono'), '6673123456')

WebUI.setText(findTestObject('Object Repository/Registro/Page_Gastiganto/input_Correo_email'), 'danielrvp27@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Registro/Page_Gastiganto/input_Contrasea_password'), 'cDbzSVqoOR4ZSDO9XOFwfA==')

WebUI.setEncryptedText(findTestObject('Object Repository/Registro/Page_Gastiganto/input_Confirmar contrasea_cPassword'), 
    'cDbzSVqoOR4ZSDO9XOFwfA==')

WebUI.click(findTestObject('Object Repository/Registro/Page_Gastiganto/button_Registrarse'))

WebUI.delay(4)

WebUI.closeBrowser()

