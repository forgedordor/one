package defpackage;

import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eklx extends ekmh {
    public final Set a;
    final ejvr b;

    public eklx(Set set, ejvr ejvrVar) {
        this.a = set;
        this.b = ejvrVar;
    }

    @Override // defpackage.ekmh
    public final Set b() {
        return new eklw(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.a.contains(obj);
    }

    @Override // defpackage.ekmh
    public final Set g() {
        return new ekls(this.a);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (ekcz.b(this.a, obj)) {
            return this.b.apply(obj);
        }
        return null;
    }

    @Override // defpackage.ekmh
    public final Collection hq() {
        return new ekcy(this.a, this.b);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        if (this.a.remove(obj)) {
            return this.b.apply(obj);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.a.size();
    }
}
