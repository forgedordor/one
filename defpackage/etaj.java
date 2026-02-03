package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class etaj implements Iterator {
    etak a;
    etak b = null;
    int c;
    final /* synthetic */ etal d;

    public etaj(etal etalVar) {
        this.d = etalVar;
        this.a = etalVar.e.d;
        this.c = etalVar.d;
    }

    public final etak a() {
        etal etalVar = this.d;
        etak etakVar = this.a;
        if (etakVar == etalVar.e) {
            throw new NoSuchElementException();
        }
        if (etalVar.d != this.c) {
            throw new ConcurrentModificationException();
        }
        this.a = etakVar.d;
        this.b = etakVar;
        return etakVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a != this.d.e;
    }

    @Override // java.util.Iterator
    public final void remove() {
        etak etakVar = this.b;
        if (etakVar == null) {
            throw new IllegalStateException();
        }
        etal etalVar = this.d;
        etalVar.e(etakVar, true);
        this.b = null;
        this.c = etalVar.d;
    }
}
