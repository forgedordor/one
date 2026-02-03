package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.view.WindowManager;
import android.view.WindowMetrics;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pyr implements pyq {
    public static final pyr a = new pyr();

    private pyr() {
    }

    @Override // defpackage.pyq
    public final float a(Context context) {
        return ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getDensity();
    }

    @Override // defpackage.pyq
    public final float b(Configuration configuration, WindowMetrics windowMetrics) {
        return windowMetrics.getDensity();
    }
}
