package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hoe implements Iterator, fdcn {
    private final hra a;
    private final int b;
    private int c;
    private final int d;

    public hoe(hra hraVar, int i, int i2) {
        this.a = hraVar;
        this.b = i2;
        this.c = i;
        this.d = hraVar.g;
        if (hraVar.f) {
            hrc.g();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c < this.b;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        hra hraVar = this.a;
        int i = hraVar.g;
        int i2 = this.d;
        if (i != i2) {
            hrc.g();
        }
        int i3 = this.c;
        this.c = hrc.a(hraVar.a, i3) + i3;
        return new hrb(hraVar, i3, i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
