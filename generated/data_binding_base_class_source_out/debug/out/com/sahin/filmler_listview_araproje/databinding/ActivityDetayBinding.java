// Generated by view binder compiler. Do not edit!
package com.sahin.filmler_listview_araproje.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import com.sahin.filmler_listview_araproje.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDetayBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView DetayAKlama;

  @NonNull
  public final TextView DetayHakkNda;

  @NonNull
  public final ImageView DetayImg;

  @NonNull
  public final TextView DetayOyuncular;

  @NonNull
  public final TextView DetayOyuncularResim;

  @NonNull
  public final TextView DetayVideo;

  @NonNull
  public final YouTubePlayerView VideoOynat;

  private ActivityDetayBinding(@NonNull LinearLayout rootView, @NonNull TextView DetayAKlama,
      @NonNull TextView DetayHakkNda, @NonNull ImageView DetayImg, @NonNull TextView DetayOyuncular,
      @NonNull TextView DetayOyuncularResim, @NonNull TextView DetayVideo,
      @NonNull YouTubePlayerView VideoOynat) {
    this.rootView = rootView;
    this.DetayAKlama = DetayAKlama;
    this.DetayHakkNda = DetayHakkNda;
    this.DetayImg = DetayImg;
    this.DetayOyuncular = DetayOyuncular;
    this.DetayOyuncularResim = DetayOyuncularResim;
    this.DetayVideo = DetayVideo;
    this.VideoOynat = VideoOynat;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDetayBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDetayBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_detay, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDetayBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.DetayAçıklama;
      TextView DetayAKlama = ViewBindings.findChildViewById(rootView, id);
      if (DetayAKlama == null) {
        break missingId;
      }

      id = R.id.DetayHakkında;
      TextView DetayHakkNda = ViewBindings.findChildViewById(rootView, id);
      if (DetayHakkNda == null) {
        break missingId;
      }

      id = R.id.DetayImg;
      ImageView DetayImg = ViewBindings.findChildViewById(rootView, id);
      if (DetayImg == null) {
        break missingId;
      }

      id = R.id.DetayOyuncular;
      TextView DetayOyuncular = ViewBindings.findChildViewById(rootView, id);
      if (DetayOyuncular == null) {
        break missingId;
      }

      id = R.id.DetayOyuncularResim;
      TextView DetayOyuncularResim = ViewBindings.findChildViewById(rootView, id);
      if (DetayOyuncularResim == null) {
        break missingId;
      }

      id = R.id.DetayVideo;
      TextView DetayVideo = ViewBindings.findChildViewById(rootView, id);
      if (DetayVideo == null) {
        break missingId;
      }

      id = R.id.VideoOynat;
      YouTubePlayerView VideoOynat = ViewBindings.findChildViewById(rootView, id);
      if (VideoOynat == null) {
        break missingId;
      }

      return new ActivityDetayBinding((LinearLayout) rootView, DetayAKlama, DetayHakkNda, DetayImg,
          DetayOyuncular, DetayOyuncularResim, DetayVideo, VideoOynat);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
