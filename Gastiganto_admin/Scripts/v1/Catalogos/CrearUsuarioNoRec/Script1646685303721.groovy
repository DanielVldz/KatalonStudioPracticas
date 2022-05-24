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

WebUI.mouseOver(findTestObject('usuario/CatalogoUsuarios/CrearUsuarioNoRec/Page_Gastiganto Admin/span_Catlogos'))

WebUI.click(findTestObject('usuario/CatalogoUsuarios/CrearUsuarioNoRec/Page_Gastiganto Admin/span_Usuarios'))

WebUI.click(findTestObject('usuario/CatalogoUsuarios/CrearUsuarioNoRec/Page_Gastiganto Admin/span_Nuevo Usuario'))

WebUI.setText(findTestObject('usuario/CatalogoUsuarios/usuario1/Page_Gastiganto Admin/input_nombre_usuario1'), 'Missael')

WebUI.delay(1)

WebUI.setText(findTestObject('usuario/CatalogoUsuarios/usuario1/Page_Gastiganto Admin/input_apellidoPat_usuario1'), 'Nieblas')

WebUI.delay(1)

WebUI.setText(findTestObject('usuario/CatalogoUsuarios/usuario1/Page_Gastiganto Admin/input_apellidoMat_usuario1'), 'Ramirez')

WebUI.delay(1)

WebUI.setText(findTestObject('usuario/CatalogoUsuarios/usuario1/Page_Gastiganto Admin/input_correo_usuario1'), 'pruebadeusuario1@mail.com')

WebUI.delay(1)

WebUI.setText(findTestObject('usuario/CatalogoUsuarios/usuario1/Page_Gastiganto Admin/input_contra_usuario1'), 'secret')

WebUI.delay(1)

WebUI.setText(findTestObject('usuario/CatalogoUsuarios/usuario1/Page_Gastiganto Admin/input_confirmarcontra_usuario1'), 'secret')

WebUI.delay(1)

WebUI.click(findTestObject('usuario/CatalogoUsuarios/CrearUsuarioNoRec/Page_Gastiganto Admin/mat-icon_visibility_off'))

WebUI.delay(2)

WebUI.click(findTestObject('usuario/CatalogoUsuarios/CrearUsuarioNoRec/Page_Gastiganto Admin/mat-icon_visibility'))

WebUI.delay(1)

WebUI.setText(findTestObject('usuario/CatalogoUsuarios/usuario1/Page_Gastiganto Admin/input_telefono_usuario1'), '6671999999')

WebUI.delay(1)

WebUI.click(findTestObject('usuario/CatalogoUsuarios/CrearUsuarioNoRec/Page_Gastiganto Admin/div_Roles_mat-select-arrow'))

WebUI.click(findTestObject('usuario/CatalogoUsuarios/CrearUsuarioNoRec/Page_Gastiganto Admin/span_Huesped'))

WebUI.delay(1)

WebUI.setText(findTestObject('usuario/CatalogoUsuarios/usuario1/Page_Gastiganto Admin/input_ine_usuario1'), '321321321321321321')

WebUI.delay(1)

WebUI.click(findTestObject('usuario/CatalogoUsuarios/CrearUsuarioNoRec/Page_Gastiganto Admin/img_Imagen de la INE (Lado frontal)_image-profile'))

WebUI.delay(10)

WebUI.click(findTestObject('usuario/CatalogoUsuarios/CrearUsuarioNoRec/Page_Gastiganto Admin/img_Imagen de la INE (Lado trasero)_image-profile'))

WebUI.delay(10)

WebUI.click(findTestObject('usuario/CatalogoUsuarios/CrearUsuarioNoRec/Page_Gastiganto Admin/span_Guardar'))

WebUI.delay(3)

