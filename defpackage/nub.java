package defpackage;

import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nub implements noq {
    final /* synthetic */ nuc a;

    public nub(nuc nucVar) {
        this.a = nucVar;
    }

    @Override // defpackage.noq
    public final noo b(long j) {
        nuc nucVar = this.a;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(nucVar.c.f(j));
        long j2 = nucVar.b;
        nor norVar = new nor(j, mgb.s((bigIntegerValueOf.multiply(BigInteger.valueOf(j2 - r6)).divide(BigInteger.valueOf(nucVar.d)).longValue() + r6) - 30000, nucVar.a, j2 - 1));
        return new noo(norVar, norVar);
    }

    @Override // defpackage.noq
    public final long w() {
        nuc nucVar = this.a;
        return nucVar.c.e(nucVar.d);
    }

    @Override // defpackage.noq
    public final boolean y() {
        return true;
    }
}
