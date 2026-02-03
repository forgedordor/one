package com.google.android.gms.maps;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.ddqn;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class MapView extends FrameLayout {
    public MapView(Context context) {
        super(context);
        new ddqn(this, context, null);
        a();
    }

    private final void a() {
        setClickable(true);
    }

    public MapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new ddqn(this, context, GoogleMapOptions.a(context, attributeSet));
        a();
    }

    public MapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new ddqn(this, context, GoogleMapOptions.a(context, attributeSet));
        a();
    }

    public MapView(Context context, GoogleMapOptions googleMapOptions) {
        super(context);
        new ddqn(this, context, googleMapOptions);
        a();
    }
}
