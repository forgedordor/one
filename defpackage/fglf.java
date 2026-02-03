package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fglf implements Iterable {
    private final fgle a;
    private final fgle b;

    public fglf(fgle fgleVar, fgle fgleVar2) {
        this.a = fgleVar;
        this.b = fgleVar2;
    }

    @Override // java.lang.Iterable
    public final Iterator<fgle> iterator() {
        return new fglg(this.a, this.b);
    }
}
