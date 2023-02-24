package fun;

import io.restassured.http.ContentType;
import io.restassured.module.jsv.JsonSchemaValidator;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Test;

import java.io.File;

import static io.restassured.RestAssured.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class GameJsonSchemaValidationTest {

    @Test
    public void gameJsonSchemaValidationTest(){

        given().accept(ContentType.JSON)
                .when().get("http://localhost:8080/game")
                .then().assertThat().statusCode(HttpStatus.SC_OK)
                .and().body(JsonSchemaValidator.matchesJsonSchema(new File("src/test/resources/jsonSchemas/gameSchema.json")))
                .and().log().all();


    }
}
