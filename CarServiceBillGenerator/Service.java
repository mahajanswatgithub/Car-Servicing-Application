public class Service {
    private String serviceCode;
    private String serviceName;
    private int hatchbackPrice;
    private int sedanPrice;
    private int suvPrice;

    public Service(String serviceCode, String serviceName, int hatchbackPrice, int sedanPrice, int suvPrice) {
        this.serviceCode = serviceCode;
        this.serviceName = serviceName;
        this.hatchbackPrice = hatchbackPrice;
        this.sedanPrice = sedanPrice;
        this.suvPrice = suvPrice;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public int getPrice(String carType) {
        if (carType.equals("Hatchback")) {
            return hatchbackPrice;
        } else if (carType.equals("Sedan")) {
            return sedanPrice;
        } else if (carType.equals("SUV")) {
            return suvPrice;
        }
        return 0;
    }
}

