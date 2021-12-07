package Task4;

import Task3.*;

import java.util.*;

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

        var studentList = new StudentList(subjects, new Student[] {
                new Student("ITA4",  "Semen", "Olegovich", "Rybin", "IT-11",
                        new HashSet<Mark>(Arrays.asList(
                        new Mark(4, sb_physics),
                        new Mark(4, sb_english),
                        new Mark(4, sb_math)
                ))),
                new Student("ITB4","Vladyslav","Denysovych", "Bychkov", "IT-22",
                        new HashSet<Mark>(Arrays.asList(
                        new Mark(4, sb_physics),
                        new Mark(5, sb_english),
                        new Mark(5, sb_math)
                ))),
                new Student("FLA4","Maria","Vladyslavovna", "Roshova", "FL-13",
                        new HashSet<Mark>(Arrays.asList(
                        new Mark(4, sb_physics),
                        new Mark(5, sb_english),
                        new Mark(4, sb_math)
                )))
        });

        System.out.println(studentList);

        studentList.addSubjectWithMarks(new Subject("Географія"), Map.of(
                "ITA4", 4,
                "ITB4", 5,
                "FLA4", 5)
        );

        System.out.println("\nAfter adding new subject: ");
        System.out.println(studentList);

        System.out.println("\nBest student: ");
        System.out.println(studentList.getBestStudent());

        System.out.println("\nPhysic marks: ");
        for (var entry : studentList.getStudentsMarksBySubject(sb_physics).entrySet())
            System.out.println(entry.getKey() + ":" + entry.getValue());
    }
}