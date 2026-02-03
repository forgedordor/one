package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class eaoi extends easg {
    public final easf a;
    public final easl b;
    public final Instant c;

    public eaoi(easf easfVar, easl easlVar, Instant instant) {
        if (easfVar == null) {
            throw new NullPointerException("Null type");
        }
        this.a = easfVar;
        if (easlVar == null) {
            throw new NullPointerException("Null price");
        }
        this.b = easlVar;
        if (instant == null) {
            throw new NullPointerException("Null updateTime");
        }
        this.c = instant;
    }

    @Override // defpackage.easg
    public final easf a() {
        return this.a;
    }

    @Override // defpackage.easg
    public final easl b() {
        return this.b;
    }

    @Override // defpackage.easg
    public final Instant c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof easg) {
            easg easgVar = (easg) obj;
            if (this.a.equals(easgVar.a()) && this.b.equals(easgVar.b()) && this.c.equals(easgVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        Instant instant = this.c;
        easl easlVar = this.b;
        return "FuelPrice{type=" + this.a.toString() + ", price=" + easlVar.toString() + ", updateTime=" + instant.toString() + "}";
    }
}
