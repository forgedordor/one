package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cujd {
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/toast/ToastsImpl");
    public final fdue a;

    public cujd(Context context) {
        context.getClass();
        this.a = fdun.d(0, 5, 1);
    }

    public final void a(String str) {
        cuje cujeVar = new cuje(str);
        ekrg ekrgVar = b;
        ((ekrd) ekrgVar.e().h("com/google/android/apps/messaging/toast/ToastsImpl", "showToast", 38, "ToastsImpl.kt")).t("showToast: %s", cujeVar);
        if (this.a.h(cujeVar)) {
            return;
        }
        ((ekrd) ekrgVar.i().h("com/google/android/apps/messaging/toast/ToastsImpl", "showToast", 43, "ToastsImpl.kt")).t("Too many toasts that have not been collected yet. Failed with %s", cujeVar);
    }
}
