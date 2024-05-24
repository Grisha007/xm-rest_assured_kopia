package requests;

import io.restassured.response.Response;
import url.SwapiUrl;

import static io.restassured.RestAssured.given;

public class GetSpecificPersonRequest {

    public static Response getSpecificPerson(String name) {

        return given()
                .queryParam("search", name)
                .when()
                .get(SwapiUrl.getPeopleUrl());
    }
}
