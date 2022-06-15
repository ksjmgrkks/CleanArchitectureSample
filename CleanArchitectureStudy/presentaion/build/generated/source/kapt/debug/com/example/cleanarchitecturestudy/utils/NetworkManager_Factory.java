// Generated by Dagger (https://dagger.dev).
package com.example.cleanarchitecturestudy.utils;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkManager_Factory implements Factory<NetworkManager> {
  private final Provider<Context> contextProvider;

  public NetworkManager_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public NetworkManager get() {
    return newInstance(contextProvider.get());
  }

  public static NetworkManager_Factory create(Provider<Context> contextProvider) {
    return new NetworkManager_Factory(contextProvider);
  }

  public static NetworkManager newInstance(Context context) {
    return new NetworkManager(context);
  }
}
