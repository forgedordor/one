package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class ekde implements Iterator {
    int b;
    int c;
    int d = -1;
    final /* synthetic */ ekdi e;

    public ekde(ekdi ekdiVar) {
        this.e = ekdiVar;
        this.b = ekdiVar.e;
        this.c = ekdiVar.c();
    }

    private final void b() {
        if (this.e.e != this.b) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object a(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        b();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.c;
        this.d = i;
        Object objA = a(i);
        this.c = this.e.d(this.c);
        return objA;
    }

    @Override // java.util.Iterator
    public final void remove() {
        b();
        ekcw.b(this.d >= 0);
        this.b += 32;
        int i = this.d;
        ekdi ekdiVar = this.e;
        ekdiVar.remove(ekdiVar.g(i));
        this.c = ekdiVar.a(this.c, this.d);
        this.d = -1;
    }
}
