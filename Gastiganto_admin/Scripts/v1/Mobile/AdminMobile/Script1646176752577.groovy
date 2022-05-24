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

WebUI.navigateToUrl('http://10.112.32.138:8073/gastiganto/admin/auth/login')

WebUI.setText(findTestObject('MobileRes/Page_Gastiganto Admin/input_Ie Soluciones_mat-input-0'), 'danielrvp27@gmail.com')

WebUI.setEncryptedText(findTestObject('MobileRes/Page_Gastiganto Admin/input_Correo electrnico_mat-input-1'), 
    'cDbzSVqoOR4ZSDO9XOFwfA==')

WebUI.click(findTestObject('MobileRes/Page_Gastiganto Admin/button_Iniciar sesin'))

WebUI.delay(10)

WebUI.click(findTestObject('MobileRes/Page_Gastiganto Admin/span'))

WebUI.click(findTestObject('MobileRes/Page_Gastiganto Admin/span_Reservaciones'))

WebUI.click(findTestObject('MobileRes/Page_Gastiganto Admin/i_Reservaciones_la la-close'))

WebUI.click(findTestObject('MobileRes/Page_Gastiganto Admin/div_Todas las plazas_mat-select-arrow'))

WebUI.click(findTestObject('MobileRes/Page_Gastiganto Admin/span_Mazatln'))

WebUI.click(findTestObject('MobileRes/Page_Gastiganto Admin/div_Todas las plazas_mat-select-arrow'))

WebUI.click(findTestObject('MobileRes/Page_Gastiganto Admin/span_Altata'))

WebUI.click(findTestObject('MobileRes/Page_Gastiganto Admin/div_Selecciona una plaza_mat-select-arrow-wrapper'))

WebUI.click(findTestObject('MobileRes/Page_Gastiganto Admin/span_Todas las plazas'))

WebUI.click(findTestObject('MobileRes/Page_Gastiganto Admin/svg_Selecciona el mes_mat-datepicker-toggle_9b036a'))

WebUI.click(findTestObject('MobileRes/Page_Gastiganto Admin/div_1'))

WebUI.click(findTestObject('MobileRes/Page_Gastiganto Admin/i_Consultar reservaciones_fas fa-search-dollar'))

WebUI.closeBrowser()

