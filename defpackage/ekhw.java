package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekhw implements Serializable {
    private static final long serialVersionUID = 0;
    final Object[] a;

    public ekhw(Object[] objArr) {
        this.a = objArr;
    }

    Object readResolve() {
        return ekhx.p(this.a);
    }
}
