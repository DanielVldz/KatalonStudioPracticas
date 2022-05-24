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

WebUI.mouseOver(findTestObject('usuario/CrearUsuariov2/Page_Gastiganto Admin/span_Catlogos'))

WebUI.click(findTestObject('usuario/CrearUsuariov2/Page_Gastiganto Admin/span_Usuarios'))

WebUI.click(findTestObject('usuario/CrearUsuariov2/Page_Gastiganto Admin/span_Nuevo Usuario'))

WebUI.setText(findTestObject('usuario/CrearUsuariov2/Page_Gastiganto Admin/input_nombre'), 'Missael')

WebUI.delay(1)

WebUI.setText(findTestObject('usuario/CrearUsuariov2/Page_Gastiganto Admin/input_apepaterno'), 'Nieblas')

WebUI.delay(1)

WebUI.setText(findTestObject('usuario/CrearUsuariov2/Page_Gastiganto Admin/input_apematerno'), 'Ramirez')

WebUI.delay(1)

WebUI.setText(findTestObject('usuario/CrearUsuariov2/Page_Gastiganto Admin/input_correo'), 'nieblas2@mail.com')

WebUI.delay(1)

WebUI.setEncryptedText(findTestObject('usuario/CrearUsuariov2/Page_Gastiganto Admin/input_contra'), '373N5QL8KVQ=')

WebUI.delay(1)

WebUI.setEncryptedText(findTestObject('usuario/CrearUsuariov2/Page_Gastiganto Admin/input_confirmarcontra'), '373N5QL8KVQ=')

WebUI.delay(1)

WebUI.click(findTestObject('usuario/CrearUsuariov2/Page_Gastiganto Admin/mat-icon_visibility_off'))

WebUI.delay(1)

WebUI.click(findTestObject('usuario/CrearUsuariov2/Page_Gastiganto Admin/mat-icon_visibility'))

WebUI.setText(findTestObject('usuario/CrearUsuariov2/Page_Gastiganto Admin/input_telefono'), '6671001234')

WebUI.delay(1)

WebUI.click(findTestObject('usuario/CrearUsuariov2/Page_Gastiganto Admin/div_Roles_mat-select-arrow'))

WebUI.delay(1)

WebUI.click(findTestObject('usuario/CrearUsuariov2/Page_Gastiganto Admin/span_Huesped'))

WebUI.setText(findTestObject('usuario/CrearUsuariov2/Page_Gastiganto Admin/input_ine'), '111111000111000111')

WebUI.delay(1)

WebUI.click(findTestObject('usuario/CrearUsuariov2/Page_Gastiganto Admin/img_Imagen de la INE (Lado frontal)_image-profile'))

WebUI.delay(10)

WebUI.click(findTestObject('usuario/CrearUsuariov2/Page_Gastiganto Admin/img_Imagen de la INE (Lado trasero)_image-profile'))

WebUI.delay(10)

WebUI.click(findTestObject('usuario/CrearUsuariov2/Page_Gastiganto Admin/button_Limpiar campos'))

WebUI.setText(findTestObject('usuario/CrearUsuariov2/Page_Gastiganto Admin/input_nombre'), 'Missael')

WebUI.delay(1)

WebUI.setText(findTestObject('usuario/CrearUsuariov2/Page_Gastiganto Admin/input_apepaterno'), 'Nieblas')

WebUI.delay(1)

WebUI.setText(findTestObject('usuario/CrearUsuariov2/Page_Gastiganto Admin/input_apematerno'), 'Ramirez')

WebUI.delay(1)

WebUI.setEncryptedText(findTestObject('usuario/CrearUsuariov2/Page_Gastiganto Admin/input_contra'), '373N5QL8KVQ=')

WebUI.delay(1)

WebUI.setText(findTestObject('usuario/CrearUsuariov2/Page_Gastiganto Admin/input_correo'), 'nieblas3@mail.com')

WebUI.delay(1)

WebUI.setEncryptedText(findTestObject('usuario/CrearUsuariov2/Page_Gastiganto Admin/input_confirmarcontra'), '373N5QL8KVQ=')

WebUI.delay(1)

WebUI.click(findTestObject('usuario/CrearUsuariov2/Page_Gastiganto Admin/mat-icon_visibility_off'))

WebUI.delay(1)

WebUI.click(findTestObject('usuario/CrearUsuariov2/Page_Gastiganto Admin/mat-icon_visibility'))

WebUI.setText(findTestObject('usuario/CrearUsuariov2/Page_Gastiganto Admin/input_telefono'), '6671001234')

WebUI.delay(1)

WebUI.click(findTestObject('usuario/CrearUsuariov2/Page_Gastiganto Admin/div_Roles_mat-select-arrow'))

WebUI.delay(1)

WebUI.click(findTestObject('usuario/CrearUsuariov2/Page_Gastiganto Admin/span_Huesped'))

WebUI.delay(1)

WebUI.setText(findTestObject('usuario/CrearUsuariov2/Page_Gastiganto Admin/input_ine'), '321111000111000111')

WebUI.delay(1)

WebUI.click(findTestObject('usuario/CrearUsuariov2/Page_Gastiganto Admin/span_Guardar'))

WebUI.delay(3)

