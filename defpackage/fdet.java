package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdet implements Iterator, fdcn {
    final /* synthetic */ fdeu a;
    private Object b;
    private int c = -2;

    public fdet(fdeu fdeuVar) {
        this.a = fdeuVar;
    }

    private final void a() {
        Object objInvoke;
        if (this.c == -2) {
            objInvoke = this.a.a.invoke();
        } else {
            fdeu fdeuVar = this.a;
            Object obj = this.b;
            obj.getClass();
            objInvoke = fdeuVar.b.invoke(obj);
        }
        this.b = objInvoke;
        this.c = objInvoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.c < 0) {
            a();
        }
        return this.c == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.c < 0) {
            a();
        }
        if (this.c == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.b;
        obj.getClass();
        this.c = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
