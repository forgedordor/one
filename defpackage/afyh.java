package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afyh {
    public final boolean a;
    private final boolean b;

    public afyh() {
        this(false, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afyh)) {
            return false;
        }
        afyh afyhVar = (afyh) obj;
        if (this.a != afyhVar.a) {
            return false;
        }
        boolean z = afyhVar.b;
        return true;
    }

    public final int hashCode() {
        return (afyg.a(this.a) * 31) + afyg.a(false);
    }

    public final String toString() {
        return "Flags(enableMultiShareCoolRanchPhase3=" + this.a + ", enablePolishAnimationInMultishare=false)";
    }

    public afyh(boolean z) {
        this.a = z;
        this.b = false;
    }

    public /* synthetic */ afyh(boolean z, int i) {
        this(1 == ((z ? 1 : 0) & ((i & 1) ^ 1)));
    }
}
