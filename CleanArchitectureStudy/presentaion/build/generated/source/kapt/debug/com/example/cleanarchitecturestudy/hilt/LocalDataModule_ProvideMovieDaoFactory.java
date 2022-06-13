// Generated by Dagger (https://dagger.dev).
package com.example.cleanarchitecturestudy.hilt;

import com.example.data.db.movie.MovieDao;
import com.example.data.db.movie.MovieDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class LocalDataModule_ProvideMovieDaoFactory implements Factory<MovieDao> {
  private final Provider<MovieDatabase> movieDatabaseProvider;

  public LocalDataModule_ProvideMovieDaoFactory(Provider<MovieDatabase> movieDatabaseProvider) {
    this.movieDatabaseProvider = movieDatabaseProvider;
  }

  @Override
  public MovieDao get() {
    return provideMovieDao(movieDatabaseProvider.get());
  }

  public static LocalDataModule_ProvideMovieDaoFactory create(
      Provider<MovieDatabase> movieDatabaseProvider) {
    return new LocalDataModule_ProvideMovieDaoFactory(movieDatabaseProvider);
  }

  public static MovieDao provideMovieDao(MovieDatabase movieDatabase) {
    return Preconditions.checkNotNull(LocalDataModule.INSTANCE.provideMovieDao(movieDatabase), "Cannot return null from a non-@Nullable @Provides method");
  }
}
