package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekfb implements Iterator {
    final /* synthetic */ ekfc a;
    private int b;
    private int c;
    private int d;
    private int e;

    public ekfb(ekfc ekfcVar) {
        this.a = ekfcVar;
        ekfd ekfdVar = ekfcVar.b;
        this.b = ekfdVar.e;
        this.c = -1;
        this.d = ekfdVar.d;
        this.e = ekfdVar.c;
    }

    private final void a() {
        if (this.a.b.d != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.b != -2 && this.e > 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        ekfc ekfcVar = this.a;
        Object objA = ekfcVar.a(this.b);
        int i = this.b;
        this.c = i;
        this.b = ekfcVar.b.f[i];
        this.e--;
        return objA;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a();
        ekcw.b(this.c != -1);
        ekfd ekfdVar = this.a.b;
        int i = this.c;
        ekfdVar.g(i, ekfh.b(ekfdVar.a[i]));
        if (this.b == ekfdVar.c) {
            this.b = this.c;
        }
        this.c = -1;
        this.d = ekfdVar.d;
    }
}
