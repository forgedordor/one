package defpackage;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekjm implements ListIterator {
    final Object a;
    int b;
    ekjk c;
    ekjk d;
    ekjk e;
    final /* synthetic */ ekjn f;

    public ekjm(ekjn ekjnVar, Object obj) {
        this.f = ekjnVar;
        this.a = obj;
        ekjj ekjjVar = (ekjj) ekjnVar.c.get(obj);
        this.c = ekjjVar == null ? null : ekjjVar.a;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        this.e = this.f.a(this.a, obj, this.c);
        this.b++;
        this.d = null;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.c != null;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.e != null;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        ekjk ekjkVar = this.c;
        if (ekjkVar == null) {
            throw new NoSuchElementException();
        }
        this.d = ekjkVar;
        this.e = ekjkVar;
        this.c = ekjkVar.e;
        this.b++;
        return this.d.b;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        ekjk ekjkVar = this.e;
        if (ekjkVar == null) {
            throw new NoSuchElementException();
        }
        this.d = ekjkVar;
        this.c = ekjkVar;
        this.e = ekjkVar.f;
        this.b--;
        return this.d.b;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        ejwl.m(this.d != null, "no calls to next() since the last call to remove()");
        ekjk ekjkVar = this.d;
        if (ekjkVar != this.c) {
            this.e = ekjkVar.f;
            this.b--;
        } else {
            this.c = ekjkVar.e;
        }
        this.f.f(ekjkVar);
        this.d = null;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        ejwl.l(this.d != null);
        this.d.b = obj;
    }

    public ekjm(ekjn ekjnVar, Object obj, int i) {
        this.f = ekjnVar;
        ekjj ekjjVar = (ekjj) ekjnVar.c.get(obj);
        int i2 = ekjjVar == null ? 0 : ekjjVar.c;
        ejwl.x(i, i2);
        if (i >= i2 / 2) {
            this.e = ekjjVar == null ? null : ekjjVar.b;
            this.b = i2;
            while (i < i2) {
                previous();
                i++;
            }
        } else {
            this.c = ekjjVar == null ? null : ekjjVar.a;
            while (i > 0) {
                next();
                i--;
            }
        }
        this.a = obj;
        this.d = null;
    }
}
