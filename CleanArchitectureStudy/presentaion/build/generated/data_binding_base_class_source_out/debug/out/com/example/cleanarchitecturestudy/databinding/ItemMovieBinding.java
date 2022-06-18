// Generated by data binding compiler. Do not edit!
package com.example.cleanarchitecturestudy.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.cleanarchitecturestudy.R;
import com.example.domain.model.Movie;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemMovieBinding extends ViewDataBinding {
  @NonNull
  public final ImageView ivPoster;

  @NonNull
  public final RatingBar rbRating;

  @NonNull
  public final TextView tvActor;

  @NonNull
  public final TextView tvDirector;

  @NonNull
  public final TextView tvReleaseDate;

  @NonNull
  public final TextView tvTitle;

  @Bindable
  protected Movie mMovie;

  protected ItemMovieBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView ivPoster, RatingBar rbRating, TextView tvActor, TextView tvDirector,
      TextView tvReleaseDate, TextView tvTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.ivPoster = ivPoster;
    this.rbRating = rbRating;
    this.tvActor = tvActor;
    this.tvDirector = tvDirector;
    this.tvReleaseDate = tvReleaseDate;
    this.tvTitle = tvTitle;
  }

  public abstract void setMovie(@Nullable Movie movie);

  @Nullable
  public Movie getMovie() {
    return mMovie;
  }

  @NonNull
  public static ItemMovieBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_movie, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemMovieBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemMovieBinding>inflateInternal(inflater, R.layout.item_movie, root, attachToRoot, component);
  }

  @NonNull
  public static ItemMovieBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_movie, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemMovieBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemMovieBinding>inflateInternal(inflater, R.layout.item_movie, null, false, component);
  }

  public static ItemMovieBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ItemMovieBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemMovieBinding)bind(component, view, R.layout.item_movie);
  }
}