package defpackage;

import java.util.Comparator;
import java.util.SortedSet;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekqc extends ekqb implements SortedSet {
    private static final long serialVersionUID = 0;

    public ekqc(SortedSet sortedSet, Object obj) {
        super(sortedSet, obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.ekqb
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final SortedSet a() {
        return (SortedSet) super.a();
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        Comparator comparator;
        synchronized (this.g) {
            comparator = a().comparator();
        }
        return comparator;
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Object objFirst;
        synchronized (this.g) {
            objFirst = a().first();
        }
        return objFirst;
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        ekqc ekqcVar;
        Object obj2 = this.g;
        synchronized (obj2) {
            ekqcVar = new ekqc(a().headSet(obj), obj2);
        }
        return ekqcVar;
    }

    @Override // java.util.SortedSet
    public final Object last() {
        Object objLast;
        synchronized (this.g) {
            objLast = a().last();
        }
        return objLast;
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        ekqc ekqcVar;
        Object obj3 = this.g;
        synchronized (obj3) {
            ekqcVar = new ekqc(a().subSet(obj, obj2), obj3);
        }
        return ekqcVar;
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        ekqc ekqcVar;
        Object obj2 = this.g;
        synchronized (obj2) {
            ekqcVar = new ekqc(a().tailSet(obj), obj2);
        }
        return ekqcVar;
    }
}
