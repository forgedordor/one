package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpyn implements dpyr {
    private final int a;
    private final Duration b;

    public dpyn(int i, Duration duration) {
        this.a = i;
        this.b = duration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpyn)) {
            return false;
        }
        dpyn dpynVar = (dpyn) obj;
        return this.a == dpynVar.a && fdbq.f(this.b, dpynVar.b);
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Closing(selectedItemCount=" + this.a + ", timeSpent=" + this.b + ")";
    }
}
