/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.thogakade.service.custom;

import java.util.ArrayList;
import lk.ijse.thogakade.dto.OrderDTO;
import lk.ijse.thogakade.dto.OrderdetailDTO;
import lk.ijse.thogakade.service.SuperService;

/**
 *
 * @author student
 */
public interface OrderService extends SuperService<OrderDTO>{

    public boolean saveOrder(OrderDTO orderDTO, ArrayList<OrderdetailDTO> orderdetailDTOs)throws Exception;

    
}
