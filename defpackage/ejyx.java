package defpackage;

import java.util.AbstractQueue;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejyx<K, V> extends AbstractQueue<ekal<K, V>> {
    final ekal a = new ejyv();

    @Override // java.util.Queue
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ekal peek() {
        ekal ekalVar = this.a;
        ekal ekalVar2 = ((ejyv) ekalVar).a;
        if (ekalVar2 == ekalVar) {
            return null;
        }
        return ekalVar2;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        ekal ekalVar = this.a;
        ejyv ejyvVar = (ejyv) ekalVar;
        ekal ekalVar2 = ejyvVar.a;
        while (ekalVar2 != ekalVar) {
            ekal ekalVarF = ekalVar2.f();
            ekak.e(ekalVar2);
            ekalVar2 = ekalVarF;
        }
        ejyvVar.a = ekalVar;
        ejyvVar.b = ekalVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return ((ekal) obj).f() != ejzp.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        ekal ekalVar = this.a;
        return ((ejyv) ekalVar).a == ekalVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<ekal<K, V>> iterator() {
        return new ejyw(this, peek());
    }

    @Override // java.util.Queue
    public final /* bridge */ /* synthetic */ boolean offer(Object obj) {
        ekal ekalVar = (ekal) obj;
        ekak.c(ekalVar.h(), ekalVar.f());
        ekal ekalVar2 = this.a;
        ekak.c(((ejyv) ekalVar2).b, ekalVar);
        ekak.c(ekalVar, ekalVar2);
        return true;
    }

    @Override // java.util.Queue
    public final /* bridge */ /* synthetic */ Object poll() {
        ekal ekalVar = this.a;
        ekal ekalVar2 = ((ejyv) ekalVar).a;
        if (ekalVar2 == ekalVar) {
            return null;
        }
        remove(ekalVar2);
        return ekalVar2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        ekal ekalVar = (ekal) obj;
        ekal ekalVarH = ekalVar.h();
        ekal ekalVarF = ekalVar.f();
        ekak.c(ekalVarH, ekalVarF);
        ekak.e(ekalVar);
        return ekalVarF != ejzp.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        ekal ekalVar = this.a;
        int i = 0;
        for (ekal ekalVarF = ((ejyv) ekalVar).a; ekalVarF != ekalVar; ekalVarF = ekalVarF.f()) {
            i++;
        }
        return i;
    }
}
