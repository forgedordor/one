package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cozc implements Comparator {
    final /* synthetic */ Comparator a;

    public cozc(Comparator comparator) {
        this.a = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int iCompare = this.a.compare(obj, obj2);
        return iCompare != 0 ? iCompare : fcxl.a(Integer.valueOf(((coze) obj).e), Integer.valueOf(((coze) obj2).e));
    }
}
