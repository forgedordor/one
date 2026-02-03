package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ergc {
    private final Class a;
    private final erwn b;

    public ergc(Class cls, erwn erwnVar) {
        this.a = cls;
        this.b = erwnVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ergc)) {
            return false;
        }
        ergc ergcVar = (ergc) obj;
        return ergcVar.a.equals(this.a) && ergcVar.b.equals(this.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        erwn erwnVar = this.b;
        return this.a.getSimpleName() + ", object identifier: " + String.valueOf(erwnVar);
    }
}
