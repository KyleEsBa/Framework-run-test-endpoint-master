package fun;


import fun.dataClass.Game;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.junit.jupiter.api.Assertions.*;

public class GameTests {

    @DisplayName("GET /game")
    @Test
    public void gameToDataClassWitParametersTest(){
        Response response = given().accept(ContentType.JSON)
                .and().queryParam("name","Chess")
                .when().get("http://localhost:8080/game");

        response.prettyPrint();
        Game game = response.as(Game.class);
        assertEquals(HttpStatus.SC_OK, response.statusCode());
        assertEquals("application/json;charset=UTF-8", response.contentType());
        assertEquals("Playing Chess is fun!", game.getText());

    }

    @DisplayName("GET /game without parameters")
    @Test
    public void gameToDataClassWithoutParametersTest(){
        Response response = given().accept(ContentType.JSON)
                .when().get("http://localhost:8080/game");

        response.prettyPrint();
        Game game = response.as(Game.class);
        assertEquals(HttpStatus.SC_OK, response.statusCode());
        assertEquals("application/json;charset=UTF-8", response.contentType());
        assertEquals("Playing Sudoku is fun!", game.getText());
    }



    }



