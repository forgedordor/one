package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwic extends dwig {
    private final ejwi a;
    private final ejwi b;
    private final ejwi c;

    public dwic(ejwi ejwiVar, ejwi ejwiVar2, ejwi ejwiVar3) {
        this.a = ejwiVar;
        this.b = ejwiVar2;
        this.c = ejwiVar3;
    }

    @Override // defpackage.dwig
    public final ejwi a() {
        return this.c;
    }

    @Override // defpackage.dwig
    public final ejwi b() {
        return this.b;
    }

    @Override // defpackage.dwig
    public final ejwi c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwig) {
            dwig dwigVar = (dwig) obj;
            if (this.a.equals(dwigVar.c()) && this.b.equals(dwigVar.b()) && this.c.equals(dwigVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        ejwi ejwiVar = this.c;
        ejwi ejwiVar2 = this.b;
        return "BootstrapDetail{numberOfMessagesDeleted=" + String.valueOf(this.a) + ", numberOfConversationDownloaded=" + String.valueOf(ejwiVar2) + ", bootstrapDuration=" + String.valueOf(ejwiVar) + "}";
    }
}
