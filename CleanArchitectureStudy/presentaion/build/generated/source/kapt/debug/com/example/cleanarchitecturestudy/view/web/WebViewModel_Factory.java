// Generated by Dagger (https://dagger.dev).
package com.example.cleanarchitecturestudy.view.web;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class WebViewModel_Factory implements Factory<WebViewModel> {
  @Override
  public WebViewModel get() {
    return newInstance();
  }

  public static WebViewModel_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static WebViewModel newInstance() {
    return new WebViewModel();
  }

  private static final class InstanceHolder {
    private static final WebViewModel_Factory INSTANCE = new WebViewModel_Factory();
  }
}
