package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dvqj extends dvqw {
    private final ejwi a;
    private final ejwi b;
    private final ejwi c;
    private final int d;

    public dvqj(int i, ejwi ejwiVar, ejwi ejwiVar2, ejwi ejwiVar3) {
        this.d = i;
        this.a = ejwiVar;
        this.b = ejwiVar2;
        this.c = ejwiVar3;
    }

    @Override // defpackage.dvqw
    public final ejwi a() {
        return this.a;
    }

    @Override // defpackage.dvqw
    public final ejwi b() {
        return this.b;
    }

    @Override // defpackage.dvqw
    public final ejwi c() {
        return this.c;
    }

    @Override // defpackage.dvqw
    public final int d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dvqw) {
            dvqw dvqwVar = (dvqw) obj;
            if (this.d == dvqwVar.d() && this.a.equals(dvqwVar.a()) && this.b.equals(dvqwVar.b()) && this.c.equals(dvqwVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.d ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        int i = this.d;
        String str = i != 1 ? i != 2 ? i != 3 ? "RETRY" : "FAILURE" : "SUCCESS" : "UNKNOWN";
        ejwi ejwiVar = this.a;
        ejwi ejwiVar2 = this.b;
        ejwi ejwiVar3 = this.c;
        return "RegisterRefreshResult{status=" + str + ", accountContext=" + String.valueOf(ejwiVar) + ", authToken=" + String.valueOf(ejwiVar2) + ", serverTimestamp=" + String.valueOf(ejwiVar3) + "}";
    }
}
