package apirequests;

import io.qameta.allure.Step;
import io.restassured.response.Response;
import ru.yandex.praktikum.Order;

import static io.restassured.RestAssured.given;

public class OrderRequest extends ApiBase{
    private Order order;
    private final static String ENDPOINT_ORDERS = "/api/v1/orders";

    public void setOrder(Order order) {
        this.order = order;
    }

    @Step("Создать заказ, проверить код ответа и номер заказа")
    public Response createOrderRequest(){
        Response response =
        given()
                .header("Content-type", "application/json")
                .body(order)
                .when()
                .post (ENDPOINT_ORDERS);
        return response;
    }

    @Step("Получить список заказов, проверить что он не пустой и код ответа")
    public Response getOrdersRequest(){
        Response response =
        given()
                .get (ENDPOINT_ORDERS);
        return  response;
    }
}
