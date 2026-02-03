package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aony implements aooa {
    public final aont a;

    public aony(aont aontVar) {
        this.a = aontVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aony) && fdbq.f(this.a, ((aony) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "HostUnavailable(unavailabilityReason=" + this.a + ")";
    }
}
