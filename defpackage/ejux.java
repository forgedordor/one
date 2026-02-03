package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejux extends ejut {
    private final char a;

    public ejux(char c) {
        this.a = c;
    }

    @Override // defpackage.ejvf
    public final void b(BitSet bitSet) {
        char c = this.a;
        bitSet.set(0, c);
        bitSet.set(c + 1, 65536);
    }

    @Override // defpackage.ejvf
    public final boolean c(char c) {
        return c != this.a;
    }

    @Override // defpackage.ejut, defpackage.ejvf
    public final ejvf f() {
        return new ejuv(this.a);
    }

    @Override // defpackage.ejvf
    public final ejvf g(ejvf ejvfVar) {
        return ejvfVar.c(this.a) ? ejuo.a : this;
    }

    public final String toString() {
        return "CharMatcher.isNot('" + ejvf.q(this.a) + "')";
    }
}
