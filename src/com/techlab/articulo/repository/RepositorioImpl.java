package com.techlab.articulo.repository;

import com.techlab.articulo.interfaces.Identificable;
import java.util.ArrayList;
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
public class RepositorioImpl<T extends Identificable> implements Repositorio<T> {

    private final ArrayList<T> lista = new ArrayList<>();

    // Implementar método agregar.
    @Override
    public void agregar(T objeto) throws IllegalArgumentException {
        if (objeto == null) {
            throw new IllegalArgumentException("El objeto a agregar no puede ser nulo");
        }

        if (buscarPorCodigo(objeto.getCodigo()) != null) {
            throw new IllegalArgumentException("El objeto ya existe en el listado");
        }

        lista.add(objeto);
    }

    // Implementar método listar.
    @Override
    public List<T> listar() {
        return new ArrayList<>(lista);
    }

    // Implementar método buscarPorCodigo.
    @Override
    public T buscarPorCodigo(String codigo) {
        for (T objeto : lista) {
            if (objeto.getCodigo().equals(codigo)) {
                return objeto;
            }
        }

        return null;
    }

    // Implementar método eliminar.
    @Override
    public void eliminar(T objeto) {
        if (objeto == null) {
            throw new IllegalArgumentException("El objeto a eliminar no puede ser nulo");
        }

        if (buscarPorCodigo(objeto.getCodigo()) == null) {
            throw new IllegalArgumentException("El objeto no existe en el listado");
        }

        lista.remove(objeto);
    }

    // Implementar método estaVacio.
    @Override
    public boolean estaVacio() {
        return lista.isEmpty();
    }
}
