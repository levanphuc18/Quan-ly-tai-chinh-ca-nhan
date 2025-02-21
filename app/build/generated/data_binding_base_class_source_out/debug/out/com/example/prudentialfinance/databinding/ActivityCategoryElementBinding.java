// Generated by view binder compiler. Do not edit!
package com.example.prudentialfinance.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.prudentialfinance.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityCategoryElementBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageButton catColor;

  @NonNull
  public final TextView catDesc;

  @NonNull
  public final LinearLayout catLayout;

  @NonNull
  public final TextView catName;

  private ActivityCategoryElementBinding(@NonNull LinearLayout rootView,
      @NonNull ImageButton catColor, @NonNull TextView catDesc, @NonNull LinearLayout catLayout,
      @NonNull TextView catName) {
    this.rootView = rootView;
    this.catColor = catColor;
    this.catDesc = catDesc;
    this.catLayout = catLayout;
    this.catName = catName;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCategoryElementBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCategoryElementBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_category_element, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCategoryElementBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cat_color;
      ImageButton catColor = ViewBindings.findChildViewById(rootView, id);
      if (catColor == null) {
        break missingId;
      }

      id = R.id.cat_desc;
      TextView catDesc = ViewBindings.findChildViewById(rootView, id);
      if (catDesc == null) {
        break missingId;
      }

      id = R.id.cat_layout;
      LinearLayout catLayout = ViewBindings.findChildViewById(rootView, id);
      if (catLayout == null) {
        break missingId;
      }

      id = R.id.cat_name;
      TextView catName = ViewBindings.findChildViewById(rootView, id);
      if (catName == null) {
        break missingId;
      }

      return new ActivityCategoryElementBinding((LinearLayout) rootView, catColor, catDesc,
          catLayout, catName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
