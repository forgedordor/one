package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etfr {
    public final String a;

    public etfr(etfs etfsVar) {
        this.a = etfsVar.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof etfr) {
            return Objects.equals(this.a, ((etfr) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final String toString() {
        return "CapabilityAlias{alias='" + this.a + "'}";
    }
}
