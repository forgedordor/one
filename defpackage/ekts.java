package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekts implements Iterator {
    final /* synthetic */ ektt a;
    private final ekrz b;
    private int c;
    private int d;

    public ekts(ektt ekttVar, ekrz ekrzVar, int i) {
        this.a = ekttVar;
        this.b = ekrzVar;
        int i2 = i & 31;
        this.c = i2;
        this.d = i >>> (i2 + 5);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objC = this.b.c(this.a.f(this.c));
        int i = this.d;
        if (i == 0) {
            this.c = -1;
            return objC;
        }
        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i) + 1;
        this.d >>>= iNumberOfTrailingZeros;
        this.c += iNumberOfTrailingZeros;
        return objC;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
