package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ektq implements Iterator {
    final /* synthetic */ ektr a;
    private int b = 0;

    public ektq(ektr ektrVar) {
        this.a = ektrVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.a.b;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.b;
        this.b = i + 1;
        ektt ekttVar = this.a.a;
        return ekttVar.e(ekttVar.a[i] & 31);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
