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

not_run: WebUI.click(findTestObject('usuario/CatalogoUsuarios/Page_Gastiganto Admin/i_Catlogos_kt-menu__hor-arrow la la-angle-d_68d266'))

not_run: WebUI.mouseOver(findTestObject('usuario/CatalogoUsuarios/Page_Gastiganto Admin/span_Catlogos'))

not_run: WebUI.click(findTestObject('usuario/CatalogoUsuarios/Page_Gastiganto Admin/span_Usuarios'))

not_run: WebUI.click(findTestObject('usuario/CatalogoUsuarios/Page_Gastiganto Admin/mat-icon_delete'))

not_run: WebUI.setText(findTestObject('usuario/CatalogoUsuarios/Page_Gastiganto Admin/Page_Gastiganto Admin/input_Nuevo Usuario_search'), 
    'Prueba')

not_run: WebUI.sendKeys(findTestObject('usuario/CatalogoUsuarios/Page_Gastiganto Admin/Page_Gastiganto Admin/input_Nuevo Usuario_search'), 
    Keys.chord(Keys.ENTER))

not_run: WebUI.click(findTestObject('usuario/CatalogoUsuarios/Page_Gastiganto Admin/span_Eliminar'))

not_run: WebUI.delay(3)

WebUI.mouseOver(findTestObject('usuario/CatalogoUsuarios/Page_Gastiganto Admin/Page_Gastiganto Admin/span_Catlogos (1)'))

WebUI.click(findTestObject('usuario/CatalogoUsuarios/Page_Gastiganto Admin/Page_Gastiganto Admin/span_Usuarios (1)'))

WebUI.click(findTestObject('usuario/CatalogoUsuarios/Page_Gastiganto Admin/Page_Gastiganto Admin/input_Nuevo Usuario_search_1'))

WebUI.setText(findTestObject('usuario/CatalogoUsuarios/Page_Gastiganto Admin/Page_Gastiganto Admin/input_Nuevo Usuario_search_1'), 
    'prueba')

WebUI.sendKeys(findTestObject('usuario/CatalogoUsuarios/Page_Gastiganto Admin/Page_Gastiganto Admin/input_Nuevo Usuario_search_1'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('usuario/CatalogoUsuarios/Page_Gastiganto Admin/Page_Gastiganto Admin/mat-icon_delete (1)'))

not_run: WebUI.delay(15)

WebUI.mouseOver(findTestObject('usuario/CatalogoUsuarios/Page_Gastiganto Admin/Page_Gastiganto Admin/span_Eliminar (1)'))

