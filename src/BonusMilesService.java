public class BonusMilesService {
    public int calculate(int price) {
        int rub = 20; // мин колличество рублей для одной мили
        int miles = price / rub;

        return miles;
    }

}

