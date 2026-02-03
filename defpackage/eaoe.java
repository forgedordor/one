package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class eaoe extends earw {
    public final easb a;
    public final Double b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final Instant f;

    public eaoe(easb easbVar, Double d, Integer num, Integer num2, Integer num3, Instant instant) {
        if (easbVar == null) {
            throw new NullPointerException("Null type");
        }
        this.a = easbVar;
        this.b = d;
        this.c = num;
        this.d = num2;
        this.e = num3;
        this.f = instant;
    }

    @Override // defpackage.earw
    public final easb a() {
        return this.a;
    }

    @Override // defpackage.earw
    public final Instant b() {
        return this.f;
    }

    @Override // defpackage.earw
    public final Double c() {
        return this.b;
    }

    @Override // defpackage.earw
    public final Integer d() {
        return this.d;
    }

    @Override // defpackage.earw
    public final Integer e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        Integer num;
        Integer num2;
        Instant instant;
        if (obj == this) {
            return true;
        }
        if (obj instanceof earw) {
            earw earwVar = (earw) obj;
            if (this.a.equals(earwVar.a()) && this.b.equals(earwVar.c()) && this.c.equals(earwVar.e()) && ((num = this.d) != null ? num.equals(earwVar.d()) : earwVar.d() == null) && ((num2 = this.e) != null ? num2.equals(earwVar.f()) : earwVar.f() == null) && ((instant = this.f) != null ? instant.equals(earwVar.b()) : earwVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.earw
    public final Integer f() {
        return this.e;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        Integer num = this.d;
        int iHashCode2 = ((iHashCode * 1000003) ^ (num == null ? 0 : num.hashCode())) * 1000003;
        Integer num2 = this.e;
        int iHashCode3 = (iHashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        Instant instant = this.f;
        return iHashCode3 ^ (instant != null ? instant.hashCode() : 0);
    }

    public final String toString() {
        Instant instant = this.f;
        return "ConnectorAggregation{type=" + this.a.toString() + ", maxChargeRateKw=" + this.b + ", count=" + this.c + ", availableCount=" + this.d + ", outOfServiceCount=" + this.e + ", availabilityLastUpdateTime=" + String.valueOf(instant) + "}";
    }
}
