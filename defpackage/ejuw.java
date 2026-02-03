package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejuw extends ejut {
    private final char a;
    private final char b;

    public ejuw(char c, char c2) {
        this.a = c;
        this.b = c2;
    }

    @Override // defpackage.ejvf
    public final void b(BitSet bitSet) {
        bitSet.set(this.a);
        bitSet.set(this.b);
    }

    @Override // defpackage.ejvf
    public final boolean c(char c) {
        return c == this.a || c == this.b;
    }

    public final String toString() {
        return "CharMatcher.anyOf(\"" + ejvf.q(this.a) + ejvf.q(this.b) + "\")";
    }
}
