package Test;

import Pages.TrianglePage;
import com.github.javafaker.Faker;
import io.qameta.allure.Severity;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCases extends BaseTest {

    static String side1;
    static String side2;
    static String side3;
    TrianglePage trianglePage;
    Faker faker;

    @BeforeClass
    public void setupTestData() {
        trianglePage=new TrianglePage(driver);
        faker = new Faker();
    }

    @Test
    public void verifyThatTheScaleneTriangleTriangleDisplayedSuccessfully(){
        int a, b, c;
        do {
            a = faker.number().numberBetween(3, 15);
            b = faker.number().numberBetween(3, 15);
            c = faker.number().numberBetween(3, 15);
        } while (!(a + b > c && a + c > b && b + c > a));
        side1 = String.valueOf(a);
        side2=String.valueOf(b);
        side3 = String.valueOf(c);
        trianglePage.enteredSidesOfTriangle(side1,side2,side3);
        Assert.assertEquals(trianglePage.getTriangleType().getText().toLowerCase(),"scalene");
    }

    @Test
    public void verifyThatTheEquilateralTriangleDisplayedSuccessfully() {
        int s = faker.number().numberBetween(3, 15);
        int a = s, b = s, c = s;

        side1 = String.valueOf(a);
        side2 = String.valueOf(b);
        side3 = String.valueOf(c);

        trianglePage.enteredSidesOfTriangle(side1, side2, side3);
        Assert.assertEquals(trianglePage.getTriangleType().getText().toLowerCase(), "equilateral");
    }

    @Test
    public void verifyThatTheIsoscelesTriangleDisplayedSuccessfully() {
        int s, b;
        do {
            s = faker.number().numberBetween(3, 15);
            b = faker.number().numberBetween(3, 15);
        } while (
                b == s || !(s + s > b && s + b > s)
        );

        int a = s, c = s;

        side1 = String.valueOf(a);
        side2 = String.valueOf(b);
        side3 = String.valueOf(c);

        trianglePage.enteredSidesOfTriangle(side1, side2, side3);
        Assert.assertEquals(trianglePage.getTriangleType().getText().toLowerCase(), "isosceles");
    }
    @Test
    public void verifyThatErrorDisplayedForInvalidTriangle() {
        int a, b, c;


        a = faker.number().numberBetween(3, 5);
        b = faker.number().numberBetween(3, 5);
        c = faker.number().numberBetween(20, 30);
        side1 = String.valueOf(a);
        side2 = String.valueOf(b);
        side3 = String.valueOf(c);

        trianglePage.enteredSidesOfTriangle(side1, side2, side3);
        Assert.assertEquals(trianglePage.getTriangleType().getText().toLowerCase(), "error: not a triangle");
    }
}
