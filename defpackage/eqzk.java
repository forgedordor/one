package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqzk extends eqzn {
    public final int a;
    public final eqzj b;

    public eqzk(int i, eqzj eqzjVar) {
        this.a = i;
        this.b = eqzjVar;
    }

    @Override // defpackage.eqst
    public final boolean a() {
        return this.b != eqzj.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof eqzk)) {
            return false;
        }
        eqzk eqzkVar = (eqzk) obj;
        return eqzkVar.a == this.a && eqzkVar.b == this.b;
    }

    public final int hashCode() {
        return Objects.hash(eqzk.class, Integer.valueOf(this.a), this.b);
    }

    public final String toString() {
        return "AesSiv Parameters (variant: " + String.valueOf(this.b) + ", " + this.a + "-byte key)";
    }
}
