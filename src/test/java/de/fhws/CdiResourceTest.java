package de.fhws;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class CdiResourceTest {
    

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/cdi")
          .then()
             .statusCode(200)
             .body(is("result 0"));
    }

    @Test
    public void testHelloEndpointWithQueryParam() {
        given()
          .when().get("/cdi?number=1")
          .then()
             .statusCode(200)
             .body(is("result 42"));
    }
}
