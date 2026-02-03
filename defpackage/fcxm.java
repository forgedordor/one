package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final /* synthetic */ class fcxm implements Comparator {
    public final /* synthetic */ fdap[] a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        for (int i = 0; i < 2; i++) {
            fdap fdapVar = this.a[i];
            int iA = fcxl.a((Comparable) fdapVar.invoke(obj), (Comparable) fdapVar.invoke(obj2));
            if (iA != 0) {
                return iA;
            }
        }
        return 0;
    }
}
