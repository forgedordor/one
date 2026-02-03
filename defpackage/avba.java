package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avba {
    public static final fdvc a(fdjx fdjxVar, fdus fdusVar, fdvc fdvcVar, fdvc fdvcVar2, fdvc fdvcVar3, fdvc fdvcVar4, fdav fdavVar) {
        fdvc[] fdvcVarArr = {fdvcVar, fdvcVar2, fdvcVar3, fdvcVar4};
        for (int i = 0; i < 4; i++) {
            fdvc fdvcVar5 = fdvcVarArr[i];
            if (fdvcVar5 != null && !(fdvcVar5 instanceof auxs)) {
                fdvc[] fdvcVarArr2 = (fdvc[]) fcur.K(fdvcVarArr).toArray(new fdvc[0]);
                avay avayVar = new avay((fdpl[]) Arrays.copyOf(fdvcVarArr2, fdvcVarArr2.length), fdvcVarArr, fdavVar);
                ArrayList arrayList = new ArrayList(4);
                for (int i2 = 0; i2 < 4; i2++) {
                    fdvc fdvcVar6 = fdvcVarArr[i2];
                    arrayList.add(fdvcVar6 != null ? fdvcVar6.c() : null);
                }
                Object[] array = arrayList.toArray(new Object[0]);
                return fdtg.b(avayVar, fdjxVar, fdusVar, fdavVar.a(array[0], array[1], array[2], array[3]));
            }
        }
        return new auxs(new avav(fdvcVarArr, fdavVar));
    }

    public static final fdvc b(fdjx fdjxVar, fdus fdusVar, fdvc fdvcVar, fdvc fdvcVar2, fdvc fdvcVar3, fdvc fdvcVar4, fdvc fdvcVar5, fdvc fdvcVar6, fdax fdaxVar) {
        fdvcVar6.getClass();
        fdvc[] fdvcVarArr = {fdvcVar, fdvcVar2, fdvcVar3, fdvcVar4, fdvcVar5, fdvcVar6};
        for (int i = 0; i < 6; i++) {
            fdvc fdvcVar7 = fdvcVarArr[i];
            if (fdvcVar7 != null && !(fdvcVar7 instanceof auxs)) {
                fdvc[] fdvcVarArr2 = (fdvc[]) fcur.K(fdvcVarArr).toArray(new fdvc[0]);
                avaq avaqVar = new avaq((fdpl[]) Arrays.copyOf(fdvcVarArr2, fdvcVarArr2.length), fdvcVarArr, fdaxVar);
                ArrayList arrayList = new ArrayList(6);
                for (int i2 = 0; i2 < 6; i2++) {
                    fdvc fdvcVar8 = fdvcVarArr[i2];
                    arrayList.add(fdvcVar8 != null ? fdvcVar8.c() : null);
                }
                Object[] array = arrayList.toArray(new Object[0]);
                return fdtg.b(avaqVar, fdjxVar, fdusVar, fdaxVar.a(array[0], array[1], array[2], array[3], array[4], array[5]));
            }
        }
        return new auxs(new avaz(fdvcVarArr, fdaxVar));
    }
}
