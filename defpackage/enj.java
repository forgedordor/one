package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class enj {
    public static final List a(eoi eoiVar, epf epfVar, enc encVar) {
        fddq fddqVar;
        if (!encVar.c() && epfVar.isEmpty()) {
            return fcvo.a;
        }
        ArrayList arrayList = new ArrayList();
        if (encVar.c()) {
            hum humVar = encVar.a;
            int i = ((enb) humVar.b()).a;
            Object[] objArr = humVar.a;
            int i2 = humVar.b;
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = ((enb) objArr[i3]).a;
                if (i4 < i) {
                    i = i4;
                }
            }
            if (i < 0) {
                ebs.c("negative minIndex");
            }
            int i5 = ((enb) humVar.b()).b;
            Object[] objArr2 = humVar.a;
            int i6 = humVar.b;
            for (int i7 = 0; i7 < i6; i7++) {
                int i8 = ((enb) objArr2[i7]).b;
                if (i8 > i5) {
                    i5 = i8;
                }
            }
            fddqVar = new fddq(i, Math.min(i5, eoiVar.b() - 1));
        } else {
            fddqVar = fddq.d;
        }
        int iA = epfVar.a();
        for (int i9 = 0; i9 < iA; i9++) {
            epa epaVar = epfVar.get(i9);
            int iA2 = eoj.a(eoiVar, epaVar.a, epaVar.b);
            int i10 = fddqVar.a;
            if ((iA2 > fddqVar.b || i10 > iA2) && iA2 >= 0 && iA2 < eoiVar.b()) {
                arrayList.add(Integer.valueOf(iA2));
            }
        }
        int i11 = fddqVar.a;
        int i12 = fddqVar.b;
        if (i11 <= i12) {
            while (true) {
                arrayList.add(Integer.valueOf(i11));
                if (i11 == i12) {
                    break;
                }
                i11++;
            }
        }
        return arrayList;
    }
}
