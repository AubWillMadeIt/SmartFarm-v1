import java.util.ArrayList;
import java.util.List;

public class FarmEnvironmentSimulator {

    private List<CropStatus> cropStatusList;

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
            crop.setPestPresence(false); // Initially no pests present
            crop.setPHLevel(6.5); // Initial pH level is set to 6.5
            cropStatusList.add(crop);
        }
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

        // Method to analyze crop status and return status string
        public String analyzeCropStatus() {
            StringBuilder status = new StringBuilder();

            // Analyze light intensity
            if (lightIntensity >= 80 && lightIntensity <= 120) {
                status.append("Light intensity: Suitable, ");
            } else if (lightIntensity < 80) {
                status.append("Light intensity: Low, ");
            } else {
                status.append("Light intensity: High, ");
            }

            // Analyze humidity
            if (humidity >= 60 && humidity <= 80) {
                status.append("Humidity: Suitable, ");
            } else if (humidity < 60) {
                status.append("Humidity: Low, ");
            } else {
                status.append("Humidity: High, ");
            }

            // Analyze soil fertility
            if (soilFertility >= 0.6 && soilFertility <= 0.8) {
                status.append("Soil fertility: Suitable, ");
            } else if (soilFertility < 0.6) {
                status.append("Soil fertility: Low, ");
            } else {
                status.append("Soil fertility: High, ");
            }

            // Analyze pest presence
            if (!pestPresence) {
                status.append("Pest presence: None");
            } else {
                status.append("Pest presence: Present");
            }

            return status.toString();
        }
    }
}
