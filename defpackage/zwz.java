package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zwz {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    private final boolean e;
    private final boolean f;

    public zwz(boolean z, boolean z2, boolean z3, boolean z4) {
        this.e = false;
        this.f = false;
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zwz)) {
            return false;
        }
        zwz zwzVar = (zwz) obj;
        boolean z = zwzVar.e;
        boolean z2 = zwzVar.f;
        return this.a == zwzVar.a && this.b == zwzVar.b && this.c == zwzVar.c && this.d == zwzVar.d;
    }

    public final int hashCode() {
        int iA = zwy.a(false);
        boolean z = this.d;
        boolean z2 = this.c;
        boolean z3 = this.b;
        return (((((((((iA * 31) + zwy.a(false)) * 31) + zwy.a(this.a)) * 31) + zwy.a(z3)) * 31) + zwy.a(z2)) * 31) + zwy.a(z);
    }

    public final String toString() {
        return "Flags(shareSnackbarHostStateWithProjector=false, useProjectorThemeForBottomSheetsAndBottomContentInProjectorMode=false, useBottomContentHeightFlowForTopAppBarVisibility=" + this.a + ", moveSnackbarAboveComposeRow=" + this.b + ", enablePenpalDs=" + this.c + ", enableDisplayCutoutFix=" + this.d + ")";
    }

    public zwz() {
        this(false, false, false, false);
    }
}
