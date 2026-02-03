package defpackage;

import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gww implements ixu {
    final /* synthetic */ float a;
    final /* synthetic */ float b;
    final /* synthetic */ gwy c;
    final /* synthetic */ int d;
    final /* synthetic */ grt e;

    public gww(float f, float f2, gwy gwyVar, int i, grt grtVar) {
        this.a = f;
        this.b = f2;
        this.c = gwyVar;
        this.d = i;
        this.e = grtVar;
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
    public final ixn e(final ixp ixpVar, List list, long j) {
        List list2 = (List) list.get(0);
        List list3 = (List) list.get(1);
        List list4 = (List) list.get(2);
        float f = this.a;
        final int iEp = ixpVar.ep(f);
        int size = list2.size();
        Integer numValueOf = 0;
        int size2 = list2.size();
        for (int i = 0; i < size2; i++) {
            numValueOf = Integer.valueOf(Math.max(numValueOf.intValue(), ((ixk) list2.get(i)).a(Alert.DURATION_SHOW_INDEFINITELY)));
        }
        final int iIntValue = numValueOf.intValue();
        int i2 = iEp + iEp;
        float f2 = this.b;
        long jM = kil.m(j, ixpVar.ep(f2), 0, iIntValue, iIntValue, 2);
        final fdcf fdcfVar = new fdcf();
        fdcfVar.a = f;
        final ArrayList arrayList = new ArrayList(list2.size());
        int size3 = list2.size();
        int i3 = 0;
        while (i3 < size3) {
            arrayList.add(((ixk) list2.get(i3)).e(jM));
            i3++;
            f = f;
            i2 = i2;
        }
        final float f3 = f;
        int i4 = i2;
        cug cugVar = new cug((byte[]) null);
        int size4 = list2.size();
        for (int i5 = 0; i5 < size4; i5++) {
            cugVar.f(((ixk) list2.get(i5)).b(Alert.DURATION_SHOW_INDEFINITELY));
        }
        final ArrayList arrayList2 = new ArrayList(size);
        int iEp2 = i4;
        int i6 = 0;
        while (i6 < size) {
            float f4 = ((kir) fcxl.c(new kir(f2), new kir(ixpVar.el(((iyl) arrayList.get(i6)).a)))).a;
            iEp2 += ixpVar.ep(f4);
            float fEl = ixpVar.el(cugVar.a(i6));
            float f5 = gwo.b;
            cug cugVar2 = cugVar;
            float f6 = ((kir) fcxl.c(new kir(fEl - (f5 + f5)), new kir(24.0f))).a;
            float f7 = fdcfVar.a;
            gwp gwpVar = new gwp(f7, f4, f6);
            fdcfVar.a = f7 + f4;
            arrayList2.add(gwpVar);
            i6++;
            cugVar = cugVar2;
        }
        this.c.a.b(arrayList2);
        final ArrayList arrayList3 = new ArrayList(list3.size());
        int size5 = list3.size();
        for (int i7 = 0; i7 < size5; i7++) {
            arrayList3.add(((ixk) list3.get(i7)).e(kil.m(j, iEp2, iEp2, 0, 0, 8)));
        }
        final int i8 = this.d;
        final ArrayList arrayList4 = new ArrayList(list4.size());
        int i9 = 0;
        for (int size6 = list4.size(); i9 < size6; size6 = size6) {
            arrayList4.add(((ixk) list4.get(i9)).e(kil.l(0, ixpVar.ep(((gwp) arrayList2.get(i8)).c), 0, iIntValue)));
            i9++;
            list4 = list4;
        }
        final grt grtVar = this.e;
        return ixpVar.ej(iEp2, iIntValue, fcvp.a, new fdap() { // from class: gwv
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                List list5;
                ixp ixpVar2;
                int i10;
                int i11;
                fdcf fdcfVar2 = fdcfVar;
                iyk iykVar = (iyk) obj;
                fdcfVar2.a = f3;
                List list6 = arrayList;
                int size7 = list6.size();
                int i12 = 0;
                while (true) {
                    list5 = arrayList2;
                    ixpVar2 = ixpVar;
                    if (i12 >= size7) {
                        break;
                    }
                    iyk.A(iykVar, (iyl) list6.get(i12), ixpVar2.ep(fdcfVar2.a), 0);
                    fdcfVar2.a += ((gwp) list5.get(i12)).b;
                    i12++;
                }
                List list7 = arrayList3;
                int size8 = list7.size();
                int i13 = 0;
                while (true) {
                    i10 = iIntValue;
                    if (i13 >= size8) {
                        break;
                    }
                    iyl iylVar = (iyl) list7.get(i13);
                    iyk.A(iykVar, iylVar, 0, i10 - iylVar.b);
                    i13++;
                }
                List list8 = arrayList4;
                int size9 = list8.size();
                int i14 = 0;
                while (true) {
                    i11 = i8;
                    if (i14 >= size9) {
                        break;
                    }
                    iyl iylVar2 = (iyl) list8.get(i14);
                    iyk.A(iykVar, iylVar2, Math.max(0, (ixpVar2.ep(((gwp) list5.get(i11)).b) - iylVar2.a) / 2), i10 - iylVar2.b);
                    i14++;
                }
                grt grtVar2 = grtVar;
                Integer num = grtVar2.d;
                if (num == null || num.intValue() != i11) {
                    grtVar2.d = Integer.valueOf(i11);
                    gwp gwpVar2 = (gwp) fcva.Q(list5, i11);
                    if (gwpVar2 != null) {
                        int iEp3 = ixpVar2.ep(((gwp) fcva.S(list5)).a()) + iEp;
                        dpn dpnVar = grtVar2.a;
                        int iB = iEp3 - dpnVar.b();
                        int i15 = fddu.i(ixpVar2.ep(gwpVar2.a) - ((iB / 2) - (ixpVar2.ep(gwpVar2.b) / 2)), 0, fddu.f(iEp3 - iB, 0));
                        if (dpnVar.c() != i15) {
                            fdil.d(grtVar2.b, null, null, new grs(grtVar2, i15, null), 3);
                        }
                    }
                }
                return fctx.a;
            }
        });
    }
}
