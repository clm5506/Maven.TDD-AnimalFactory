package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void testAddCat() {

        //Given
        String catsName = "CatGirl";
        Date catsBirfday = new Date();
        catsBirfday.setDate(20180223);

        int catId = 1;

        Cat myCat = new Cat(catsName,catsBirfday,catId);

        //When
        CatHouse.add(myCat);

        //Then
        Assert.assertEquals(myCat,CatHouse.getCatById(catId));

    }

    @Test
    public void testRemoveCatById() {

        //Given
        String catsName = "Tom";
        Date catsBirthday = new Date();
        catsBirthday.setDate(20180223);
        int catId = 2;

        Cat myCat = new Cat(catsName, catsBirthday, catId);

        //When

        CatHouse.add(myCat);
        CatHouse.remove(myCat);

        //Then
        System.out.println(CatHouse.getNumberOfCats());
        Assert.assertEquals(null,CatHouse.getCatById(catId));

    }

    @Test
    public void testRemoveCatByObject() {

        //Given
        String catsName1 = "CatGirl";
        Date catsBirtday = new Date();
        catsBirtday.setDate(20180223);
        int catId = 3;

        Cat myCat = new Cat(catsName1,catsBirtday,catId);

        //When
        CatHouse.add(myCat);
        CatHouse.remove(myCat);

        //Then
        Assert.assertEquals(null,CatHouse.getCatById(catId));

    }

    @Test
    public void testGetCatById() {

        //Given
        String catsName = "FeFe";
        Date catsBday = new Date();
        catsBday.setDate(20181010);
        int catId = 4;

        Cat myCat = new Cat(catsName, catsBday, catId);

        CatHouse.add(myCat);

        //When
        CatHouse.add(myCat);

        //Then
        Assert.assertEquals(myCat,CatHouse.getCatById(catId));

    }

    @Test
    public void testGetNumberOfCats() {

        //Given
        Integer expectedNumOfCats = 1;
        String catName = "Ann";
        Date catsBday = new Date();
        catsBday.setDate(20191112);
        int catId = 5;

        Cat myCat = new Cat(catName, catsBday, catId);

        //When
        CatHouse.add(myCat);

        //Then
        Assert.assertEquals(expectedNumOfCats,CatHouse.getNumberOfCats());

    }

}
