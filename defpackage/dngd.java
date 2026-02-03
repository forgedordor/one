package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dngd {
    public final boolean a;

    public dngd(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dngd) && this.a == ((dngd) obj).a;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    public final String toString() {
        return "TracingConfiguration(isEnabled=" + this.a + ")";
    }

    public dngd() {
        this(true);
    }
}
