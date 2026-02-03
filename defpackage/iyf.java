package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iyf extends icr implements jcb {
    public fdap a;
    public long b = -9223372034707292160L;

    public iyf(fdap fdapVar) {
        this.a = fdapVar;
    }

    @Override // defpackage.icr
    public final boolean dN() {
        return true;
    }

    @Override // defpackage.jcb
    public final void i(long j) {
        if (kjg.e(this.b, j)) {
            return;
        }
        this.a.invoke(new kjg(j));
        this.b = j;
    }

    @Override // defpackage.jcb
    public final /* synthetic */ void ea(ivy ivyVar) {
    }
}
