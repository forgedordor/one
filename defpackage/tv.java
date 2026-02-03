package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class tv implements Comparator {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        tx txVar = (tx) obj;
        tx txVar2 = (tx) obj2;
        RecyclerView recyclerView = txVar.d;
        if ((recyclerView == null) != (txVar2.d == null)) {
            return recyclerView != null ? -1 : 1;
        }
        boolean z = txVar.a;
        if (z != txVar2.a) {
            return !z ? 1 : -1;
        }
        int i = txVar2.b - txVar.b;
        if (i != 0) {
            return i;
        }
        int i2 = txVar.c - txVar2.c;
        if (i2 == 0) {
            return 0;
        }
        return i2;
    }
}
