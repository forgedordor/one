package defpackage;

import java.util.AbstractQueue;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekai<K, V> extends AbstractQueue<ekal<K, V>> {
    final ekal a = new ekag();

    @Override // java.util.Queue
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ekal peek() {
        ekal ekalVar = this.a;
        ekal ekalVar2 = ((ekag) ekalVar).a;
        if (ekalVar2 == ekalVar) {
            return null;
        }
        return ekalVar2;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        ekal ekalVar = this.a;
        ekag ekagVar = (ekag) ekalVar;
        ekal ekalVar2 = ekagVar.a;
        while (ekalVar2 != ekalVar) {
            ekal ekalVarG = ekalVar2.g();
            ekak.f(ekalVar2);
            ekalVar2 = ekalVarG;
        }
        ekagVar.a = ekalVar;
        ekagVar.b = ekalVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return ((ekal) obj).g() != ejzp.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        ekal ekalVar = this.a;
        return ((ekag) ekalVar).a == ekalVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<ekal<K, V>> iterator() {
        return new ekah(this, peek());
    }

    @Override // java.util.Queue
    public final /* bridge */ /* synthetic */ boolean offer(Object obj) {
        ekal ekalVar = (ekal) obj;
        ekak.d(ekalVar.i(), ekalVar.g());
        ekal ekalVar2 = this.a;
        ekak.d(((ekag) ekalVar2).b, ekalVar);
        ekak.d(ekalVar, ekalVar2);
        return true;
    }

    @Override // java.util.Queue
    public final /* bridge */ /* synthetic */ Object poll() {
        ekal ekalVar = this.a;
        ekal ekalVar2 = ((ekag) ekalVar).a;
        if (ekalVar2 == ekalVar) {
            return null;
        }
        remove(ekalVar2);
        return ekalVar2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        ekal ekalVar = (ekal) obj;
        ekal ekalVarI = ekalVar.i();
        ekal ekalVarG = ekalVar.g();
        ekak.d(ekalVarI, ekalVarG);
        ekak.f(ekalVar);
        return ekalVarG != ejzp.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        ekal ekalVar = this.a;
        int i = 0;
        for (ekal ekalVarG = ((ekag) ekalVar).a; ekalVarG != ekalVar; ekalVarG = ekalVarG.g()) {
            i++;
        }
        return i;
    }
}
