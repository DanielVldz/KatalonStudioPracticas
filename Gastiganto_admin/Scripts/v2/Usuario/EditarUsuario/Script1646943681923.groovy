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

WebUI.mouseOver(findTestObject('usuario/EditarUsuariov2/Page_Gastiganto Admin/span_Catlogos'))

WebUI.click(findTestObject('usuario/EditarUsuariov2/Page_Gastiganto Admin/span_Usuarios'))

WebUI.setText(findTestObject('usuario/EditarUsuariov2/Page_Gastiganto Admin/input_Nuevo Usuario_search'), 'missael')

WebUI.delay(1)

WebUI.click(findTestObject('usuario/EditarUsuariov2/Page_Gastiganto Admin/mat-icon_create'))

WebUI.setText(findTestObject('usuario/EditarUsuariov2/Page_Gastiganto Admin/input_Informacin bsica_mat-input-5'), 
    'Antonio')

WebUI.delay(1)

WebUI.setText(findTestObject('usuario/EditarUsuariov2/Page_Gastiganto Admin/input_Roles_mat-input-12'), '111222000111000111')

WebUI.delay(1)

WebUI.setText(findTestObject('usuario/EditarUsuariov2/Page_Gastiganto Admin/input_Confirmar contrasea_mat-input-11'), 
    '6671000000')

WebUI.delay(1)

WebUI.setText(findTestObject('usuario/EditarUsuariov2/Page_Gastiganto Admin/input_Nombre_mat-input-6'), 'Lopez')

WebUI.delay(1)

WebUI.click(findTestObject('usuario/EditarUsuariov2/Page_Gastiganto Admin/span_Actualizar'))

WebUI.delay(5)

