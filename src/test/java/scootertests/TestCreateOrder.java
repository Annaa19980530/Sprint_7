package scootertests;

import apirequests.OrderRequest;
import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.yandex.praktikum.Order;
import static org.apache.http.HttpStatus.*;

import static org.hamcrest.Matchers.*;

@RunWith(Parameterized.class)
public class TestCreateOrder{
      Order order;

    public TestCreateOrder(Order order) {
        this.order = order;
    }

    @Before
    public void setUp(){
        orderRequest.setUp();
    }

    @Parameterized.Parameters
    public static Object[][] getTestData(){
        return new Object[][]{
                {new Order("Иван","Иванов","Советская","Ленинское","+79099995566",2,"2024-06-12","Позвонить за час",new String[]{"BLACK"})},
                {new Order("Петр","Петров","Дьяконова","Московское","89199895767",3,"2024-07-30","Позвонить за час",new String[]{"GREY"})},
                {new Order("Ivan","Petrov","Большая Покровская","Горьковское","+70070070070",4,"2024-08-01","Позвонить за час",new String[]{"BLACK","GREY"})},
                {new Order("Petr","Ivanov","Вождей Революции","Буревестник","89262626123",5,"2024-07-10","Позвонить за час",new String[]{})}
        };
    }

    OrderRequest orderRequest = new OrderRequest();

    @Test
    @DisplayName("Создание заказа самоката с разным цветом")
    @Description("Проверка создания заказа самоката с разным цветом")
    public void checkCreateOrder(){
        orderRequest.setOrder(order);
        orderRequest.createOrderRequest()
                .then().statusCode(SC_CREATED)
                .and()
                .assertThat().body("track", notNullValue());
    }
}
