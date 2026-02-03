package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chfr extends chfs {
    public final chft a;
    public final chem b;

    public chfr(chft chftVar, chem chemVar) {
        chftVar.getClass();
        this.a = chftVar;
        this.b = chemVar;
    }

    @Override // defpackage.chfs
    public final chft a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chfr)) {
            return false;
        }
        chfr chfrVar = (chfr) obj;
        return fdbq.f(this.a, chfrVar.a) && fdbq.f(this.b, chfrVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Request(sendingMessageData=" + this.a + ", chatApiData=" + this.b + ")";
    }
}
