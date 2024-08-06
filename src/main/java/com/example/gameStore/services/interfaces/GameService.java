package com.example.gameStore.services.interfaces;

import com.example.gameStore.dtos.GameDto;
import com.example.gameStore.dtos.KeyDto;
import com.example.gameStore.dtos.ReviewDto;

import java.util.List;
import java.util.Optional;

public interface GameService {

    List<GameDto> findAllGames();

    Optional<GameDto> getGameById(String id);

    Optional<GameDto> createGame(GameDto gameDto);

    Optional<GameDto> updateGame(String id, GameDto gameDto);

    boolean deleteGame(String id);

    List<String> getAllGenres();

    List<GameDto> getGamesByGenre(String genre);

    List<GameDto> getCurrentUserGames();

    List<GameDto> getCurrentUserFavouriteGames();

    Optional<GameDto> addCurrentUserFavoriteGame(String gameId);

    boolean deleteFavoriteGameOfCurrentUser(String gameId);

    List<ReviewDto> getGameReviews(String gameId);

    Optional<ReviewDto> createReview(String gameId);

    Optional<ReviewDto> updateReview(String gameId, String reviewId);

    boolean deleteReview(String gameId, String reviewId);

    Optional<ReviewDto> getReviewById(String gameId, String reviewId);

    Optional<KeyDto> addKeyToGame(String gameId);

    Optional<Integer> countGameKeys(String gameId);
}
