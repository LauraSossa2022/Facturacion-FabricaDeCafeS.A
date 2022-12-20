package com.unab.app.interfaces;

import java.util.List;

import com.unab.app.models.DetalleFactura;

public interface IDetalleFacturaService {
	
	public void save(DetalleFactura detalleFactura);
	
	public List<DetalleFactura> findDetalleFacturaByIdFacturaByIdProducto(Long id_factura, Long id_producto);
<<<<<<< HEAD
}
=======
}
>>>>>>> 564036f9ecb251729d33cc564710cd95c35beabf
