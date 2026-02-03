package defpackage;

import java.io.Serializable;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgpe extends fgna implements Serializable {
    private static HashMap a = null;
    private static final long serialVersionUID = -6390301302770925357L;
    private final fgnc b;

    private fgpe(fgnc fgncVar) {
        this.b = fgncVar;
    }

    public static synchronized fgpe h(fgnc fgncVar) {
        fgpe fgpeVar;
        HashMap map = a;
        if (map == null) {
            a = new HashMap(7);
            fgpeVar = null;
        } else {
            fgpeVar = (fgpe) map.get(fgncVar);
        }
        if (fgpeVar != null) {
            return fgpeVar;
        }
        fgpe fgpeVar2 = new fgpe(fgncVar);
        a.put(fgncVar, fgpeVar2);
        return fgpeVar2;
    }

    private final UnsupportedOperationException i() {
        return new UnsupportedOperationException(this.b.m.concat(" field is unsupported"));
    }

    private Object readResolve() {
        return h(this.b);
    }

    @Override // defpackage.fgna
    public final long a(long j, int i) {
        throw i();
    }

    @Override // defpackage.fgna
    public final long b(long j, long j2) {
        throw i();
    }

    @Override // defpackage.fgna
    public final long c() {
        return 0L;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return 0;
    }

    @Override // defpackage.fgna
    public final fgnc d() {
        return this.b;
    }

    @Override // defpackage.fgna
    public final boolean e() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fgpe)) {
            return false;
        }
        fgpe fgpeVar = (fgpe) obj;
        fgpeVar.g();
        return fgpeVar.g().equals(g());
    }

    @Override // defpackage.fgna
    public final boolean f() {
        return false;
    }

    public final String g() {
        return this.b.m;
    }

    public final int hashCode() {
        return g().hashCode();
    }

    public final String toString() {
        return "UnsupportedDurationField[" + g() + "]";
    }
}
