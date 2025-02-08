package com.csc340.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class BeerController {

    // URL of the third-party API
    private static final String API_URL = "https://random-data-api.com/api/v2/beers";

    // GET mapping that returns a single Beer object
    @GetMapping("/beer")
    public Beer getBeer() {
        // Create a RestTemplate to make the API call
        RestTemplate restTemplate = new RestTemplate();

        // Make a GET request to the external API
        Beer beer = restTemplate.getForObject(API_URL, Beer.class);

        // Return the Beer object
        return beer;
    }
}
