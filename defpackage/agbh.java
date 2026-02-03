package defpackage;

import android.app.Activity;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agbh implements afyw {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/navigation/targets/BackNavigationHandler");
    private final Context b;

    public agbh(Context context) {
        this.b = context;
    }

    @Override // defpackage.afyw
    public final /* bridge */ /* synthetic */ Object a(afzv afzvVar, fcxy fcxyVar) {
        Activity activityA = daiy.a(this.b);
        if (activityA == null) {
            throw new IllegalArgumentException("BackNavigationHandler must be created with an activity context.");
        }
        ((ekrd) a.h().h("com/google/android/apps/messaging/navigation/targets/BackNavigationHandler", "navigate", 51, "Back.kt")).q("Dispatching Back navigation event.");
        einf.e(agbg.a, activityA);
        return fctx.a;
    }
}
