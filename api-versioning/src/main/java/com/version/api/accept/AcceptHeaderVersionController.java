package com.version.api.accept;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/header/accept")
public class AcceptHeaderVersionController {

	@GetMapping(value = "/versions", produces = CustomMediaType.DOUBLE_B_API_VERSION_1_VALUE)
	public ResponseEntity<List<String>> getVersionsV1() {
		return ResponseEntity.ok(List.of("v1.1", "v1.2", "v1.3"));
	}

	@GetMapping(value = "/versions", produces = CustomMediaType.DOUBLE_B_API_VERSION_2_VALUE)
	public ResponseEntity<List<String>> getVersionsV2() {
		return ResponseEntity.ok(List.of("v2.1", "v2.2", "v2.3"));
	}

}
