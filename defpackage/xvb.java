package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xvb {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/image/LoggingGlideErrorListener");
    private final ains b;

    public xvb(ains ainsVar) {
        ainsVar.getClass();
        this.b = ainsVar;
    }

    public final void a(rhs rhsVar, Object obj, int i) {
        String strF = obj instanceof Uri ? cqcv.f((Uri) obj) : "unknown";
        ekrw ekrwVarI = a.i();
        ekrwVarI.X(eksq.a, "BugleGlide");
        ((ekrd) ((ekrd) ekrwVarI).g(rhsVar).h("com/google/android/apps/messaging/conversation2/image/LoggingGlideErrorListener", "onLoadFailed", 25, "LoggingGlideErrorListener.kt")).t("Glide load %s failed", strF);
        this.b.e("Bugle.Glide.Error.Count", i);
    }
}
