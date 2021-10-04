package com.enigma.enigma.Controller;
import com.enigma.enigma.Model.Device;
import com.enigma.enigma.Service.DeviceServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/device")
@RequiredArgsConstructor
public class CreateDeviceController {

    private final DeviceServiceImpl deviceService;

    @RequestMapping(value = {"/createDevice"}, method = RequestMethod.POST)
    public void createDevice(@RequestBody Device device){
        deviceService.createDevice(device);
    }
}
