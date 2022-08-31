import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static javax.xml.bind.JAXBIntrospector.getValue;

public class testTask extends BaseClass {

//private final static String baseUrl = "https://www.google.com/";
//private final static String searchString = "Александр Наумов";

@Test
    public void openImages(){
    //открываю страницу, где мне нужно искать
    open("https://www.google.com/");
    //ввожу нужный запрос
    $(By.name("q")).val("Александр Наумов").pressEnter();
    //нажимаю на кнопку "картинки" в гугле (здесь открывается по ссылке)
    $(byXpath("https://www.google.com/search?q=%D0%B0%D0%BB%D0%B5%D0%BA%D1%81%D0%B0%D0%BD%D0%B4%D1%80+%D0%BD%D0%B0%D1%83%D0%BC%D0%BE%D0%B2&sxsrf=ALiCzsaFVFvzK1vIaZd7WhlJh777M2kz8g:1661955784819&source=lnms&tbm=isch&sa=X&ved=2ahUKEwiFzL7ho_H5AhWKxosKHVSsANIQ_AUoAXoECAIQAw")).click();
    //нужно скачать третью по счету картинку из выданных результатов
    $(getValue(3).click.download);
}
}
