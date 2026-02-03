package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fglg implements Iterator {
    private fgle a;
    private final fgle b;

    public fglg(fgle fgleVar, fgle fgleVar2) {
        this.a = fgleVar;
        this.b = fgleVar2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        fgle fgleVar = this.a;
        return (fgleVar == null || fgleVar == this.b) ? false : true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        fgle fgleVar = this.a;
        this.a = fgleVar.i;
        return fgleVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
