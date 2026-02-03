package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ciad extends cibv {
    public final ekgb a;
    public final Optional b;
    public final Optional c;
    public final Optional d;

    public ciad(ekgb ekgbVar, Optional optional, Optional optional2, Optional optional3) {
        this.a = ekgbVar;
        this.b = optional;
        this.c = optional2;
        this.d = optional3;
    }

    @Override // defpackage.cibv
    public final ekgb a() {
        return this.a;
    }

    @Override // defpackage.cibv
    public final Optional b() {
        return this.b;
    }

    @Override // defpackage.cibv
    public final Optional c() {
        return this.c;
    }

    @Override // defpackage.cibv
    public final Optional d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cibv) {
            cibv cibvVar = (cibv) obj;
            if (ekjz.h(this.a, cibvVar.a()) && this.b.equals(cibvVar.b()) && this.c.equals(cibvVar.c()) && this.d.equals(cibvVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        Optional optional = this.d;
        Optional optional2 = this.c;
        Optional optional3 = this.b;
        return "GroupResolutionQueryResults{allParameterResults=" + this.a.toString() + ", onlyGlobalIdentifiersResults=" + String.valueOf(optional3) + ", onlySessionIdResults=" + String.valueOf(optional2) + ", telephonyFallbackResults=" + String.valueOf(optional) + "}";
    }
}
