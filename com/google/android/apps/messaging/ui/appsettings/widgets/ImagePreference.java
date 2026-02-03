package com.google.android.apps.messaging.ui.appsettings.widgets;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.preference.Preference;
import com.google.android.apps.messaging.R;
import defpackage.fdbq;
import defpackage.pab;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ImagePreference extends Preference {
    public ImageView a;
    public Drawable b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImagePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.A = R.layout.image_preference;
    }

    @Override // androidx.preference.Preference
    public final void a(pab pabVar) {
        pabVar.getClass();
        super.a(pabVar);
        View viewC = pabVar.C(R.id.image_view);
        viewC.getClass();
        this.a = (ImageView) viewC;
        Context context = this.j;
        int i = context.getResources().getDisplayMetrics().widthPixels;
        int i2 = context.getResources().getDisplayMetrics().heightPixels;
        View viewC2 = pabVar.C(R.id.illustration_frame);
        viewC2.getClass();
        FrameLayout frameLayout = (FrameLayout) viewC2;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        layoutParams.width = Math.min(i, i2);
        frameLayout.setLayoutParams(layoutParams);
        ImageView imageView = this.a;
        if (imageView == null) {
            fdbq.c("imageView");
            imageView = null;
        }
        imageView.setImageDrawable(this.b);
    }
}
