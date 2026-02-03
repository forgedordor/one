package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lih {
    public static float a(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return lig.a(edgeEffect);
        }
        return 0.0f;
    }

    public static float b(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return lig.b(edgeEffect, f, f2);
        }
        lif.a(edgeEffect, f, f2);
        return f;
    }

    public static EdgeEffect c(Context context, AttributeSet attributeSet) {
        return Build.VERSION.SDK_INT >= 31 ? lig.c(context, attributeSet) : new EdgeEffect(context);
    }
}
