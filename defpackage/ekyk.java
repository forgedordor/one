package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekyk implements Iterator {
    final /* synthetic */ Iterator a;
    private ekyl b;
    private int c = 0;

    public ekyk(Iterator it) {
        this.a = it;
        this.b = (ekyl) it.next();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c < this.b.b || this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.c;
        if (i < this.b.b) {
            this.c = i + 1;
        } else {
            this.c = 1;
            this.b = (ekyl) this.a.next();
        }
        return Integer.valueOf(this.b.a);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
