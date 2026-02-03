package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class erfj implements Iterable {
    final /* synthetic */ List a;
    final /* synthetic */ List b;

    public erfj(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new erfl(this.a.iterator(), this.b.iterator());
    }
}
