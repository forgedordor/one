package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epqp extends epqq {
    private final evqs a;
    private final evqs b;

    public epqp(evqs evqsVar, evqs evqsVar2) {
        this.a = evqsVar;
        this.b = evqsVar2;
    }

    @Override // defpackage.epqq
    public final evqs a() {
        return this.b;
    }

    @Override // defpackage.epqq
    public final evqs b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof epqq) {
            epqq epqqVar = (epqq) obj;
            if (this.a.equals(epqqVar.b()) && this.b.equals(epqqVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        evqs evqsVar = this.b;
        return "Curve25519KeyPair{publicKey=" + this.a.toString() + ", privateKey=" + evqsVar.toString() + "}";
    }
}
