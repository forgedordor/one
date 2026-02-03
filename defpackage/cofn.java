package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cofn {
    public final long a;
    public final String b;

    public cofn(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cofn)) {
            return false;
        }
        cofn cofnVar = (cofn) obj;
        return this.a == cofnVar.a && fdbq.f(this.b, cofnVar.b);
    }

    public final int hashCode() {
        long j = this.a;
        return (((int) (j ^ (j >>> 32))) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "SmsMessageToUpdate(messageId=" + this.a + ", address=" + this.b + ")";
    }
}
