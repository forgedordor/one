package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkol {
    public final dkod a;
    public final dkoc b;
    public final dkob c;
    public final boolean d;
    private final dkok e;

    public dkol(dkod dkodVar, dkoc dkocVar, dkob dkobVar, boolean z, dkok dkokVar) {
        this.a = dkodVar;
        this.b = dkocVar;
        this.c = dkobVar;
        this.d = z;
        this.e = dkokVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkol)) {
            return false;
        }
        dkol dkolVar = (dkol) obj;
        return fdbq.f(this.a, dkolVar.a) && fdbq.f(this.b, dkolVar.b) && fdbq.f(this.c, dkolVar.c) && this.d == dkolVar.d && fdbq.f(this.e, dkolVar.e);
    }

    public final int hashCode() {
        dkod dkodVar = this.a;
        int iHashCode = dkodVar == null ? 0 : dkodVar.hashCode();
        dkoc dkocVar = this.b;
        int iHashCode2 = dkocVar != null ? dkocVar.hashCode() : 0;
        int i = iHashCode * 31;
        if (this.c != null) {
            throw null;
        }
        return ((((i + iHashCode2) * 961) + (true != this.d ? 1237 : 1231)) * 31) + 1231;
    }

    public final String toString() {
        return "SeparatorsUiData(text=" + this.a + ", lastReadMarker=" + this.b + ", aiSummary=" + this.c + ", showSeparators=" + this.d + ", flags=" + this.e + ")";
    }

    public dkol() {
        this(null, null, null, true, new dkok((char[]) null));
    }
}
