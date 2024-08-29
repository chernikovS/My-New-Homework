package app;

public class AdvisePrinter implements Advisor {

    public void advise(Day day) {

        switch (day) {
            case Monday, Tuesday, Wednesday, Thursday:
                System.out.println("Винагороджуйте себе за досягнення.");
                break;

            case Friday:
                System.out.println("Happy Friday!");
                break;

            case Saturday, Sunday:
                System.out.println("Рекомендуємо відвідати Оперний театр в Одесі.");
                break;

            default:
                break;
        }
    }
}