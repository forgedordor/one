package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afnr {
    public final boolean a;
    private final boolean b;

    public afnr(boolean z) {
        this.a = z;
        this.b = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afnr)) {
            return false;
        }
        afnr afnrVar = (afnr) obj;
        if (this.a != afnrVar.a) {
            return false;
        }
        boolean z = afnrVar.b;
        return true;
    }

    public final int hashCode() {
        return (afnq.a(this.a) * 31) + afnq.a(false);
    }

    public final String toString() {
        return "Flags(enableMultiShareCoolRanchPhase3=" + this.a + ", enablePolishAnimationInMultishare=false)";
    }

    public afnr() {
        this(false);
    }
}
