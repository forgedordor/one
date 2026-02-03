package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efcg extends efer {
    public final double a;
    public final double b;
    public final Optional c;
    private final Optional d;
    private final String e;
    private final Optional f;
    private final Optional g;
    private final Optional h;
    private final Optional i;

    public efcg(Optional optional, String str, Optional optional2, Optional optional3, Optional optional4, double d, double d2, Optional optional5, Optional optional6) {
        this.d = optional;
        this.e = str;
        this.f = optional2;
        this.g = optional3;
        this.h = optional4;
        this.a = d;
        this.b = d2;
        this.c = optional5;
        this.i = optional6;
    }

    @Override // defpackage.efer
    public final double a() {
        return this.b;
    }

    @Override // defpackage.efer
    public final double b() {
        return this.a;
    }

    @Override // defpackage.efer
    public final Optional c() {
        return this.i;
    }

    @Override // defpackage.efer
    public final Optional d() {
        return this.f;
    }

    @Override // defpackage.efer
    public final Optional e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof efer) {
            efer eferVar = (efer) obj;
            if (this.d.equals(eferVar.h()) && this.e.equals(eferVar.i()) && this.f.equals(eferVar.d()) && this.g.equals(eferVar.e()) && this.h.equals(eferVar.f()) && Double.doubleToLongBits(this.a) == Double.doubleToLongBits(eferVar.b()) && Double.doubleToLongBits(this.b) == Double.doubleToLongBits(eferVar.a()) && this.c.equals(eferVar.g()) && this.i.equals(eferVar.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.efer
    public final Optional f() {
        return this.h;
    }

    @Override // defpackage.efer
    public final Optional g() {
        return this.c;
    }

    @Override // defpackage.efer
    public final Optional h() {
        return this.d;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.d.hashCode() ^ 1000003) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
        double d = this.a;
        long jDoubleToLongBits = Double.doubleToLongBits(d) ^ (Double.doubleToLongBits(d) >>> 32);
        double d2 = this.b;
        return (((((((iHashCode * 1000003) ^ ((int) jDoubleToLongBits)) * 1000003) ^ ((int) (Double.doubleToLongBits(d2) ^ (Double.doubleToLongBits(d2) >>> 32)))) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    @Override // defpackage.efer
    public final String i() {
        return this.e;
    }
}
