package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chfo {
    public final cbqz a;
    public final aufx b;
    public final cbqx c;

    public chfo(cbqz cbqzVar, aufx aufxVar, cbqx cbqxVar) {
        cbqzVar.getClass();
        aufxVar.getClass();
        this.a = cbqzVar;
        this.b = aufxVar;
        this.c = cbqxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chfo)) {
            return false;
        }
        chfo chfoVar = (chfo) obj;
        return fdbq.f(this.a, chfoVar.a) && fdbq.f(this.b, chfoVar.b) && fdbq.f(this.c, chfoVar.c);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        cbqx cbqxVar = this.c;
        return (iHashCode * 31) + (cbqxVar == null ? 0 : cbqxVar.hashCode());
    }

    public final String toString() {
        return "SendingConfiguration(encryptionProtocol=" + this.a + ", messageClass=" + this.b + ", mlsEncryptionId=" + this.c + ")";
    }

    public /* synthetic */ chfo(cbqz cbqzVar, aufx aufxVar) {
        this(cbqzVar, aufxVar, null);
    }
}
