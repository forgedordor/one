package defpackage;

import androidx.car.app.model.Alert;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gll implements ixu {
    private static final int f(ivu ivuVar, List list, int i, fdat fdatVar) {
        int iIntValue;
        int iIntValue2;
        List list2 = (List) list.get(0);
        List list3 = (List) list.get(1);
        List list4 = (List) list.get(2);
        List list5 = (List) list.get(3);
        List list6 = (List) list.get(4);
        int iC = hjf.c(i, ivuVar.ep(32.0f));
        ivt ivtVar = (ivt) fcva.P(list5);
        if (ivtVar != null) {
            iIntValue = ((Number) fdatVar.a(ivtVar, Integer.valueOf(iC))).intValue();
            iC = hjf.c(iC, ivtVar.b(Alert.DURATION_SHOW_INDEFINITELY));
        } else {
            iIntValue = 0;
        }
        ivt ivtVar2 = (ivt) fcva.P(list6);
        if (ivtVar2 != null) {
            iIntValue2 = ((Number) fdatVar.a(ivtVar2, Integer.valueOf(iC))).intValue();
            iC = hjf.c(iC, ivtVar2.b(Alert.DURATION_SHOW_INDEFINITELY));
        } else {
            iIntValue2 = 0;
        }
        Object obj = (ivt) fcva.P(list3);
        int iIntValue3 = obj != null ? ((Number) fdatVar.a(obj, Integer.valueOf(iC))).intValue() : 0;
        Object obj2 = (ivt) fcva.P(list2);
        int iIntValue4 = obj2 != null ? ((Number) fdatVar.a(obj2, Integer.valueOf(iC))).intValue() : 0;
        Object obj3 = (ivt) fcva.P(list4);
        int iIntValue5 = obj3 != null ? ((Number) fdatVar.a(obj3, Integer.valueOf(iC))).intValue() : 0;
        int iA = glm.a(iIntValue3 > 0, iIntValue5 > 0, glg.d(ivuVar, iIntValue5));
        float fA = glg.a(iA);
        return glg.b(ivuVar, iIntValue, iIntValue2, iIntValue4, iIntValue3, iIntValue5, iA, ivuVar.ep(fA + fA), kim.k(0, 0, 0, 15));
    }

    private static final int g(ivu ivuVar, List list, int i, fdat fdatVar) {
        List list2 = (List) list.get(0);
        List list3 = (List) list.get(1);
        List list4 = (List) list.get(2);
        List list5 = (List) list.get(3);
        List list6 = (List) list.get(4);
        ivt ivtVar = (ivt) fcva.P(list5);
        int iIntValue = ivtVar != null ? ((Number) fdatVar.a(ivtVar, Integer.valueOf(i))).intValue() : 0;
        ivt ivtVar2 = (ivt) fcva.P(list6);
        int iIntValue2 = ivtVar2 != null ? ((Number) fdatVar.a(ivtVar2, Integer.valueOf(i))).intValue() : 0;
        ivt ivtVar3 = (ivt) fcva.P(list2);
        int iIntValue3 = ivtVar3 != null ? ((Number) fdatVar.a(ivtVar3, Integer.valueOf(i))).intValue() : 0;
        ivt ivtVar4 = (ivt) fcva.P(list3);
        int iIntValue4 = ivtVar4 != null ? ((Number) fdatVar.a(ivtVar4, Integer.valueOf(i))).intValue() : 0;
        ivt ivtVar5 = (ivt) fcva.P(list4);
        return glg.e(iIntValue, iIntValue2, iIntValue3, iIntValue4, ivtVar5 != null ? ((Number) fdatVar.a(ivtVar5, Integer.valueOf(i))).intValue() : 0, ivuVar.ep(32.0f), kim.k(0, 0, 0, 15));
    }

    @Override // defpackage.ixu
    public final int a(ivu ivuVar, List list, int i) {
        return f(ivuVar, list, i, glh.a);
    }

    @Override // defpackage.ixu
    public final int b(ivu ivuVar, List list, int i) {
        return g(ivuVar, list, i, gli.a);
    }

    @Override // defpackage.ixu
    public final int c(ivu ivuVar, List list, int i) {
        return f(ivuVar, list, i, glj.a);
    }

    @Override // defpackage.ixu
    public final int d(ivu ivuVar, List list, int i) {
        return g(ivuVar, list, i, glk.a);
    }

    @Override // defpackage.ixu
    public final ixn e(ixp ixpVar, List list, long j) {
        List list2;
        final iyl iylVarE;
        List list3 = (List) list.get(0);
        List list4 = (List) list.get(1);
        List list5 = (List) list.get(2);
        List list6 = (List) list.get(3);
        List list7 = (List) list.get(4);
        long jM = kil.m(j, 0, 0, 0, 0, 10);
        int iEp = ixpVar.ep(32.0f);
        ixk ixkVar = (ixk) fcva.P(list6);
        int iD = ixkVar != null ? ixkVar.d(kil.a(j)) : 0;
        ixk ixkVar2 = (ixk) fcva.P(list7);
        int iD2 = ixkVar2 != null ? ixkVar2.d(kil.a(j)) : 0;
        int iB = kil.b(jM);
        int i = iD + iD2 + iEp;
        ixk ixkVar3 = (ixk) fcva.P(list5);
        float fA = glg.a(glm.a(fcva.P(list4) != null, fcva.P(list5) != null, glg.d(ixpVar, ixkVar3 != null ? ixkVar3.c(hjf.c(iB, i)) : 0)));
        long jH = kim.h(jM, -iEp, -ixpVar.ep(fA + fA));
        ixk ixkVar4 = (ixk) fcva.P(list6);
        iyl iylVarE2 = ixkVar4 != null ? ixkVar4.e(jH) : null;
        int iB2 = hjf.b(iylVarE2);
        ixk ixkVar5 = (ixk) fcva.P(list7);
        if (ixkVar5 != null) {
            list2 = list4;
            iylVarE = ixkVar5.e(kim.l(jH, -iB2, 0, 2));
        } else {
            list2 = list4;
            iylVarE = null;
        }
        int iB3 = iB2 + hjf.b(iylVarE);
        ixk ixkVar6 = (ixk) fcva.P(list3);
        iyl iylVarE3 = ixkVar6 != null ? ixkVar6.e(kim.l(jH, -iB3, 0, 2)) : null;
        int iA = hjf.a(iylVarE3);
        ixk ixkVar7 = (ixk) fcva.P(list5);
        iyl iylVarE4 = ixkVar7 != null ? ixkVar7.e(kim.h(jH, -iB3, -iA)) : null;
        int iA2 = iA + hjf.a(iylVarE4);
        boolean z = (iylVarE4 == null || iylVarE4.ei(iuc.a) == iylVarE4.ei(iuc.b)) ? false : true;
        ixk ixkVar8 = (ixk) fcva.P(list2);
        iyl iylVarE5 = ixkVar8 != null ? ixkVar8.e(kim.h(jH, -iB3, -iA2)) : null;
        int iA3 = glm.a(iylVarE5 != null, iylVarE4 != null, z);
        final int iE = glg.e(hjf.b(iylVarE2), hjf.b(iylVarE), hjf.b(iylVarE3), hjf.b(iylVarE5), hjf.b(iylVarE4), iEp, j);
        int iA4 = hjf.a(iylVarE2);
        int iA5 = hjf.a(iylVarE);
        final iyl iylVar = iylVarE4;
        int iA6 = hjf.a(iylVarE3);
        int iA7 = hjf.a(iylVarE5);
        int iA8 = hjf.a(iylVar);
        float fA2 = glg.a(iA3);
        final int iB4 = glg.b(ixpVar, iA4, iA5, iA6, iA7, iA8, iA3, ixpVar.ep(fA2 + fA2), j);
        final boolean zA = gln.a(iA3, 3);
        final int iEp2 = ixpVar.ep(16.0f);
        final int iEp3 = ixpVar.ep(16.0f);
        final int iEp4 = ixpVar.ep(fA2);
        final iyl iylVar2 = iylVarE2;
        final iyl iylVar3 = iylVarE5;
        final iyl iylVar4 = iylVarE3;
        return ixpVar.ej(iE, iB4, fcvp.a, new fdap() { // from class: gkv
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                iyk iykVar = (iyk) obj;
                iyl iylVar5 = iylVar2;
                int i2 = iEp2;
                boolean z2 = zA;
                int iA9 = iEp4;
                int i3 = iB4;
                if (iylVar5 != null) {
                    iyk.A(iykVar, iylVar5, i2, z2 ? iA9 : ibw.n.a(iylVar5.b, i3));
                }
                iyl iylVar6 = iylVar;
                iyl iylVar7 = iylVar3;
                iyl iylVar8 = iylVar4;
                int iB5 = i2 + hjf.b(iylVar5);
                int iA10 = z2 ? iA9 : ibw.n.a(hjf.a(iylVar8) + hjf.a(iylVar7) + hjf.a(iylVar6), i3);
                if (iylVar7 != null) {
                    iyk.A(iykVar, iylVar7, iB5, iA10);
                }
                int iA11 = iA10 + hjf.a(iylVar7);
                if (iylVar8 != null) {
                    iyk.A(iykVar, iylVar8, iB5, iA11);
                }
                int iA12 = iA11 + hjf.a(iylVar8);
                if (iylVar6 != null) {
                    iyk.A(iykVar, iylVar6, iB5, iA12);
                }
                iyl iylVar9 = iylVarE;
                if (iylVar9 != null) {
                    int i4 = (iE - iEp3) - iylVar9.a;
                    if (!z2) {
                        iA9 = ibw.n.a(iylVar9.b, i3);
                    }
                    iyk.A(iykVar, iylVar9, i4, iA9);
                }
                return fctx.a;
            }
        });
    }
}
