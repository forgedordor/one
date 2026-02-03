package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejuv extends ejut {
    private final char a;

    public ejuv(char c) {
        this.a = c;
    }

    @Override // defpackage.ejvf
    public final void b(BitSet bitSet) {
        bitSet.set(this.a);
    }

    @Override // defpackage.ejvf
    public final boolean c(char c) {
        return c == this.a;
    }

    @Override // defpackage.ejut, defpackage.ejvf
    public final ejvf f() {
        return new ejux(this.a);
    }

    @Override // defpackage.ejvf
    public final ejvf g(ejvf ejvfVar) {
        return ejvfVar.c(this.a) ? ejvfVar : new ejvd(this, ejvfVar);
    }

    @Override // defpackage.ejvf
    public final String h(CharSequence charSequence, char c) {
        return charSequence.toString().replace(this.a, c);
    }

    public final String toString() {
        return "CharMatcher.is('" + ejvf.q(this.a) + "')";
    }
}
