package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ddb extends icr implements jcd {
    public final hox a;
    public final hox b;
    public long c;
    private kil d;

    public ddb(dba dbaVar, fdae fdaeVar) {
        hsi hsiVar = hsi.a;
        this.a = new hpl(dbaVar, hsiVar);
        this.b = new hpl(fdaeVar, hsiVar);
        this.c = -9223372034707292160L;
    }

    @Override // defpackage.jcd
    public final ixn b(ixp ixpVar, ixk ixkVar, long j) {
        iyl iylVarE;
        if (ixpVar.ev()) {
            this.d = new kil(j);
        }
        if (!((Boolean) ((fdae) this.b.a()).invoke()).booleanValue()) {
            iyl iylVarE2 = ixkVar.e(j);
            return ixpVar.ej(iylVarE2.a, iylVarE2.b, fcvp.a, new dcy(iylVarE2));
        }
        if (ixpVar.ev()) {
            iylVarE = ixkVar.e(j);
            this.c = (iylVarE.a << 32) | (iylVarE.b & 4294967295L);
        } else {
            kil kilVar = this.d;
            kilVar.getClass();
            iylVarE = ixkVar.e(kilVar.a);
        }
        long jE = kim.e(j, this.c);
        return ixpVar.ej((int) (jE >> 32), (int) (4294967295L & jE), fcvp.a, new dda(this, iylVarE, jE, ixpVar));
    }

    @Override // defpackage.jcd
    public final int e(ivu ivuVar, ivt ivtVar, int i) {
        if (!ivuVar.ev()) {
            long j = this.c;
            if (cyi.a(j)) {
                return (int) (4294967295L & j);
            }
        }
        return ivtVar.a(i);
    }

    @Override // defpackage.jcd
    public final int f(ivu ivuVar, ivt ivtVar, int i) {
        if (!ivuVar.ev()) {
            long j = this.c;
            if (cyi.a(j)) {
                return (int) (j >> 32);
            }
        }
        return ivtVar.b(i);
    }

    @Override // defpackage.jcd
    public final int g(ivu ivuVar, ivt ivtVar, int i) {
        if (!ivuVar.ev()) {
            long j = this.c;
            if (cyi.a(j)) {
                return (int) (4294967295L & j);
            }
        }
        return ivtVar.c(i);
    }

    @Override // defpackage.jcd
    public final int h(ivu ivuVar, ivt ivtVar, int i) {
        if (!ivuVar.ev()) {
            long j = this.c;
            if (cyi.a(j)) {
                return (int) (j >> 32);
            }
        }
        return ivtVar.d(i);
    }
}
