package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dayo {
    public final boolean a;
    private final boolean b;

    public dayo(boolean z, boolean z2) {
        this.b = z;
        this.a = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dayo)) {
            return false;
        }
        dayo dayoVar = (dayo) obj;
        return this.b == dayoVar.b && this.a == dayoVar.a;
    }

    public final int hashCode() {
        return (dayn.a(this.b) * 31) + dayn.a(this.a);
    }

    public final String toString() {
        return "Flags(addMinorUiTweaksToWelcome=" + this.b + ", fixWelcomeFlowScrollCrash=" + this.a + ")";
    }

    public dayo() {
        this(false, false);
    }
}
