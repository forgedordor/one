package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hvi extends huy {
    private final Object c;

    public hvi(Object obj, int i) {
        super(i, 1);
        this.c = obj;
    }

    @Override // defpackage.huy, java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        this.a++;
        return this.c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        b();
        this.a--;
        return this.c;
    }
}
