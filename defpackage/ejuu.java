package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejuu extends ejut {
    private final char a;
    private final char b;

    public ejuu(char c, char c2) {
        ejwl.a(c2 >= c);
        this.a = c;
        this.b = c2;
    }

    @Override // defpackage.ejvf
    public final void b(BitSet bitSet) {
        bitSet.set(this.a, this.b + 1);
    }

    @Override // defpackage.ejvf
    public final boolean c(char c) {
        return this.a <= c && c <= this.b;
    }

    public final String toString() {
        return "CharMatcher.inRange('" + ejvf.q(this.a) + "', '" + ejvf.q(this.b) + "')";
    }
}
