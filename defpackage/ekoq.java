package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekoq extends eknw implements Serializable {
    private static final long serialVersionUID = 0;
    final eknw a;

    public ekoq(eknw eknwVar) {
        this.a = eknwVar;
    }

    @Override // defpackage.eknw
    public final eknw c() {
        return this.a;
    }

    @Override // defpackage.eknw, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ekoq) {
            return this.a.equals(((ekoq) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString().concat(".reverse()");
    }
}
