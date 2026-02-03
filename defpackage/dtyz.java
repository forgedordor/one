package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtyz extends dtzh {
    public final String a;
    public final ejwi b;

    public dtyz(String str, ejwi ejwiVar) {
        this.a = str;
        this.b = ejwiVar;
    }

    @Override // defpackage.dtzh
    public final ejwi a() {
        return this.b;
    }

    @Override // defpackage.dtzh
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dtzh) {
            dtzh dtzhVar = (dtzh) obj;
            if (this.a.equals(dtzhVar.b()) && this.b.equals(dtzhVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "CheckContentChangeRequest{url=" + this.a + ", cachedETagOptional=" + String.valueOf(this.b) + "}";
    }
}
