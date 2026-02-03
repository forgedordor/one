package com.google.android.libraries.messaging.lighter.ui.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import defpackage.dwyh;
import defpackage.dwyj;
import defpackage.dwyl;
import defpackage.eehg;
import defpackage.fbfm;
import defpackage.len;
import defpackage.ley;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class LoadingView extends LinearLayout {
    public LoadingView(Context context) {
        this(context, null);
    }

    public LoadingView(Context context, AttributeSet attributeSet) {
        super(dwyh.a(context, fbfm.i()), attributeSet);
        inflate(getContext(), R.layout.loading_view, this);
        GradientDrawable gradientDrawable = (GradientDrawable) getContext().getDrawable(R.drawable.loading_view_bg);
        gradientDrawable.setColor(eehg.b(this, R.attr.colorSurface));
        setBackground(gradientDrawable);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, dwyl.a);
        String string = typedArrayObtainStyledAttributes.getString(0);
        typedArrayObtainStyledAttributes.recycle();
        TextView textView = (TextView) findViewById(R.id.loading_text);
        if (string == null || string.length() == 0) {
            textView.setVisibility(8);
        } else {
            textView.setText(string);
            textView.setVisibility(0);
        }
        float dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.loading_view_elevation);
        int[] iArr = ley.a;
        len.j(this, dimensionPixelSize);
        setOutlineProvider(new dwyj(getResources().getDimension(R.dimen.loading_view_background_radius)));
        setClipToOutline(false);
    }
}
