package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekji implements Iterator {
    final Set a;
    ekjk b;
    ekjk c;
    int d;
    final /* synthetic */ ekjn e;

    public ekji(ekjn ekjnVar) {
        this.e = ekjnVar;
        this.a = ekpg.g(ekjnVar.x().size());
        this.b = ekjnVar.a;
        this.d = ekjnVar.e;
    }

    private final void a() {
        if (this.e.e != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        ekjk ekjkVar;
        a();
        ekjk ekjkVar2 = this.b;
        if (ekjkVar2 == null) {
            throw new NoSuchElementException();
        }
        this.c = ekjkVar2;
        Set set = this.a;
        set.add(ekjkVar2.a);
        do {
            ekjkVar = this.b.c;
            this.b = ekjkVar;
            if (ekjkVar == null) {
                break;
            }
        } while (!set.add(ekjkVar.a));
        return this.c.a;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a();
        ejwl.m(this.c != null, "no calls to next() since the last call to remove()");
        Object obj = this.c.a;
        ekjn ekjnVar = this.e;
        ekjnVar.e(obj);
        this.c = null;
        this.d = ekjnVar.e;
    }
}
