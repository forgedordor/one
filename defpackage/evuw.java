package defpackage;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evuw implements Iterator {
    private final ArrayDeque a;
    private evqp b;

    public evuw(evqs evqsVar) {
        if (!(evqsVar instanceof evuy)) {
            this.a = null;
            this.b = (evqp) evqsVar;
            return;
        }
        evuy evuyVar = (evuy) evqsVar;
        ArrayDeque arrayDeque = new ArrayDeque(evuyVar.g);
        this.a = arrayDeque;
        arrayDeque.push(evuyVar);
        this.b = b(evuyVar.e);
    }

    private final evqp b(evqs evqsVar) {
        while (evqsVar instanceof evuy) {
            evuy evuyVar = (evuy) evqsVar;
            this.a.push(evuyVar);
            int i = evuy.h;
            evqsVar = evuyVar.e;
        }
        return (evqp) evqsVar;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final evqp next() {
        evqp evqpVarB;
        evqp evqpVar = this.b;
        if (evqpVar == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.a;
            evqpVarB = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            evuy evuyVar = (evuy) arrayDeque.pop();
            int i = evuy.h;
            evqpVarB = b(evuyVar.f);
        } while (evqpVarB.H());
        this.b = evqpVarB;
        return evqpVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
