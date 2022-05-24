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

WebUI.mouseOver(findTestObject('usuario/CatalogoUsuarios/CrearUsuarioNew/Page_Gastiganto Admin/span_Catlogos'))

WebUI.click(findTestObject('usuario/CatalogoUsuarios/CrearUsuarioNew/Page_Gastiganto Admin/span_Usuarios'))

WebUI.click(findTestObject('usuario/CatalogoUsuarios/CrearUsuarioNew/Page_Gastiganto Admin/i_Usuarios_la la-user-plus'))

WebUI.delay(3)

WebUI.setText(findTestObject('usuario/CatalogoUsuarios/usuarionuevo/Page_Gastiganto Admin/input_nombre'), 'rodolfo')

WebUI.delay(3)

WebUI.setText(findTestObject('usuario/CatalogoUsuarios/usuarionuevo/Page_Gastiganto Admin/input_ape_paterno'), 'valdez')

WebUI.delay(3)

WebUI.setText(findTestObject('usuario/CatalogoUsuarios/usuarionuevo/Page_Gastiganto Admin/input_ape_materno'), 'padilla')

WebUI.delay(3)

WebUI.setText(findTestObject('usuario/CatalogoUsuarios/usuarionuevo/Page_Gastiganto Admin/input_correo'), 'prueba@mail.com')

WebUI.delay(3)

WebUI.setEncryptedText(findTestObject('usuario/CatalogoUsuarios/usuarionuevo/Page_Gastiganto Admin/input_contra'), '373N5QL8KVQ=')

WebUI.delay(3)

WebUI.setEncryptedText(findTestObject('usuario/CatalogoUsuarios/usuarionuevo/Page_Gastiganto Admin/input_confirmar_contra'), '373N5QL8KVQ=')

WebUI.delay(3)

WebUI.setText(findTestObject('usuario/CatalogoUsuarios/usuarionuevo/Page_Gastiganto Admin/input_telefono'), '3213123123')

WebUI.delay(3)

WebUI.click(findTestObject('usuario/CatalogoUsuarios/CrearUsuarioNew/Page_Gastiganto Admin/span_Roles'))

WebUI.click(findTestObject('usuario/CatalogoUsuarios/CrearUsuarioNew/Page_Gastiganto Admin/span_Huesped'))

WebUI.delay(3)

WebUI.setText(findTestObject('usuario/CatalogoUsuarios/usuarionuevo/Page_Gastiganto Admin/input_ine'), '112233445566778899')

WebUI.delay(3)

WebUI.click(findTestObject('usuario/CatalogoUsuarios/CrearUsuarioNew/Page_Gastiganto Admin/span_Limpiar campos'))

WebUI.delay(3)

WebUI.setText(findTestObject('usuario/CatalogoUsuarios/usuarionuevo/Page_Gastiganto Admin/input_nombre'), 'eliminar')

WebUI.delay(3)

WebUI.setText(findTestObject('usuario/CatalogoUsuarios/usuarionuevo/Page_Gastiganto Admin/input_ape_paterno'), 'este')

WebUI.delay(3)

WebUI.setText(findTestObject('usuario/CatalogoUsuarios/usuarionuevo/Page_Gastiganto Admin/input_ape_materno'), 'usuario')

WebUI.delay(3)

WebUI.setText(findTestObject('usuario/CatalogoUsuarios/usuarionuevo/Page_Gastiganto Admin/input_correo'), 'prueba@mail.com')

WebUI.delay(3)

WebUI.setEncryptedText(findTestObject('usuario/CatalogoUsuarios/usuarionuevo/Page_Gastiganto Admin/input_contra'), '373N5QL8KVQ=')

WebUI.delay(3)

WebUI.setEncryptedText(findTestObject('usuario/CatalogoUsuarios/usuarionuevo/Page_Gastiganto Admin/input_confirmar_contra'), '373N5QL8KVQ=')

WebUI.delay(3)

WebUI.click(findTestObject('usuario/CatalogoUsuarios/CrearUsuarioNew/Page_Gastiganto Admin/mat-icon_visibility_off'))

WebUI.delay(3)

WebUI.click(findTestObject('usuario/CatalogoUsuarios/CrearUsuarioNew/Page_Gastiganto Admin/mat-icon_visibility'))

WebUI.delay(3)

WebUI.setText(findTestObject('usuario/CatalogoUsuarios/usuarionuevo/Page_Gastiganto Admin/input_telefono'), '6699112233')

WebUI.delay(3)

WebUI.click(findTestObject('usuario/CatalogoUsuarios/CrearUsuarioNew/Page_Gastiganto Admin/span_Roles'))

WebUI.click(findTestObject('usuario/CatalogoUsuarios/CrearUsuarioNew/Page_Gastiganto Admin/span_Huesped'))

WebUI.delay(3)

WebUI.setText(findTestObject('usuario/CatalogoUsuarios/usuarionuevo/Page_Gastiganto Admin/input_ine'), '112233445566778899')

WebUI.delay(3)

WebUI.click(findTestObject('usuario/CatalogoUsuarios/CrearUsuarioNew/Page_Gastiganto Admin/img_Imagen de la INE (Lado frontal)_image-profile'))

WebUI.delay(10)

WebUI.click(findTestObject('usuario/CatalogoUsuarios/CrearUsuarioNew/Page_Gastiganto Admin/img_Imagen de la INE (Lado frontal)_image-profile'))

WebUI.delay(10)

WebUI.click(findTestObject('usuario/CatalogoUsuarios/CrearUsuarioNew/Page_Gastiganto Admin/span_Guardar'))

WebUI.delay(3)

