package Exercise_21_PatronDAOGenerics.main;

import Exercise_21_PatronDAOGenerics.main.daos.EstudianteDaoH2;
import Exercise_21_PatronDAOGenerics.main.entidades.Estudiante;
import Exercise_21_PatronDAOGenerics.main.servicios.EstudianteService;

public class Main {
    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante();

        estudiante1.setId(1L);
        estudiante1.setNombre("Yazmin");
        estudiante1.setApellido("Erazo");

        EstudianteService estudianteService = new EstudianteService();

        estudianteService.setEstudianteIDao(new EstudianteDaoH2());

        estudianteService.guardarEstudiante(estudiante1);

        Estudiante estudiante2 = new Estudiante();

        estudiante2.setId(2L);
        estudiante2.setNombre("Paola");
        estudiante2.setApellido("Erazo");

        estudianteService.guardarEstudiante(estudiante2);

        estudianteService.buscarTodos();
    }
}
