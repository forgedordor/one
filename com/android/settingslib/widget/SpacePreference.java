package com.android.settingslib.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.preference.Preference;
import com.google.android.apps.messaging.R;
import defpackage.kyz;
import defpackage.pab;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SpacePreference extends Preference {
    private final int a;

    /* JADX WARN: Illegal instructions before constructor call */
    public SpacePreference(Context context, AttributeSet attributeSet) {
        context.getClass();
        int iB = kyz.b(context, R.attr.preferenceStyle, android.R.attr.preferenceStyle);
        super(context, attributeSet, iB, 0);
        this.A = R.layout.space_preference;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{android.R.attr.layout_height}, iB, 0);
        this.a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final void a(pab pabVar) {
        pabVar.getClass();
        super.a(pabVar);
        pabVar.v = false;
        pabVar.u = false;
        pabVar.a.setLayoutParams(new ViewGroup.LayoutParams(-1, this.a));
    }
}
