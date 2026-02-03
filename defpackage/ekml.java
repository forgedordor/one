package defpackage;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekml extends ekmp {
    final /* synthetic */ Comparator a;

    public ekml(Comparator comparator) {
        this.a = comparator;
    }

    @Override // defpackage.ekmp
    public final Map a() {
        return new TreeMap(this.a);
    }
}
