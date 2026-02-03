package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class chxy extends chyz {
    private final enwr a;
    private final chyx b;
    private final Optional c;
    private final Optional d;

    public chxy(enwr enwrVar, chyx chyxVar, Optional optional, Optional optional2) {
        if (enwrVar == null) {
            throw new NullPointerException("Null availability");
        }
        this.a = enwrVar;
        if (chyxVar == null) {
            throw new NullPointerException("Null hint");
        }
        this.b = chyxVar;
        this.c = optional;
        this.d = optional2;
    }

    @Override // defpackage.chyz
    public final chyx a() {
        return this.b;
    }

    @Override // defpackage.chyz
    public final enwr b() {
        return this.a;
    }

    @Override // defpackage.chyz
    public final Optional c() {
        return this.d;
    }

    @Override // defpackage.chyz
    public final Optional d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof chyz) {
            chyz chyzVar = (chyz) obj;
            if (this.a.equals(chyzVar.b()) && this.b.equals(chyzVar.a()) && this.c.equals(chyzVar.d()) && this.d.equals(chyzVar.c())) {
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
        chyx chyxVar = this.b;
        return "RcsAvailabilityUpdate{availability=" + this.a.toString() + ", hint=" + chyxVar.toString() + ", subId=" + optional2.toString() + ", rcsProvisioningId=" + optional.toString() + "}";
    }
}
