package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bmt {
    private final List a = new ArrayList();

    private static void c(List list, int i, int[] iArr, int i2) {
        if (i2 >= iArr.length) {
            list.add((int[]) iArr.clone());
            return;
        }
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = 0;
            while (true) {
                if (i4 >= i2) {
                    iArr[i2] = i3;
                    c(list, i, iArr, i2 + 1);
                    break;
                } else if (i3 == iArr[i4]) {
                    break;
                } else {
                    i4++;
                }
            }
        }
    }

    public final List a(List list) {
        if (list.isEmpty()) {
            return new ArrayList();
        }
        int size = list.size();
        List list2 = this.a;
        if (size != list2.size()) {
            return null;
        }
        int size2 = list2.size();
        ArrayList<int[]> arrayList = new ArrayList();
        c(arrayList, size2, new int[size2], 0);
        bmv[] bmvVarArr = new bmv[list.size()];
        for (int[] iArr : arrayList) {
            boolean z = true;
            for (int i = 0; i < list2.size(); i++) {
                if (iArr[i] < list.size()) {
                    bmv bmvVar = (bmv) list2.get(i);
                    bmv bmvVar2 = (bmv) list.get(iArr[i]);
                    z &= bmvVar2.b().p <= bmvVar.b().p && bmvVar2.c() == bmvVar.c();
                    if (!z) {
                        break;
                    }
                    bmvVarArr[iArr[i]] = (bmv) list2.get(i);
                }
            }
            if (z) {
                return Arrays.asList(bmvVarArr);
            }
        }
        return null;
    }

    public final void b(bmv bmvVar) {
        this.a.add(bmvVar);
    }
}
