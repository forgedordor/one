package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lto {
    public static final ltq a(ltm ltmVar, lty ltyVar) {
        List listB;
        ArrayList<ltb> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List list = ltyVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            lti ltiVar = (lti) list.get(i);
            List list2 = ltiVar.b;
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if ((ltiVar instanceof ltg) && i2 == list2.size() / 2) {
                    arrayList2.add(new fcti(ltiVar, Integer.valueOf(arrayList.size())));
                }
                arrayList.add(list2.get(i2));
            }
        }
        Float fValueOf = Float.valueOf(0.0f);
        int iP = fcva.p(arrayList, 9);
        if (iP == 0) {
            listB = fcva.b(fValueOf);
        } else {
            ArrayList arrayList3 = new ArrayList(iP + 1);
            arrayList3.add(fValueOf);
            for (ltb ltbVar : arrayList) {
                float fFloatValue = fValueOf.floatValue();
                float fB = ltm.b(ltbVar);
                if (fB < 0.0f) {
                    throw new IllegalArgumentException("Measured cubic is expected to be greater or equal to zero");
                }
                fValueOf = Float.valueOf(fFloatValue + fB);
                arrayList3.add(fValueOf);
            }
            listB = arrayList3;
        }
        float fFloatValue2 = ((Number) fcva.S(listB)).floatValue();
        cue cueVar = new cue(listB.size());
        int size3 = listB.size();
        for (int i3 = 0; i3 < size3; i3++) {
            cueVar.d(((Number) listB.get(i3)).floatValue() / fFloatValue2);
        }
        fcww fcwwVar = new fcww((byte[]) null);
        int size4 = arrayList2.size();
        for (int i4 = 0; i4 < size4; i4++) {
            int iIntValue = ((Number) ((fcti) arrayList2.get(i4)).b).intValue();
            float fA = cueVar.a(iIntValue) + cueVar.a(iIntValue + 1);
            float f = lub.a;
            fcwwVar.add(new ltv(lub.e(fA / 2.0f), (lti) ((fcti) arrayList2.get(i4)).a));
        }
        return new ltq(ltmVar, fcva.a(fcwwVar), arrayList, cueVar);
    }
}
