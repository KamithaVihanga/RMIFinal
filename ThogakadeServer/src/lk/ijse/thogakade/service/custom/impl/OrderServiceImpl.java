/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.thogakade.service.custom.impl;


import java.util.ArrayList;
import lk.ijse.thogakade.bisnuss.BOFactory;
import lk.ijse.thogakade.bisnuss.custom.OrderBO;
import lk.ijse.thogakade.dto.OrderDTO;
import lk.ijse.thogakade.service.custom.OrderService;

/**
 *
 * @author Pramod Dilshan
 */
public class OrderServiceImpl implements OrderService{
    
    private OrderBO orderBO;

    public OrderServiceImpl() throws Exception {
        try {
            orderBO = (OrderBO) BOFactory.getInstance().getBOTypes(BOFactory.BOType.ORDER);
        } catch (Exception ex) {

        }
    }

    @Override
    public boolean save(OrderDTO t) throws Exception {
        return orderBO.save(t);
    }

    @Override
    public boolean update(OrderDTO t) throws Exception {
        return orderBO.update(t);
    }

    @Override
    public boolean delete(String id) throws Exception {
        return orderBO.delete(id);
    }

    @Override
    public OrderDTO getbyId(String id) throws Exception {
        return orderBO.getbyId(id);
    }

    @Override
    public ArrayList<OrderDTO> get() throws Exception {
        return orderBO.get();
    }
}
