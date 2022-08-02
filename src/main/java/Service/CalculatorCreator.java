package Service;

import com.epam.com.model.Calculator;

public class CalculatorCreator {

    public static final String NUMBER_OF_INSTANCES = "testData.valueOfNumberOfInstances";
    public static final String OPERATING_SYSTEM = "testData.valueOfOperatingSystem";
    public static final String MACHINE_CLASS = "testData.valueOfMachineClass";
    public static final String MACHINE_SERIES = "testData.valueOfMachineSeries";
    public static final String MACHINE_TYPE = "testData.valueOfMachineType";
    public static final String GPU_TYPE = "testData.valueOfGpuType";
    public static final String NUMBER_OF_GPUS = "testData.valueOfNumberOfGpus";
    public static final String LOCAL_SSD = "testData.valueOfLocalSSD";
    public static final String DATACENTER_LOCATION = "testData.valueOfDatacenterLocation";
    public static final String COMMITTED_USAGE = "testData.valueOfCommittedUsage";



    public static Calculator withCredentialsFromProperty() {
        return new Calculator(TestDataReader.getTestData(NUMBER_OF_INSTANCES), TestDataReader.getTestData(OPERATING_SYSTEM),
                TestDataReader.getTestData(MACHINE_CLASS), TestDataReader.getTestData(MACHINE_SERIES), TestDataReader.getTestData(MACHINE_TYPE),
                TestDataReader.getTestData(GPU_TYPE), TestDataReader.getTestData(NUMBER_OF_GPUS),
                TestDataReader.getTestData(LOCAL_SSD), TestDataReader.getTestData(DATACENTER_LOCATION),
                TestDataReader.getTestData(COMMITTED_USAGE));
    }
}
