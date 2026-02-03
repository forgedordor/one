package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csei {
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/util/spam/common/SpamProtectionSettingDataService");
    public final fcsu a;
    private final Context c;
    private final fcsu d;
    private final fcsu e;
    private final fcyh f;

    public csei(Context context, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcyh fcyhVar) {
        context.getClass();
        fcsuVar.getClass();
        fcsuVar3.getClass();
        fcyhVar.getClass();
        this.c = context;
        this.d = fcsuVar;
        this.e = fcsuVar2;
        this.a = fcsuVar3;
        this.f = fcyhVar;
    }

    private final crrd g() {
        return ((crre) this.d.b()).a("spam_protection_feature_consent");
    }

    public final crrd a() {
        crrd crrdVarG = g();
        if (!crrdVarG.c() || !((crqv) this.e.b()).q(this.c.getString(R.string.spam_detection_pref_key), false)) {
            return crrdVarG;
        }
        d();
        return g();
    }

    public final Object b(fcxy fcxyVar) {
        return eicj.a(this.f, new cseg(this, null), fcxyVar);
    }

    public final Object c(boolean z, fcxy fcxyVar) {
        Object objA = eicj.a(this.f, new cseh(this, z, null), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    public final void d() {
        ((crre) this.d.b()).b(g());
    }

    public final void e(boolean z) {
        if (((crre) this.d.b()).d("spam_protection_feature_consent", z)) {
            return;
        }
        ekrw ekrwVarJ = b.j();
        ekrwVarJ.X(eksq.a, "BugleSpam");
        ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/shared/util/spam/common/SpamProtectionSettingDataService", "updateSpamProtectionFromUserBlocking", 95, "SpamProtectionSettingDataService.kt")).q("SpamProtectionSettingDataService.updateSpamProtectionFromUser: failed to update setting state.");
    }

    public final boolean f() {
        if (((crxn) this.a.b()).b()) {
            return true;
        }
        return a().a();
    }
}
