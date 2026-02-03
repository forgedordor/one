package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekeb extends eknw implements Serializable {
    private static final long serialVersionUID = 0;
    final ekgp a;

    public ekeb(ekgp ekgpVar) {
        this.a = ekgpVar;
    }

    private final int f(Object obj) {
        Integer num = (Integer) this.a.get(obj);
        if (num != null) {
            return num.intValue();
        }
        throw new eknv(obj);
    }

    @Override // defpackage.eknw, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return f(obj) - f(obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj instanceof ekeb) {
            return ekmi.m(this.a, ((ekeb) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Ordering.explicit(" + String.valueOf(this.a.keySet()) + ")";
    }
}
