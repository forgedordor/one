package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdxp implements eora {
    final /* synthetic */ fdjc a;

    public fdxp(fdjc fdjcVar) {
        this.a = fdjcVar;
    }

    @Override // defpackage.eora
    public final void b(Object obj) {
        Object objA;
        try {
            objA = Boolean.valueOf(((fdme) this.a).R(obj));
        } catch (Throwable th) {
            objA = fctl.a(th);
        }
        Throwable thC = fctk.c(objA);
        if (thC != null) {
            fdjs.b(fcyi.a, thC);
        }
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        Object objA;
        try {
            objA = Boolean.valueOf(this.a.a(th));
        } catch (Throwable th2) {
            objA = fctl.a(th2);
        }
        Throwable thC = fctk.c(objA);
        if (thC != null) {
            fdjs.b(fcyi.a, thC);
        }
    }
}
