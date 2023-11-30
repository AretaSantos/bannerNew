package com.example.banner;

import java.net.URISyntaxException;

import org.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@CrossOrigin(origins = "http://localhost:3000/")
@RestController
public class BannerController {

	@GetMapping("/banner-data")
	public ResponseEntity<?> getBannerData() throws URISyntaxException {

		String url = "https://jobly.almamedia.fi/nostobannerit/almabanner/600x500/index.php?title=Asiakasvastaava%20OPISKELIJAT%20HUOMIO,%204%20paikkaa&company=Superior%20Sales%20Oy&logourl=https://www.jobly.fi/sites/default/files/styles/squared_logo_wide_1x/public/company_logos/superiorsales-logo-black-bg.jpg?itok=QYnkIxu1";

		JSONObject urlJson = BannerService.urlToJson(url);
		//System.out.println(urlJson);

		return ResponseEntity.ok(urlJson.toString());
	}

}
