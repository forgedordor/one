package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dcw extends day {
    public ddz a;
    public iby b;
    private boolean e;
    private long c = -9223372034707292160L;
    private long d = kim.k(0, 0, 0, 15);
    private final hox f = new hpl(null, hsi.a);

    public dcw(ddz ddzVar, iby ibyVar) {
        this.a = ddzVar;
        this.b = ibyVar;
    }

    public final void a(dct dctVar) {
        this.f.b(dctVar);
    }

    @Override // defpackage.jcd
    public final ixn b(ixp ixpVar, ixk ixkVar, long j) {
        iyl iylVarE;
        dcw dcwVar;
        dct dctVar;
        char c;
        long j2;
        long jE;
        dct dctVar2;
        if (ixpVar.ev()) {
            this.d = j;
            this.e = true;
            iylVarE = ixkVar.e(j);
        } else {
            iylVarE = ixkVar.e(this.e ? this.d : j);
        }
        iyl iylVar = iylVarE;
        long j3 = (iylVar.b & 4294967295L) | (iylVar.a << 32);
        if (ixpVar.ev()) {
            this.c = j3;
            dcwVar = this;
            jE = j3;
            c = ' ';
            j2 = 4294967295L;
        } else {
            long j4 = this.c;
            if (true != cyi.a(j4)) {
                j4 = j3;
            }
            dct dctVar3 = (dct) this.f.a();
            if (dctVar3 != null) {
                ddp ddpVar = dctVar3.a;
                boolean z = (kjg.e(j4, ((kjg) ddpVar.d()).a) || ddpVar.j()) ? false : true;
                if (!kjg.e(j4, ((kjg) ddpVar.c()).a) || z) {
                    dctVar3.b = ((kjg) ddpVar.d()).a;
                    dctVar2 = dctVar3;
                    dcwVar = this;
                    fdil.d(E(), null, null, new dcu(dctVar2, j4, dcwVar, null), 3);
                } else {
                    dcwVar = this;
                    dctVar2 = dctVar3;
                }
                dctVar = dctVar2;
                c = ' ';
                j2 = 4294967295L;
            } else {
                long j5 = j4;
                dcwVar = this;
                c = ' ';
                j2 = 4294967295L;
                dctVar = new dct(new ddp(new kjg(j5), diu.h, new kjg(4294967297L), 8), j5);
            }
            dcwVar.a(dctVar);
            jE = kim.e(j, ((kjg) dctVar.a.d()).a);
        }
        int i = (int) (jE >> c);
        int i2 = (int) (jE & j2);
        return ixpVar.ej(i, i2, fcvp.a, new dcv(dcwVar, j3, i, i2, ixpVar, iylVar));
    }

    @Override // defpackage.icr
    public final void dT() {
        a(null);
    }

    @Override // defpackage.icr
    public final void dU() {
        this.c = -9223372034707292160L;
        this.e = false;
    }
}
