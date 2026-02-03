package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekio extends ekeh {
    final /* synthetic */ Iterable a;
    final /* synthetic */ ejvr b;

    public ekio(Iterable iterable, ejvr ejvrVar) {
        this.a = iterable;
        this.b = ejvrVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return ekjc.j(this.a.iterator(), this.b);
    }
}
