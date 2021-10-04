package com.enigma.enigma.Controller;
import com.enigma.enigma.Model.Device;
import com.enigma.enigma.Service.DeviceServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


@RestController
@RequestMapping("/device")
@AllArgsConstructor
public class findDeviceByIdController {

    private DeviceServiceImpl deviceService;
    @RequestMapping(value= {"/getDeviceByID/{id}"}, method= RequestMethod.GET)
    public Optional<Device> getDeviceById(@PathVariable Long id) {
        return deviceService.getDeviceById(id);
    }

}
