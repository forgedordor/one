package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpoi implements fdat {
    final /* synthetic */ dpnr a;
    final /* synthetic */ dpmg b;

    public dpoi(dpnr dpnrVar, dpmg dpmgVar) {
        this.a = dpnrVar;
        this.b = dpmgVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            hmlVar.v(-1633490746);
            final dpnr dpnrVar = this.a;
            boolean zF = hmlVar.F(dpnrVar);
            final dpmg dpmgVar = this.b;
            boolean zD = zF | hmlVar.D(dpmgVar);
            Object objF = hmlVar.f();
            if (zD || objF == hmk.a) {
                objF = new fdat() { // from class: dpoh
                    @Override // defpackage.fdat
                    public final Object a(Object obj3, Object obj4) {
                        izm izmVar = (izm) obj3;
                        final kil kilVar = (kil) obj4;
                        izmVar.getClass();
                        dpnr dpnrVar2 = dpnrVar;
                        List list = dpnrVar2.a;
                        final LinkedHashMap linkedHashMap = new LinkedHashMap(fddu.f(fcwa.a(fcva.p(list, 10)), 16));
                        for (Object obj5 : list) {
                            dpmg dpmgVar2 = dpmgVar;
                            linkedHashMap.put(obj5, ((dpnq) obj5).d(izmVar, dpmgVar2, kilVar.a, dpnrVar2));
                        }
                        long j = kilVar.a;
                        return izmVar.ej(kil.b(j), kil.a(j), fcvp.a, new fdap() { // from class: dpog
                            @Override // defpackage.fdap
                            public final Object invoke(Object obj6) {
                                iyk iykVar = (iyk) obj6;
                                iykVar.getClass();
                                for (Map.Entry entry : linkedHashMap.entrySet()) {
                                    dpnq dpnqVar = (dpnq) entry.getKey();
                                    List list2 = (List) entry.getValue();
                                    int size = list2.size();
                                    for (int i = 0; i < size; i++) {
                                        kil kilVar2 = kilVar;
                                        dpnqVar.e(iykVar, kilVar2.a, (iyl) list2.get(i));
                                    }
                                }
                                return fctx.a;
                            }
                        });
                    }
                };
                hmlVar.y(objF);
            }
            hmlVar.o();
            izg.a(null, (fdat) objF, hmlVar, 0, 1);
        }
        return fctx.a;
    }
}
