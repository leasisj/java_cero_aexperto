package org.ijimenez.poointerfaces.reposito;

public interface OrdenablePaginableCrudRepositorio<T> extends CrudRepositorio<T>,OrdenableRepositorio<T>, PaginableRepositorio<T>{
	
}
