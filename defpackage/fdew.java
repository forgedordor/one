package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdew extends fdex implements Iterator, fcxy, fdcn {
    public fcxy a;
    private int b;
    private Object c;
    private Iterator d;

    private final Throwable c() {
        int i = this.b;
        return i != 4 ? i != 5 ? new IllegalStateException(a.g(i, "Unexpected state of the iterator: ")) : new IllegalStateException("Iterator has failed.") : new NoSuchElementException();
    }

    @Override // defpackage.fdex
    public final Object a(Object obj, fcxy fcxyVar) {
        this.c = obj;
        this.b = 3;
        this.a = fcxyVar;
        return fcyl.a;
    }

    @Override // defpackage.fdex
    public final Object b(Iterator it, fcxy fcxyVar) {
        if (!it.hasNext()) {
            return fctx.a;
        }
        this.d = it;
        this.b = 2;
        this.a = fcxyVar;
        return fcyl.a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() throws Throwable {
        while (true) {
            int i = this.b;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw c();
                }
                Iterator it = this.d;
                it.getClass();
                if (it.hasNext()) {
                    this.b = 2;
                    return true;
                }
                this.d = null;
            }
            this.b = 5;
            fcxy fcxyVar = this.a;
            fcxyVar.getClass();
            this.a = null;
            fcxyVar.w(fctx.a);
        }
    }

    @Override // java.util.Iterator
    public final Object next() throws Throwable {
        int i = this.b;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.b = 1;
            Iterator it = this.d;
            it.getClass();
            return it.next();
        }
        if (i != 3) {
            throw c();
        }
        this.b = 0;
        Object obj = this.c;
        this.c = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // defpackage.fcxy
    public final fcyh u() {
        return fcyi.a;
    }

    @Override // defpackage.fcxy
    public final void w(Object obj) throws Throwable {
        fctl.b(obj);
        this.b = 4;
    }
}
