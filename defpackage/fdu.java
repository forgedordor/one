package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fdu implements ixm {
    private final fdae a;
    private final fdae b;

    public fdu(fdae fdaeVar, fdae fdaeVar2) {
        this.a = fdaeVar;
        this.b = fdaeVar2;
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
    public final ixn e(ixp ixpVar, List list, long j) {
        fcti fctiVar;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            if (!(((ixk) obj).f() instanceof fdw)) {
                arrayList.add(obj);
            }
        }
        List list2 = (List) this.b.invoke();
        final ArrayList arrayList2 = null;
        if (list2 != null) {
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ihu ihuVar = (ihu) list2.get(i2);
                if (ihuVar != null) {
                    ixk ixkVar = (ixk) arrayList.get(i2);
                    float f = ihuVar.d;
                    float f2 = ihuVar.b;
                    float fFloor = (float) Math.floor(f - f2);
                    float f3 = ihuVar.e;
                    float f4 = ihuVar.c;
                    fctiVar = new fcti(ixkVar.e(kim.k(0, (int) fFloor, (int) Math.floor(f3 - f4), 5)), new kjb((Math.round(f2) << 32) | (Math.round(f4) & 4294967295L)));
                } else {
                    fctiVar = null;
                }
                if (fctiVar != null) {
                    arrayList3.add(fctiVar);
                }
            }
            arrayList2 = arrayList3;
        }
        ArrayList arrayList4 = new ArrayList(list.size());
        int size3 = list.size();
        for (int i3 = 0; i3 < size3; i3++) {
            Object obj2 = list.get(i3);
            if (((ixk) obj2).f() instanceof fdw) {
                arrayList4.add(obj2);
            }
        }
        final List listA = exb.a(arrayList4, this.a);
        return ixpVar.ej(kil.b(j), kil.a(j), fcvp.a, new fdap() { // from class: fdt
            @Override // defpackage.fdap
            public final Object invoke(Object obj3) {
                List list3 = arrayList2;
                iyk iykVar = (iyk) obj3;
                if (list3 != null) {
                    int size4 = list3.size();
                    for (int i4 = 0; i4 < size4; i4++) {
                        fcti fctiVar2 = (fcti) list3.get(i4);
                        iykVar.t((iyl) fctiVar2.a, ((kjb) fctiVar2.b).a, 0.0f);
                    }
                }
                List list4 = listA;
                if (list4 != null) {
                    int size5 = list4.size();
                    for (int i5 = 0; i5 < size5; i5++) {
                        fcti fctiVar3 = (fcti) list4.get(i5);
                        iyl iylVar = (iyl) fctiVar3.a;
                        fdae fdaeVar = (fdae) fctiVar3.b;
                        iykVar.t(iylVar, fdaeVar != null ? ((kjb) fdaeVar.invoke()).a : 0L, 0.0f);
                    }
                }
                return fctx.a;
            }
        });
    }
}
