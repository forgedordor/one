package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class batv extends baxj {
    private final bvea a;
    private final ekgp b;

    public batv(bvea bveaVar, ekgp ekgpVar) {
        this.a = bveaVar;
        this.b = ekgpVar;
    }

    @Override // defpackage.baxj
    public final bvea a() {
        return this.a;
    }

    @Override // defpackage.baxj
    public final ekgp b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof baxj) {
            baxj baxjVar = (baxj) obj;
            if (this.a.equals(baxjVar.a()) && ekmi.m(this.b, baxjVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "MessageSendReceiveAttempt{transportProtocol=" + this.a.toString() + ", regionCodes=" + ekmi.g(this.b) + "}";
    }
}
