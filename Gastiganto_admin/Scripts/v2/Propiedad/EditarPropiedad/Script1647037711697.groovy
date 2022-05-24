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

WebUI.mouseOver(findTestObject('Object Repository/EditarPropiedadv2/Page_Gastiganto Admin/span_Catlogos'))

WebUI.click(findTestObject('Object Repository/EditarPropiedadv2/Page_Gastiganto Admin/span_Propiedades'))

WebUI.setText(findTestObject('Object Repository/EditarPropiedadv2/Page_Gastiganto Admin/input_Nueva propiedad_mat-input-4'), 
    'portico pruebaTSC')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/EditarPropiedadv2/Page_Gastiganto Admin/mat-icon_create'))

WebUI.setText(findTestObject('Object Repository/EditarPropiedadv2/Page_Gastiganto Admin/input_Archivos_mat-input-5'), 'Portico PruebaEditado')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/EditarPropiedadv2/Page_Gastiganto Admin/div_Mazatln_mat-select-arrow-wrapper'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/EditarPropiedadv2/Page_Gastiganto Admin/span_Altata'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/EditarPropiedadv2/Page_Gastiganto Admin/input_Seleccione un propietario_mat-input-6'), 
    '6671001133')

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/EditarPropiedadv2/Page_Gastiganto Admin/input_Seleccione una cerradura_mat-input-7'), 
    'Calle 2')

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/EditarPropiedadv2/Page_Gastiganto Admin/input_Calle_mat-input-8'), 'Colonia 2')

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/EditarPropiedadv2/Page_Gastiganto Admin/input_Colonia_mat-input-9'), '2222')

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/EditarPropiedadv2/Page_Gastiganto Admin/input_Nmero exterior_mat-input-10'), 
    '321')

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/EditarPropiedadv2/Page_Gastiganto Admin/input_Nmero interior_mat-input-11'), 
    '80222')

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/EditarPropiedadv2/Page_Gastiganto Admin/input_Cdigo postal_mat-input-12'), 
    '1122')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/EditarPropiedadv2/Page_Gastiganto Admin/div_Latitud Longitud  Tarifa mnima Cantidad_dc389b'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/EditarPropiedadv2/Page_Gastiganto Admin/input_Latitud_mat-input-13'), '3344')

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/EditarPropiedadv2/Page_Gastiganto Admin/input__mat-input-14'), '1900')

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/EditarPropiedadv2/Page_Gastiganto Admin/input_Tarifa mnima_mat-input-15'), 
    '6')

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/EditarPropiedadv2/Page_Gastiganto Admin/input_Cantidad de adultos_mat-input-16'), 
    '2')

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/EditarPropiedadv2/Page_Gastiganto Admin/textarea_Formato 24 hrs_mat-input-17'), 
    'Terminos y condiciones Editado')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/EditarPropiedadv2/Page_Gastiganto Admin/div_Imagenes'))

WebUI.click(findTestObject('Object Repository/EditarPropiedadv2/Page_Gastiganto Admin/div_Amenidades'))

WebUI.click(findTestObject('Object Repository/EditarPropiedadv2/Page_Gastiganto Admin/mat-panel-title_Bao'))

WebUI.click(findTestObject('Object Repository/EditarPropiedadv2/Page_Gastiganto Admin/div_Secador de pelo_mat-checkbox-inner-cont_42d176'))

WebUI.click(findTestObject('Object Repository/EditarPropiedadv2/Page_Gastiganto Admin/mat-expansion-panel-header_Habitacin y lavandera'))

WebUI.click(findTestObject('Object Repository/EditarPropiedadv2/Page_Gastiganto Admin/div_Plancha_mat-checkbox-inner-container ma_aabc91'))

WebUI.click(findTestObject('Object Repository/EditarPropiedadv2/Page_Gastiganto Admin/mat-panel-title_Entretenimiento'))

WebUI.click(findTestObject('Object Repository/EditarPropiedadv2/Page_Gastiganto Admin/mat-panel-title_Calefaccin y refrigeracin'))

WebUI.click(findTestObject('Object Repository/EditarPropiedadv2/Page_Gastiganto Admin/mat-panel-title_Seguridad en el hogar'))

WebUI.click(findTestObject('Object Repository/EditarPropiedadv2/Page_Gastiganto Admin/div_Detector de humo_mat-checkbox-inner-con_c84995'))

WebUI.click(findTestObject('Object Repository/EditarPropiedadv2/Page_Gastiganto Admin/mat-expansion-panel-header_Internet y oficina'))

WebUI.click(findTestObject('Object Repository/EditarPropiedadv2/Page_Gastiganto Admin/div_rea para trabajar_mat-checkbox-inner-co_d083cb'))

WebUI.click(findTestObject('Object Repository/EditarPropiedadv2/Page_Gastiganto Admin/mat-expansion-panel-header_Cocina y comida'))

WebUI.click(findTestObject('Object Repository/EditarPropiedadv2/Page_Gastiganto Admin/div_Cocina_mat-checkbox-inner-container mat_5acabf'))

WebUI.click(findTestObject('Object Repository/EditarPropiedadv2/Page_Gastiganto Admin/mat-panel-title_Caractersticas de la ubicacin'))

WebUI.click(findTestObject('Object Repository/EditarPropiedadv2/Page_Gastiganto Admin/div_Entrada privada_mat-checkbox-inner-cont_d7ff30'))

WebUI.click(findTestObject('Object Repository/EditarPropiedadv2/Page_Gastiganto Admin/mat-expansion-panel-header_Estacionamiento _ac946a'))

WebUI.click(findTestObject('Object Repository/EditarPropiedadv2/Page_Gastiganto Admin/div_Estacionamiento gratuito en las instala_41415d'))

WebUI.click(findTestObject('Object Repository/EditarPropiedadv2/Page_Gastiganto Admin/mat-panel-title_Servicios'))

WebUI.click(findTestObject('Object Repository/EditarPropiedadv2/Page_Gastiganto Admin/div_Llegada por cuenta propia_mat-checkbox-_7af4ce'))

WebUI.click(findTestObject('Object Repository/EditarPropiedadv2/Page_Gastiganto Admin/div_Se admiten mascotas_mat-checkbox-inner-_7f36d1'))

WebUI.click(findTestObject('Object Repository/EditarPropiedadv2/Page_Gastiganto Admin/mat-panel-title_No incluidos'))

WebUI.click(findTestObject('Object Repository/EditarPropiedadv2/Page_Gastiganto Admin/div_Lavadora_mat-checkbox-inner-container m_133ebc'))

WebUI.click(findTestObject('Object Repository/EditarPropiedadv2/Page_Gastiganto Admin/div_Archivos'))

WebUI.click(findTestObject('EditarPropiedadv2/Page_Gastiganto Admin/mat-icon_close3'))

WebUI.delay(1)

WebUI.click(findTestObject('EditarPropiedadv2/Page_Gastiganto Admin/mat-icon_close2'))

WebUI.delay(1)

WebUI.click(findTestObject('EditarPropiedadv2/Page_Gastiganto Admin/mat-icon_close1'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/EditarPropiedadv2/Page_Gastiganto Admin/span_Actualizar'))

