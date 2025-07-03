

public class Main {
    public static void main (String[] args)
    {
        Processor intelCPU = new Processor(11, "intelCore");
       
        Processor nvidiaGPU = new Processor(2021, "nvidia");
       
        Processor amdGPU = new Processor(23, "amd" ); // can exist independently
       
        RandomAccessMemory ramIn = new RandomAccessMemory("DDR", 2);
       
        HardDiskDrive sddIn = new HardDiskDrive(600, "sdd5");
       
        //association
        Laptop macBook = new Laptop("mac","ios",intelCPU, nvidiaGPU, ramIn, sddIn);

    }
}