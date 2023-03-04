public class Main {
    public static void main(String[] args) {
        Griffindir[] studentsGriffindor = {
                new Griffindir("Гарри Поттер", 31, 39, 98, 54, 65),
                new Griffindir("Рон Уизли", 20, 30, 58, 34, 98),
                new Griffindir("Гермиона Грэйнджер", 90, 93, 90, 84, 95),
        };
        Puffenduy[] studentsPuffenduy = {
                new Puffenduy("Захария Смит", 45,65,32,12, 65),
                new Puffenduy("Cедрик Диггори", 55,75,12,25, 57),
                new Puffenduy("Джастин Финч-Флетчли", 33,84,75,96, 20),

//                String name, int transgress, int witchcraft, int hardworking, int loyalty, int honesty
        };
        Slizerine[] studentsSlizerine = {
                new Slizerine("Драко Малфой", 32,32,65,76,87,23,87),
                new Slizerine("Грэхэм Монтегю", 22,72,12,16,47,34,37),
                new Slizerine("Грегори Гойл", 35,2,5,6,7,43,17),

        };
        Kogtervan[] studentsKogtervan ={
           new Kogtervan("Чжоу Чанг", 43,76,87,32,87,90),
           new Kogtervan("Падма Патил", 36,46,32,12,89,38),
           new Kogtervan("Маркус Белби", 43,43,98,82,51,20),
        } ;
        PrintService printService = new PrintService();
        printService.print(studentsGriffindor);
        printService.print(studentsPuffenduy);
        printService.print(studentsSlizerine);
        printService.print(studentsKogtervan);

        ComparisonService comparisonService = new ComparisonService();
        comparisonService.compareAllInFacultet(studentsGriffindor);
        comparisonService.compareAllInFacultet(studentsPuffenduy);
        comparisonService.compareAllInFacultet(studentsSlizerine);
        comparisonService.compareAllInFacultet(studentsKogtervan);
        comparisonService.compareTwoStudents(studentsKogtervan[2], studentsGriffindor[2]);

    }
}