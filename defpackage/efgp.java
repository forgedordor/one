package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efgp extends efgz {
    public final evqs a;
    public final Optional b;
    private final ekgb d;

    public efgp(ekgb ekgbVar, evqs evqsVar, Optional optional) {
        this.d = ekgbVar;
        this.a = evqsVar;
        this.b = optional;
    }

    @Override // defpackage.efgz
    public final ekgb a() {
        return this.d;
    }

    @Override // defpackage.efgz
    public final evqs b() {
        return this.a;
    }

    @Override // defpackage.efgz
    public final Optional c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof efgz) {
            efgz efgzVar = (efgz) obj;
            if (ekjz.h(this.d, efgzVar.a()) && this.a.equals(efgzVar.b()) && this.b.equals(efgzVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.d.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        Optional optional = this.b;
        evqs evqsVar = this.a;
        return "CpimMessageContent{headers=" + String.valueOf(this.d) + ", content=" + evqsVar.toString() + ", messageContent=" + String.valueOf(optional) + "}";
    }
}
