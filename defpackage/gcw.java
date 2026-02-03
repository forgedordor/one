package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gcw extends jbi implements jfv, jbd, jcb {
    public fyf a;
    public boolean b;
    public int c;
    public ddz d;
    public float e;
    public float f;
    private final hox g = new hpl(new kjb(0), hsi.a);
    private final ith h;
    private final ith i;

    public gcw(fyf fyfVar, boolean z, int i, ddz ddzVar) {
        this.a = fyfVar;
        this.b = z;
        this.c = i;
        this.d = ddzVar;
        gcu gcuVar = new gcu(this);
        irs irsVar = itf.a;
        ito itoVar = new ito(null, null, null, gcuVar);
        N(itoVar);
        this.h = itoVar;
        ito itoVar2 = new ito(null, null, null, new gcq(this));
        N(itoVar2);
        this.i = itoVar2;
    }

    @Override // defpackage.jfv
    public final /* synthetic */ long a() {
        return jge.a;
    }

    @Override // defpackage.icr
    public final /* synthetic */ void dM() {
        jfu.a(this);
    }

    @Override // defpackage.jfv
    public final void dV() {
        this.h.dV();
        this.i.dV();
    }

    @Override // defpackage.jfv
    public final void dW(irs irsVar, iru iruVar, long j) {
        this.h.dW(irsVar, iruVar, j);
        this.i.dW(irsVar, iruVar, j);
    }

    public final float e() {
        kio kioVarG = jbg.g(this);
        float f = hbj.a;
        return (kioVarG.en(74.0f) * kioVarG.ep(this.a.c())) / kioVarG.ep(256.0f);
    }

    @Override // defpackage.jfv
    public final /* synthetic */ void eb() {
        jfu.b(this);
    }

    public final long f() {
        return ((kjb) this.g.a()).a;
    }

    @Override // defpackage.jcb
    public final void i(long j) {
        this.g.b(new kjb(kjh.b(j)));
        this.a.b.b(new kir(jbg.g(this).el((int) (j >> 32))));
    }

    @Override // defpackage.jfv
    public final /* synthetic */ boolean y() {
        return false;
    }

    @Override // defpackage.jfv
    public final /* synthetic */ void A() {
    }

    @Override // defpackage.jcb
    public final /* synthetic */ void ea(ivy ivyVar) {
    }
}
