package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vuu implements vur {
    private final xhh a;

    public vuu(xhh xhhVar) {
        this.a = xhhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vuu) && fdbq.f(this.a, ((vuu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failure(shortcut=" + this.a + ")";
    }
}
