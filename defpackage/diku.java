package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diku implements diky {
    public final dike a;
    private final String b;

    public diku(String str, dike dikeVar) {
        this.b = str;
        this.a = dikeVar;
    }

    @Override // defpackage.dilm
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof diku)) {
            return false;
        }
        diku dikuVar = (diku) obj;
        return fdbq.f(this.b, dikuVar.b) && fdbq.f(this.a, dikuVar.a);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        dike dikeVar = this.a;
        return iHashCode + (dikeVar == null ? 0 : dikeVar.hashCode());
    }

    public final String toString() {
        return "Error(contentDescription=" + this.b + ", renderListener=" + this.a + ")";
    }
}
