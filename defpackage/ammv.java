package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ammv {
    public final int a;

    public ammv(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ammv) && this.a == ((ammv) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "SatelliteConfigImpl(maxMessageSize=" + this.a + ")";
    }
}
