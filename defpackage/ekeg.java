package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekeg extends ekeh {
    final /* synthetic */ Iterable[] a;

    public ekeg(Iterable[] iterableArr) {
        this.a = iterableArr;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ekiy(new ekef(this.a));
    }
}
