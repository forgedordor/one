package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkoc {
    public final diih a;

    public dkoc(diih diihVar) {
        this.a = diihVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dkoc) && fdbq.f(this.a, ((dkoc) obj).a);
    }

    public final int hashCode() {
        diih diihVar = this.a;
        if (diihVar == null) {
            return 0;
        }
        return diihVar.hashCode();
    }

    public final String toString() {
        return "LastReadMarker(initialCompositionElement=" + this.a + ")";
    }

    public dkoc() {
        this(null);
    }
}
