// Generated by Dagger (https://dagger.dev).
package com.example.cleanarchitecturestudy.hilt;

import com.example.data.api.ApiInterface;
import com.example.data.repository.search.remote.MovieRemoteDataSource;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DataModule_ProvideRemoteDataSourceFactory implements Factory<MovieRemoteDataSource> {
  private final Provider<ApiInterface> apiInterfaceProvider;

  public DataModule_ProvideRemoteDataSourceFactory(Provider<ApiInterface> apiInterfaceProvider) {
    this.apiInterfaceProvider = apiInterfaceProvider;
  }

  @Override
  public MovieRemoteDataSource get() {
    return provideRemoteDataSource(apiInterfaceProvider.get());
  }

  public static DataModule_ProvideRemoteDataSourceFactory create(
      Provider<ApiInterface> apiInterfaceProvider) {
    return new DataModule_ProvideRemoteDataSourceFactory(apiInterfaceProvider);
  }

  public static MovieRemoteDataSource provideRemoteDataSource(ApiInterface apiInterface) {
    return Preconditions.checkNotNullFromProvides(DataModule.INSTANCE.provideRemoteDataSource(apiInterface));
  }
}
