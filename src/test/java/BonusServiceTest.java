import static org.junit.jupiter.api.Assertions.*;

public class BonusServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        //подготавливаем данные:
        long amount = 16_666;
        boolean registered = true;
        long expected = 499;

        //вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        //производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndOnLimit() {
        BonusService service = new BonusService();

        //подготавливаем данные:
        long amount = 16_667;
        boolean registered = true;
        long expected = 500;

        //вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        //производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        //подготавливаем данные:
        long amount = 16_668;
        boolean registered = true;
        long expected = 500;

        //вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        //производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForUnRegisteredAndUnderLimit() {
        BonusService service = new BonusService();
        //подготавливаем данные:
        long amount = 49_999;
        boolean registered = false;
        long expected = 499;

        //вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        //производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForUnregisteredAndOnLimit() {
        BonusService service = new BonusService();

        //подготавливаем данные:
        long amount = 50_000;
        boolean registered = false;
        long expected = 500;

        //вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        //производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);

}
    @org.junit.jupiter.api.Test
    void shouldCalculateForUnregisteredAndOverLimit() {
        BonusService service = new BonusService();
        //подготавливаем данные:
        long amount = 50_001;
        boolean registered = false;
        long expected = 500;

        //вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        //производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
}
