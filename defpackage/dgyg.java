package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgyg extends dgza {
    public final int a;
    public final Duration b;
    private final int h;

    public dgyg(int i, int i2, Duration duration) {
        this.a = i;
        this.h = i2;
        this.b = duration;
    }

    @Override // defpackage.dgza
    public final int a() {
        return this.h;
    }

    @Override // defpackage.dgza
    public final int b() {
        return this.a;
    }

    @Override // defpackage.dgza
    public final Duration c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dgza) {
            dgza dgzaVar = (dgza) obj;
            if (this.a == dgzaVar.b() && this.h == dgzaVar.a() && this.b.equals(dgzaVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.h) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "InstantMessageError{type=" + this.a + ", reason=" + this.h + ", retryAfter=" + String.valueOf(this.b) + "}";
    }
}
