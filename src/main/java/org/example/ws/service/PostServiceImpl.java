package org.example.ws.service;

import java.util.List;

import org.example.ws.model.Post;
import org.example.ws.repository.PostRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(
		propagation = Propagation.SUPPORTS,
		readOnly = true
		)
public class PostServiceImpl implements PostService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private PostRepository postRepository;
	
	@Override
	public List<Post> getPosts() {
		logger.info(" > getPosts");
		return postRepository.findAll();
	}

}
