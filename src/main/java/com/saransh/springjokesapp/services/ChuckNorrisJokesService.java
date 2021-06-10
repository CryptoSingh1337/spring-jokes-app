package com.saransh.springjokesapp.services;

import com.saransh.springjokesapp.model.Joke;
import com.saransh.springjokesapp.model.JokeImpl;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * Created by CryptoSingh1337 on 6/10/2021
 */
@Service
public class ChuckNorrisJokesService implements JokesService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorrisJokesService(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public Joke getRandomJoke() {
        return new JokeImpl(chuckNorrisQuotes.getRandomQuote());
    }
}
