package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejvd extends ejvf {
    final ejvf a;
    final ejvf b;

    public ejvd(ejvf ejvfVar, ejvf ejvfVar2) {
        this.a = ejvfVar;
        ejvfVar2.getClass();
        this.b = ejvfVar2;
    }

    @Override // defpackage.ejvf
    public final void b(BitSet bitSet) {
        this.a.b(bitSet);
        this.b.b(bitSet);
    }

    @Override // defpackage.ejvf
    public final boolean c(char c) {
        return this.a.c(c) || this.b.c(c);
    }

    public final String toString() {
        ejvf ejvfVar = this.b;
        return "CharMatcher.or(" + this.a.toString() + ", " + ejvfVar.toString() + ")";
    }
}
