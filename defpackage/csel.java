package defpackage;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csel {
    public final Context a;
    public final fcsu b;
    public final cogw c;
    public final fcsu d;
    public final fcsu e;

    public csel(Context context, fcsu fcsuVar, cogw cogwVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        this.a = context;
        this.b = fcsuVar;
        this.c = cogwVar;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
    }

    public final void a(crrd crrdVar) {
        ((crre) this.e.b()).b(crrdVar);
    }

    public final void b() {
        ((csei) this.b.b()).d();
    }

    public final void c() {
        ((crqv) this.d.b()).h("spam_popup_dismissed", true);
    }

    public final boolean d() {
        return ((crqv) this.d.b()).q("spam_popup_dismissed", false);
    }

    @Deprecated
    public final boolean e() {
        return crxi.a() ? ((csei) this.b.b()).f() : ((crre) this.e.b()).a("spam_protection_feature_consent").a();
    }

    public final boolean f(crrd crrdVar, boolean z) {
        if (!z || !crrdVar.c()) {
            return false;
        }
        ((crre) this.e.b()).b(crrdVar);
        return true;
    }

    public final boolean g() {
        long jE = ((crqv) this.d.b()).e("spam_popup_seen_timestamp", -1L);
        return jE == -1 || this.c.f().toEpochMilli() <= jE + TimeUnit.HOURS.toMillis(12L);
    }
}
