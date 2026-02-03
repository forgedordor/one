package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejun extends ejvf {
    final ejvf a;
    final ejvf b;

    public ejun(ejvf ejvfVar, ejvf ejvfVar2) {
        this.a = ejvfVar;
        this.b = ejvfVar2;
    }

    @Override // defpackage.ejvf
    public final void b(BitSet bitSet) {
        BitSet bitSet2 = new BitSet();
        this.a.b(bitSet2);
        BitSet bitSet3 = new BitSet();
        this.b.b(bitSet3);
        bitSet2.and(bitSet3);
        bitSet.or(bitSet2);
    }

    @Override // defpackage.ejvf
    public final boolean c(char c) {
        return this.a.c(c) && this.b.c(c);
    }

    public final String toString() {
        ejvf ejvfVar = this.b;
        return "CharMatcher.and(" + this.a.toString() + ", " + ejvfVar.toString() + ")";
    }
}
