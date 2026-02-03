package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hvo extends hvn implements Map.Entry, fdcq {
    private final hvu b;
    private Object c;

    public hvo(hvu hvuVar, Object obj, Object obj2) {
        super(obj, obj2);
        this.b = hvuVar;
        this.c = obj2;
    }

    @Override // defpackage.hvn, java.util.Map.Entry
    public final Object getValue() {
        return this.c;
    }

    @Override // defpackage.hvn, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.c;
        this.c = obj;
        hvs hvsVar = this.b.a;
        hvr hvrVar = hvsVar.d;
        Object obj3 = this.a;
        if (!hvrVar.containsKey(obj3)) {
            return obj2;
        }
        if (hvsVar.c) {
            Object objA = hvsVar.a();
            hvrVar.put(obj3, obj);
            hvsVar.b(objA != null ? objA.hashCode() : 0, hvrVar.b, objA, 0);
        } else {
            hvrVar.put(obj3, obj);
        }
        hvsVar.e = hvrVar.d;
        return obj2;
    }
}
