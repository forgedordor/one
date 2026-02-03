package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkgt {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    private final boolean d;

    public dkgt() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkgt)) {
            return false;
        }
        dkgt dkgtVar = (dkgt) obj;
        if (this.a != dkgtVar.a || this.b != dkgtVar.b) {
            return false;
        }
        boolean z = dkgtVar.d;
        return this.c == dkgtVar.c;
    }

    public final int hashCode() {
        return (((((dkgs.a(this.a) * 31) + dkgs.a(this.b)) * 31) + dkgs.a(false)) * 31) + dkgs.a(this.c);
    }

    public final String toString() {
        return "Flags(useWidthModifier=" + this.a + ", enableSwipeToShowTimestamps=" + this.b + ", enableLasagna=false, alignShortcutAtCenter=" + this.c + ")";
    }

    public dkgt(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.d = false;
        this.c = z3;
    }

    public /* synthetic */ dkgt(byte[] bArr) {
        this(false, false, false);
    }
}
