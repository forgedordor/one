package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class eaoj extends eash {
    public final Duration a;
    public final int b;

    public eaoj(Duration duration, int i) {
        if (duration == null) {
            throw new NullPointerException("Null duration");
        }
        this.a = duration;
        this.b = i;
    }

    @Override // defpackage.eash
    public final int a() {
        return this.b;
    }

    @Override // defpackage.eash
    public final Duration b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eash) {
            eash eashVar = (eash) obj;
            if (this.a.equals(eashVar.b()) && this.b == eashVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "Leg{duration=" + this.a.toString() + ", distanceMeters=" + this.b + "}";
    }
}
