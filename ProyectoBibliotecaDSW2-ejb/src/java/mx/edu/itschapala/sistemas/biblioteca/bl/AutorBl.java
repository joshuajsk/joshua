/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.edu.itschapala.sistemas.biblioteca.bl;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import mx.edu.itschapala.sistemas.biblioteca.dao.AutorDaoLocal;
import mx.edu.itschapala.sistemas.biblioteca.modelo.Autor;

/**
 *
 * @author Instituto
 */
@Stateless
public class AutorBl implements AutorBlLocal {
    @EJB
    private AutorDaoLocal autorDao;

    @Override
    public boolean registrar(Autor autor) {
        autorDao.crear(autor);
        return true;
    }
    
    

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public boolean eliminar(Autor autor) {
        autorDao.remover(autor);
        return true;
    }

    @Override
    public boolean modificar(Autor autor) {
       autorDao.editar(autor);
        return true;
    }

    @Override
    public List<Autor> getLista() {
        return autorDao.buscarTodos();
    }

    @Override
    public Autor getPorId(int id) {
        return autorDao.buscarPorId(id);
    }
    
    
}
