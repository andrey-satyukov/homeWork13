public class ComparisonService {

    private int maxAmount;
    private int indexOfBestStudent;
    private int sumPoints;
    public void compareAllInFacultet(Griffindir[] studentsGriffindor) {
        sumPoints = 0;
        maxAmount = 0;
        indexOfBestStudent = 0;
        Griffindir bestGrifindorec = studentsGriffindor[0];
        for (int i = 0; i < studentsGriffindor.length; i++) {
            Griffindir currentStudenGriffindor = studentsGriffindor[i];
            int sumPoints = currentStudenGriffindor.getWitchcraft() + currentStudenGriffindor.getTransgress() + currentStudenGriffindor.getBravery() + currentStudenGriffindor.getNobility() + currentStudenGriffindor.getHonor();
            System.out.println(currentStudenGriffindor.getName() + " - " + sumPoints);
            if (maxAmount < sumPoints) {
                maxAmount = sumPoints;
                indexOfBestStudent = i;
            }
        }
        bestGrifindorec = studentsGriffindor[indexOfBestStudent];
        System.out.println("bestGrifindorec = " + bestGrifindorec.getName());
        System.out.println();
    }

    public void compareAllInFacultet(Puffenduy[] studentsPuffenduy) {
        sumPoints = 0;
        maxAmount = 0;
        indexOfBestStudent = 0;
        Puffenduy bestPuffenduec = studentsPuffenduy[0];
        for (int i = 0; i < studentsPuffenduy.length; i++) {
            Puffenduy currentStudentPuffenduy = studentsPuffenduy[i];
            sumPoints = currentStudentPuffenduy.getTransgress() + currentStudentPuffenduy.getWitchcraft() + currentStudentPuffenduy.getHardworking() + currentStudentPuffenduy.getLoyalty() + currentStudentPuffenduy.getHonesty();
            System.out.println(currentStudentPuffenduy.getName() + " - " + sumPoints);
            if (maxAmount < sumPoints) {
                maxAmount = sumPoints;
                indexOfBestStudent = i;
            }
        }
        bestPuffenduec = studentsPuffenduy[indexOfBestStudent];
        System.out.println("bestPuffenduec = " + bestPuffenduec.getName());
        System.out.println();
    }

    public void compareAllInFacultet(Slizerine[] studentsSlizerine) {
        Slizerine bestSlizerinec = studentsSlizerine[0];
        sumPoints = 0;
        maxAmount = 0;
        indexOfBestStudent = 0;
        for (int i = 0; i < studentsSlizerine.length; i++) {
            Slizerine currentStudentSlizerine = studentsSlizerine[i];
            sumPoints = currentStudentSlizerine.getTransgress() + currentStudentSlizerine.getWitchcraft() + currentStudentSlizerine.getTrick() + currentStudentSlizerine.getDetermination() + currentStudentSlizerine.getAmbition() + currentStudentSlizerine.getResourcefulness() + bestSlizerinec.getLustForPower();
            System.out.println(currentStudentSlizerine.getName() + " - " + sumPoints);
            if (maxAmount < sumPoints) {
                maxAmount = sumPoints;
                indexOfBestStudent = i;
            }
        }
        bestSlizerinec = studentsSlizerine[indexOfBestStudent];
        System.out.println("bestSlizerinec = " + bestSlizerinec.getName());
        System.out.println();
    }

    public void compareAllInFacultet(Kogtervan[] studentsKogtervan) {
        sumPoints = 0;
        maxAmount = 0;
        indexOfBestStudent = 0;
        for (int i = 0; i < studentsKogtervan.length; i++) {
            Kogtervan currenStudentKogtervan = studentsKogtervan[i];
            sumPoints = currenStudentKogtervan.getTransgress() + currenStudentKogtervan.getWitchcraft() + currenStudentKogtervan.getMind() + currenStudentKogtervan.getWisdom() + currenStudentKogtervan.getWit() + currenStudentKogtervan.getCreative();
            System.out.println(currenStudentKogtervan.getName() + " - " + sumPoints);
            if (maxAmount < sumPoints) {
                maxAmount = sumPoints;
                indexOfBestStudent = i;
            }
        }
        Kogtervan bestKogtevranec = studentsKogtervan[indexOfBestStudent];
        System.out.println("bestKogtevranec = " + bestKogtevranec.getName());
    }


    public void compareTwoStudents(Hogwards student1, Hogwards student2) {
        int sum1 = student1.getTransgress() + student1.getWitchcraft();
        int sum2 = student2.getTransgress() + student2.getWitchcraft();
        if (sum1 > sum2) {
            System.out.println(student1.getName() + " обладает большей мощностью магии, чем " + student2.getName());
        } else if (sum2 > sum1) {
            System.out.println(student2.getName() + " обладает большей мощностью магии, чем " + student1.getName());
        } else {
            System.out.println(student2.getName() + " обладает такой же мощностью магии, как и " + student1.getName());
        }
    }
}
