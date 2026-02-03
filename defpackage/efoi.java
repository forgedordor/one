package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efoi {
    public final String a;
    public final long b;
    public final alqm c;

    public efoi(String str, long j, alqm alqmVar) {
        this.a = str;
        this.b = j;
        this.c = alqmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof efoi)) {
            return false;
        }
        efoi efoiVar = (efoi) obj;
        return fdbq.f(this.a, efoiVar.a) && this.b == efoiVar.b && fdbq.f(this.c, efoiVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.b;
        return (((iHashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "IncomingProtoMessageData(conversationId=" + this.a + ", sentTimestamp=" + this.b + ", sender=" + this.c + ")";
    }
}
