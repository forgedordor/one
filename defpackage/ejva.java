package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ejva extends ejvf {
    final ejvf b;

    public ejva(ejvf ejvfVar) {
        this.b = ejvfVar;
    }

    @Override // defpackage.ejvf
    public final void b(BitSet bitSet) {
        BitSet bitSet2 = new BitSet();
        this.b.b(bitSet2);
        bitSet2.flip(0, 65536);
        bitSet.or(bitSet2);
    }

    @Override // defpackage.ejvf
    public final boolean c(char c) {
        return !this.b.c(c);
    }

    @Override // defpackage.ejvf
    public final ejvf f() {
        return this.b;
    }

    @Override // defpackage.ejvf
    public final boolean i(CharSequence charSequence) {
        return this.b.j(charSequence);
    }

    @Override // defpackage.ejvf
    public final boolean j(CharSequence charSequence) {
        return this.b.i(charSequence);
    }

    public String toString() {
        return this.b.toString().concat(".negate()");
    }
}
