package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ieu extends icr implements ies, jew, ier {
    public fdap a;
    private final iew b;
    private boolean c;

    public ieu(iew iewVar, fdap fdapVar) {
        this.b = iewVar;
        this.a = fdapVar;
        iewVar.a = this;
    }

    @Override // defpackage.ies
    public final void a() {
        this.c = false;
        this.b.r();
        jbq.a(this);
    }

    @Override // defpackage.ier
    public final long c() {
        return kjh.d(jbg.e(this, 128).c);
    }

    @Override // defpackage.icr
    public final void dL() {
        a();
    }

    @Override // defpackage.icr
    public final void dM() {
        a();
    }

    @Override // defpackage.ier
    public final kio j() {
        return jbg.g(this);
    }

    @Override // defpackage.ier
    public final kji k() {
        return jbg.h(this);
    }

    @Override // defpackage.jew
    public final void n() {
        a();
    }

    @Override // defpackage.jbp
    public final void r(imw imwVar) {
        if (!this.c) {
            iew iewVar = this.b;
            iewVar.r();
            jex.a(this, new iet(this, iewVar));
            if (iewVar.b == null) {
                itw.b("DrawResult not defined, did you forget to call onDraw?");
                throw new fcta();
            }
            this.c = true;
        }
        ifc ifcVar = this.b.b;
        ifcVar.getClass();
        ifcVar.a.invoke(imwVar);
    }

    @Override // defpackage.jbp
    public final void t() {
        a();
    }

    @Override // defpackage.icr
    public final void s() {
    }
}
