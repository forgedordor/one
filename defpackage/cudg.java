package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cudg {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    private final boolean d;

    /* JADX WARN: Illegal instructions before constructor call */
    public cudg() {
        boolean z = false;
        this(z, z, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cudg)) {
            return false;
        }
        cudg cudgVar = (cudg) obj;
        boolean z = cudgVar.d;
        return this.a == cudgVar.a && this.b == cudgVar.b && this.c == cudgVar.c;
    }

    public final int hashCode() {
        int iA = cudf.a(false);
        boolean z = this.c;
        return (((((iA * 31) + cudf.a(this.a)) * 31) + cudf.a(this.b)) * 31) + cudf.a(z);
    }

    public final String toString() {
        return "Flags(useComposeBackHandler=false, enableBackBehaviorFix=" + this.a + ", enableStartChatCoolRanchPhase3=" + this.b + ", enableAutomationDetectionForClickEvents=" + this.c + ")";
    }

    public /* synthetic */ cudg(boolean z, boolean z2, int i) {
        boolean zA = crtr.a();
        this.d = false;
        this.a = z & ((i & 2) == 0);
        this.b = ((i & 4) == 0) & z2;
        this.c = zA;
    }
}
