package defpackage;

import android.content.Context;
import android.graphics.Color;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eejp {
    private static final int c = (int) Math.round(5.1000000000000005d);
    public final boolean a;
    public final int b;
    private final int d;
    private final int e;
    private final float f;

    public eejp(boolean z, int i, int i2, int i3, float f) {
        this.a = z;
        this.d = i;
        this.e = i2;
        this.b = i3;
        this.f = f;
    }

    public final int a(int i, float f) {
        int i2;
        float fMin = (this.f <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f / r0)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i);
        int iF = eehg.f(kzb.h(i, 255), this.d, fMin);
        if (fMin > 0.0f && (i2 = this.e) != 0) {
            iF = kzb.g(kzb.h(i2, c), iF);
        }
        return kzb.h(iF, iAlpha);
    }

    public final int b(int i, float f) {
        return (this.a && kzb.h(i, 255) == this.b) ? a(i, f) : i;
    }

    public eejp(Context context) {
        this(eepx.d(context, R.attr.elevationOverlayEnabled, false), eehg.c(context, R.attr.elevationOverlayColor, 0), eehg.c(context, R.attr.elevationOverlayAccentColor, 0), eehg.c(context, R.attr.colorSurface, 0), context.getResources().getDisplayMetrics().density);
    }
}
