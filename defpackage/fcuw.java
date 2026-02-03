package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcuw implements Iterable, fdcn {
    final /* synthetic */ Object[] a;

    public fcuw(Object[] objArr) {
        this.a = objArr;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return fdbd.a(this.a);
    }
}
