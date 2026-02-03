package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekmu extends ekmh {
    public final ekmj a;

    public ekmu(ekmj ekmjVar) {
        this.a = ekmjVar;
    }

    @Override // defpackage.ekmh
    public final Set b() {
        return new ekmt(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.a.q();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.a.s(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Object get(Object obj) {
        if (containsKey(obj)) {
            return new ekjd((ekjn) this.a, obj);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return this.a.A();
    }

    @Override // defpackage.ekmh, java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return this.a.x();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Object remove(Object obj) {
        if (containsKey(obj)) {
            return ((ekjn) this.a).d(obj);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.a.x().size();
    }
}
