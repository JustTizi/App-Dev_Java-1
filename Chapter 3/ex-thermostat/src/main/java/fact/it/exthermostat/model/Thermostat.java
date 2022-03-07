package fact.it.exthermostat.model;

public class Thermostat {
    private int temperature;
    private int maxTemp;
    private int minTemp;
    private int increment;

    public Thermostat(int temperature, int maxTemp, int minTemp, int increment) {
        if (maxTemp > minTemp){
            this.maxTemp = maxTemp;
            this.minTemp = minTemp;
        }
        else {
            this.maxTemp = minTemp;
            this.minTemp = maxTemp;
        }

        if (temperature > this.minTemp && temperature < this.maxTemp) {
            this.temperature = temperature;
        }
        else {
            this.temperature = (minTemp+maxTemp)/2;
        }

        this.increment = Math.abs(increment);
    }

    public int getTemperature() {
        return temperature;
    }

    public int getMaxTemp() {
        return maxTemp;
    }

    public int getMinTemp() {
        return minTemp;
    }

    public int getIncrement() {
        return increment;
    }

    public void setIncrement(int increment) {
        this.increment = Math.abs(increment);
    }

    public void warmer() {
        if ((this.temperature + this.increment) > this.maxTemp){
            this.temperature = this.maxTemp;
        }
        else {
            this.temperature += this.increment;
        }
    }

    public void colder() {
        if ((this.temperature - this.increment) < this.minTemp){
            this.temperature = this.minTemp;
        }
        else {
            this.temperature -= this.increment;
        }
    }
    public void warmer(int incrementTemp) {
        if ((this.temperature + incrementTemp) > this.maxTemp){
            this.temperature = this.maxTemp;
        }
        else {
            this.temperature += incrementTemp;
        }
    }

    public void colder(int decrement) {
        if ((this.temperature - decrement) < this.minTemp){
            this.temperature = this.minTemp;
        }
        else {
            this.temperature -= decrement;
        }
    }
}
