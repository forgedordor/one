package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejxw<T> implements Serializable, ejxr {
    private static final long serialVersionUID = 0;
    public final Object a;

    public ejxw(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ejxw) {
            return ejwh.a(this.a, ((ejxw) obj).a);
        }
        return false;
    }

    @Override // defpackage.ejxr
    public final T get() {
        return (T) this.a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + String.valueOf(this.a) + ")";
    }
}
