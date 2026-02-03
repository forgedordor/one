package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehas extends ehce {
    private final ehay a;
    private final ehcl b;

    public ehas(ehay ehayVar, ehcl ehclVar) {
        if (ehayVar == null) {
            throw new NullPointerException("Null callbacks");
        }
        this.a = ehayVar;
        this.b = ehclVar;
    }

    @Override // defpackage.ehce
    public final ehay a() {
        return this.a;
    }

    @Override // defpackage.ehce
    public final ehcl b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ehce) {
            ehce ehceVar = (ehce) obj;
            if (this.a.equals(ehceVar.a()) && this.b.equals(ehceVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        ehcl ehclVar = this.b;
        return "CallbackResult{callbacks=" + this.a.toString() + ", result=" + ehclVar.toString() + "}";
    }
}
