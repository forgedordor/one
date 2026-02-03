package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awxy implements Comparator {
    final /* synthetic */ Comparator a;

    public awxy(Comparator comparator) {
        this.a = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int iCompare = this.a.compare(obj, obj2);
        return iCompare != 0 ? iCompare : fcxl.a(Boolean.valueOf(((awxn) obj).g().isEmpty()), Boolean.valueOf(((awxn) obj2).g().isEmpty()));
    }
}
