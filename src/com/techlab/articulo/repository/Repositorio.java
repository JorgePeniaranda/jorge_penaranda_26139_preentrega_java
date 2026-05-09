package com.techlab.articulo.repository;

import com.techlab.articulo.interfaces.Identificable;
import java.util.List;

/**
 * CONSIGNA DE ESTA CLASE
 * ------------------------------------------------------------
 * Esta clase debe ser GENÉRICA.
 *
 * Debe modelarse así:
 * Repositorio<T extends Identificable>
 *
 * ¿Qué significa eso?
 * Que podrá trabajar con distintos tipos de objetos, siempre que esos
 * objetos tengan código.
 *
 * EJEMPLOS DE USO ESPERADOS
 * ------------------------------------------------------------
 * - Repositorio<Categoria>
 * - Repositorio<Articulo>
 *
 * ESTA CLASE DEBE GUARDAR LOS DATOS EN MEMORIA
 * ------------------------------------------------------------
 * Usando:
 * - ArrayList<T>
 *
 * MÉTODOS MÍNIMOS ESPERADOS
 * ------------------------------------------------------------
 * - agregar(T objeto)
 * - listar()
 * - buscarPorCodigo(int codigo)
 * - eliminar(T objeto)
 * - estaVacio()
 *
 * OBJETIVO DIDÁCTICO
 * ------------------------------------------------------------
 * Esta clase prepara el terreno para entender luego estructuras como:
 * JpaRepository<T, ID> en Spring Boot.
 */
public interface Repositorio<T extends Identificable> {
    // Implementar método agregar.
    public void agregar(T objeto);

    // Implementar método listar.
    public List<T> listar();

    // Implementar método buscarPorCodigo.
    public T buscarPorCodigo(String codigo);

    // Implementar método eliminar.
    public void eliminar(T objeto);

    // Implementar método estaVacio.
    public boolean estaVacio();
}
