package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eeja extends uk {
    public eeja(Context context) {
        super(context);
    }

    @Override // defpackage.uk
    protected final float a(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }
}
