package com.epam.com.model;

import org.checkerframework.checker.units.qual.C;

import java.util.Objects;

public class Calculator {
    private String numberOfInstances;
//    private String operatingSystem;
//    private String machineClass;
//
//    private String machineSeries;
//    private String machineType;
//    private String numberOfGpus;
//    private String gpuType;
//    private String localSSD;
//    private String datacenterLocation;
//    private String committedUsage;
//
//

    public Calculator(String numberOfInstances)
    {
        this.numberOfInstances = numberOfInstances;
    }

    /*public Calculator(String numberOfInstances, String operatingSystem, String machineClass, String machineSeries, String machineType,
                      String numberOfGpus, String gpuType, String localSSD, String datacenterLocation,
                      String committedUsage) {
        this.numberOfInstances = numberOfInstances;
        this.operatingSystem = operatingSystem;
        this.machineClass = machineClass;
        this.machineSeries = machineSeries;
        this.machineType = machineType;
        this.numberOfGpus = numberOfGpus;
        this.gpuType = gpuType;
        this.localSSD = localSSD;
        this.datacenterLocation = datacenterLocation;
        this.committedUsage = committedUsage;
    }*/


    public String getNumberOfInstances() {
        return numberOfInstances;
    }

    public void setNumberOfInstances(String numberOfInstances) {
        this.numberOfInstances = numberOfInstances;
    }
//
//    public String getOperatingSystem() {
//        return operatingSystem;
//    }
//
//    public void setOperatingSystem(String operatingSystem) {
//        this.operatingSystem = operatingSystem;
//    }
//
//    public String getMachineClass() {
//        return machineClass;
//    }
//
//    public void setMachineClass(String machineClass) {
//        this.machineClass = machineClass;
//    }

   // public String getMachineSeries() {
//        return machineSeries;
//    }
//
//    public void setMachineSeries(String machineSeries) {
//        this.machineSeries = machineSeries;
//    }
//
//    public String getMachineType() {
//        return machineType;
//    }
//
//    public void setMachineType(String machineType) {
//        this.machineType = machineType;
//    }
//
//    public String getNumberOfGpus() {
//        return numberOfGpus;
//    }
//
//    public void setNumberOfGpus(String numberOfGpus) {
//        this.numberOfGpus = numberOfGpus;
//    }
//
//    public String getGpuType() {
//        return gpuType;
//    }
//
//    public void setGpuType(String gpuType) {
//        this.gpuType = gpuType;
//    }
//
//    public String getLocalSSD() {
//        return localSSD;
//    }
//
//    public void setLocalSSD(String localSSD) {
//        this.localSSD = localSSD;
//    }
//
//    public String getDatacenterLocation() {
//        return datacenterLocation;
//    }
//
//    public void setDatacenterLocation(String datacenterLocation) {
//        this.datacenterLocation = datacenterLocation;
//    }
//
//    public String getCommittedUsage() {
//        return committedUsage;
//    }
//
//    public void setCommittedUsage(String committedUsage) {
//        this.committedUsage = committedUsage;
//    }
//
//    @Override
//    public String toString() {
//        return "Calculator{" +
//                "numberOfInstances='" + numberOfInstances + '\'' +
//                ", operatingSystem='" + operatingSystem + '\'' +
//                ", machineClass='" + machineClass + '\'' +
//                ", machineType='" + machineType + '\'' +
//                ", numberOfGpus='" + numberOfGpus + '\'' +
//                ", gpuType='" + gpuType + '\'' +
//                ", localSSD='" + localSSD + '\'' +
//                ", datacenterLocation='" + datacenterLocation + '\'' +
//                ", committedUsage='" + committedUsage + '\'' +
//                '}';
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Calculator that = (Calculator) o;
//        return numberOfInstances.equals(that.numberOfInstances) && operatingSystem.equals(that.operatingSystem) && machineClass.equals(that.machineClass) && machineSeries.equals(that.machineSeries) && machineType.equals(that.machineType) && numberOfGpus.equals(that.numberOfGpus) && gpuType.equals(that.gpuType) && localSSD.equals(that.localSSD) && datacenterLocation.equals(that.datacenterLocation) && committedUsage.equals(that.committedUsage);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(numberOfInstances, operatingSystem, machineClass, machineSeries, machineType, numberOfGpus, gpuType, localSSD, datacenterLocation, committedUsage);
//    }



}
