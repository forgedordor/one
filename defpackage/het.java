package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class het {
    public static final float a(float f, float f2, float f3, float f4, float f5) {
        return f5 <= f3 ? f : f5 >= f4 ? f2 : kjx.b(f, f2, (f5 - f3) / (f4 - f3));
    }

    public static final csz b(float f, List list, boolean z) {
        int i = cta.a;
        cue cueVar = new cue(1);
        cueVar.d(0.0f);
        if (f != 0.0f && !list.isEmpty()) {
            fddq fddqVarR = fddu.r(1, list.size());
            ArrayList arrayList = new ArrayList(fcva.p(fddqVarR, 10));
            fcvy it = fddqVarR.iterator();
            while (((fddp) it).a) {
                int iA = it.a();
                int i2 = iA - 1;
                heg hegVar = (heg) list.get(i2);
                heg hegVar2 = (heg) list.get(iA);
                cueVar.d(iA == fcva.e(list) ? 1.0f : cueVar.a(i2) + ((z ? ((hef) fcva.N(hegVar2)).c - ((hef) fcva.N(hegVar)).c : ((hef) fcva.S(hegVar)).c - ((hef) fcva.S(hegVar2)).c) / f));
                arrayList.add(true);
            }
        }
        return cueVar;
    }

    public static final heg c(final heg hegVar, float f, float f2, float f3, hef hefVar, int i) {
        ArrayList arrayList = new ArrayList(hegVar.a());
        int iA = hegVar.a();
        for (int i2 = 0; i2 < iA; i2++) {
            hef hefVar2 = hegVar.get(i2);
            if (!hefVar2.e) {
                arrayList.add(hefVar2);
            }
        }
        final float size = f3 / arrayList.size();
        heg hegVarB = heh.b(f, f2, i, (hefVar.b - (size / 2.0f)) + f3, new fdap() { // from class: hes
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                heg hegVar2 = hegVar;
                hek hekVar = (hek) obj;
                int iA2 = hegVar2.a();
                for (int i3 = 0; i3 < iA2; i3++) {
                    float f4 = size;
                    hef hefVar3 = hegVar2.get(i3);
                    hekVar.b(hefVar3.a - Math.abs(f4), hefVar3.e);
                }
                return fctx.a;
            }
        });
        ArrayList arrayList2 = new ArrayList(hegVarB.a());
        int iA2 = hegVarB.a();
        for (int i3 = 0; i3 < iA2; i3++) {
            hef hefVar3 = hegVarB.get(i3);
            arrayList2.add(new hef(hefVar3.a, hefVar3.b, hegVar.get(i3).c, hefVar3.d, hefVar3.e, hefVar3.f, hefVar3.g));
        }
        return new heg(arrayList2);
    }

    public static final heg d(final heg hegVar, final int i, final int i2, float f, float f2) {
        float f3 = hegVar.get(i).a - hegVar.get(i).g;
        int i3 = i > i2 ? 1 : -1;
        int i4 = hegVar.b;
        return heh.b(f, f2, i4 + i3, hegVar.get(i4).b + ((f3 + f2) * i3), new fdap() { // from class: her
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                hek hekVar = (hek) obj;
                List listAq = fcva.aq(hegVar);
                int i5 = i;
                hef hefVar = (hef) listAq.get(i5);
                listAq.remove(i5);
                listAq.add(i2, hefVar);
                int size = listAq.size();
                for (int i6 = 0; i6 < size; i6++) {
                    hef hefVar2 = (hef) listAq.get(i6);
                    hekVar.b(hefVar2.a, hefVar2.e);
                }
                return fctx.a;
            }
        });
    }
}
