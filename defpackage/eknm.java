package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eknm implements Iterator {
    private final ekni a;
    private final Iterator b;
    private eknh c;
    private int d;
    private int e;
    private boolean f;

    public eknm(ekni ekniVar, Iterator it) {
        this.a = ekniVar;
        this.b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d > 0 || this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int iA = this.d;
        if (iA == 0) {
            eknh eknhVar = (eknh) this.b.next();
            this.c = eknhVar;
            iA = eknhVar.a();
            this.e = iA;
        }
        this.d = iA - 1;
        this.f = true;
        eknh eknhVar2 = this.c;
        eknhVar2.getClass();
        return eknhVar2.b();
    }

    @Override // java.util.Iterator
    public final void remove() {
        ekcw.b(this.f);
        if (this.e == 1) {
            this.b.remove();
        } else {
            ekni ekniVar = this.a;
            eknh eknhVar = this.c;
            eknhVar.getClass();
            ekniVar.remove(eknhVar.b());
        }
        this.e--;
        this.f = false;
    }
}
