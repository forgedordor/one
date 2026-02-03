package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekfz implements Serializable {
    private static final long serialVersionUID = 0;
    final Object[] a;

    public ekfz(Object[] objArr) {
        this.a = objArr;
    }

    Object readResolve() {
        return ekgb.p(this.a);
    }
}
