import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class FarmEnvironmentSimulator {

    private List<CropStatus> cropStatusList;

    private ScheduledExecutorService executorService;
    private static final double MAX_CHANGE_THRESHOLD = 0.5; // Maximum change threshold for each property

    // Constructor to initialize the crop status list with 10 blocks
    public FarmEnvironmentSimulator() {
        cropStatusList = new ArrayList<>();
        // Initialize 10 crop blocks
        for (int i = 1; i <= 10; i++) {
            CropStatus crop = new CropStatus();
            crop.setBlockId(i);
            crop.setLightIntensity(100.0); // Initial light intensity is set to 100.0
            crop.setHumidity(70.0); // Initial humidity is set to 70.0
            crop.setSoilFertility(0.7); // Initial soil fertility is set to 0.7
            crop.setPestPresence(true); // Initially no pests present
            crop.setPHLevel(6.5); // Initial pH level is set to 6.5
            cropStatusList.add(crop);
        }
        executorService = Executors.newSingleThreadScheduledExecutor();
        executorService.scheduleAtFixedRate(this::simulateEnvironmentChange, 0, 50, TimeUnit.SECONDS);
    }

    // Method to get the status of a specific crop block
    public CropStatus getBlockStatus(int blockId) {
        for (CropStatus cropStatus : cropStatusList) {
            if (cropStatus.getBlockId() == blockId) {
                return cropStatus;
            }
        }
        return null; // Return null if blockId not found
    }

    // Method to get the statuses of all crop blocks
    public List<CropStatus> getAllStatuses() {
        return cropStatusList;
    }

    // Method to set pest presence for a specific crop block
    public void setPestPresence(int blockId, boolean presence) {
        CropStatus cropStatus = getBlockStatus(blockId);
        if (cropStatus != null) {
            cropStatus.setPestPresence(presence);
        }
    }

    // Method to set pH level for a specific crop block
    public void setPhLevel(int blockId, double pHLevel) {
        CropStatus cropStatus = getBlockStatus(blockId);
        if (cropStatus != null) {
            cropStatus.setPHLevel(pHLevel);
        }
    }

    // Method to set light intensity for a specific crop block
    public void setLightIntensity(int blockId, double lightIntensity) {
        CropStatus cropStatus = getBlockStatus(blockId);
        if (cropStatus != null) {
            cropStatus.setLightIntensity(lightIntensity);
        }
    }

    // Method to change humidity for a specific crop block
    public void changeHumidity(int blockId, double delta) {
        CropStatus cropStatus = getBlockStatus(blockId);
        if (cropStatus != null) {
            cropStatus.setHumidity(cropStatus.getHumidity() + delta);
        }
    }

    // Method to change soil fertility for a specific crop block
    public void changeSoilFertility(int blockId, double delta) {
        CropStatus cropStatus = getBlockStatus(blockId);
        if (cropStatus != null) {
            cropStatus.setSoilFertility(cropStatus.getSoilFertility() + delta);
        }
    }

    // Method to change humidity for all crop blocks
    public void changeAllHumidity(double delta) {
        for (CropStatus cropStatus : cropStatusList) {
            cropStatus.setHumidity(cropStatus.getHumidity() + delta);
        }
    }

    // Method to change soil fertility for all crop blocks
    public void changeAllSoilFertility(double delta) {
        for (CropStatus cropStatus : cropStatusList) {
            cropStatus.setSoilFertility(cropStatus.getSoilFertility() + delta);
        }
    }

    // Method to simulate environment change
    private void simulateEnvironmentChange() {
        Random random = new Random();
        for (CropStatus cropStatus : cropStatusList) {
            double lightIntensityChange = generateRandomChange(random);
            double humidityChange = generateRandomChange(random);
            double soilFertilityChange = generateRandomChange(random);
            boolean pestPresenceChange = random.nextBoolean();
            double pHLevelChange = generateRandomChange(random);

            cropStatus.setLightIntensity(cropStatus.getLightIntensity() + lightIntensityChange);
            cropStatus.setHumidity(cropStatus.getHumidity() + humidityChange);
            cropStatus.setSoilFertility(cropStatus.getSoilFertility() + soilFertilityChange);
            cropStatus.setPestPresence(pestPresenceChange);
            cropStatus.setPHLevel(cropStatus.getPHLevel() + pHLevelChange);
        }
    }

    // Method to generate random change within a threshold
    private double generateRandomChange(Random random) {
        double change = (random.nextDouble() - 0.5) * MAX_CHANGE_THRESHOLD;
        return change;
    }


    // Inner class representing the status of a crop block
    class CropStatus {
        private int blockId;
        private double lightIntensity;
        private double humidity;
        private double soilFertility;
        private boolean pestPresence;
        private double pHLevel;

        // Getter and setter methods for blockId
        public int getBlockId() {
            return blockId;
        }

        public void setBlockId(int blockId) {
            this.blockId = blockId;
        }

        // Getter and setter methods for lightIntensity
        public double getLightIntensity() {
            return lightIntensity;
        }

        public void setLightIntensity(double lightIntensity) {
            this.lightIntensity = lightIntensity;
        }

        // Getter and setter methods for humidity
        public double getHumidity() {
            return humidity;
        }

        public void setHumidity(double humidity) {
            this.humidity = humidity;
        }

        // Getter and setter methods for soilFertility
        public double getSoilFertility() {
            return soilFertility;
        }

        public void setSoilFertility(double soilFertility) {
            this.soilFertility = soilFertility;
        }

        // Getter and setter methods for pestPresence
        public boolean isPestPresence() {
            return pestPresence;
        }

        public void setPestPresence(boolean pestPresence) {
            this.pestPresence = pestPresence;
        }

        // Getter and setter methods for pHLevel
        public double getPHLevel() {
            return pHLevel;
        }

        public void setPHLevel(double pHLevel) {
            this.pHLevel = pHLevel;
        }
    }
}
