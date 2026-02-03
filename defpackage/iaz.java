package defpackage;

import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iaz implements ListIterator, fdcn {
    final /* synthetic */ fdcg a;
    final /* synthetic */ iba b;

    public iaz(fdcg fdcgVar, iba ibaVar) {
        this.a = fdcgVar;
        this.b = ibaVar;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        iad.b();
        throw new fcta();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.a.a < this.b.a + (-1);
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.a.a >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        fdcg fdcgVar = this.a;
        int i = fdcgVar.a + 1;
        iba ibaVar = this.b;
        iad.a(i, ibaVar.a);
        fdcgVar.a = i;
        return ibaVar.get(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.a.a + 1;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        fdcg fdcgVar = this.a;
        iba ibaVar = this.b;
        int i = fdcgVar.a;
        iad.a(i, ibaVar.a);
        fdcgVar.a = i - 1;
        return ibaVar.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.a.a;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ void remove() {
        iad.b();
        throw new fcta();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        iad.b();
        throw new fcta();
    }
}
