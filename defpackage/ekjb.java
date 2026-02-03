package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekjb extends ekqg {
    private final Object a;
    private boolean b;

    public ekjb(Object obj) {
        this.a = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.b) {
            throw new NoSuchElementException();
        }
        this.b = true;
        return this.a;
    }
}
