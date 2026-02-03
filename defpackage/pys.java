package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.view.WindowMetrics;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pys implements pyq {
    public static final pys a = new pys();

    private pys() {
    }

    @Override // defpackage.pyq
    public final float a(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    @Override // defpackage.pyq
    public final float b(Configuration configuration, WindowMetrics windowMetrics) {
        return configuration.densityDpi / 160.0f;
    }
}
