package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class ekbl implements Iterator {
    int b;
    int c = -1;
    int d;
    final /* synthetic */ ekbm e;

    public ekbl(ekbm ekbmVar) {
        this.e = ekbmVar;
        this.b = ekbmVar.a.a();
        this.d = ekbmVar.a.d;
    }

    private final void b() {
        if (this.e.a.d != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object a(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        b();
        return this.b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objA = a(this.b);
        int i = this.b;
        this.c = i;
        this.b = this.e.a.e(i);
        return objA;
    }

    @Override // java.util.Iterator
    public final void remove() {
        b();
        ekcw.b(this.c != -1);
        ekbm ekbmVar = this.e;
        ekbmVar.b -= ekbmVar.a.g(this.c);
        this.b--;
        this.c = -1;
        this.d = ekbmVar.a.d;
    }
}
