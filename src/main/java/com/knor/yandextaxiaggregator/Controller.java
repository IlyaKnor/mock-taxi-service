package com.knor.yandextaxiaggregator;


import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/taxi")
public class Controller {
    @PostMapping("/order")
    public ResponseEntity<?> getOffer() {
        return ResponseEntity.status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body("{\n" +
                        "  \"offer_id\": \"123\",\n" +
                        "  \"currency\": \"RUB\",\n" +
                        "  \"distance\": 61529.771101536542,\n" +
                        "  \"options\": [\n" +
                        "    {\n" +
                        "      \"class_level\": 50,\n" +
                        "      \"class_name\": \"econom\",\n" +
                        "      \"class_text\": \"Эконом\",\n" +
                        "      \"min_price\": 495,\n" +
                        "      \"price\": 10945,\n" +
                        "      \"price_text\": \"10945 руб.\",\n" +
                        "      \"waiting_time\": 203.98798614740372\n" +
                        "    }\n" +
                        "  ],\n" +
                        "  \"time\": 3816.9397069215775\n" +
                        "}");
    }

    @PostMapping("/offer")
    public ResponseEntity<?> getOrder() {
        return ResponseEntity.status(HttpStatus.ACCEPTED)
                .contentType(MediaType.APPLICATION_JSON)
                .body("{\n" +
                        "\"order_id\":\"123\",\n" +
                        "\"driver\": {\n" +
                        "  \"phone_number\": \"88005553535\",\n" +
                        "  \"rating\": 5,\n" +
                        "  \"picture_url\": \"https://d1w2poirtb3as9.cloudfront.net/img.jpeg\",\n" +
                        "  \"name\": \"Bob\"\n" +
                        "},\n" +
                        "\"vehicle\": {\n" +
                        "  \"make\": \"Nissan\",\n" +
                        "  \"model\": \"Solaris\",\n" +
                        "  \"color\": \"White\",\n" +
                        "  \"vehicle_number\": \"АР 529 46\"\n" +
                        "},\n" +
                        "\"pickup\": {\n" +
                        "  \"latitude\": 37.3303463,\n" +
                        "  \"longitude\": -121.8890484\n" +
                        "},\n" +
                        "\"destinations\": [\n" +
                        " {\n" +
                        "  \"latitude\": 37.6213129,\n" +
                        "  \"longitude\": -122.3789554\n" +
                        "}\n" +
                        "  ]\n" +
                        "}");
    }
}
