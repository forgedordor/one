package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djwc implements djvp {
    public final String a;
    public final String b;
    public final List c;
    public final boolean d;
    public final boolean e;
    public final fdae f;
    public final int g;
    public final icc h;

    public djwc(String str, String str2, List list, boolean z, boolean z2, fdae fdaeVar, icc iccVar, int i) {
        list.getClass();
        fdaeVar.getClass();
        iccVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = z;
        this.e = z2;
        this.f = fdaeVar;
        this.h = iccVar;
        this.g = i;
    }

    public static /* synthetic */ djwc a(djwc djwcVar, String str, String str2, List list, boolean z, fdae fdaeVar, icc iccVar, int i) {
        if ((i & 1) != 0) {
            str = djwcVar.a;
        }
        String str3 = str;
        if ((i & 2) != 0) {
            str2 = djwcVar.b;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            list = djwcVar.c;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            z = djwcVar.d;
        }
        boolean z2 = z;
        boolean z3 = (i & 16) != 0 ? djwcVar.e : false;
        if ((i & 32) != 0) {
            fdaeVar = djwcVar.f;
        }
        fdae fdaeVar2 = fdaeVar;
        icc iccVar2 = (i & 64) != 0 ? djwcVar.h : iccVar;
        int i2 = djwcVar.g;
        str3.getClass();
        list2.getClass();
        fdaeVar2.getClass();
        iccVar2.getClass();
        return new djwc(str3, str4, list2, z2, z3, fdaeVar2, iccVar2, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djwc)) {
            return false;
        }
        djwc djwcVar = (djwc) obj;
        return fdbq.f(this.a, djwcVar.a) && fdbq.f(this.b, djwcVar.b) && fdbq.f(this.c, djwcVar.c) && this.d == djwcVar.d && this.e == djwcVar.e && fdbq.f(this.f, djwcVar.f) && fdbq.f(this.h, djwcVar.h) && this.g == djwcVar.g;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return ((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode()) * 31) + djwa.a(this.d)) * 31) + djwa.a(this.e)) * 31) + this.f.hashCode()) * 31) + this.h.hashCode()) * 31) + this.g;
    }

    public final String toString() {
        return "CheckboxListItemUiData(title=" + this.a + ", subtitle=" + this.b + ", subtitleAnnotations=" + this.c + ", isChecked=" + this.d + ", useTrailingCheckbox=" + this.e + ", onToggle=" + this.f + ", verticalAlignment=" + this.h + ", titleMaxLines=" + this.g + ")";
    }

    public /* synthetic */ djwc(String str, String str2, List list, boolean z, boolean z2, fdae fdaeVar, icc iccVar, int i, int i2) {
        this(str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? fcvo.a : list, ((i2 & 8) == 0) & z, ((i2 & 16) == 0) & z2, (i2 & 32) != 0 ? new fdae() { // from class: djwb
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        } : fdaeVar, (i2 & 64) != 0 ? ibw.n : iccVar, (i2 & 128) != 0 ? 1 : i);
    }
}
