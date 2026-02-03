package com.google.android.apps.messaging.ui.mediapicker.c2o.content;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import defpackage.cvjo;
import defpackage.cyws;
import defpackage.eehg;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CategoryToggleView extends cyws {
    public ImageView a;
    public FrameLayout b;
    public cvjo c;
    private final float d;
    private final float e;
    private final float f;
    private GradientDrawable g;

    public CategoryToggleView(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        this.d = getResources().getDimension(R.dimen.c2o_content_item_corner_radius);
        this.e = getResources().getDimension(R.dimen.category_toggle_elevation);
        this.f = getResources().getDimension(R.dimen.category_toggle_padding);
        getResources().getFraction(R.fraction.c2o_category_disabled_icon_alpha, 1, 1);
        getResources().getInteger(R.integer.c2o_category_toggle_animation_duration_ms);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (ImageView) findViewById(R.id.c2o_category_toggle_icon);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.c2o_category_toggle_frame);
        this.b = frameLayout;
        frameLayout.setOnClickListener(this.c.a(new View.OnClickListener() { // from class: cywq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        }));
        GradientDrawable gradientDrawable = (GradientDrawable) this.b.getBackground().mutate();
        this.g = gradientDrawable;
        Context context = getContext();
        context.getClass();
        gradientDrawable.setColor(eehg.d(context, R.attr.colorSurfaceContainerHighest, "BugleSurfaceColors"));
        this.b.setClipToOutline(true);
        this.b.setBackground(this.g);
    }

    protected void setCornerRadiusPercentage(float f) {
        ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
        float f2 = this.f;
        int height = getHeight();
        int width = getWidth() - ((int) (f2 + f2));
        float f3 = this.d;
        float f4 = (height / 2) - ((int) f3);
        float f5 = ((int) (f4 * f)) + f3;
        float f6 = width / 2;
        if (f5 < f6) {
            layoutParams.height = height;
        } else {
            float f7 = width;
            float f8 = 1.0f - f;
            layoutParams.height = (int) (f7 + ((f8 + f8) * f4));
            f5 = f6;
        }
        float f9 = this.e * f;
        setTranslationZ(f9);
        this.b.setTranslationZ(f9);
        this.a.setTranslationZ(f9);
        this.b.setLayoutParams(layoutParams);
        this.g.setCornerRadius(f5);
        this.b.setBackground(this.g);
    }
}
