package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

import static org.hamcrest.CoreMatchers.instanceOf;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void testNewDog() {
        //Given
        String name = "Hank";
        Date bDate = new Date();
        bDate.setDate(19910304);
        Integer dogId = 23453;

        //When
        Dog newPupp = new Dog(name, bDate, dogId);
        String retrievedName = newPupp.getName();
        Integer retrievedId = newPupp.getId();
        Date retrievedBirthDate = newPupp.getBirthDate();

        //When
        Assert.assertEquals(name, retrievedName);
        Assert.assertEquals(bDate, retrievedBirthDate);
        Assert.assertEquals(dogId, retrievedId);
    }

    @Test
    public void testDogSpeak() {
        //Given
        String dogName = "Harriet";
        Date birthDate = new Date();
        birthDate.setDate(19980405);
        Integer dogId = 89889;
        String expected = "bark!";

        //When
        Dog doggieDog = new Dog(dogName, birthDate, dogId);

        //Then
        Assert.assertEquals(expected, doggieDog.speak());
    }

    @Test
    public void testSetDogBirthdate() {
        //Given
        String dogName = "Ricky";
        Date birthDate = new Date();
        birthDate.setDate(19980506);
        Integer dogId = 789;

        Date newDateToSetDogsBday = new Date();
        newDateToSetDogsBday.setDate(19900909);

        //When
        Dog fido = new Dog(dogName, birthDate, dogId);
        fido.setBirthDate(newDateToSetDogsBday);

        //Then
        Assert.assertEquals(newDateToSetDogsBday, fido.getBirthDate());
    }

    @Test
    public void testDogEat() {
        //Given
        String dogName = "Ricardo";
        Date birthDate = new Date();
        birthDate.setDate(19800101);
        Integer dogId = 999;
        Food bigMac = new Food();
        Integer numOfMealsDogAte = 1;

        //When
        Dog goldie = new Dog(dogName, birthDate, dogId);
        goldie.eat(bigMac);

        //Then

        Assert.assertEquals(numOfMealsDogAte, goldie.getNumberOfMealsEaten());

    }

    @Test
    public void testDogGetId() {
        //Given
        String dogName = "Richie";
        Date birthDate = new Date();
        birthDate.setDate(19700101);
        Integer dogId = 919;

        //When
        Dog hankie = new Dog(dogName, birthDate, dogId);

        //Then
        Assert.assertEquals(dogId, hankie.getId());
    }

    @Test
    public void testDogInstanceOfAnimal() {
        //Given
        String peroName = "Perrito";
        Date dogsBday = new Date();
        dogsBday.setDate(19940202);
        Integer pupId = 34;

        //When
        Cat newDogg = new Cat(peroName, dogsBday, pupId);

        //Then
        Assert.assertThat(newDogg, instanceOf(Animal.class));
    }

    @Test
    public void testDogInstanceOfMammal() {
        //Given
        String peroName = "Perrito";
        Date dogsBday = new Date();
        dogsBday.setDate(19940202);
        Integer pupId = 34;

        //When
        Cat newDogg = new Cat(peroName, dogsBday, pupId);

        //Then
        Assert.assertThat(newDogg, instanceOf(Mammal.class));

    }
}
