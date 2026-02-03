package defpackage;

import java.io.Serializable;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekij implements Serializable {
    private static final long serialVersionUID = 0;
    final Comparator a;
    final Object[] b;

    public ekij(Comparator comparator, Object[] objArr) {
        this.a = comparator;
        this.b = objArr;
    }

    Object readResolve() {
        ekii ekiiVar = new ekii(this.a);
        ekiiVar.n(this.b);
        return ekiiVar.g();
    }
}
