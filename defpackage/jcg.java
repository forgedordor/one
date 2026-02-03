package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jcg extends jer {
    private static final ikb F;
    private iuk G;
    public jcd f;
    public kil g;
    public jdf h;

    static {
        iii iiiVar = new iii();
        iiiVar.k(ije.f);
        iiiVar.r(1.0f);
        iiiVar.s(1);
        F = iiiVar;
    }

    public jcg(jcr jcrVar, jcd jcdVar) {
        super(jcrVar);
        this.f = jcdVar;
        this.h = jcrVar.j != null ? new jce(this) : null;
        this.G = (jcdVar.D().t & 512) != 0 ? new iuk(this, (iuh) jcdVar) : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void aH() {
        /*
            r7 = this;
            boolean r0 = r7.k
            if (r0 == 0) goto L5
            return
        L5:
            r7.as()
            iuk r0 = r7.G
            r1 = 0
            if (r0 == 0) goto L5c
            iuh r2 = r0.b
            jdf r3 = r7.h
            r3.getClass()
            r2.w()
            boolean r0 = r0.c
            if (r0 != 0) goto L55
            long r2 = r7.c
            jdf r0 = r7.h
            r4 = 0
            if (r0 == 0) goto L2c
            long r5 = r0.u()
            kjg r0 = new kjg
            r0.<init>(r5)
            goto L2d
        L2c:
            r0 = r4
        L2d:
            boolean r0 = defpackage.kjg.d(r2, r0)
            if (r0 == 0) goto L55
            jer r0 = r7.G()
            long r2 = r0.c
            jer r0 = r7.G()
            jdf r0 = r0.C()
            if (r0 == 0) goto L4d
            long r4 = r0.u()
            kjg r0 = new kjg
            r0.<init>(r4)
            r4 = r0
        L4d:
            boolean r0 = defpackage.kjg.d(r2, r4)
            if (r0 == 0) goto L55
            r0 = 1
            goto L56
        L55:
            r0 = r1
        L56:
            jer r2 = r7.G()
            r2.u = r0
        L5c:
            ixn r0 = r7.K()
            r0.o()
            jer r0 = r7.G()
            r0.u = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jcg.aH():void");
    }

    @Override // defpackage.jer
    public final icr A() {
        return this.f.D();
    }

    @Override // defpackage.jer
    public final jdf C() {
        return this.h;
    }

    @Override // defpackage.jer
    public final void D() {
        if (this.h == null) {
            this.h = new jce(this);
        }
    }

    @Override // defpackage.jer
    public final void F(ijb ijbVar, ini iniVar) {
        jer jerVar;
        G().ai(ijbVar, iniVar);
        if (!jcv.a(this.t).A() || (jerVar = this.w) == null) {
            return;
        }
        if (kjg.e(this.c, jerVar.c) && kjb.f(jerVar.z, 0L)) {
            return;
        }
        aj(ijbVar, F);
    }

    public final jer G() {
        jer jerVar = this.w;
        jerVar.getClass();
        return jerVar;
    }

    public final void H(jcd jcdVar) {
        if (!fdbq.f(jcdVar, this.f)) {
            if ((jcdVar.D().t & 512) != 0) {
                iuh iuhVar = (iuh) jcdVar;
                iuk iukVar = this.G;
                if (iukVar != null) {
                    iukVar.b = iuhVar;
                } else {
                    iukVar = new iuk(this, iuhVar);
                }
                this.G = iukVar;
            } else {
                this.G = null;
            }
        }
        this.f = jcdVar;
    }

    @Override // defpackage.ivt
    public final int a(int i) {
        iuk iukVar = this.G;
        return iukVar != null ? iukVar.b.a(iukVar, G(), i) : this.f.e(this, G(), i);
    }

    @Override // defpackage.ivt
    public final int b(int i) {
        iuk iukVar = this.G;
        return iukVar != null ? iukVar.b.i(iukVar, G(), i) : this.f.f(this, G(), i);
    }

    @Override // defpackage.ivt
    public final int c(int i) {
        iuk iukVar = this.G;
        return iukVar != null ? iukVar.b.j(iukVar, G(), i) : this.f.g(this, G(), i);
    }

    @Override // defpackage.ivt
    public final int d(int i) {
        iuk iukVar = this.G;
        return iukVar != null ? iukVar.b.k(iukVar, G(), i) : this.f.h(this, G(), i);
    }

    @Override // defpackage.ixk
    public final iyl e(long j) {
        ixn ixnVarB;
        if (this.v) {
            kil kilVar = this.g;
            if (kilVar == null) {
                throw new IllegalArgumentException("Lookahead constraints cannot be null in approach pass.");
            }
            j = kilVar.a;
        }
        z(j);
        iuk iukVar = this.G;
        if (iukVar != null) {
            jcg jcgVar = iukVar.a;
            iuh iuhVar = iukVar.b;
            jdf jdfVar = jcgVar.h;
            jdfVar.getClass();
            ixn ixnVarK = jdfVar.K();
            ixnVarK.k();
            ixnVarK.j();
            boolean z = false;
            boolean z2 = iuhVar.v() || !kil.f(j, this.g);
            iukVar.c = z2;
            if (!z2) {
                G().v = true;
            }
            ixnVarB = iuhVar.o(iukVar, G(), j);
            G().v = false;
            int iK = ixnVarB.k();
            jdf jdfVar2 = this.h;
            jdfVar2.getClass();
            if (iK == jdfVar2.a) {
                int iJ = ixnVarB.j();
                jdf jdfVar3 = this.h;
                jdfVar3.getClass();
                if (iJ == jdfVar3.b) {
                    z = true;
                }
            }
            if (!iukVar.c) {
                long j2 = G().c;
                jdf jdfVarC = G().C();
                if (kjg.d(j2, jdfVarC != null ? new kjg(jdfVarC.u()) : null) && !z) {
                    ixnVarB = new jcf(ixnVarB, this);
                }
            }
        } else {
            ixnVarB = this.f.b(this, G(), j);
        }
        ay(ixnVarB);
        ar();
        return this;
    }

    @Override // defpackage.jer, defpackage.iyl
    protected final void ef(long j, float f, fdap fdapVar) {
        super.ef(j, f, fdapVar);
        aH();
    }

    @Override // defpackage.jde
    public final int s(itz itzVar) {
        jdf jdfVar = this.h;
        return jdfVar != null ? jdfVar.q.g(itzVar, Integer.MIN_VALUE) : jch.a(this, itzVar);
    }

    @Override // defpackage.jer, defpackage.iyl
    public final void x(long j, float f, ini iniVar) {
        super.x(j, f, iniVar);
        aH();
    }
}
