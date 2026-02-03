package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekop extends eknw implements Serializable {
    public static final ekop a = new ekop();
    private static final long serialVersionUID = 0;

    private ekop() {
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.eknw
    public final eknw c() {
        return ekno.a;
    }

    @Override // defpackage.eknw, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
