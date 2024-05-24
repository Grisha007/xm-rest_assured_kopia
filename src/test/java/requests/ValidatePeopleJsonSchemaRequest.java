package requests;

import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.ValidatableResponse;
import url.SwapiUrl;

import static io.restassured.RestAssured.given;

public class ValidatePeopleJsonSchemaRequest {

    public static ValidatableResponse validatePeopleJsonSchemaRequest() {

        return given()
                .when()
                .get(SwapiUrl.getPeopleUrl())
                .then()
                .assertThat()
                .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("swapi-people-schema.json"));
    }
}
