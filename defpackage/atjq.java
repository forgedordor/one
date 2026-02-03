package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atjq {
    public final atjr a;
    public final Duration b;
    public final int c;

    public atjq(atjr atjrVar, int i, Duration duration) {
        atjrVar.getClass();
        this.a = atjrVar;
        this.c = i;
        this.b = duration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof atjq)) {
            return false;
        }
        atjq atjqVar = (atjq) obj;
        return this.a == atjqVar.a && this.c == atjqVar.c && fdbq.f(this.b, atjqVar.b);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.c) * 31) + this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FileProcessingStepData(stepName=");
        sb.append(this.a);
        sb.append(", executionStatus=");
        int i = this.c;
        sb.append((Object) (i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "FAILED_OPEN" : "FAILED_AFTER_RETRY" : "FAILED" : "CANCELED" : "SUCCEEDED_AFTER_RETRY" : "SUCCEEDED"));
        sb.append(", executionLatency=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
