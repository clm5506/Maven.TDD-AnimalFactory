package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }

    @Test
    public void testAddDog() {
        //Given
        String dogName = "Puppisito";
        Date birthDate = new Date();
        birthDate.setDate(20040923);
        Integer dogId = 77;
        Dog doge = new Dog(dogName, birthDate, dogId);

        //When
        DogHouse.add(doge);

        //Then
        Assert.assertEquals(doge, DogHouse.getDogById(dogId));

    }

    @Test
    public void testRemoveDog() {

        //Given
        String dogName = "Doug";
        Date birthDate = new Date();
        birthDate.setDate(20070606);
        Integer dogId = 22;
        Dog doggie = new Dog(dogName, birthDate, dogId);

        //When
        DogHouse.add(doggie);
        DogHouse.remove(doggie);

        //Then
        Assert.assertEquals(null, DogHouse.getDogById(dogId));

    }

    @Test
    public void testGetDogById() {

        //Given
        String dogNombre = "Estaben";
        Date birthDate = new Date();
        birthDate.setDate(19920202);
        Integer dogId = 21;
        Dog snoop = new Dog(dogNombre, birthDate, dogId);

        //When
        DogHouse.add(snoop);

        //Then
        Assert.assertEquals(snoop, DogHouse.getDogById(dogId));
    }

    @Test
    public void testGetNumberOfDogs2() {
        DogHouse.clear();
        //Given
        String dogName = "Enrique";
        Date birthDate = new Date();
        birthDate.setDate(19910202);
        Integer dogId = 234;
        Dog clifford = new Dog(dogName, birthDate, dogId);
        Integer numOfDogsInHouse = 1;

        //When
        DogHouse.add(clifford);

        //Then
        Assert.assertEquals(numOfDogsInHouse, DogHouse.getNumberOfDogs());

    }
}
