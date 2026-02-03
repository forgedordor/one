package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpyo implements dpyr {
    private final int a;
    private final Duration b;

    public dpyo(int i, Duration duration) {
        this.a = i;
        this.b = duration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpyo)) {
            return false;
        }
        dpyo dpyoVar = (dpyo) obj;
        return this.a == dpyoVar.a && fdbq.f(this.b, dpyoVar.b);
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Loaded(selectedItemCount=" + this.a + ", loadingTime=" + this.b + ")";
    }
}
