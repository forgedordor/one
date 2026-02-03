package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cvc implements Iterator, fdcn {
    public int a = -1;
    final /* synthetic */ cvd b;
    private final Iterator c;

    public cvc(cvd cvdVar) {
        this.b = cvdVar;
        this.c = fdey.a(new cvb(cvdVar, this, null));
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.c.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.a;
        if (i != -1) {
            this.b.a.f(i);
            this.a = -1;
        }
    }
}
