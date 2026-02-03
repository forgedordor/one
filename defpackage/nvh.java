package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class nvh extends miy implements nva {
    private nva e;
    private long f;

    @Override // defpackage.nva
    public final int a() {
        nva nvaVar = this.e;
        mee.f(nvaVar);
        return nvaVar.a();
    }

    @Override // defpackage.nva
    public final int b(long j) {
        nva nvaVar = this.e;
        mee.f(nvaVar);
        return nvaVar.b(j - this.f);
    }

    @Override // defpackage.nva
    public final long c(int i) {
        nva nvaVar = this.e;
        mee.f(nvaVar);
        return nvaVar.c(i) + this.f;
    }

    @Override // defpackage.nva
    public final List e(long j) {
        nva nvaVar = this.e;
        mee.f(nvaVar);
        return nvaVar.e(j - this.f);
    }

    @Override // defpackage.miy, defpackage.miq
    public final void eP() {
        super.eP();
        this.e = null;
    }

    public final void i(long j, nva nvaVar, long j2) {
        this.b = j;
        this.e = nvaVar;
        if (j2 != Long.MAX_VALUE) {
            j = j2;
        }
        this.f = j;
    }
}
