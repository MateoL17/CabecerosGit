package services;

/*
* clase donde se va a implementar los metodos de la interfaz y de la clase
* que funciona como modelo
* */

import models.Producto;

import java.util.Arrays;
import java.util.List;

public class ProductosServicesImplements implements ProductoServices {
    @Override
    public List<Producto> listar() {
        return Arrays.asList(new Producto(1L, "Laptop", "Computacion", 256.35),
                new Producto(2L, "Mouse", "Computacion", 25.50),
                new Producto(3L, "Cocina", "Electrodomestico", 85.50));
    }
}
