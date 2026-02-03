package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzfl {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x018c A[LOOP:2: B:56:0x0186->B:58:0x018c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [fdat] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(java.util.Map r10, defpackage.fdap r11, defpackage.fdat r12, defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzfl.a(java.util.Map, fdap, fdat, fcxy):java.lang.Object");
    }

    public static final Map b(Map map, fdat fdatVar) {
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(fcwa.a(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object key2 = entry.getKey();
            Object objA = ((fctk) entry.getValue()).a;
            if (fctk.d(objA)) {
                try {
                    objA = fdatVar.a(key2, objA);
                } catch (Throwable th) {
                    objA = fctl.a(th);
                }
            }
            linkedHashMap.put(key, new fctk(objA));
        }
        return linkedHashMap;
    }

    public static final Object d(Map map, fdau fdauVar, fcxy fcxyVar) {
        return fdjy.a(new bzfk(map, fdauVar, null), fcxyVar);
    }
}
