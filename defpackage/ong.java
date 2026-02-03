package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ong implements Iterator, fdcn {
    final /* synthetic */ onh a;
    private int b = -1;
    private boolean c;

    public ong(onh onhVar) {
        this.a = onhVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b + 1 < this.a.b.c();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.c = true;
        onh onhVar = this.a;
        int i = this.b + 1;
        this.b = i;
        return (ojx) onhVar.b.e(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.c) {
            throw new IllegalStateException("You must call next() before you can remove an element");
        }
        onh onhVar = this.a;
        int i = this.b;
        cvx cvxVar = onhVar.b;
        ((ojx) cvxVar.e(i)).e = null;
        int i2 = this.b;
        Object[] objArr = cvxVar.c;
        Object obj = objArr[i2];
        Object obj2 = cvy.a;
        if (obj != obj2) {
            objArr[i2] = obj2;
            cvxVar.a = true;
        }
        this.b = i2 - 1;
        this.c = false;
    }
}
