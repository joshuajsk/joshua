/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.edu.itschapala.sistemas.biblioteca.bl;

import java.util.List;
import javax.ejb.Local;
import mx.edu.itschapala.sistemas.biblioteca.modelo.Usuario;

/**
 *
 * @author Instituto
 */
@Local
public interface usuarioLocal {

    boolean registrar(Usuario usuario);

    boolean eliminar(Usuario usuario);

    boolean modificar(Usuario usuario);

    List<Usuario> getList();

    Usuario buscarPorId(int id);
    
}
