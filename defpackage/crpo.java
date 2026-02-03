package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.telephony.SmsManager;
import j$.time.Duration;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crpo implements crou {
    private final crou a;
    private volatile ejxr b;
    private volatile ejxr c;

    public crpo(final crou crouVar) {
        this.a = crouVar;
        this.b = ejxx.b(new ejxr() { // from class: crpm
            @Override // defpackage.ejxr
            public final Object get() {
                String strM = crouVar.m();
                return strM == null ? "" : strM;
            }
        }, Duration.ofSeconds(dfog.c()));
        this.c = ejxx.b(new ejxr() { // from class: crpn
            @Override // defpackage.ejxr
            public final Object get() {
                String strP = crouVar.p();
                return strP == null ? "" : strP;
            }
        }, Duration.ofSeconds(dfog.c()));
    }

    @Override // defpackage.crou
    public final int[] A() {
        return this.a.A();
    }

    @Override // defpackage.crou
    public final int a() {
        return this.a.a();
    }

    @Override // defpackage.crou
    public final int b() {
        return this.a.b();
    }

    @Override // defpackage.crou
    public final int c() {
        return this.a.c();
    }

    @Override // defpackage.crou
    public final int d() {
        return this.a.d();
    }

    @Override // defpackage.crou
    public final Bitmap e(Context context) {
        return this.a.e(context);
    }

    @Override // defpackage.crou
    public final SmsManager f() {
        return this.a.f();
    }

    @Override // defpackage.crou
    public final Optional g() {
        return this.a.g();
    }

    @Override // defpackage.crou
    public final Optional h() {
        return this.a.h();
    }

    @Override // defpackage.crou
    public final CharSequence i() {
        return this.a.i();
    }

    @Override // defpackage.crou
    public final CharSequence j() {
        return this.a.j();
    }

    @Override // defpackage.crou
    public final String k() {
        return this.a.k();
    }

    @Override // defpackage.crou
    public final String l() {
        return this.a.l();
    }

    @Override // defpackage.crou
    public final String m() {
        ejxr ejxrVar = this.b;
        if (ejxrVar == null) {
            fdbq.c("getNetworkCountry");
            ejxrVar = null;
        }
        return (String) ejxrVar.get();
    }

    @Override // defpackage.crou
    public final String n() {
        return this.a.n();
    }

    @Override // defpackage.crou
    public final String o() {
        return this.a.o();
    }

    @Override // defpackage.crou
    public final String p() {
        ejxr ejxrVar = this.c;
        if (ejxrVar == null) {
            fdbq.c("getSimCountry");
            ejxrVar = null;
        }
        Object obj = ejxrVar.get();
        obj.getClass();
        return (String) obj;
    }

    @Override // defpackage.crou
    public final String q() {
        return this.a.q();
    }

    @Override // defpackage.crou
    public final String r() {
        return this.a.r();
    }

    @Override // defpackage.crou
    public final String s() {
        return this.a.s();
    }

    @Override // defpackage.crou
    public final String t() {
        return this.a.t();
    }

    @Override // defpackage.crou
    public final String u(Context context) {
        return this.a.u(context);
    }

    @Override // defpackage.crou
    public final boolean v() {
        return this.a.v();
    }

    @Override // defpackage.crou
    public final boolean w() {
        return this.a.w();
    }

    @Override // defpackage.crou
    public final boolean x() {
        return this.a.x();
    }

    @Override // defpackage.crou
    public final boolean y() {
        return this.a.y();
    }

    @Override // defpackage.crou
    public final int[] z() {
        return this.a.z();
    }
}
