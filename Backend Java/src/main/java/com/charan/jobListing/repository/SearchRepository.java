package com.charan.jobListing.repository;
import com.charan.jobListing.model.Post;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);

}