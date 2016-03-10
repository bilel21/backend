package org.example.ws.web.api;

import java.util.List;

import org.example.ws.model.Post;
import org.example.ws.service.PostService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private PostService postService;
	
	@RequestMapping(
			value = "api.posts",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE
			)
	public ResponseEntity<List<Post>> getPosts(){
		logger.info(" > getPots");
		List<Post> posts = postService.getPosts();
		logger.info(" < getPots");
		return new ResponseEntity<>(posts, HttpStatus.OK);
	}
}
