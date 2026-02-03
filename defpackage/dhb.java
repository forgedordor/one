package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dhb implements hsf {
    public final dhg a;
    public fdap b;
    public fdap c;
    final /* synthetic */ dhc d;

    public dhb(dhc dhcVar, dhg dhgVar, fdap fdapVar, fdap fdapVar2) {
        this.d = dhcVar;
        this.a = dhgVar;
        this.b = fdapVar;
        this.c = fdapVar2;
    }

    @Override // defpackage.hsf
    public final Object a() {
        b(this.d.a.d());
        return this.a.a();
    }

    public final void b(dhe dheVar) {
        Object objInvoke = this.c.invoke(dheVar.b());
        if (!this.d.a.t()) {
            this.a.k(objInvoke, (dew) this.b.invoke(dheVar));
        } else {
            this.a.j(this.c.invoke(dheVar.a()), objInvoke, (dew) this.b.invoke(dheVar));
        }
    }
}
