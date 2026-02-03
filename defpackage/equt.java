package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class equt extends eqtf {
    public final int a;
    public final equs b;

    public equt(int i, equs equsVar) {
        this.a = i;
        this.b = equsVar;
    }

    @Override // defpackage.eqst
    public final boolean a() {
        return this.b != equs.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof equt)) {
            return false;
        }
        equt equtVar = (equt) obj;
        return equtVar.a == this.a && equtVar.b == this.b;
    }

    public final int hashCode() {
        return Objects.hash(equt.class, Integer.valueOf(this.a), this.b);
    }

    public final String toString() {
        return "AesGcmSiv Parameters (variant: " + String.valueOf(this.b) + ", " + this.a + "-byte key)";
    }
}
