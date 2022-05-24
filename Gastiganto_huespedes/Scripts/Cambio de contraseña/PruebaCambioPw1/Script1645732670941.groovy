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

WebUI.navigateToUrl('http://10.112.32.138:8073/gastiganto/huespedes/auth/login')

WebUI.setText(findTestObject('Object Repository/Cambio de contraseña/Page_Gastiganto/input_Correo_email'), 'danielrvp27@gmail.com')

WebUI.setText(findTestObject('Object Repository/Cambio de contraseña/Page_Gastiganto/input_Contrasea_password'), 'contraseña')

WebUI.click(findTestObject('Login/Page_Gastiganto/button_Iniciar sesin'))

WebUI.click(findTestObject('Object Repository/Cambio de contraseña/Page_Gastiganto/span_Mi perfil'))

WebUI.click(findTestObject('Object Repository/Cambio de contraseña/Page_Gastiganto/span_Cambiar contrasea'))

WebUI.setEncryptedText(findTestObject('Object Repository/Cambio de contraseña/Page_Gastiganto/input_Nueva contrasea_form-control form-con_18c268'), 
    'GS4YhOlirY4=')

WebUI.setEncryptedText(findTestObject('Object Repository/Cambio de contraseña/Page_Gastiganto/input_Confirmar contrasea_form-control form_972848'), 
    'GS4YhOlirY4=')

WebUI.setEncryptedText(findTestObject('Object Repository/Cambio de contraseña/Page_Gastiganto/input_Nueva contrasea_form-control form-con_18c268'), 
    'rjzw2pJdzpY=')

WebUI.setEncryptedText(findTestObject('Object Repository/Cambio de contraseña/Page_Gastiganto/input_Confirmar contrasea_form-control form_972848'), 
    'rjzw2pJdzpY=')

WebUI.click(findTestObject('Object Repository/Cambio de contraseña/Page_Gastiganto/button_Guardar cambios'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Cambio de contraseña/Page_Gastiganto/span_Contrasea actualizada correctamente'), 
    0)

WebUI.delay(3)

WebUI.closeBrowser()

