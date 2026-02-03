package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxf<S> extends day {
    public dhc a;
    public hsf b;
    public cxg c;
    private long d = -9223372034707292160L;

    public cxf(dhc dhcVar, hsf hsfVar, cxg cxgVar) {
        this.a = dhcVar;
        this.b = hsfVar;
        this.c = cxgVar;
    }

    public final long a(long j) {
        long j2 = this.d;
        return kjg.e(j2, -9223372034707292160L) ? j : j2;
    }

    @Override // defpackage.jcd
    public final ixn b(ixp ixpVar, ixk ixkVar, long j) {
        long j2;
        iyl iylVarE = ixkVar.e(j);
        if (ixpVar.ev()) {
            j2 = (iylVarE.a << 32) | (iylVarE.b & 4294967295L);
        } else {
            dhc dhcVar = this.a;
            if (dhcVar == null) {
                j2 = (iylVarE.a << 32) | (iylVarE.b & 4294967295L);
                this.d = j2;
            } else {
                long j3 = (iylVarE.b & 4294967295L) | (iylVarE.a << 32);
                hsf hsfVarB = dhcVar.b(new cxd(this, j3), new cxe(this, j3));
                j2 = ((kjg) hsfVarB.a()).a;
                this.d = ((kjg) hsfVarB.a()).a;
            }
        }
        return ixpVar.ej((int) (j2 >> 32), (int) (4294967295L & j2), fcvp.a, new cxc(this, iylVarE, j2));
    }

    @Override // defpackage.icr
    public final void dT() {
        this.d = -9223372034707292160L;
    }
}
