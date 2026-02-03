package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ednz extends edof {
    private final ejwi a;
    private final ejwi b;
    private final int c;

    public ednz(ejwi ejwiVar, int i, ejwi ejwiVar2) {
        this.a = ejwiVar;
        this.c = i;
        this.b = ejwiVar2;
    }

    @Override // defpackage.edof
    public final ejwi a() {
        return this.b;
    }

    @Override // defpackage.edof
    public final ejwi b() {
        return this.a;
    }

    @Override // defpackage.edof
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof edof) {
            edof edofVar = (edof) obj;
            if (this.a.equals(edofVar.b()) && this.c == edofVar.c() && this.b.equals(edofVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        ejwi ejwiVar = this.b;
        return "UriResource{uri=" + String.valueOf(this.a) + ", state=" + edhn.a(this.c) + ", event=" + String.valueOf(ejwiVar) + "}";
    }
}
