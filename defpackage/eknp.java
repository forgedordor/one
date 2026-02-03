package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eknp extends eknw implements Serializable {
    private static final long serialVersionUID = 0;
    final eknw a;

    public eknp(eknw eknwVar) {
        this.a = eknwVar;
    }

    @Override // defpackage.eknw
    public final eknw b() {
        return this.a.b();
    }

    @Override // defpackage.eknw
    public final eknw c() {
        return this.a.c().b();
    }

    @Override // defpackage.eknw, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return -1;
        }
        if (obj2 == null) {
            return 1;
        }
        return this.a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eknp) {
            return this.a.equals(((eknp) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 957692532;
    }

    public final String toString() {
        return this.a.toString().concat(".nullsFirst()");
    }

    @Override // defpackage.eknw
    public final eknw a() {
        return this;
    }
}
