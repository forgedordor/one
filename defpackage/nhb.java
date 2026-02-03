package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nhb extends nhd {
    protected nhb(mcm mcmVar, int[] iArr, List list) {
        super(mcmVar, iArr);
        ekgb.n(list);
    }

    public static void d(List list, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < list.size(); i++) {
            ekfw ekfwVar = (ekfw) list.get(i);
            if (ekfwVar != null) {
                ekfwVar.h(new nha(j, jArr[i]));
            }
        }
    }
}
