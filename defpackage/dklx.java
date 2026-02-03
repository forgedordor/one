package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dklx {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    /* JADX WARN: Illegal instructions before constructor call */
    public dklx() {
        boolean z = false;
        this(z, z, z, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dklx)) {
            return false;
        }
        dklx dklxVar = (dklx) obj;
        return this.a == dklxVar.a && this.b == dklxVar.b && this.c == dklxVar.c;
    }

    public final int hashCode() {
        return (((dklw.a(this.a) * 31) + dklw.a(this.b)) * 31) + dklw.a(this.c);
    }

    public final String toString() {
        return "Flags(useWrappingMetatext=" + this.a + ", useClickableWithPosition=" + this.b + ", trackLastMetatextItemInList=" + this.c + ")";
    }

    public /* synthetic */ dklx(boolean z, boolean z2, boolean z3, int i) {
        this.a = 1 == ((z ? 1 : 0) & ((i & 1) ^ 1));
        this.b = ((i & 2) == 0) & z2;
        this.c = ((i & 4) == 0) & z3;
    }
}
