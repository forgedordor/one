package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egyd extends egzt {
    public final egyi a;
    public final long b;
    public final egyv c;
    public final egyz d;
    public final int e;
    public final Instant f;

    public egyd(egyi egyiVar, long j, egyv egyvVar, egyz egyzVar, int i, Instant instant) {
        this.a = egyiVar;
        this.b = j;
        this.c = egyvVar;
        this.d = egyzVar;
        this.e = i;
        if (instant == null) {
            throw new NullPointerException("Null epochTimeAtStart");
        }
        this.f = instant;
    }

    @Override // defpackage.egzt
    public final int a() {
        return this.e;
    }

    @Override // defpackage.egzt
    public final long b() {
        return this.b;
    }

    @Override // defpackage.egzt
    public final egyi c() {
        return this.a;
    }

    @Override // defpackage.egzt
    public final egyv d() {
        return this.c;
    }

    @Override // defpackage.egzt
    public final egyz e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof egzt) {
            egzt egztVar = (egzt) obj;
            if (this.a.equals(egztVar.c()) && this.b == egztVar.b() && this.c.equals(egztVar.d()) && this.d.equals(egztVar.e()) && this.e == egztVar.a() && this.f.equals(egztVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.egzt
    public final Instant f() {
        return this.f;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        return (((((((((iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        Instant instant = this.f;
        egyz egyzVar = this.d;
        egyv egyvVar = this.c;
        return "SubscribeSequenceState{dataSource=" + this.a.toString() + ", index=" + this.b + ", fetchTaskIdentifier=" + egyvVar.toString() + ", loadTaskIdentifier=" + egyzVar.toString() + ", loadAttempts=" + this.e + ", epochTimeAtStart=" + instant.toString() + "}";
    }
}
