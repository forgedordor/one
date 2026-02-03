package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.telephony.SmsManager;
import j$.util.Optional;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axda implements crof {
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/core/myidentity/SubscriptionUtilsWrapper");
    public final crof a;
    private final cmmh c;
    private final fcsu d;

    public axda(crof crofVar, cmmh cmmhVar, fcsu fcsuVar) {
        cmmhVar.getClass();
        fcsuVar.getClass();
        this.a = crofVar;
        this.c = cmmhVar;
        this.d = fcsuVar;
        if (crofVar.a() != -1) {
            int iA = crofVar.a();
            int i = cmmhVar.d;
            if (iA == i) {
                return;
            }
            throw new IllegalArgumentException("subIds mismatch " + crofVar.a() + ", " + i);
        }
    }

    @Override // defpackage.crof
    public final boolean A() {
        return this.a.A();
    }

    @Override // defpackage.crof
    public final boolean B() {
        return this.a.B();
    }

    @Override // defpackage.crof
    public final boolean C() {
        return this.a.C();
    }

    @Override // defpackage.crof
    public final int[] D() {
        return this.a.D();
    }

    @Override // defpackage.crof
    public final int[] E() {
        return this.a.E();
    }

    @Override // defpackage.crof
    public final int a() {
        return this.c.d;
    }

    @Override // defpackage.crof
    public final int b() {
        return this.a.b();
    }

    @Override // defpackage.crof
    public final int c() {
        return this.a.c();
    }

    @Override // defpackage.crof
    public final int d() {
        return this.a.d();
    }

    @Override // defpackage.crof
    public final int e() {
        return this.a.e();
    }

    @Override // defpackage.crof
    public final Bitmap f(Context context) {
        return this.a.f(context);
    }

    @Override // defpackage.crof
    public final SmsManager g() {
        return this.a.g();
    }

    @Override // defpackage.crof
    public final alqm h(String str) {
        return this.a.h(str);
    }

    @Override // defpackage.crof
    public final Optional i(boolean z) {
        return k(z);
    }

    @Override // defpackage.crof
    public final Optional j() {
        return this.a.j();
    }

    @Override // defpackage.crof
    public final Optional k(boolean z) {
        cmmh cmmhVar = this.c;
        String str = cmmhVar.g;
        if (str != null && str.length() != 0) {
            return Optional.of(((alrj) this.d.b()).c(cmmhVar.g, new ejxr() { // from class: axcz
                @Override // defpackage.ejxr
                public final Object get() {
                    String strS = this.a.a.s();
                    if (strS.length() == 0) {
                        strS = null;
                    }
                    return Optional.ofNullable(strS);
                }
            }));
        }
        ekrw ekrwVarH = b.h();
        ekrwVarH.X(eksq.a, "BugleSelfIdentity");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrdVar.X(cqnc.w, Integer.valueOf(a()));
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/core/myidentity/SubscriptionUtilsWrapper", "getMessagingIdentity", 47, "SubscriptionUtilsWrapper.kt")).q("empty phone number from override");
        return Optional.empty();
    }

    @Override // defpackage.crof
    public final CharSequence l() {
        return this.a.l();
    }

    @Override // defpackage.crof
    public final CharSequence m() {
        return this.a.m();
    }

    @Override // defpackage.crof
    public final String n() {
        return this.a.n();
    }

    @Override // defpackage.crof
    public final String o() {
        return this.a.o();
    }

    @Override // defpackage.crof
    public final String p() {
        return this.a.p();
    }

    @Override // defpackage.crof
    public final String q() {
        return this.a.q();
    }

    @Override // defpackage.crof
    public final String r() {
        String str = this.c.u;
        str.getClass();
        return str;
    }

    @Override // defpackage.crof
    public final String s() {
        return this.a.s();
    }

    @Override // defpackage.crof
    @fcsv
    public final String t(Locale locale) {
        return this.a.t(locale);
    }

    @Override // defpackage.crof
    public final String u() {
        return this.a.u();
    }

    @Override // defpackage.crof
    public final String v() {
        return this.a.v();
    }

    @Override // defpackage.crof
    public final String w() {
        String str = this.c.n;
        str.getClass();
        return str;
    }

    @Override // defpackage.crof
    public final String x() {
        return this.a.x();
    }

    @Override // defpackage.crof
    public final String y(Context context) {
        return this.a.y(context);
    }

    @Override // defpackage.crof
    public final boolean z() {
        return this.a.z();
    }
}
