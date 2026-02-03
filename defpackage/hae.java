package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hae implements ixm {
    final /* synthetic */ float a;

    public hae(float f) {
        this.a = f;
    }

    @Override // defpackage.ixm
    public final /* synthetic */ int a(ivu ivuVar, List list, int i) {
        return ixl.a(this, ivuVar, list, i);
    }

    @Override // defpackage.ixm
    public final /* synthetic */ int b(ivu ivuVar, List list, int i) {
        return ixl.b(this, ivuVar, list, i);
    }

    @Override // defpackage.ixm
    public final /* synthetic */ int c(ivu ivuVar, List list, int i) {
        return ixl.c(this, ivuVar, list, i);
    }

    @Override // defpackage.ixm
    public final /* synthetic */ int d(ivu ivuVar, List list, int i) {
        return ixl.d(this, ivuVar, list, i);
    }

    @Override // defpackage.ixm
    public final ixn e(ixp ixpVar, List list, final long j) {
        Object obj;
        Object obj2;
        int i = 0;
        long jM = kil.m(j, 0, 0, 0, 0, 10);
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj3 = list.get(i2);
            ixk ixkVar = (ixk) obj3;
            if (iwa.b(ixkVar) != gkt.a && iwa.b(ixkVar) != gkt.b) {
                arrayList.add(obj3);
            }
        }
        final ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            arrayList2.add(((ixk) arrayList.get(i3)).e(jM));
        }
        int size3 = list.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size3) {
                obj = null;
                break;
            }
            obj = list.get(i4);
            if (iwa.b((ixk) obj) == gkt.a) {
                break;
            }
            i4++;
        }
        ixk ixkVar2 = (ixk) obj;
        int size4 = list.size();
        while (true) {
            if (i >= size4) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i);
            if (iwa.b((ixk) obj2) == gkt.b) {
                break;
            }
            i++;
        }
        ixk ixkVar3 = (ixk) obj2;
        float size5 = arrayList2.size();
        iyl iylVarE = ixkVar2 != null ? ixkVar2.e(jM) : null;
        iyl iylVarE2 = ixkVar3 != null ? ixkVar3.e(jM) : null;
        final float f = 6.2831855f / size5;
        final float fA = kil.a(j) * this.a;
        final iyl iylVar = iylVarE;
        final iyl iylVar2 = iylVarE2;
        return ixpVar.ej(kil.d(j), kil.c(j), fcvp.a, new fdap() { // from class: had
            @Override // defpackage.fdap
            public final Object invoke(Object obj4) {
                long j2;
                iyk iykVar = (iyk) obj4;
                iyl iylVar3 = iylVar;
                int i5 = 0;
                if (iylVar3 != null) {
                    iykVar.s(iylVar3, 0, 0, 0.0f);
                }
                List list2 = arrayList2;
                int size6 = list2.size();
                while (true) {
                    j2 = j;
                    if (i5 >= size6) {
                        break;
                    }
                    float f2 = f;
                    float f3 = fA;
                    iyl iylVar4 = (iyl) list2.get(i5);
                    int iB = kil.b(j2);
                    int i6 = iylVar4.a / 2;
                    int iA = kil.a(j2);
                    int i7 = iylVar4.b / 2;
                    double d = f2 * i5;
                    double d2 = f3;
                    double d3 = d - 1.5707963267948966d;
                    iykVar.s(iylVar4, fdcu.a((Math.cos(d3) * d2) + ((iB >> 1) - i6)), fdcu.a((d2 * Math.sin(d3)) + ((iA >> 1) - i7)), 0.0f);
                    i5++;
                }
                iyl iylVar5 = iylVar2;
                if (iylVar5 != null) {
                    iykVar.s(iylVar5, (kil.d(j2) - iylVar5.a) / 2, (kil.c(j2) - iylVar5.b) / 2, 0.0f);
                }
                return fctx.a;
            }
        });
    }
}
