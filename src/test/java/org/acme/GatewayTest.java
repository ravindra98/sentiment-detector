package org.acme;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import java.util.UUID;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class GatewayTest {

    @Test
    public void testSentimentEndpoint() {
        given()
                .when().get("/sentiment")
                .then()
                .statusCode(200)
                .body(is("success"));
    }
}
