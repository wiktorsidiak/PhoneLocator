package com.enigma.enigma.Service;
import com.enigma.enigma.Model.Device;
import java.util.Optional;

public interface DeviceService {

    Device createDevice(Device device);

Optional<Device> getDeviceById(Long id);
}
