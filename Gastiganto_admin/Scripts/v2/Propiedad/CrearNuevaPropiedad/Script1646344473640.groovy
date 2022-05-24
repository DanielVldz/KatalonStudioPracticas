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

WebUI.mouseOver(findTestObject('Object Repository/CatalogoPropiedades/CrearPropiedad/Page_Gastiganto Admin/span_Catlogos'))

WebUI.click(findTestObject('Object Repository/CatalogoPropiedades/CrearPropiedad/Page_Gastiganto Admin/span_Propiedades'))

WebUI.click(findTestObject('Object Repository/CatalogoPropiedades/CrearPropiedad/Page_Gastiganto Admin/span_Nueva propiedad'))

WebUI.setText(findTestObject('Object Repository/CatalogoPropiedades/CrearPropiedad/Page_Gastiganto Admin/input_Archivos_mat-input-5'), 
    'Portico PruebaTSC')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/CatalogoPropiedades/CrearPropiedad/Page_Gastiganto Admin/div_Seleccione una plazaSeleccione una plaza'))

WebUI.click(findTestObject('Object Repository/CatalogoPropiedades/CrearPropiedad/Page_Gastiganto Admin/span_Mazatln'))

WebUI.click(findTestObject('Object Repository/CatalogoPropiedades/CrearPropiedad/Page_Gastiganto Admin/span_Seleccione un propietario'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/CatalogoPropiedades/CrearPropiedad/Page_Gastiganto Admin/span_Jess Oscar Crespo Palazuelos (6677889999)'))

not_run: WebUI.click(findTestObject('Object Repository/CatalogoPropiedades/CrearPropiedad/Page_Gastiganto Admin/div_Jess Oscar Crespo Palazuelos (667788999_4dba46'))

not_run: WebUI.click(findTestObject('Object Repository/CatalogoPropiedades/CrearPropiedad/Page_Gastiganto Admin/span_Jess Oscar Crespo Palazuelos (6677889999)'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/CatalogoPropiedades/CrearPropiedad/Page_Gastiganto Admin/input_Seleccione un propietario_mat-input-6'), 
    '6671001122')

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/CatalogoPropiedades/CrearPropiedad/Page_Gastiganto Admin/input_Seleccione una cerradura_mat-input-7'), 
    'Calle 1')

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/CatalogoPropiedades/CrearPropiedad/Page_Gastiganto Admin/input_Calle_mat-input-8'), 
    'Colonia 1')

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/CatalogoPropiedades/CrearPropiedad/Page_Gastiganto Admin/input_Colonia_mat-input-9'), 
    '1111')

WebUI.delay(10)

WebUI.setText(findTestObject('Object Repository/CatalogoPropiedades/CrearPropiedad/Page_Gastiganto Admin/input_Nmero interior_mat-input-11'), 
    '80111')

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/CatalogoPropiedades/CrearPropiedad/Page_Gastiganto Admin/input_Cdigo postal_mat-input-12'), 
    '1234')

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/CatalogoPropiedades/CrearPropiedad/Page_Gastiganto Admin/input_Latitud_mat-input-13'), 
    '4321')

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/CatalogoPropiedades/CrearPropiedad/Page_Gastiganto Admin/input__mat-input-14'), 
    '900')

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/CatalogoPropiedades/CrearPropiedad/Page_Gastiganto Admin/input_Tarifa mnima_mat-input-15'), 
    '4')

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/CatalogoPropiedades/CrearPropiedad/Page_Gastiganto Admin/input_Cantidad de adultos_mat-input-16'), 
    '4')

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/CatalogoPropiedades/CrearPropiedad/Page_Gastiganto Admin/textarea_Formato 24 hrs_mat-input-17'), 
    'Terminos y condiciones 1')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/CatalogoPropiedades/CrearPropiedad/Page_Gastiganto Admin/div_Imagenes'))

