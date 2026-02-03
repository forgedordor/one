package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlbr {
    public final boolean a;
    public final String b;
    public final String c;
    public final boolean d;
    public final fdae e;

    public dlbr(boolean z, String str, String str2, boolean z2, fdae fdaeVar) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = z2;
        this.e = fdaeVar;
    }

    public static /* synthetic */ dlbr a(dlbr dlbrVar, boolean z, String str, String str2, fdae fdaeVar, int i) {
        if ((i & 1) != 0) {
            z = dlbrVar.a;
        }
        boolean z2 = z;
        if ((i & 2) != 0) {
            str = dlbrVar.b;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = dlbrVar.c;
        }
        String str4 = str2;
        boolean z3 = (i & 8) != 0 ? dlbrVar.d : false;
        if ((i & 16) != 0) {
            fdaeVar = dlbrVar.e;
        }
        fdae fdaeVar2 = fdaeVar;
        fdaeVar2.getClass();
        return new dlbr(z2, str3, str4, z3, fdaeVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlbr)) {
            return false;
        }
        dlbr dlbrVar = (dlbr) obj;
        return this.a == dlbrVar.a && fdbq.f(this.b, dlbrVar.b) && fdbq.f(this.c, dlbrVar.c) && this.d == dlbrVar.d && fdbq.f(this.e, dlbrVar.e);
    }

    public final int hashCode() {
        String str = this.b;
        int iHashCode = str == null ? 0 : str.hashCode();
        boolean z = this.a;
        String str2 = this.c;
        return (((((((dlbq.a(z) * 31) + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + dlbq.a(this.d)) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "ScrollToBottomUiData(isVisible=" + this.a + ", contentDescription=" + this.b + ", text=" + this.c + ", useSurfaceContainer=" + this.d + ", onClick=" + this.e + ")";
    }

    public /* synthetic */ dlbr(String str, String str2, boolean z, fdae fdaeVar, int i) {
        this(false, str, (i & 4) != 0 ? null : str2, ((i & 8) == 0) & z, fdaeVar);
    }
}
