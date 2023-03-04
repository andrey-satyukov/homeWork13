public class PrintService {
    public void print(Puffenduy[] studentsPuffenduy) {
        System.out.println("Количество учеников в Пуффендуе: " + studentsPuffenduy.length);
        for (int i = 0; i < studentsPuffenduy.length; i++) {
            Puffenduy studentPuffendoi = studentsPuffenduy[i];
            System.out.println("Имя: " + studentPuffendoi.getName()
                    + ". Трансгрессия: " + studentPuffendoi.getTransgress()
                    + ". Колдовство: " + studentPuffendoi.getWitchcraft()
                    + ". Трудолюбие: " + studentPuffendoi.getHardworking()
                    +". Верность: " + studentPuffendoi.getLoyalty()
                    + ". Честность: " + studentPuffendoi.getHonesty());
//            String name, int transgress, int witchcraft, int hardworking, int loyalty, int honesty
        }
        System.out.println();

    }
    public void print(Griffindir[] studentsGriffindor) {
        System.out.println("Количество учеников в Гриффиндоре: " + studentsGriffindor.length);
        for (int i = 0; i < studentsGriffindor.length; i++) {
            Griffindir studentGriffindor = studentsGriffindor[i];
            System.out.println("Имя: " + studentGriffindor.getName()
                    + ". Трансгрессия: " + studentGriffindor.getTransgress()
                    + ". Колдовство: " + studentGriffindor.getWitchcraft()
                    + ". Благородство: " + studentGriffindor.getNobility()
                    + ". Честь: " + studentGriffindor.getHonor()
                    + ". Храбрость: " + studentGriffindor.getBravery());
        }
        System.out.println();
    }


    public void print(Slizerine[] studentsSlizerine) {
        System.out.println("Количество учеников в Слизерине " + studentsSlizerine.length);
        for (int i = 0; i < studentsSlizerine.length; i++) {
            Slizerine studenSlizerine = studentsSlizerine[i];
            System.out.println(
                    "Имя: " + studenSlizerine.getName()
                    + ". Трансгрессия: " + studenSlizerine.getTransgress()
                    + ". Колдовство: " + studenSlizerine.getWitchcraft()
                    + ". Хитрость: " + studenSlizerine.getTrick()
                    + ". Решительность: " + studenSlizerine.getDetermination()
                    + " Амбициозность: " + studenSlizerine.getAmbition()
                    + ". Находчивость: " + studenSlizerine.getResourcefulness()

            );
        }
        System.out.println();
    }

    public void print(Kogtervan[] studentsKogtervan) {
        System.out.println("Количество учеников в Когтерване: " + studentsKogtervan.length);
        for (int i = 0; i < studentsKogtervan.length; i++) {
            Kogtervan studentKogtevran = studentsKogtervan[i];
            System.out.println(
                    "Имя: " + studentKogtevran.getName()
                    + ". Трансгрессия: " + studentKogtevran.getTransgress()
                    + ". Колдовство: " + studentKogtevran.getWitchcraft()
                    + ". Мудрость: " + studentKogtevran.getWisdom()
                    + ". Остроумие: "  + studentKogtevran.getWit()
                    + ". Творчество: " + studentKogtevran.getCreative()
            );
        }
        System.out.println();
    }
}
