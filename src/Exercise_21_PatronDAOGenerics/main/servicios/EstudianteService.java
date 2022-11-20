package Exercise_21_PatronDAOGenerics.main.servicios;

import Exercise_21_PatronDAOGenerics.main.daos.IDao;
import Exercise_21_PatronDAOGenerics.main.entidades.Estudiante;

import java.util.List;

public class EstudianteService {

    private IDao<Estudiante> estudianteIDao;

    public IDao<Estudiante> getEstudianteIDao() {
        return estudianteIDao;
    }

    public void setEstudianteIDao(IDao<Estudiante> estudianteIDao) {
        this.estudianteIDao = estudianteIDao;
    }


    public Estudiante guardarEstudiante(Estudiante estudiante) {
        //Delegarle la responsabilidad de guardar al DAO
        return estudianteIDao.guardar(estudiante);
    }

    public void eliminarEstudiante(Long id) {
         estudianteIDao.eliminar(id);
    }

    public Estudiante buscarEstudiante(Long id) {
        return estudianteIDao.buscar(id);
    }

    public List<Estudiante> buscarTodos() {
        return estudianteIDao.buscarTodos();
    }


}
