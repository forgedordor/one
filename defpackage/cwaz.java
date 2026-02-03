package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwaz {
    private final boolean a;

    public cwaz() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwaz)) {
            return false;
        }
        boolean z = ((cwaz) obj).a;
        return true;
    }

    public final int hashCode() {
        return 1237;
    }

    public final String toString() {
        return "Flags(enableCoolRanchPhase3=false)";
    }

    public /* synthetic */ cwaz(byte[] bArr) {
        this.a = false;
    }
}
