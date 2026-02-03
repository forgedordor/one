package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekee extends ekeh {
    final /* synthetic */ Iterable a;

    public ekee(Iterable iterable) {
        this.a = iterable;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ekiy(ekjc.j(this.a.iterator(), new ejvr() { // from class: eked
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return ((Iterable) obj).iterator();
            }
        }));
    }
}
