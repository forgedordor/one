package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuba {
    public final cubn a;
    private final cubn b;

    public cuba() {
        this(null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cuba)) {
            return false;
        }
        cuba cubaVar = (cuba) obj;
        cubn cubnVar = cubaVar.b;
        return fdbq.f(null, null) && fdbq.f(this.a, cubaVar.a);
    }

    public final int hashCode() {
        cubn cubnVar = this.a;
        if (cubnVar == null) {
            return 0;
        }
        return cubnVar.hashCode();
    }

    public final String toString() {
        return "ProfileSuggestionUiData(profileSuggestionRow=null, phoneSuggestionRow=" + this.a + ")";
    }

    public cuba(cubn cubnVar) {
        this.b = null;
        this.a = cubnVar;
    }

    public /* synthetic */ cuba(cubn cubnVar, int i) {
        this((i & 2) != 0 ? null : cubnVar);
    }
}
