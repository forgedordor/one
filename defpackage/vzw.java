package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vzw implements wac {
    public final ajli a;

    public vzw(ajli ajliVar) {
        this.a = ajliVar;
        if (ajliVar == ajli.NONE) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vzw) && this.a == ((vzw) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DisabledTransportCapabilityData(composeDisabledReason=" + this.a + ")";
    }
}
