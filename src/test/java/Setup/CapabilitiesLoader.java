package Setup;
import org.json.JSONObject;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class CapabilitiesLoader {

    public DesiredCapabilities loadCapabilities(String jsonFilePath) throws IOException {
        // Load the JSON file content as a string
        String content = new String(Files.readAllBytes(Paths.get(jsonFilePath)));
        System.out.println("capabilitiesJson: " + content);

        // Parse the JSON string into a JSONObject
        JSONObject capabilitiesObject = new JSONObject(content);

        // Create DesiredCapabilities object
        DesiredCapabilities capabilities = new DesiredCapabilities();

        // Loop through the JSON and add each property to DesiredCapabilities
        capabilitiesObject.keys().forEachRemaining(key -> {
            Object value = capabilitiesObject.get(key);
            if (value instanceof JSONObject) {
                // If the value is a nested JSON (like "goog:chromeOptions"), handle it
                JSONObject nestedObject = (JSONObject) value;
                nestedObject.keys().forEachRemaining(innerKey -> {
                    capabilities.setCapability(innerKey, nestedObject.get(innerKey));
                });
            } else {
                capabilities.setCapability(key, value);
            }
        });

        // Return the final DesiredCapabilities object
        return capabilities;
    }
}
