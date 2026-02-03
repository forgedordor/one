package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnbx {
    private static final List e = fcva.g("image/*", "video/*");
    public final List a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    /* JADX WARN: Illegal instructions before constructor call */
    public dnbx() {
        boolean z = false;
        this(z, z, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnbx)) {
            return false;
        }
        dnbx dnbxVar = (dnbx) obj;
        return fdbq.f(this.a, dnbxVar.a) && this.b == dnbxVar.b && this.c == dnbxVar.c && this.d == dnbxVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        boolean z = this.d;
        return ((((iHashCode + dnbw.a(this.b)) * 31) + dnbw.a(this.c)) * 31) + dnbw.a(z);
    }

    public final String toString() {
        return "SystemContentPickerConfiguration(allowedMimeTypes=" + this.a + ", areMultiplePicksAllowed=" + this.b + ", shouldShowFab=" + this.c + ", shouldShowTile=" + this.d + ")";
    }

    public /* synthetic */ dnbx(boolean z, boolean z2, int i) {
        List list = (i & 1) != 0 ? e : null;
        boolean z3 = (i & 2) != 0;
        boolean z4 = z & ((i & 4) == 0);
        boolean z5 = (i & 8) == 0;
        list.getClass();
        this.a = list;
        this.b = z3;
        this.c = z4;
        this.d = z2 & z5;
    }
}
