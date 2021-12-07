package Task3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main
{
    public static void main(String[] args) {
        final var sb_physics = new Subject("Фізика");
        final var sb_english = new Subject("Англійська мова");
        final var sb_math = new Subject("Математика");

        final Set<Subject> subjects = new HashSet<Subject>(Arrays.asList(
                sb_physics,
                sb_english,
                sb_math
        ));

        final Set<Student> students = new HashSet<Student>(Arrays.asList(
                new Student("ITA3",  "Semen", "Olegovich", "Rybin", "IT-11", new HashSet<Mark>(Arrays.asList(
                        new Mark(4, sb_physics),
                        new Mark(4, sb_english),
                        new Mark(4, sb_math)
                ))),
                new Student("ITB3","Vladyslav","Denysovych", "Bychkov", "IT-22", new HashSet<Mark>(Arrays.asList(
                        new Mark(4, sb_physics),
                        new Mark(5, sb_english),
                        new Mark(5, sb_math)
                ))),
                new Student("FLA3","Maria","Vladyslavovna", "Roshova", "FL-13",new HashSet<Mark>(Arrays.asList(
                        new Mark(4, sb_physics),
                        new Mark(5, sb_english),
                        new Mark(4, sb_math)
                )))
        ));

        for (var student : students)
        {
            System.out.println(student);
        }
    }
}
