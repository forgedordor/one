package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bov {
    public static boolean a(bmm bmmVar, int... iArr) {
        if (bmmVar == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return bmmVar.b().containsAll(arrayList);
    }
}
