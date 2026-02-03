package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ndr implements nge {
    public final ekgb a;
    private final nge b;

    public ndr(nge ngeVar, List list) {
        this.b = ngeVar;
        this.a = ekgb.n(list);
    }

    @Override // defpackage.nge
    public final long c() {
        return this.b.c();
    }

    @Override // defpackage.nge
    public final long e() {
        return this.b.e();
    }

    @Override // defpackage.nge
    public final void l(long j) {
        this.b.l(j);
    }

    @Override // defpackage.nge
    public final boolean n(msd msdVar) {
        return this.b.n(msdVar);
    }

    @Override // defpackage.nge
    public final boolean o() {
        return this.b.o();
    }
}
