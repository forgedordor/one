package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwmi extends dwjo {
    private final ejwi a;
    private final ejwi b;

    public dwmi(ejwi ejwiVar, ejwi ejwiVar2) {
        this.a = ejwiVar;
        this.b = ejwiVar2;
    }

    @Override // defpackage.dwjo
    public final ejwi a() {
        return this.a;
    }

    @Override // defpackage.dwjo
    public final ejwi b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwjo) {
            dwjo dwjoVar = (dwjo) obj;
            if (this.a.equals(dwjoVar.a()) && this.b.equals(dwjoVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        ejwi ejwiVar = this.b;
        return "OverlayActionPayload{reactionOverlayHeader=" + String.valueOf(this.a) + ", stackedReactionWebView=" + String.valueOf(ejwiVar) + "}";
    }
}
