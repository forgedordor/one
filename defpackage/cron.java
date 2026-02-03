package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.telephony.SmsManager;
import j$.util.Optional;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cron implements crof {
    private static final cqce c = cqce.g("Bugle", "SubscriptionUtilsFake");
    public final crnf a;
    public final crom b;
    private final crny d;
    private final alfq e;

    static {
        "gbaKey".getBytes(StandardCharsets.UTF_8);
    }

    public cron(crnf crnfVar, crny crnyVar, crom cromVar, alfq alfqVar) {
        this.a = crnfVar;
        this.d = crnyVar;
        this.b = cromVar;
        this.e = alfqVar;
    }

    @Override // defpackage.crof
    public final boolean A() {
        return false;
    }

    @Override // defpackage.crof
    public final boolean B() {
        return false;
    }

    @Override // defpackage.crof
    public final boolean C() {
        return ((crmp) this.b).b;
    }

    @Override // defpackage.crof
    public final int[] D() {
        crmp crmpVar = (crmp) this.b;
        return new int[]{crmpVar.j, crmpVar.k};
    }

    @Override // defpackage.crof
    public final int[] E() {
        return new int[]{0, 0};
    }

    @Override // defpackage.crof
    public final int a() {
        return ((crmp) this.b).a;
    }

    @Override // defpackage.crof
    public final int b() {
        return 0;
    }

    @Override // defpackage.crof
    public final int c() {
        return 0;
    }

    @Override // defpackage.crof
    public final int d() {
        return ((crmp) this.b).d;
    }

    @Override // defpackage.crof
    public final int e() {
        return ((crmp) this.b).o;
    }

    @Override // defpackage.crof
    public final Bitmap f(Context context) {
        return null;
    }

    @Override // defpackage.crof
    public final SmsManager g() {
        return SmsManager.getSmsManagerForSubscriptionId(SmsManager.getDefaultSmsSubscriptionId());
    }

    @Override // defpackage.crof
    public final alqm h(String str) {
        ejxr ejxrVar = new ejxr() { // from class: croj
            @Override // defpackage.ejxr
            public final Object get() {
                cron cronVar = this.a;
                return cronVar.a.a(((crmp) cronVar.b).a);
            }
        };
        alfq alfqVar = this.e;
        return alfqVar.j(alfqVar.c(str, ejxrVar), ((crmp) this.b).a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [alqm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [alqm, java.lang.Object] */
    @Override // defpackage.crof
    public final Optional i(boolean z) {
        Optional optionalK = k(z);
        if (optionalK.isEmpty()) {
            return Optional.empty();
        }
        String strS = s();
        String strV = this.d.g().v(ejwk.b(optionalK.get().j()), strS);
        cqce cqceVar = c;
        if (cqceVar.t(2)) {
            cqbd cqbdVarD = cqceVar.d();
            cqbdVarD.I("SubscriptionUtils.getCanonicalForSelf: self=");
            cqbdVarD.k(strV);
            cqbdVarD.A("country", strS);
            cqbdVarD.I(strS);
            cqbdVarD.r();
        }
        return Optional.of(this.e.h(optionalK.get(), strV));
    }

    @Override // defpackage.crof
    public final Optional j() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("enableMultipartSMS", false);
        bundle.putInt("smsToMmsTextLengthThreshold", -1);
        bundle.putInt("systemCarrierConfig", 2);
        return Optional.of(bundle);
    }

    @Override // defpackage.crof
    public final Optional k(boolean z) {
        ejxr ejxrVar = new ejxr() { // from class: crok
            @Override // defpackage.ejxr
            public final Object get() {
                return Optional.of(((crmp) this.a.b).l);
            }
        };
        return Optional.of(this.e.c(((crmp) this.b).i, ejxrVar));
    }

    @Override // defpackage.crof
    public final CharSequence l() {
        return ((crmp) this.b).g;
    }

    @Override // defpackage.crof
    public final CharSequence m() {
        return ((crmp) this.b).e;
    }

    @Override // defpackage.crof
    public final String n() {
        return ejwk.b(((crmp) this.b).c);
    }

    @Override // defpackage.crof
    public final String o() {
        return "";
    }

    @Override // defpackage.crof
    public final String p() {
        return ((crmp) this.b).m;
    }

    @Override // defpackage.crof
    public final String q() {
        return ((crmp) this.b).g;
    }

    @Override // defpackage.crof
    public final String r() {
        return ((crmp) this.b).f;
    }

    @Override // defpackage.crof
    public final String s() {
        return ((crmp) this.b).l;
    }

    @Override // defpackage.crof
    public final String t(Locale locale) {
        return ((crmp) this.b).l;
    }

    public final String toString() {
        return m().toString();
    }

    @Override // defpackage.crof
    public final String u() {
        return ((crmp) this.b).h;
    }

    @Override // defpackage.crof
    public final String v() {
        crmp crmpVar = (crmp) this.b;
        return crmpVar.j + Integer.toString(crmpVar.k);
    }

    @Override // defpackage.crof
    public final String w() {
        return ejwk.b(((crmp) this.b).c);
    }

    @Override // defpackage.crof
    public final String x() {
        return "";
    }

    @Override // defpackage.crof
    public final String y(Context context) {
        return ((crmp) this.b).n;
    }

    @Override // defpackage.crof
    public final boolean z() {
        return ((crmp) this.b).c != null;
    }
}
