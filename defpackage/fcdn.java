package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
class fcdn extends fbqm {
    public final fbqm a;

    public fcdn(fbqm fbqmVar) {
        this.a = fbqmVar;
    }

    @Override // defpackage.fbnd
    public final fbnh a(fbrk fbrkVar, fbnc fbncVar) {
        return this.a.a(fbrkVar, fbncVar);
    }

    @Override // defpackage.fbnd
    public final String b() {
        return this.a.b();
    }

    @Override // defpackage.fbqm
    public fbqm d() {
        throw null;
    }

    @Override // defpackage.fbqm
    public final void e() {
        this.a.e();
    }

    @Override // defpackage.fbqm
    public final boolean f(TimeUnit timeUnit) {
        return this.a.f(timeUnit);
    }

    @Override // defpackage.fbqm
    public final fbnv g() {
        return this.a.g();
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        ejwfVarB.b("delegate", this.a);
        return ejwfVarB.toString();
    }
}
