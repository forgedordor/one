package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class efp extends efo {
    public boolean a = true;
    public int b;

    public efp(int i) {
        this.b = i;
    }

    @Override // defpackage.efo
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.efo, defpackage.jcd
    public final int f(ivu ivuVar, ivt ivtVar, int i) {
        return this.b == 1 ? ivtVar.d(i) : ivtVar.b(i);
    }

    @Override // defpackage.efo, defpackage.jcd
    public final int h(ivu ivuVar, ivt ivtVar, int i) {
        return this.b == 1 ? ivtVar.d(i) : ivtVar.b(i);
    }

    @Override // defpackage.efo
    public final long i(ixk ixkVar, long j) {
        int iD = this.b == 1 ? ixkVar.d(kil.a(j)) : ixkVar.b(kil.a(j));
        if (iD < 0) {
            iD = 0;
        }
        return kik.d(iD);
    }
}
