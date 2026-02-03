package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzoo extends bzue {
    private final String a;
    private final evqs b;

    public bzoo(String str, evqs evqsVar) {
        this.a = str;
        this.b = evqsVar;
    }

    @Override // defpackage.bzue
    public final evqs a() {
        return this.b;
    }

    @Override // defpackage.bzue
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        evqs evqsVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bzue) {
            bzue bzueVar = (bzue) obj;
            if (this.a.equals(bzueVar.b()) && ((evqsVar = this.b) != null ? evqsVar.equals(bzueVar.a()) : bzueVar.a() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        evqs evqsVar = this.b;
        return (iHashCode * 1000003) ^ (evqsVar == null ? 0 : evqsVar.hashCode());
    }

    public final String toString() {
        return "UploadResult{fileId=" + this.a + ", encryptionKey=" + String.valueOf(this.b) + "}";
    }
}
