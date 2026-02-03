package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekey extends ekfc {
    public ekey(ekfd ekfdVar) {
        super(ekfdVar);
    }

    @Override // defpackage.ekfc
    public final /* bridge */ /* synthetic */ Object a(int i) {
        return new ekev(this.b, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            ekfd ekfdVar = this.b;
            int iD = ekfdVar.d(key);
            if (iD != -1 && ejwh.a(ekfdVar.a[iD], value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        int iB = ekfh.b(key);
        ekfd ekfdVar = this.b;
        int iE = ekfdVar.e(key, iB);
        if (iE == -1 || !ejwh.a(ekfdVar.a[iE], value)) {
            return false;
        }
        ekfdVar.h(iE, iB);
        return true;
    }
}
