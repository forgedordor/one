package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class crrk extends crry {
    public final int a;
    private final Optional b;
    private final dfmw c;

    public crrk(Optional optional, int i, dfmw dfmwVar) {
        this.b = optional;
        this.a = i;
        if (dfmwVar == null) {
            throw new NullPointerException("Null appProperties");
        }
        this.c = dfmwVar;
    }

    @Override // defpackage.crry
    public final int a() {
        return this.a;
    }

    @Override // defpackage.crry
    public final dfmw b() {
        return this.c;
    }

    @Override // defpackage.crry
    public final Optional c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof crry) {
            crry crryVar = (crry) obj;
            if (this.b.equals(crryVar.c()) && this.a == crryVar.a() && this.c.equals(crryVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.a) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        dfmw dfmwVar = this.c;
        return "PhenotypeRegistrationData{phenotypeReregistrationTimer=" + this.b.toString() + ", subId=" + this.a + ", appProperties=" + dfmwVar.toString() + "}";
    }
}
