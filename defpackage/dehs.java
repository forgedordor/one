package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dehs extends deia {
    public final Long a;
    public final int b;

    public dehs(Long l, int i) {
        this.a = l;
        this.b = i;
    }

    @Override // defpackage.degp
    public final long a(degq degqVar, degq degqVar2) {
        b(degqVar);
        b(degqVar2);
        return dejc.c(degqVar2.b, degqVar.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dehs) {
            return Objects.equals(this.a, ((dehs) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }

    public final String toString() {
        return "BasicPhysicalTicker";
    }
}
