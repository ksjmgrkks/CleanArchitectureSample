// Generated by Dagger (https://dagger.dev).
package com.example.cleanarchitecturestudy.view.search;

import com.example.cleanarchitecturestudy.utils.NetworkManager;
import com.example.domain.usecase.movie.GetLocalMoviesUseCase;
import com.example.domain.usecase.movie.GetMoviesUseCase;
import com.example.domain.usecase.movie.GetPagingMoviesUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MovieSearchViewModel_Factory implements Factory<MovieSearchViewModel> {
  private final Provider<GetMoviesUseCase> getMoviesUseCaseProvider;

  private final Provider<GetPagingMoviesUseCase> getPagingMoviesUseCaseProvider;

  private final Provider<GetLocalMoviesUseCase> getLocalMoviesUseCaseProvider;

  private final Provider<NetworkManager> networkManagerProvider;

  public MovieSearchViewModel_Factory(Provider<GetMoviesUseCase> getMoviesUseCaseProvider,
      Provider<GetPagingMoviesUseCase> getPagingMoviesUseCaseProvider,
      Provider<GetLocalMoviesUseCase> getLocalMoviesUseCaseProvider,
      Provider<NetworkManager> networkManagerProvider) {
    this.getMoviesUseCaseProvider = getMoviesUseCaseProvider;
    this.getPagingMoviesUseCaseProvider = getPagingMoviesUseCaseProvider;
    this.getLocalMoviesUseCaseProvider = getLocalMoviesUseCaseProvider;
    this.networkManagerProvider = networkManagerProvider;
  }

  @Override
  public MovieSearchViewModel get() {
    return newInstance(getMoviesUseCaseProvider.get(), getPagingMoviesUseCaseProvider.get(), getLocalMoviesUseCaseProvider.get(), networkManagerProvider.get());
  }

  public static MovieSearchViewModel_Factory create(
      Provider<GetMoviesUseCase> getMoviesUseCaseProvider,
      Provider<GetPagingMoviesUseCase> getPagingMoviesUseCaseProvider,
      Provider<GetLocalMoviesUseCase> getLocalMoviesUseCaseProvider,
      Provider<NetworkManager> networkManagerProvider) {
    return new MovieSearchViewModel_Factory(getMoviesUseCaseProvider, getPagingMoviesUseCaseProvider, getLocalMoviesUseCaseProvider, networkManagerProvider);
  }

  public static MovieSearchViewModel newInstance(GetMoviesUseCase getMoviesUseCase,
      GetPagingMoviesUseCase getPagingMoviesUseCase, GetLocalMoviesUseCase getLocalMoviesUseCase,
      NetworkManager networkManager) {
    return new MovieSearchViewModel(getMoviesUseCase, getPagingMoviesUseCase, getLocalMoviesUseCase, networkManager);
  }
}
