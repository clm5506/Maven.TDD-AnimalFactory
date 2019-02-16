package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void testCreateDog() {

        //Given

        String dogName = "Pupboi";
        Date dogsBday = new Date();
        dogsBday.setDate(20190101);

        //When
        Dog myDog = AnimalFactory.createDog(dogName,dogsBday);

        //Then
        Assert.assertEquals(dogName,myDog.getName());
        Assert.assertEquals(dogsBday, myDog.getBirthDate());

}
    @Test
    public void testCreateCat(){
        String catName = "Senorita";
        Date catsBday = new Date();
        catsBday.setDate(20180223);

        Cat myCat = AnimalFactory.createCat(catName,catsBday);

        Assert.assertEquals(catName,myCat.getName());
        Assert.assertEquals(catsBday, myCat.getBirthDate());
    }


}
