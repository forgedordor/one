package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edqi extends edqo {
    private final edlw a;
    private final edll b;
    private final edlw c;

    public edqi(edlw edlwVar, edll edllVar, edlw edlwVar2) {
        this.a = edlwVar;
        this.b = edllVar;
        this.c = edlwVar2;
    }

    @Override // defpackage.edqo
    public final edll a() {
        return this.b;
    }

    @Override // defpackage.edqo
    public final edlw b() {
        return this.a;
    }

    @Override // defpackage.edqo
    public final edlw c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof edqo) {
            edqo edqoVar = (edqo) obj;
            if (this.a.equals(edqoVar.b()) && this.b.equals(edqoVar.a()) && this.c.equals(edqoVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        edlw edlwVar = this.c;
        edll edllVar = this.b;
        return "GooglePhotosResource{meSuggestedPhotosResource=" + this.a.toString() + ", clustersResource=" + edllVar.toString() + ", suggestedPhotosResource=" + edlwVar.toString() + "}";
    }
}
