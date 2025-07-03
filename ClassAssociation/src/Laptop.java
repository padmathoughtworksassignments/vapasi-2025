

public class Laptop {
    String nameLaptop;
    String os;
   
    Processor gpu, cpu;
    RandomAccessMemory ram;
    HardDiskDrive hdd;
   
    Laptop(String nameLaptopInput, String osInput,
           Processor cpuInput, Processor gpuInput,
           RandomAccessMemory ramInput,
           HardDiskDrive hddInput)
    {
        nameLaptop = nameLaptopInput;
        os = osInput;
       
        cpu = cpuInput;
        gpu = gpuInput;
       
        ram = ramInput;
        hdd = hddInput;
       
    }
   
}