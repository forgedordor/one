package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class och extends mpc {
    protected long j;
    protected odl k;
    protected oaw l;
    protected boolean m;
    private mau n;
    private mau o;
    private final oes p;
    private final oak q;
    private final mix r;
    private boolean s;
    private boolean t;
    private boolean u;

    public och(int i, oes oesVar, oak oakVar) {
        super(i);
        this.p = oesVar;
        this.q = oakVar;
        this.r = new mix(0);
    }

    private final boolean ac() {
        if (this.k != null) {
            return true;
        }
        if (this.o == null) {
            if (this.l == null || oeu.b(this.n.o) != 1) {
                this.o = aa(this.n);
            } else {
                mau mauVarB = this.l.b();
                if (mauVarB == null) {
                    return false;
                }
                this.o = aa(mauVarB);
            }
        }
        odt odtVarJ = ((odu) this.q).j(this.o);
        if (odtVarJ == null) {
            return false;
        }
        this.k = odtVarJ;
        return true;
    }

    private final boolean ad(mix mixVar) {
        int iC = c(j(), mixVar, 0);
        if (iC == -5) {
            throw new IllegalStateException("Format changes are not supported.");
        }
        if (iC != -4) {
            return false;
        }
        mixVar.i();
        if (mixVar.eS()) {
            return true;
        }
        this.p.c(this.b, mixVar.f);
        return true;
    }

    @Override // defpackage.mpc
    protected final void A() {
        this.s = false;
    }

    @Override // defpackage.mpc
    protected final void B(mau[] mauVarArr, long j, long j2, nen nenVar) {
        this.j = j;
    }

    @Override // defpackage.mth
    public final void S(long j, long j2) {
        boolean zX;
        boolean z;
        try {
            if (!this.s || this.m) {
                return;
            }
            mau mauVar = this.n;
            if (mauVar == null || this.t) {
                if (mauVar == null) {
                    msa msaVarJ = j();
                    if (c(msaVarJ, this.r, 2) != -5) {
                        return;
                    }
                    mau mauVar2 = msaVarJ.b;
                    mee.f(mauVar2);
                    mau mauVarZ = Z(mauVar2);
                    this.n = mauVarZ;
                    this.t = this.q.d(mauVarZ, 3);
                }
                if (this.t) {
                    if (oeu.b(this.n.o) == 2 && !ac()) {
                        return;
                    }
                    W(this.n);
                    this.t = false;
                }
            }
            if (this.l != null) {
                do {
                    zX = ac() ? X() : false;
                    oaw oawVar = this.l;
                    mix mixVar = this.r;
                    if (oawVar.h(mixVar) && ad(mixVar)) {
                        if (!Y(mixVar)) {
                            ab(mixVar);
                            this.l.e(mixVar);
                        }
                        z = true;
                    } else {
                        z = false;
                    }
                } while (zX | z);
                return;
            }
            if (!ac()) {
                return;
            }
            while (true) {
                mix mixVarC = this.k.c();
                if (mixVarC == null) {
                    return;
                }
                if (!this.u) {
                    if (!ad(mixVarC)) {
                        return;
                    }
                    if (Y(mixVarC)) {
                        continue;
                    } else {
                        this.u = true;
                    }
                }
                boolean zES = mixVarC.eS();
                this.k.i();
                this.u = false;
                this.m = zES;
                if (zES) {
                    return;
                }
            }
        } catch (ocp e) {
            this.s = false;
            this.q.b(e);
        }
    }

    @Override // defpackage.mth
    public final boolean T() {
        return this.m;
    }

    @Override // defpackage.mth
    public final boolean U() {
        return true;
    }

    @Override // defpackage.mtk
    public final int V(mau mauVar) {
        return mti.a(mbw.b(mauVar.o) == this.b ? 4 : 0);
    }

    protected abstract void W(mau mauVar);

    protected abstract boolean X();

    protected abstract boolean Y(mix mixVar);

    @Override // defpackage.mpc, defpackage.mth
    public final mse k() {
        return this.p;
    }

    @Override // defpackage.mpc
    protected final void v(boolean z, boolean z2) {
        this.p.c(this.b, 0L);
    }

    @Override // defpackage.mpc
    protected final void y() {
        oaw oawVar = this.l;
        if (oawVar != null) {
            oawVar.f();
        }
    }

    @Override // defpackage.mpc
    protected final void z() {
        this.s = true;
    }

    protected mau Z(mau mauVar) {
        return mauVar;
    }

    protected mau aa(mau mauVar) {
        return mauVar;
    }

    protected void ab(mix mixVar) {
    }
}
