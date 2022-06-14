// Generated by Dagger (https://dagger.dev).
package com.example.cleanarchitecturestudy.hilt;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import okhttp3.Interceptor;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApiModule_ProvideHeaderInterceptorFactory implements Factory<Interceptor> {
  @Override
  public Interceptor get() {
    return provideHeaderInterceptor();
  }

  public static ApiModule_ProvideHeaderInterceptorFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Interceptor provideHeaderInterceptor() {
    return Preconditions.checkNotNullFromProvides(ApiModule.INSTANCE.provideHeaderInterceptor());
  }

  private static final class InstanceHolder {
    private static final ApiModule_ProvideHeaderInterceptorFactory INSTANCE = new ApiModule_ProvideHeaderInterceptorFactory();
  }
}
