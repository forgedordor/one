package defpackage;

import java.util.Comparator;
import java.util.SortedSet;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekpd extends ekpc implements SortedSet {
    public ekpd(SortedSet sortedSet, ejwm ejwmVar) {
        super(sortedSet, ejwmVar);
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.a).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return ekjc.e(this.a.iterator(), this.b);
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new ekpd(((SortedSet) this.a).headSet(obj), this.b);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.a;
        while (true) {
            ejwm ejwmVar = this.b;
            Object objLast = sortedSetHeadSet.last();
            if (ejwmVar.a(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new ekpd(((SortedSet) this.a).subSet(obj, obj2), this.b);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new ekpd(((SortedSet) this.a).tailSet(obj), this.b);
    }
}