WebUI.click(findTestObject('Object Repository/CatalogoPropiedades/CrearPropiedad/Page_Gastiganto Admin/mat-icon_add_a_photo'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/CatalogoPropiedades/CrearPropiedad/Page_Gastiganto Admin/mat-icon_add_a_photo'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/CatalogoPropiedades/CrearPropiedad/Page_Gastiganto Admin/mat-icon_add_a_photo'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/CatalogoPropiedades/CrearPropiedad/Page_Gastiganto Admin/span_Elegir como principal'))

WebUI.click(findTestObject('Object Repository/CatalogoPropiedades/CrearPropiedad/Page_Gastiganto Admin/div_Amenidades'))

WebUI.click(findTestObject('Object Repository/CatalogoPropiedades/CrearPropiedad/Page_Gastiganto Admin/mat-panel-title_Bao'))

WebUI.click(findTestObject('Object Repository/CatalogoPropiedades/CrearPropiedad/Page_Gastiganto Admin/div_Secador de pelo_mat-checkbox-inner-cont_42d176'))

WebUI.click(findTestObject('Object Repository/CatalogoPropiedades/CrearPropiedad/Page_Gastiganto Admin/div_Shampoo_mat-checkbox-inner-container ma_bfb45f'))

WebUI.click(findTestObject('Object Repository/CatalogoPropiedades/CrearPropiedad/Page_Gastiganto Admin/mat-panel-title_Habitacin y lavandera'))

WebUI.click(findTestObject('Object Repository/CatalogoPropiedades/CrearPropiedad/Page_Gastiganto Admin/div_Elementos bsicos_mat-checkbox-inner-con_91fa9d'))

WebUI.click(findTestObject('Object Repository/CatalogoPropiedades/CrearPropiedad/Page_Gastiganto Admin/div_Plancha_mat-checkbox-inner-container ma_aabc91'))

WebUI.click(findTestObject('Object Repository/CatalogoPropiedades/CrearPropiedad/Page_Gastiganto Admin/mat-expansion-panel-header_Entretenimiento'))

WebUI.click(findTestObject('Object Repository/CatalogoPropiedades/CrearPropiedad/Page_Gastiganto Admin/div_TV_mat-checkbox-inner-container mat-che_3bd11f'))

WebUI.click(findTestObject('Object Repository/CatalogoPropiedades/CrearPropiedad/Page_Gastiganto Admin/mat-panel-title_Calefaccin y refrigeracin'))

WebUI.click(findTestObject('Object Repository/CatalogoPropiedades/CrearPropiedad/Page_Gastiganto Admin/div_Aire acondicionado_mat-checkbox-inner-c_25a9ce'))

WebUI.click(findTestObject('Object Repository/CatalogoPropiedades/CrearPropiedad/Page_Gastiganto Admin/mat-panel-title_Seguridad en el hogar'))

WebUI.click(findTestObject('Object Repository/CatalogoPropiedades/CrearPropiedad/Page_Gastiganto Admin/div_Detector de humo_mat-checkbox-inner-con_c84995'))

WebUI.click(findTestObject('Object Repository/CatalogoPropiedades/CrearPropiedad/Page_Gastiganto Admin/mat-panel-title_Internet y oficina'))

WebUI.click(findTestObject('Object Repository/CatalogoPropiedades/CrearPropiedad/Page_Gastiganto Admin/div_Wifi_mat-checkbox-inner-container mat-c_253989'))

WebUI.click(findTestObject('Object Repository/CatalogoPropiedades/CrearPropiedad/Page_Gastiganto Admin/div_rea para trabajar_mat-checkbox-inner-co_d083cb'))

WebUI.click(findTestObject('Object Repository/CatalogoPropiedades/CrearPropiedad/Page_Gastiganto Admin/mat-expansion-panel-header_Cocina y comida'))

WebUI.click(findTestObject('Object Repository/CatalogoPropiedades/CrearPropiedad/Page_Gastiganto Admin/div_Refrigerador_mat-checkbox-inner-contain_7f79d1'))

WebUI.click(findTestObject('Object Repository/CatalogoPropiedades/CrearPropiedad/Page_Gastiganto Admin/div_Cocina_mat-checkbox-inner-container mat_5acabf'))

WebUI.click(findTestObject('Object Repository/CatalogoPropiedades/CrearPropiedad/Page_Gastiganto Admin/mat-panel-title_Caractersticas de la ubicacin'))

WebUI.click(findTestObject('Object Repository/CatalogoPropiedades/CrearPropiedad/Page_Gastiganto Admin/div_Entrada privada_mat-checkbox-inner-cont_d7ff30'))

WebUI.click(findTestObject('Object Repository/CatalogoPropiedades/CrearPropiedad/Page_Gastiganto Admin/mat-expansion-panel-header_Estacionamiento _ac946a'))

WebUI.click(findTestObject('Object Repository/CatalogoPropiedades/CrearPropiedad/Page_Gastiganto Admin/div_Estacionamiento gratuito en las instala_41415d'))

WebUI.click(findTestObject('Object Repository/CatalogoPropiedades/CrearPropiedad/Page_Gastiganto Admin/mat-expansion-panel-header_Servicios'))

WebUI.click(findTestObject('Object Repository/CatalogoPropiedades/CrearPropiedad/Page_Gastiganto Admin/div_Se admiten mascotas_mat-checkbox-inner-_7f36d1'))

WebUI.click(findTestObject('Object Repository/CatalogoPropiedades/CrearPropiedad/Page_Gastiganto Admin/mat-panel-title_No incluidos'))

WebUI.click(findTestObject('Object Repository/CatalogoPropiedades/CrearPropiedad/Page_Gastiganto Admin/div_Lavadora_mat-checkbox-inner-container m_133ebc'))

WebUI.click(findTestObject('Object Repository/CatalogoPropiedades/CrearPropiedad/Page_Gastiganto Admin/div_Archivos'))

WebUI.click(findTestObject('Object Repository/CatalogoPropiedades/CrearPropiedad/Page_Gastiganto Admin/label_CLICK PARA SELECCIONAR EL ARCHIVO'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/CatalogoPropiedades/CrearPropiedad/Page_Gastiganto Admin/div_Mostrar en_mat-select-arrow'))

WebUI.click(findTestObject('Object Repository/CatalogoPropiedades/CrearPropiedad/Page_Gastiganto Admin/span_pre-reservado'))

WebUI.click(findTestObject('Object Repository/CatalogoPropiedades/CrearPropiedad/Page_Gastiganto Admin/label_CLICK PARA SELECCIONAR EL ARCHIVO'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/CatalogoPropiedades/CrearPropiedad/Page_Gastiganto Admin/div_Mostrar en_mat-select-arrow-wrapper'))

WebUI.click(findTestObject('Object Repository/CatalogoPropiedades/CrearPropiedad/Page_Gastiganto Admin/span_reservado'))

not_run: WebUI.click(findTestObject('Object Repository/CatalogoPropiedades/CrearPropiedad/Page_Gastiganto Admin/div_Ie Soluciones_cdk-overlay-backdrop cdk-_4fab31'))

WebUI.click(findTestObject('Object Repository/CatalogoPropiedades/CrearPropiedad/Page_Gastiganto Admin/label_CLICK PARA SELECCIONAR EL ARCHIVO'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/CatalogoPropiedades/CrearPropiedad/Page_Gastiganto Admin/div_Mostrar en_mat-select-arrow_1'))

WebUI.click(findTestObject('Object Repository/CatalogoPropiedades/CrearPropiedad/Page_Gastiganto Admin/span_cancelado'))

WebUI.click(findTestObject('Object Repository/CatalogoPropiedades/CrearPropiedad/Page_Gastiganto Admin/button_Guardar'))

WebUI.delay(3)

