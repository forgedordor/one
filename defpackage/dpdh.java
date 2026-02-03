package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpdh {
    public final dpxq a;
    public final boolean b;
    public final boolean c;
    private final boolean d;
    private final boolean e;

    public dpdh() {
        this(null, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpdh)) {
            return false;
        }
        dpdh dpdhVar = (dpdh) obj;
        if (!fdbq.f(this.a, dpdhVar.a)) {
            return false;
        }
        boolean z = dpdhVar.d;
        if (this.b != dpdhVar.b || this.c != dpdhVar.c) {
            return false;
        }
        boolean z2 = dpdhVar.e;
        return true;
    }

    public final int hashCode() {
        dpxq dpxqVar = this.a;
        return ((((((((dpxqVar == null ? 0 : dpxqVar.hashCode()) * 31) + dpdg.a(false)) * 31) + dpdg.a(this.b)) * 31) + dpdg.a(this.c)) * 31) + dpdg.a(false);
    }

    public final String toString() {
        return "HugoHostFragmentConfiguration(hugoScreenStateListener=" + this.a + ", enableOverrideScreenConfigurationOnScreenOpen=false, reopenOpenScreenOnRestore=" + this.b + ", useProvidedDraftController=" + this.c + ", closeKeyboardAndInputOnClose=false)";
    }

    public /* synthetic */ dpdh(dpxq dpxqVar, int i) {
        this.a = 1 == (i & 1) ? null : dpxqVar;
        this.d = false;
        this.b = (i & 4) != 0;
        this.c = (i & 8) != 0;
        this.e = false;
    }
}
