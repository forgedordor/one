package defpackage;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcuf extends fcue implements ListIterator, fdcn {
    final /* synthetic */ fcuh c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fcuf(fcuh fcuhVar, int i) {
        super(fcuhVar);
        this.c = fcuhVar;
        fcud.c(i, fcuhVar.a());
        this.a = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.a > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.a;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        fcuh fcuhVar = this.c;
        int i = this.a - 1;
        this.a = i;
        return fcuhVar.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.a - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
