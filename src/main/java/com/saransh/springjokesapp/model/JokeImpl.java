package com.saransh.springjokesapp.model;

/**
 * Created by CryptoSingh1337 on 6/10/2021
 */
public class JokeImpl implements Joke {

    private String jokeQuote;

    public JokeImpl(String jokeQuote) {
        this.jokeQuote = jokeQuote;
    }

    public String getJokeQuote() {
        return jokeQuote;
    }

    public void setJokeQuote(String jokeQuote) {
        this.jokeQuote = jokeQuote;
    }
}
