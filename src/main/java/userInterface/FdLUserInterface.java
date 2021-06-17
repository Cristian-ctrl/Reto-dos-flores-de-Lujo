package userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class FdLUserInterface {

	public static final Target TXT_BUSCADOR_FDL = Target.the("").locatedBy("//ul[@id='menu-menu-principal']//input[@placeholder='Buscar productos']");
	public static final Target BTN_BUSCADOR_FDL = Target.the("").locatedBy("//div[@class='dgwt-wcas-sf-wrapp']//button[@class='dgwt-wcas-search-submit']");
	public static final Target BTN_PRODUCTO_FDL = Target.the("").locatedBy("//span[@class=\"et_shop_image\"]//ancestor::a");
	public static final Target LBL_PRODUCTO_FDL = Target.the("").locatedBy("//div[h1]");
	public static final Target BTN_VOLVER_FDL = Target.the("").locatedBy("//a[contains(text(),'Volver a la Tienda')]");
	public static final Target BTN_CATEGORIA_FLORES_FDL = Target.the("").locatedBy("//*[@id=\"post-10\"]/div/div/div/div[3]/div[1]/div[1]/div/div[2]/a");
	public static final Target BTN_PRODUCTO_ALEATORIO_FDL = Target.the("").locatedBy("//span[@class='et_shop_image']");
	public static final Target LBL_NOMBRE_PRODUCTO_ALEATORIO_FDL = Target.the("").locatedBy("//li[@data-aut-id='itemBox']//a//span[@data-aut-id='itemTitle']");
	
}
