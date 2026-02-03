package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class dngz {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object a(defpackage.dnhb r4, defpackage.dngy r5, boolean r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof defpackage.dnha
            if (r0 == 0) goto L13
            r0 = r7
            dnha r0 = (defpackage.dnha) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            dnha r0 = new dnha
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r7)
            goto L3f
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.fctl.b(r7)
            java.util.List r5 = defpackage.fcva.b(r5)
            r0.b = r3
            java.lang.Object r7 = b(r4, r5, r6, r0)
            if (r7 != r1) goto L3f
            return r1
        L3f:
            java.util.Map r7 = (java.util.Map) r7
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            boolean r4 = r7.containsValue(r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dngz.a(dnhb, dngy, boolean, fcxy):java.lang.Object");
    }

    public static /* synthetic */ Object b(dnhb dnhbVar, List list, boolean z, fcxy fcxyVar) {
        if (!z || !c(dnhbVar, list)) {
            dnhi dnhiVar = (dnhi) dnhbVar;
            return dnhiVar.a.c("PermissionsManager#showPermissionsRequestDialog", new dnhh(list, dnhiVar, null), fcxyVar);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(fddu.f(fcwa.a(fcva.p(list, 10)), 16));
        for (Object obj : list) {
            linkedHashMap.put(obj, true);
        }
        return linkedHashMap;
    }

    public static boolean c(dnhb dnhbVar, List list) {
        list.getClass();
        if (list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!dnhbVar.d((dngy) it.next())) {
                return false;
            }
        }
        return true;
    }
}
