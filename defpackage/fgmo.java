package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgmo {
    private final BitSet a;

    public fgmo(fgmn fgmnVar) {
        this.a = fgmnVar.a;
    }

    public static fgmn a() {
        return new fgmn(new BitSet());
    }

    public final fgmn b() {
        return new fgmn((BitSet) this.a.clone());
    }

    public final boolean c(char c) {
        return this.a.get(c);
    }
}
