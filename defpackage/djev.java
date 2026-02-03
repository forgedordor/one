package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djev {
    public final boolean a;
    public final boolean b;

    public djev() {
        this(false, 3);
    }

    public static /* synthetic */ djev a(djev djevVar, boolean z, int i) {
        boolean z2 = (i & 1) != 0 ? djevVar.a : false;
        if ((i & 2) != 0) {
            z = djevVar.b;
        }
        return new djev(z2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djev)) {
            return false;
        }
        djev djevVar = (djev) obj;
        return this.a == djevVar.a && this.b == djevVar.b;
    }

    public final int hashCode() {
        return (djeu.a(this.a) * 31) + djeu.a(this.b);
    }

    public final String toString() {
        return "Flags(enableDraftContentsCheck=" + this.a + ", enableInvertedColors=" + this.b + ")";
    }

    public djev(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public /* synthetic */ djev(boolean z, int i) {
        this(1 == (i & 1), z & ((i & 2) == 0));
    }
}
