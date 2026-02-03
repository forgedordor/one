package defpackage;

import java.io.Serializable;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekdn extends eknw implements Serializable {
    private static final long serialVersionUID = 0;
    final Comparator a;

    public ekdn(Comparator comparator) {
        comparator.getClass();
        this.a = comparator;
    }

    @Override // defpackage.eknw, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ekdn) {
            return this.a.equals(((ekdn) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
