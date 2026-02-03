package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eonp implements Comparable {
    public final Object a;
    final int b;
    public final List c = new ArrayList();
    public int d;

    public eonp(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(this.b, ((eonp) obj).b);
    }
}
