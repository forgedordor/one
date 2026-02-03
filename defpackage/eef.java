package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eef implements ehc {
    private final int b;
    private final int a = 0;
    private final int c = 0;
    private final int d = 0;

    public eef(int i) {
        this.b = i;
    }

    @Override // defpackage.ehc
    public final int a(kio kioVar) {
        return 0;
    }

    @Override // defpackage.ehc
    public final int b(kio kioVar, kji kjiVar) {
        return 0;
    }

    @Override // defpackage.ehc
    public final int c(kio kioVar, kji kjiVar) {
        return 0;
    }

    @Override // defpackage.ehc
    public final int d(kio kioVar) {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eef)) {
            return false;
        }
        eef eefVar = (eef) obj;
        int i = eefVar.a;
        if (this.b != eefVar.b) {
            return false;
        }
        int i2 = eefVar.c;
        int i3 = eefVar.d;
        return true;
    }

    public final int hashCode() {
        return this.b * 961;
    }

    public final String toString() {
        return "Insets(left=0, top=" + this.b + ", right=0, bottom=0)";
    }
}
