package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kpv implements ksk, kpq {
    private final ksa a;
    private Map b;
    private final Map c;
    private final Map d;
    private final kpy e;
    private final int[] f;
    private final int[] g;

    public kpv(kio kioVar) {
        ksa ksaVar = new ksa(null);
        ksaVar.af(this);
        this.a = ksaVar;
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new kpy(kioVar);
        this.f = new int[2];
        this.g = new int[2];
    }

    private final long e(krz krzVar, long j) {
        boolean z = krzVar instanceof ksg;
        Object obj = krzVar.aq;
        String str = krzVar.v;
        int i = 0;
        if (!z) {
            if (!(obj instanceof ixk)) {
                Log.w("CCL", "Nothing to measure for widget: ".concat(String.valueOf(str)));
                return ctg.c(0, 0);
            }
            iyl iylVarE = ((ixk) obj).e(j);
            this.b.put(obj, iylVarE);
            return ctg.c(iylVarE.a, iylVarE.b);
        }
        int i2 = kil.k(j) ? 1073741824 : kil.i(j) ? Integer.MIN_VALUE : 0;
        if (kil.j(j)) {
            i = 1073741824;
        } else if (kil.h(j)) {
            i = Integer.MIN_VALUE;
        }
        ksg ksgVar = (ksg) krzVar;
        ksgVar.b(i2, kil.b(j), i, kil.a(j));
        return ctg.c(ksgVar.aU, ksgVar.aV);
    }

    private static final void f(int i, int i2, int i3, int i4, boolean z, boolean z2, int i5, int[] iArr) {
        if (i == 0) {
            throw null;
        }
        int i6 = i - 1;
        if (i6 == 0) {
            iArr[0] = i2;
            iArr[1] = i2;
            return;
        }
        if (i6 == 1) {
            iArr[0] = 0;
            iArr[1] = i5;
        } else {
            if (i6 != 2) {
                iArr[0] = i5;
                iArr[1] = i5;
                return;
            }
            boolean z3 = z2 || (i4 == 1 ? i3 != 1 || z : i4 == 2);
            iArr[0] = true != z3 ? 0 : i2;
            if (true != z3) {
                i2 = i5;
            }
            iArr[1] = i2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0199  */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    @Override // defpackage.ksk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.krz r27, defpackage.ksj r28) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kpv.b(krz, ksj):void");
    }

    public final void c(iyk iykVar, List list, Map map) {
        iyl iylVar;
        iyk iykVar2;
        this.b = map;
        Map map2 = this.d;
        int i = 0;
        if (map2.isEmpty()) {
            ArrayList arrayList = this.a.aL;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                krz krzVar = (krz) arrayList.get(i2);
                Object obj = krzVar.aq;
                if (obj instanceof ixk) {
                    krk krkVar = krzVar.u;
                    krz krzVar2 = krkVar.a;
                    if (krzVar2 != null) {
                        krkVar.b = krzVar2.k();
                        krkVar.c = krkVar.a.l();
                        krkVar.d = krkVar.a.i();
                        krkVar.e = krkVar.a.g();
                        krkVar.a(krkVar.a.u);
                    }
                    map2.put(kpw.a((ixk) obj), new krk(krkVar));
                }
            }
        }
        int size2 = list.size();
        while (i < size2) {
            ixk ixkVar = (ixk) list.get(i);
            final krk krkVar2 = (krk) map2.get(kpw.a(ixkVar));
            if (krkVar2 == null || (iylVar = (iyl) this.b.get(ixkVar)) == null || krkVar2.q == 8) {
                iykVar2 = iykVar;
            } else if (Float.isNaN(krkVar2.h) && Float.isNaN(krkVar2.i) && Float.isNaN(krkVar2.j) && Float.isNaN(krkVar2.k) && Float.isNaN(krkVar2.l) && Float.isNaN(krkVar2.m) && Float.isNaN(krkVar2.n) && Float.isNaN(krkVar2.o) && Float.isNaN(krkVar2.p)) {
                iykVar.t(iylVar, kjc.a(krkVar2.b - kjb.a(0L), krkVar2.c - kjb.b(0L)), 0.0f);
                iykVar2 = iykVar;
            } else {
                iykVar2 = iykVar;
                iykVar2.u(iylVar, krkVar2.b - kjb.a(0L), krkVar2.c - kjb.b(0L), Float.isNaN(krkVar2.m) ? 0.0f : krkVar2.m, new fdap() { // from class: kpb
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        krk krkVar3 = krkVar2;
                        ikl iklVar = (ikl) obj2;
                        if (!Float.isNaN(krkVar3.f) || !Float.isNaN(krkVar3.g)) {
                            iklVar.C(ila.a(Float.isNaN(krkVar3.f) ? 0.5f : krkVar3.f, Float.isNaN(krkVar3.g) ? 0.5f : krkVar3.g));
                        }
                        if (!Float.isNaN(krkVar3.h)) {
                            iklVar.u(krkVar3.h);
                        }
                        if (!Float.isNaN(krkVar3.i)) {
                            iklVar.v(krkVar3.i);
                        }
                        if (!Float.isNaN(krkVar3.j)) {
                            iklVar.w(krkVar3.j);
                        }
                        if (!Float.isNaN(krkVar3.k)) {
                            iklVar.D(krkVar3.k);
                        }
                        if (!Float.isNaN(krkVar3.l)) {
                            iklVar.E(krkVar3.l);
                        }
                        if (!Float.isNaN(krkVar3.m)) {
                            iklVar.z(krkVar3.m);
                        }
                        if (!Float.isNaN(krkVar3.n) || !Float.isNaN(krkVar3.o)) {
                            iklVar.x(Float.isNaN(krkVar3.n) ? 1.0f : krkVar3.n);
                            iklVar.y(Float.isNaN(krkVar3.o) ? 1.0f : krkVar3.o);
                        }
                        if (!Float.isNaN(krkVar3.p)) {
                            iklVar.a(krkVar3.p);
                        }
                        return fctx.a;
                    }
                });
            }
            i++;
            iykVar = iykVar2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00da A[LOOP:1: B:34:0x00d4->B:36:0x00da, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x022a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long d(long r17, defpackage.kji r19, final defpackage.kpo r20, final java.util.List r21, java.util.Map r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kpv.d(long, kji, kpo, java.util.List, java.util.Map):long");
    }

    @Override // defpackage.ksk
    public final void a() {
    }
}
