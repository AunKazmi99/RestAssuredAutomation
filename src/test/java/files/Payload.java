package files;

public class Payload {
    public static String AddPlace() {
        return "{\n" +
                "  \"location\": {\n" +
                "    \"lat\": -38.383494,\n" +
                "    \"lng\": 33.427362\n" +
                "  },\n" +
                "  \"accuracy\": 50,\n" +
                "  \"name\": \"Frontline house\",\n" +
                "  \"phone_number\": \"(+91) 983 893 3937\",\n" +
                "  \"address\": \"29, side layout, cohen 09\",\n" +
                "  \"types\": [\n" +
                "    \"shoe park\",\n" +
                "    \"shop\"\n" +
                "  ],\n" +
                "  \"website\": \"http://google.com\",\n" +
                "  \"language\": \"French-IN\"\n" +
                "}";
    }

    public static String updatePlace() {
        return "{\n" +
                "\"place_id\":\"4cd322a1c5c532519f9536a7336cca3d\",\n" +
                "\"address\":\"70 Summer walk, USA\",\n" +
                "\"key\":\"qaclick123\"\n" +
                "}";
    }

    public static String coursePrice() {

        return "{\n" +
                "    \"dashboard\": {\n" +
                "        \"purchaseAmount\": 910,\n" +
                "        \"website\": \"rahulshettyacademy.com\"\n" +
                "    },\n" +
                "    \"courses\": [\n" +
                "        {\n" +
                "            \"title\": \"Selenium Python\",\n" +
                "            \"price\": 50,\n" +
                "            \"copies\": 6\n" +
                "        },\n" +
                "        {\n" +
                "            \"title\": \"Cypress\",\n" +
                "            \"price\": 40,\n" +
                "            \"copies\": 4\n" +
                "        },\n" +
                "        {\n" +
                "            \"title\": \"RPA\",\n" +
                "            \"price\": 45,\n" +
                "            \"copies\": 10\n" +
                "        }\n" +
                "    ]\n" +
                "}";
    }

    public static String addBook(String isbn, String aisle) {
        return "{\n" +
                "    \"name\": \"Learn Appium Automation with Java\",\n" +
                "    \"isbn\": \"" + isbn + "\",\n" +
                "    \"aisle\": \"" + aisle + "\",\n" +
                "    \"author\": \"John foe\"\n" +
                "}";
    }

    public static String createBug(String summary, String description) {
        return "{\n" +
                "    \"fields\": {\n" +
                "        \"project\": {\n" +
                "            \"key\": \"SCRUM\"\n" +
                "        },\n" +
                "        \"summary\": \"" + summary + "\",\n" +
                "        \"description\": {\n" +
                "            \"content\": [\n" +
                "                {\n" +
                "                    \"content\": [\n" +
                "                        {\n" +
                "                            \"text\": \"" + description + "\",\n" +
                "                            \"type\": \"text\"\n" +
                "                        }\n" +
                "                    ],\n" +
                "                    \"type\": \"paragraph\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"type\": \"doc\",\n" +
                "            \"version\": 1\n" +
                "        },\n" +
                "        \"issuetype\": {\n" +
                "            \"name\": \"Bug\"\n" +
                "        }\n" +
                "    }\n" +
                "}";
    }

}
