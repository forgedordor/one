package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class pid {
    public static final int a(pjl pjlVar, String str) {
        int iA = pjlVar.a();
        for (int i = 0; i < iA; i++) {
            if (fdbq.f(str, pjlVar.c(i))) {
                return i;
            }
        }
        return -1;
    }

    public static final int b(pjl pjlVar, String str) {
        int iA = pie.a(pjlVar, str);
        if (iA >= 0) {
            return iA;
        }
        int iA2 = pjlVar.a();
        ArrayList arrayList = new ArrayList(iA2);
        for (int i = 0; i < iA2; i++) {
            arrayList.add(pjlVar.c(i));
        }
        throw new IllegalArgumentException("Column '" + str + "' does not exist. Available columns: [" + fcva.aF(arrayList, null, null, null, null, 63) + ']');
    }
}
