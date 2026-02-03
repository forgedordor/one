package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class csvh extends cswh {
    private final evqs a;
    private final evvp b;

    public csvh(evqs evqsVar, evvp evvpVar) {
        this.a = evqsVar;
        if (evvpVar == null) {
            throw new NullPointerException("Null creationTime");
        }
        this.b = evvpVar;
    }

    @Override // defpackage.cswh
    public final evqs a() {
        return this.a;
    }

    @Override // defpackage.cswh
    public final evvp b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cswh) {
            cswh cswhVar = (cswh) obj;
            if (this.a.equals(cswhVar.a()) && this.b.equals(cswhVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        evvp evvpVar = this.b;
        return "DecryptedKeyPair{publicKey=" + this.a.toString() + ", creationTime=" + evvpVar.toString() + "}";
    }
}
