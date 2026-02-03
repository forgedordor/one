package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djga {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public djga() {
        this(false, false, false, false, false, false, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djga)) {
            return false;
        }
        djga djgaVar = (djga) obj;
        return this.a == djgaVar.a && this.b == djgaVar.b && this.c == djgaVar.c && this.d == djgaVar.d && this.e == djgaVar.e && this.f == djgaVar.f;
    }

    public final int hashCode() {
        int iA = djfz.a(this.a);
        boolean z = this.f;
        boolean z2 = this.e;
        boolean z3 = this.d;
        return (((((((((iA * 31) + djfz.a(this.b)) * 31) + djfz.a(this.c)) * 31) + djfz.a(z3)) * 31) + djfz.a(z2)) * 31) + djfz.a(z);
    }

    public final String toString() {
        return "Flags(useRevisedLayout=" + this.a + ", useMagicEdit=" + this.b + ", verifyTextFieldDisposition=" + this.c + ", hideInputIfNullUiData=" + this.d + ", enableAutomationDetectionForClickEvents=" + this.e + ", useDynamicCursorColor=" + this.f + ")";
    }

    public /* synthetic */ djga(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i) {
        this.a = 1 == ((z ? 1 : 0) & ((i & 1) ^ 1));
        this.b = ((i & 2) == 0) & z2;
        this.c = ((i & 4) == 0) & z3;
        this.d = ((i & 8) == 0) & z4;
        this.e = ((i & 16) == 0) & z5;
        this.f = ((i & 32) == 0) & z6;
    }
}
