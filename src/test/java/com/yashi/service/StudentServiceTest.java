package Level4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

public class StudentServiceTest {

    // ✅ Test valid student registration
    @Test
    void testRegisterStudent() throws Exception {

        StudentDAO mockDao = mock(StudentDAO.class);
        StudentService service = new StudentService(mockDao);

        Student s = new Student(1, "Yashi");

        service.registerStudent(s);

        verify(mockDao).addStudent(s);
    }

    // ✅ Test invalid student
    @Test
    void testInvalidStudent() {

        StudentDAO mockDao = mock(StudentDAO.class);
        StudentService service = new StudentService(mockDao);

        assertThrows(IllegalArgumentException.class, () -> {
            service.registerStudent(new Student(2, ""));
        });

        verify(mockDao, never()).addStudent(any());
    }

    // ✅ Test fetching students
    @Test
    void testShowStudents() throws Exception {

        StudentDAO mockDao = mock(StudentDAO.class);

        List<Student> fakeList = Arrays.asList(
                new Student(1, "Yashi"),
                new Student(2, "Rohit")
        );

        when(mockDao.getAllStudents()).thenReturn(fakeList);

        StudentService service = new StudentService(mockDao);

        List<StudentL> result = service.showStudents();

        assertEquals(2, result.size());
        assertEquals("Yashi", result.get(0).name);

        verify(mockDao).getAllStudents();
    }
}
