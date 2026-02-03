package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcvw<T> implements Iterable<fcvv<? extends T>>, fdcn {
    private final fdae a;

    public fcvw(fdae fdaeVar) {
        this.a = fdaeVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Iterator] */
    @Override // java.lang.Iterable
    public final Iterator<fcvv<T>> iterator() {
        return new fcvx(this.a.invoke());
    }
}
