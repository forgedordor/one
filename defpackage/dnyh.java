package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnyh extends fcyz implements fdau {
    /* synthetic */ Object a;
    /* synthetic */ Object b;

    public dnyh(fcxy fcxyVar) {
        super(3, fcxyVar);
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dnyh dnyhVar = new dnyh((fcxy) obj3);
        dnyhVar.a = (dnxu) obj;
        dnyhVar.b = (Map) obj2;
        return dnyhVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        Object obj2 = this.a;
        ?? r0 = this.b;
        int iOrdinal = ((dnxu) obj2).ordinal();
        if (iOrdinal == 0) {
            return r0;
        }
        if (iOrdinal == 1) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : r0.entrySet()) {
                if (((dnvg) entry.getValue()).d) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return linkedHashMap;
        }
        if (iOrdinal != 2) {
            throw new fctg();
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : r0.entrySet()) {
            if (!((dnvg) entry2.getValue()).d) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        return linkedHashMap2;
    }
}
