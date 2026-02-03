package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class web {
    public final dojv a;
    public final vvl b;

    public web(dojv dojvVar, vvl vvlVar) {
        this.a = dojvVar;
        this.b = vvlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof web)) {
            return false;
        }
        web webVar = (web) obj;
        return fdbq.f(this.a, webVar.a) && fdbq.f(this.b, webVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "MediaWithInstanceId(media=" + this.a + ", instanceId=" + this.b + ")";
    }
}
