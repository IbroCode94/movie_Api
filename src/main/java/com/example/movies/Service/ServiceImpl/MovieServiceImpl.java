package com.example.movies.Service.ServiceImpl;

import com.example.movies.Repository.MovieRepository;
import com.example.movies.Service.MovieService;
import com.example.movies.model.Movie;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class MovieServiceImpl implements MovieService {
    private final MovieRepository movieRepository;
    @Override
    public List<Movie> allMovies() {
        return movieRepository.findAll();
    }
}
