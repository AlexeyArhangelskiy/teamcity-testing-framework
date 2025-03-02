package com.example.teamcitydemo.api;

import com.example.teamcitydemo.api.models.User;
import com.example.teamcitydemo.api.spec.Specifications;
import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class DummyTest extends BaseApiTest{
    @Test
    public void userShouldBeAbleGetAllProject() {
        RestAssured
                .given()
                .spec(Specifications.getSpec().authSpec(User.builder().user("admin1").password("admin").build()))
                .get("/app/rest/projects");
    }
}
