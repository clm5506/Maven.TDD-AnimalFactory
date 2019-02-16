package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

import static org.hamcrest.CoreMatchers.instanceOf;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
     public void testSetName() {
        //Given
        String catName = "Alex";
        Date catsBirfday = new Date();
        int catId = 22;
        String newName = "Munchkin";

        //When
        Cat cat = new Cat(catName, catsBirfday, catId);
        cat.setName(newName);

        //Then
        Assert.assertEquals(newName, cat.getName());
    }

    @Test
    public void testSpeak() {

        //Given
        String cName = "Fluff";
        Date catsBD = new Date();
        int catId = 33;
        String expected = "meow!";

        //When
        Cat newCat = new Cat(cName,catsBD,catId);

        //Then
        Assert.assertEquals(expected, newCat.speak());

    }

    @Test
    public void testSetBirthdate() {

        //Given
        String caName = "Monica";
        Date catsBirDay = new Date();
        catsBirDay.setDate(20181012);
        int catId = 123;

        //When
        Cat newKitty = new Cat(caName, catsBirDay,catId);
        Date newDate = new Date();
        newDate.setDate(20180214);
        newKitty.setBirthDate(newDate);

        //Then
        Assert.assertEquals(newDate, newKitty.getBirthDate());
    }

    @Test
    public void testEatFood() {

        //Given
        String catsName = "Anica";
        Date catsBday = new Date();
        catsBday.setDate(19911012);
        int catId = 77;
        Food grilledCheese = new Food();
        Integer foodsEaten = 1;

        //When
        Cat newKit = new Cat(catsName, catsBday, catId);
        newKit.eat(grilledCheese);

        //Then
        Assert.assertEquals(foodsEaten, newKit.getNumberOfMealsEaten());

    }

    @Test
    public void testGetCatId() {

        //Given
        String catsName = "Miranda";
        Date catsDOB = new Date();
        catsDOB.setDate(19910909);
        Integer catId = 88;

        //When
        Cat newKitten = new Cat(catsName, catsDOB, catId);

        //Then
        Assert.assertEquals(catId, newKitten.getId());

    }

    @Test
    public void testCatInstanceOfAnimal() {
        //Given
        String gatoName = "Gato";
        Date catsBday = new Date();
        catsBday.setDate(19940202);
        Integer catId = 34;

        //When
        Cat newKat = new Cat(gatoName, catsBday, catId);

        //Then
        Assert.assertThat(newKat, instanceOf(Animal.class));
    }

    @Test
    public void testCatInstanceOfMammal() {
        //Given
        String catName = "nameofcat";
        Date catsBirthday = new Date();
        catsBirthday.setDate(19930203);
        Integer catId = 6686;

        //When
        Cat kit = new Cat(catName, catsBirthday,catId);

        //Then
        Assert.assertThat(kit, instanceOf(Mammal.class));
    }



}
