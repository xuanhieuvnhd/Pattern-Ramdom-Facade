import java.util.List;

public class RandomListFacade {
    private ListFilter listFilter;
    private ListPrinter listPrinter;
    private RandomList randomList;
    private RandomNumber randomNumber;


    public RandomListFacade(RandomNumber randomNumber, RandomList randomList, ListFilter listFilter, ListPrinter listPrinter) {
        this.listFilter = listFilter;
        this.listPrinter = listPrinter;
        this.randomList = randomList;
        this.randomNumber = randomNumber;
    }

    public void printRandomEvenList(int min, int max) {

        int size = randomNumber.generateInteger(min, max);
        System.out.println("Kich thuoc so ngau nhien: "+size);
        List<Integer> listRandom = randomList.generateList(size, min, max);
        System.out.println("Danh sach ngau nhien: " + listRandom);
        List<Integer> listEven = listFilter.filterOdd(listRandom);
        System.out.println("Danh sach so chan: " + listEven);
    }
}
