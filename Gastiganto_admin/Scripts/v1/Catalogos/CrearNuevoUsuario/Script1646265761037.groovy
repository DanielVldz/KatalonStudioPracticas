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

WebUI.mouseOver(findTestObject('usuario/CatalogoUsuarios/CrearUsuario/Page_Gastiganto Admin/span_Catlogos'))

WebUI.click(findTestObject('usuario/CatalogoUsuarios/CrearUsuario/Page_Gastiganto Admin/a_Usuarios'))

WebUI.click(findTestObject('usuario/CatalogoUsuarios/CrearUsuario/Page_Gastiganto Admin/button_Nuevo Usuario'))

WebUI.delay(3)

WebUI.setText(findTestObject('null'), 'eliminar')

WebUI.delay(3)

WebUI.setText(findTestObject('null'), 'este')

WebUI.delay(3)

WebUI.setText(findTestObject('null'), 'usuario')

WebUI.delay(3)

WebUI.setText(findTestObject('null'), 'prueba@mail.com')

WebUI.delay(3)

WebUI.setEncryptedText(findTestObject('null'), '373N5QL8KVQ=')

WebUI.delay(3)

WebUI.click(findTestObject('usuario/CatalogoUsuarios/CrearUsuario/Page_Gastiganto Admin/mat-icon_visibility_off'))

WebUI.delay(3)

WebUI.setText(findTestObject('null'), 'secret')

WebUI.delay(3)

WebUI.click(findTestObject('usuario/CatalogoUsuarios/CrearUsuario/Page_Gastiganto Admin/mat-icon_visibility'))

WebUI.delay(3)

WebUI.setText(findTestObject('null'), '6677000000')

WebUI.delay(3)

WebUI.click(findTestObject('usuario/CatalogoUsuarios/CrearUsuario/Page_Gastiganto Admin/span_Roles'))

WebUI.delay(3)

WebUI.click(findTestObject('usuario/CatalogoUsuarios/CrearUsuario/Page_Gastiganto Admin/span_Huesped'))

WebUI.delay(3)

WebUI.click(findTestObject('usuario/CatalogoUsuarios/CrearUsuario/Page_Gastiganto Admin/div_Imagen de la INE (Lado frontal)Imagen d_fc053f'))

WebUI.delay(10)

WebUI.click(findTestObject('usuario/CatalogoUsuarios/CrearUsuario/Page_Gastiganto Admin/img_Imagen de la INE (Lado frontal)_image-profile'))

WebUI.delay(10)

WebUI.click(findTestObject('usuario/CatalogoUsuarios/CrearUsuario/Page_Gastiganto Admin/img_Imagen de la INE (Lado frontal)_image-profile'))

WebUI.delay(10)

WebUI.setText(findTestObject('null'), '112233445566778899')

WebUI.delay(3)

WebUI.click(findTestObject('usuario/CatalogoUsuarios/CrearUsuario/Page_Gastiganto Admin/span_Limpiar campos'))

WebUI.delay(3)

WebUI.setText(findTestObject('null'), 'eliminar')

WebUI.delay(3)

WebUI.setText(findTestObject('null'), 'este')

WebUI.delay(3)

WebUI.setText(findTestObject('null'), 'usuario')

WebUI.delay(3)

WebUI.setText(findTestObject('null'), 'prueba@mail.com')

WebUI.delay(3)

WebUI.setEncryptedText(findTestObject('null'), '373N5QL8KVQ=')

WebUI.delay(3)

WebUI.setEncryptedText(findTestObject('null'), '373N5QL8KVQ=')

WebUI.delay(3)

WebUI.click(findTestObject('usuario/CatalogoUsuarios/CrearUsuario/Page_Gastiganto Admin/mat-icon_visibility_off'))

WebUI.delay(3)

WebUI.click(findTestObject('usuario/CatalogoUsuarios/CrearUsuario/Page_Gastiganto Admin/mat-icon_visibility'))

WebUI.delay(3)

WebUI.setText(findTestObject('null'), '6677000000')

WebUI.delay(3)

WebUI.click(findTestObject('usuario/CatalogoUsuarios/CrearUsuario/Page_Gastiganto Admin/span_Roles'))

WebUI.delay(3)

WebUI.click(findTestObject('usuario/CatalogoUsuarios/CrearUsuario/Page_Gastiganto Admin/span_Huesped'))

WebUI.delay(3)

WebUI.setText(findTestObject('null'), '112233445566778899')

WebUI.delay(3)

WebUI.click(findTestObject('usuario/CatalogoUsuarios/CrearUsuario/Page_Gastiganto Admin/div_Informacin bsica'))

WebUI.delay(3)

WebUI.click(findTestObject('usuario/CatalogoUsuarios/CrearUsuario/Page_Gastiganto Admin/span_Nuevo Usuario'))

WebUI.delay(5)

