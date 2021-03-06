/**
 * 
 */
package org.springframework.social.har.dto.mocks;

import static org.springframework.http.HttpHeaders.CONTENT_TYPE;
import static org.springframework.http.HttpStatus.OK;
import static org.springframework.http.MediaType.TEXT_HTML_VALUE;
import static org.springframework.social.har.dto.mocks.MockHarResponses.helloWorldHtmlContent;
import static org.springframework.social.har.dto.mocks.MockHttpHeaders.tenHttpHeaders;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;

/**
 * @author robin
 *
 */
public class MockResponseEntities {
	
	public static final ResponseEntity<Object> responseEntityWithTenHeadersAndHelloWorldHtml() {
		return new ResponseEntity<Object>(helloWorldHtmlContent().getText(), tenHttpHeaders("20"), OK);
	}
	
	public static final ResponseEntity<Object> responseEntityWithContentTypeHeaderAndHelloWorldHtml() {
		HttpHeaders headers = new HttpHeaders();
		headers.add(CONTENT_TYPE, TEXT_HTML_VALUE);
		
		return new ResponseEntity<Object>(helloWorldHtmlContent().getText(), headers, OK);
	}

}
