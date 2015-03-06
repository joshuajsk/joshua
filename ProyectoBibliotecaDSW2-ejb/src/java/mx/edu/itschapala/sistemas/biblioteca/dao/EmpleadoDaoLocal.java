/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.edu.itschapala.sistemas.biblioteca.dao;

import java.util.List;
import javax.ejb.Local;
import mx.edu.itschapala.sistemas.biblioteca.modelo.Empleado;

/**
 *
 * @author Instituto
 */
@Local
public interface EmpleadoDaoLocal {

    void crear(Empleado empleado);

    void editar(Empleado empleado);

    void remover(Empleado empleado);

    Empleado buscarPorId(Object id);

    List<Empleado> buscarTodos();

    List<Empleado> buscarRango(int[] range);

    int contar();
    
}
