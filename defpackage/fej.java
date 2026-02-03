package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fej extends jbi implements jfv, ift, igu {
    public fdae a;
    public boolean b;
    private final ith c;

    public fej(fdae fdaeVar) {
        this.a = fdaeVar;
        fei feiVar = new fei(this);
        irs irsVar = itf.a;
        ito itoVar = new ito(null, null, null, feiVar);
        N(itoVar);
        this.c = itoVar;
    }

    @Override // defpackage.jfv
    public final long a() {
        return jbo.a(jbg.g(this));
    }

    @Override // defpackage.icr
    public final /* synthetic */ void dM() {
        jfu.a(this);
    }

    @Override // defpackage.jfv
    public final void dV() {
        this.c.dV();
    }

    @Override // defpackage.jfv
    public final void dW(irs irsVar, iru iruVar, long j) {
        this.c.dW(irsVar, iruVar, j);
    }

    @Override // defpackage.jfv
    public final /* synthetic */ void eb() {
        jfu.b(this);
    }

    @Override // defpackage.ift
    public final void n(igx igxVar) {
        this.b = igxVar.b();
    }

    @Override // defpackage.jfv
    public final /* synthetic */ boolean y() {
        return false;
    }

    @Override // defpackage.jfv
    public final /* synthetic */ void A() {
    }
}
