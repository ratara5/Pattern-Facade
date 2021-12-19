package com.raymond.facade;

import com.raymond.api.AvionAPI;
import com.raymond.api.HotelAPI;

public class CheckFacade {

    private AvionAPI avionAPI;
    private HotelAPI hotelAPI;

    public CheckFacade(){
        avionAPI=new AvionAPI();
        hotelAPI=new HotelAPI();
    }

    public void buscar(String fechaida, String fechavuelta, String origen, String destino){
        avionAPI.buscarVuelos(fechaida, fechavuelta, origen, destino);
        hotelAPI.buscarHoteles(fechaida, fechavuelta, origen, destino);
    }

}
