package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class dpmx {
    public static List a(dpnq dpnqVar, izm izmVar, dpmg dpmgVar, long j, dpnr dpnrVar) {
        dpnrVar.getClass();
        if (!dpnqVar.g()) {
            j = kil.m(j, 0, 0, 0, 0, 10);
        }
        long j2 = j;
        List listA = izmVar.a(dpnqVar.c(), new hxd(-2123080928, true, new dpnp(dpnqVar, dpmgVar, j2, dpnrVar)));
        ArrayList arrayList = new ArrayList(fcva.p(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(((ixk) it.next()).e(j2));
        }
        if (dpnqVar.h()) {
            int iB = kil.b(j2);
            int iA = kil.a(j2);
            int size = arrayList.size();
            int iF = 0;
            int iF2 = 0;
            for (int i = 0; i < size; i++) {
                iyl iylVar = (iyl) arrayList.get(i);
                iF = fddu.f(iylVar.a, iF);
                iF2 = fddu.f(iylVar.b, iF2);
                dpnqVar.l(iylVar);
                iB = fddu.g(0, iB);
                iA = fddu.g(dpnqVar.a(j2, iylVar), iA);
            }
            hox hoxVarB = dpnqVar.b();
            dpmf dpmfVar = null;
            if (iF > 0 && iF2 > 0) {
                dpmfVar = new dpmf((iF << 32) | (iF2 & 4294967295L), (iB << 32) | (iA & 4294967295L));
            }
            hoxVarB.b(dpmfVar);
        }
        return arrayList;
    }

    public static void b(dpnq dpnqVar, iyk iykVar, long j, iyl iylVar) {
        iylVar.getClass();
        dpnqVar.l(iylVar);
        iyk.A(iykVar, iylVar, 0, dpnqVar.a(j, iylVar));
    }
}
