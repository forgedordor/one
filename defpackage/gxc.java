package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gxc implements ixu {
    final /* synthetic */ gxe a;

    public gxc(gxe gxeVar) {
        this.a = gxeVar;
    }

    @Override // defpackage.ixu
    public final /* synthetic */ int a(ivu ivuVar, List list, int i) {
        return ixt.a(this, ivuVar, list, i);
    }

    @Override // defpackage.ixu
    public final /* synthetic */ int b(ivu ivuVar, List list, int i) {
        return ixt.b(this, ivuVar, list, i);
    }

    @Override // defpackage.ixu
    public final /* synthetic */ int c(ivu ivuVar, List list, int i) {
        return ixt.c(this, ivuVar, list, i);
    }

    @Override // defpackage.ixu
    public final /* synthetic */ int d(ivu ivuVar, List list, int i) {
        return ixt.d(this, ivuVar, list, i);
    }

    @Override // defpackage.ixu
    public final ixn e(ixp ixpVar, List list, long j) {
        List list2 = (List) list.get(0);
        List list3 = (List) list.get(1);
        List list4 = (List) list.get(2);
        int size = list2.size();
        final fdcg fdcgVar = new fdcg();
        int iB = kil.b(j);
        if (size > 0) {
            fdcgVar.a = iB / size;
        }
        Integer numValueOf = 0;
        int size2 = list2.size();
        for (int i = 0; i < size2; i++) {
            numValueOf = Integer.valueOf(Math.max(((ixk) list2.get(i)).a(fdcgVar.a), numValueOf.intValue()));
        }
        final int iIntValue = numValueOf.intValue();
        gxe gxeVar = this.a;
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            float fEl = ixpVar.el(Math.min(((ixk) list2.get(i2)).b(iIntValue), fdcgVar.a));
            float f = gwo.b;
            arrayList.add(new gwp(ixpVar.el(fdcgVar.a) * i2, ixpVar.el(fdcgVar.a), ((kir) fcxl.c(new kir(fEl - (f + f)), new kir(24.0f))).a));
        }
        gxeVar.a.b(arrayList);
        final ArrayList arrayList2 = new ArrayList(list2.size());
        int size3 = list2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            ixk ixkVar = (ixk) list2.get(i3);
            int i4 = fdcgVar.a;
            arrayList2.add(ixkVar.e(kil.l(i4, i4, iIntValue, iIntValue)));
        }
        final ArrayList arrayList3 = new ArrayList(list3.size());
        int size4 = list3.size();
        for (int i5 = 0; i5 < size4; i5++) {
            arrayList3.add(((ixk) list3.get(i5)).e(kil.m(j, 0, 0, 0, 0, 11)));
        }
        final ArrayList arrayList4 = new ArrayList(list4.size());
        int size5 = list4.size();
        for (int i6 = 0; i6 < size5; i6++) {
            ixk ixkVar2 = (ixk) list4.get(i6);
            int i7 = fdcgVar.a;
            arrayList4.add(ixkVar2.e(kil.l(i7, i7, 0, iIntValue)));
        }
        return ixpVar.ej(iB, iIntValue, fcvp.a, new fdap() { // from class: gxb
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                int i8;
                List list5 = arrayList2;
                iyk iykVar = (iyk) obj;
                int size6 = list5.size();
                for (int i9 = 0; i9 < size6; i9++) {
                    iyk.A(iykVar, (iyl) list5.get(i9), fdcgVar.a * i9, 0);
                }
                List list6 = arrayList3;
                int size7 = list6.size();
                int i10 = 0;
                while (true) {
                    i8 = iIntValue;
                    if (i10 >= size7) {
                        break;
                    }
                    iyl iylVar = (iyl) list6.get(i10);
                    iyk.A(iykVar, iylVar, 0, i8 - iylVar.b);
                    i10++;
                }
                List list7 = arrayList4;
                int size8 = list7.size();
                for (int i11 = 0; i11 < size8; i11++) {
                    iyl iylVar2 = (iyl) list7.get(i11);
                    iyk.A(iykVar, iylVar2, 0, i8 - iylVar2.b);
                }
                return fctx.a;
            }
        });
    }
}
