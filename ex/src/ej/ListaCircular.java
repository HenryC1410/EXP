package ej;

public class ListaCircular {
    Nodo cabeza = null;

    public void agregarCodigo(int codigo) {
        Nodo nuevo = new Nodo(codigo);
        if (cabeza == null) {
            cabeza = nuevo;
            cabeza.siguiente = cabeza;
        } else if (cabeza.codigo > codigo) {
            Nodo temp = cabeza;
            while (temp.siguiente != cabeza) {
                temp = temp.siguiente;
            }
            nuevo.siguiente = cabeza;
            cabeza = nuevo;
            temp.siguiente = cabeza;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != cabeza && actual.siguiente.codigo < codigo) {
                actual = actual.siguiente;
            }
            nuevo.siguiente = actual.siguiente;
            actual.siguiente = nuevo;
        }
    }

    public boolean buscarCodigo(int codigo) {
        if (cabeza == null) {
            return false;
        }
        Nodo actual = cabeza;
        do {
            if (actual.codigo == codigo) {
                return true;
            }
            actual = actual.siguiente;
        } while (actual != cabeza);
        return false;
    }

    public void imprimirTodo() {
        if (cabeza == null) {
            System.out.println("La lista está vacía.");
            return;
        }
        Nodo actual = cabeza;
        do {
            System.out.println("Código: " + actual.codigo);
            actual = actual.siguiente;
        } while (actual != cabeza);
    }
}
