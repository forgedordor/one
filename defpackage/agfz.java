package defpackage;

import android.app.Activity;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agfz implements afyw {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/navigation/targets/SignOutOfAccountNavigationHandler");
    private final Context b;

    public agfz(Context context) {
        this.b = context;
    }

    @Override // defpackage.afyw
    public final /* bridge */ /* synthetic */ Object a(afzv afzvVar, fcxy fcxyVar) {
        Activity activityA = daiy.a(this.b);
        if (activityA == null) {
            throw new IllegalArgumentException("SignOutOfAccountNavigationHandler must be created with an activity context.");
        }
        ((ekrd) a.h().h("com/google/android/apps/messaging/navigation/targets/SignOutOfAccountNavigationHandler", "navigate", 45, "SignOutOfAccount.kt")).q("Dispatching finish activity navigation event.");
        einf.e(agfy.a, activityA);
        return fctx.a;
    }
}
