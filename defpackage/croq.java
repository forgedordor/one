package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.telephony.SmsManager;
import android.text.TextUtils;
import j$.util.Optional;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class croq implements crof {
    private static final ekrg c = ekrg.c("com/google/android/apps/messaging/shared/util/phone/SubscriptionUtilsImpl");
    public final int a;
    public final crnf b;
    private final crny d;
    private final alfq e;
    private final crmu f;
    private final crou g;
    private final crnt h;

    public croq(crny crnyVar, alfq alfqVar, crnf crnfVar, crnt crntVar, crmu crmuVar, crou crouVar, int i) {
        this.a = i;
        this.d = crnyVar;
        this.e = alfqVar;
        this.b = crnfVar;
        this.f = crmuVar;
        this.g = crouVar;
        this.h = crntVar;
    }

    @Override // defpackage.crof
    public final boolean A() {
        return this.g.w();
    }

    @Override // defpackage.crof
    public final boolean B() {
        return this.g.x();
    }

    @Override // defpackage.crof
    public final boolean C() {
        return this.g.y();
    }

    @Override // defpackage.crof
    public final int[] D() {
        return this.g.z();
    }

    @Override // defpackage.crof
    public final int[] E() {
        return this.g.A();
    }

    @Override // defpackage.crof
    public final int a() {
        return this.a;
    }

    @Override // defpackage.crof
    public final int b() {
        return this.g.a();
    }

    @Override // defpackage.crof
    public final int c() {
        return this.g.b();
    }

    @Override // defpackage.crof
    public final int d() {
        return this.g.c();
    }

    @Override // defpackage.crof
    public final int e() {
        return this.g.d();
    }

    @Override // defpackage.crof
    public final Bitmap f(Context context) {
        return this.g.e(context);
    }

    @Override // defpackage.crof
    public final SmsManager g() {
        return this.g.f();
    }

    @Override // defpackage.crof
    public final alqm h(String str) {
        ejxr ejxrVar = new ejxr() { // from class: croo
            @Override // defpackage.ejxr
            public final Object get() {
                croq croqVar = this.a;
                return croqVar.b.a(croqVar.a);
            }
        };
        alfq alfqVar = this.e;
        return alfqVar.j(alfqVar.c(str, ejxrVar), this.a);
    }

    @Override // defpackage.crof
    public final Optional i(boolean z) {
        Optional optionalK = k(z);
        if (optionalK.isEmpty()) {
            return Optional.empty();
        }
        String strS = s();
        String strV = this.d.g().v(ejwk.b(((alqm) optionalK.get()).j()), strS);
        ekrw ekrwVarH = c.h();
        ekrwVarH.X(eksq.a, "Bugle");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrdVar.X(cqnc.w, Integer.valueOf(this.a));
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/util/phone/SubscriptionUtilsImpl", "getCanonicalForSelf", 273, "SubscriptionUtilsImpl.java")).D("SubscriptionUtils.getCanonicalForSelf: self=%s, country=%s", cqcv.b(strV), strS);
        return Optional.of(this.e.h((alqm) optionalK.get(), strV));
    }

    @Override // defpackage.crof
    public final Optional j() {
        return this.g.g();
    }

    @Override // defpackage.crof
    public final Optional k(boolean z) {
        if (z) {
            String strC = this.f.c(this.a);
            if (!TextUtils.isEmpty(strC)) {
                return Optional.of(this.e.c(strC, new ejxr() { // from class: crop
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return Optional.of(this.a.s());
                    }
                }));
            }
        }
        if (this.f.d()) {
            ekrw ekrwVarH = c.h();
            ekrwVarH.X(eksq.a, "Bugle");
            ekrd ekrdVar = (ekrd) ekrwVarH;
            ekrdVar.X(cqnc.w, Integer.valueOf(this.a));
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/util/phone/SubscriptionUtilsImpl", "getMessagingIdentity", 182, "SubscriptionUtilsImpl.java")).q("getMessagingIdentity: Emulating unknown SIM number");
            return Optional.empty();
        }
        Optional optionalH = this.g.h();
        if (!optionalH.isEmpty()) {
            return Optional.ofNullable(this.h.a((String) optionalH.get(), this.a));
        }
        ekrw ekrwVarE = c.e();
        ekrwVarE.X(eksq.a, "Bugle");
        ekrd ekrdVar2 = (ekrd) ekrwVarE;
        ekrdVar2.X(cqnc.w, Integer.valueOf(this.a));
        ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/util/phone/SubscriptionUtilsImpl", "getMessagingIdentity", 190, "SubscriptionUtilsImpl.java")).q("String phone number for self is empty!");
        return Optional.empty();
    }

    @Override // defpackage.crof
    public final CharSequence l() {
        return this.g.i();
    }

    @Override // defpackage.crof
    public final CharSequence m() {
        return this.g.j();
    }

    @Override // defpackage.crof
    public final String n() {
        return this.g.k();
    }

    @Override // defpackage.crof
    public final String o() {
        return this.g.l();
    }

    @Override // defpackage.crof
    public final String p() {
        return this.g.m();
    }

    @Override // defpackage.crof
    public final String q() {
        return this.g.n();
    }

    @Override // defpackage.crof
    public final String r() {
        return this.g.o();
    }

    @Override // defpackage.crof
    public final String s() {
        String strP = this.g.p();
        return TextUtils.isEmpty(strP) ? "" : strP.toUpperCase(Locale.US);
    }

    @Override // defpackage.crof
    public final String t(Locale locale) {
        return s();
    }

    public final String toString() {
        return m().toString();
    }

    @Override // defpackage.crof
    public final String u() {
        return this.g.q();
    }

    @Override // defpackage.crof
    public final String v() {
        return this.g.r();
    }

    @Override // defpackage.crof
    public final String w() {
        return this.g.s();
    }

    @Override // defpackage.crof
    public final String x() {
        return this.g.t();
    }

    @Override // defpackage.crof
    public final String y(Context context) {
        return this.g.u(context);
    }

    @Override // defpackage.crof
    public final boolean z() {
        return this.g.v();
    }
}
