package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cnxj {
    public final cnxu a;
    public final Duration b;

    public cnxj(cnxu cnxuVar, Duration duration) {
        cnxuVar.getClass();
        this.a = cnxuVar;
        this.b = duration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cnxj)) {
            return false;
        }
        cnxj cnxjVar = (cnxj) obj;
        return this.a == cnxjVar.a && fdbq.f(this.b, cnxjVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "UpdateResults(status=" + this.a + ", txnDuration=" + this.b + ")";
    }
}
