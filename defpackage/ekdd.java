package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekdd extends AbstractSet {
    final /* synthetic */ ekdi a;

    public ekdd(ekdi ekdiVar) {
        this.a = ekdiVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        ekdi ekdiVar = this.a;
        Map mapN = ekdiVar.n();
        if (mapN != null) {
            return mapN.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int iF = ekdiVar.f(entry.getKey());
            if (iF != -1 && ejwh.a(ekdiVar.j(iF), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry> iterator() {
        return this.a.k();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iE;
        int iD;
        ekdi ekdiVar = this.a;
        Map mapN = ekdiVar.n();
        if (mapN != null) {
            return mapN.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (ekdiVar.u() || (iD = ekdl.d(entry.getKey(), entry.getValue(), (iE = ekdiVar.e()), ekdiVar.i(), ekdiVar.v(), ekdiVar.w(), ekdiVar.x())) == -1) {
            return false;
        }
        ekdiVar.r(iD, iE);
        ekdiVar.f--;
        ekdiVar.o();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }
}
