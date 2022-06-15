// Generated by Dagger (https://dagger.dev).
package com.example.domain.usecase.movie;

import com.example.domain.repository.MovieRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class GetLocalMoviesUseCase_Factory implements Factory<GetLocalMoviesUseCase> {
  private final Provider<MovieRepository> repositoryProvider;

  public GetLocalMoviesUseCase_Factory(Provider<MovieRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public GetLocalMoviesUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static GetLocalMoviesUseCase_Factory create(Provider<MovieRepository> repositoryProvider) {
    return new GetLocalMoviesUseCase_Factory(repositoryProvider);
  }

  public static GetLocalMoviesUseCase newInstance(MovieRepository repository) {
    return new GetLocalMoviesUseCase(repository);
  }
}
