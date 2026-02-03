package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fxx implements ixm {
    final /* synthetic */ float a;
    final /* synthetic */ float b;

    public fxx(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    private static final void f(List list, fdcg fdcgVar, ixp ixpVar, float f, List list2, List list3, fdcg fdcgVar2, List list4, fdcg fdcgVar3, fdcg fdcgVar4) {
        if (!list.isEmpty()) {
            fdcgVar.a += ixpVar.ep(f);
        }
        list.add(0, fcva.ao(list2));
        list3.add(Integer.valueOf(fdcgVar2.a));
        list4.add(Integer.valueOf(fdcgVar.a));
        fdcgVar.a += fdcgVar2.a;
        fdcgVar3.a = Math.max(fdcgVar3.a, fdcgVar4.a);
        list2.clear();
        fdcgVar4.a = 0;
        fdcgVar2.a = 0;
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
    public final ixn e(final ixp ixpVar, List list, long j) {
        float f;
        final float f2;
        fxx fxxVar = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        fdcg fdcgVar = new fdcg();
        fdcg fdcgVar2 = new fdcg();
        ArrayList arrayList4 = new ArrayList();
        fdcg fdcgVar3 = new fdcg();
        fdcg fdcgVar4 = new fdcg();
        int size = list.size();
        int i = 0;
        while (true) {
            f = fxxVar.b;
            f2 = fxxVar.a;
            if (i >= size) {
                break;
            }
            int i2 = size;
            int i3 = i;
            iyl iylVarE = ((ixk) list.get(i)).e(j);
            if (!arrayList4.isEmpty()) {
                ArrayList arrayList5 = arrayList;
                if (fdcgVar3.a + ixpVar.ep(f2) + iylVarE.a > kil.b(j)) {
                    arrayList = arrayList5;
                    f(arrayList, fdcgVar2, ixpVar, f, arrayList4, arrayList2, fdcgVar4, arrayList3, fdcgVar, fdcgVar3);
                } else {
                    arrayList = arrayList5;
                }
            }
            if (!arrayList4.isEmpty()) {
                fdcgVar3.a += ixpVar.ep(f2);
            }
            arrayList4.add(iylVarE);
            fdcgVar3.a += iylVarE.a;
            fdcgVar4.a = Math.max(fdcgVar4.a, iylVarE.b);
            i = i3 + 1;
            size = i2;
            fxxVar = this;
        }
        if (!arrayList4.isEmpty()) {
            f(arrayList, fdcgVar2, ixpVar, f, arrayList4, arrayList2, fdcgVar4, arrayList3, fdcgVar, fdcgVar3);
        }
        final int iMax = Math.max(fdcgVar.a, kil.d(j));
        int iMax2 = Math.max(fdcgVar2.a, kil.c(j));
        final ArrayList arrayList6 = arrayList;
        return ixpVar.ej(iMax, iMax2, fcvp.a, new fdap() { // from class: fxw
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ixp ixpVar2;
                List list2 = arrayList6;
                iyk iykVar = (iyk) obj;
                int size2 = list2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    List list3 = (List) list2.get(i4);
                    int size3 = list3.size();
                    int[] iArr = new int[size3];
                    int i5 = 0;
                    while (true) {
                        ixpVar2 = ixpVar;
                        if (i5 >= size3) {
                            break;
                        }
                        iArr[i5] = ((iyl) list3.get(i5)).a + (i5 < fcva.e(list3) ? ixpVar2.ep(f2) : 0);
                        i5++;
                    }
                    int[] iArr2 = new int[size3];
                    ecr.b.b(ixpVar2, iMax, iArr, ixpVar2.q(), iArr2);
                    int size4 = list3.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        iykVar.s((iyl) list3.get(i6), iArr2[i6], ((Number) arrayList3.get(i4)).intValue(), 0.0f);
                    }
                }
                return fctx.a;
            }
        });
    }
}
