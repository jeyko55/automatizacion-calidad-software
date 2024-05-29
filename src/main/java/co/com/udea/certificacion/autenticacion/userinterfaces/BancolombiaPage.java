package co.com.udea.certificacion.autenticacion.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class BancolombiaPage extends PageObject {

   public static final Target BOTON_SABER_MAS_CREDITOS = Target.the("El boton para acceder a los posibles creditos").locatedBy("//a[@href='/personas/creditos/consumo']");
   public static final Target BOTON_SIMULAR_LIBRE_INVERSION = Target.the("El boton para simular credito libre inversion").locatedBy("//section[@id='creditos']/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/a[1]");
   public static final Target BOTON_CONTINUAR = Target.the("El boton para continuar con el credito").locatedBy("//button[contains(@class,'button-primary btn')]");
   public static final Target BOTON_SI = Target.the("El boton que verifica si sé cuanto dinero necesito").locatedBy("//span[@class='mat-radio-inner-circle']");
   public static final Target TEXT_AREA_MONTO = Target.the("el espacio para ingresar el monto").locatedBy("//input[contains(@class,'mat-input-element mat-form-field-autofill-control')]");
   public static final Target TEXT_AREA_MESES = Target.the("el espacio para ingresar a cuantos meses").locatedBy("(//input[contains(@class,'mat-input-element mat-form-field-autofill-control')])[2]");
   public static final Target CAMPO_FECHA = Target.the("la fecha de nacimiento").locatedBy("(//input[contains(@class,'mat-input-element mat-form-field-autofill-control')])[3]");
   public static final Target BOTON_SIGLO = Target.the("el boton del año 2000").locatedBy("//div[text()=' 2000 ']");
   public static final Target BOTON_ENERO = Target.the("el boton del mes enero").locatedBy("//div[@class='mat-calendar-body-cell-content mat-focus-indicator']");
   public static final Target BOTON_DIA = Target.the("el boton del dia 26").locatedBy("//mat-calendar[@id='mat-datepicker-0']/div[1]/mat-month-view[1]/table[1]/tbody[1]/tr[5]/td[4]/div[1]");
   public static final Target BOTON_SIMULAR = Target.the("el boton para simular").locatedBy("//button[contains(@class,'btn btn-block')]");
   public static final Target BOTON_SOLICITAR_CREDITO = Target.the("el boton para solicitar credito").locatedBy("//a[@id='visa-solicita-tarjeta-compras']");
   public static final Target TIPO_DOCUMENTO_TEXT_AREA = Target.the("el espacio para ingresar el tipo de documento").locatedBy("//div[@id='documentType']//input[1]");
   public static final Target OPCIONES_MENU = Target.the("el espacio para ingresar el tipo de documento").locatedBy("//ul[@role='listbox']");
   public static final Target BOTON_CEDULA = Target.the("el boton cedula de ciudadanía").locatedBy("//ul[@id='documentType-container']/li[4]");
   public static final Target TEXT_AREA_NUMERO_DOCUMENTO = Target.the("el espacio para ingresar el numero del documento").locatedBy("//input[contains(@class,'ng-untouched ng-pristine')]");
   public static final Target TEXT_AREA_NUMERO_CELULAR = Target.the("el espacio para ingresar el numero del celular").locatedBy("//input[contains(@class,'ng-pristine ng-invalid')]");
   public static final Target TEXT_AREA_CORREO_ELECTRONICO = Target.the("el espacio para ingresar el correo electronico").locatedBy("//em[text()='mail']/following-sibling::input");
   public static final Target CHECKBOX = Target.the("el checkbox de autorización").locatedBy("//input[@id='habeasData']/following-sibling::span[1]");
   public static final Target BOTON_SEGUNDO_CONTINUAR = Target.the("el segundo boton para continuar el proceso").locatedBy("//button[contains(@class,'bc-button bc-button-fill')]");
   public static final Target TEXT_AREA_NOMBRE = Target.the("el espacio para ingresar los nombres").locatedBy("//input[contains(@class,'ng-untouched ng-pristine')]");
   public static final Target TEXT_AREA_APELLIDOS = Target.the("el espacio para ingresar los apellidos").locatedBy("//input[contains(@class,'ng-untouched ng-pristine')]");
   public static final Target TEXT_AREA_SOLICITUD_FECHA_NACIMIENTO = Target.the("fecha de nacimiento al rellenar solicitud").locatedBy("//em[text()='calendar']/following-sibling::input");
   public static final Target BOTON_MES_ACTUAL= Target.the("boton con el mes actual").locatedBy("//em[text()='arrow2-left']/following-sibling::h6");
   public static final Target BOTON_NACIMIENTO= Target.the("boton con el año de nacimiento de nuevo").locatedBy("//h6[text()='2024']");
   public static final Target BOTON_IZQUIERDA = Target.the("boton para moverse a la izquierda").locatedBy("//em[contains(@class,'bc-icon bc-sm')]");
   public static final Target BOTON_SEGUNDO_SIGLO= Target.the("boton con el año 2000").locatedBy("//p[@id='YEAR2000']");
   public static final Target BOTON_SEGUNDO_ENERO= Target.the("boton con el mes enero").locatedBy("//p[@month_number='0']");
   public static final Target BOTON_SEGUNDO_DIA= Target.the("boton con el dia 26").locatedBy("//p[@id='DAY25']/following-sibling::p[1]");
   public static final Target TEXT_AREA_CIUDAD= Target.the("Espacio para poner ciuad").locatedBy("(//input[contains(@class,'bc-input bc-pe-4')])[3]");
   public static final Target TEXT_AREA_MEDELLIN_ANTIOQUIA= Target.the("Ubicacion medellin antioquia").locatedBy("//ul[@id='cityId-container']/li[5416]");
   public static final Target TEXT_AREA_EMAIL= Target.the("Espacio para poner el email").locatedBy("//input[@formcontrolname='email']");
   public static final Target TEXT_AREA_CONFIRMACION_EMAIL= Target.the("Espacio para confirmar el email").locatedBy("//input[@formcontrolname='emailVerify']");
   public static final Target TEXT_AREA_CELULAR_DE_NUEVO= Target.the("Espacio para poner el celular").locatedBy("//input[@formcontrolname='phone']");
   public static final Target TEXT_AREA_INGRESOS_MENSUALES= Target.the("Espacio para poner los ingresos mensuales").locatedBy("//input[@formcontrolname='monthlyIncome']");
   public static final Target BOTON_SIGUIENTE= Target.the("Boton siguiente dentro de la pagina").locatedBy("//button[contains(@class,'max-w-xs bc-button')]");
   public static final Target TEXTO_VERIFICACION= Target.the("Texto con la verificación que necesitamos").locatedBy("//h1[contains(@class,'bc-cibsans-font-style-12-bold bc-text-center')]");



   public static final Target TEXT_AREA_CIUDAD_NO_DISPONIBLE= Target.the("Texto con la una ciudad que no esta disponible").locatedBy("//ul[@id='cityId-container']//li[1]");

   public static final Target MENSAJE_ERROR= Target.the("boton con el mensaje de error").locatedBy("(//button[text()='Salir'])[2]");



}
