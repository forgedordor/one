package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejvt<E> implements Serializable, ejvr {
    private static final long serialVersionUID = 0;
    private final Object a;

    public ejvt(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.ejvr
    public final E apply(Object obj) {
        return (E) this.a;
    }

    @Override // defpackage.ejvr
    public final boolean equals(Object obj) {
        if (obj instanceof ejvt) {
            return ejwh.a(this.a, ((ejvt) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Functions.constant(" + String.valueOf(this.a) + ")";
    }
}
