package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkrk implements dkri {
    public final int a;
    private final dkpi b;
    private final String c;
    private final float d;
    private final fdae e;
    private final List f;
    private final int g;

    public dkrk() {
        this(null, null, 0, 0, 0.0f, null, 63);
    }

    @Override // defpackage.dkri
    public final float a() {
        return this.d;
    }

    @Override // defpackage.dkri
    public final String b() {
        return this.c;
    }

    @Override // defpackage.dkri
    public final List c() {
        return this.f;
    }

    @Override // defpackage.dkri
    public final fdae d() {
        return this.e;
    }

    @Override // defpackage.dkri
    public final int e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkrk)) {
            return false;
        }
        dkrk dkrkVar = (dkrk) obj;
        return fdbq.f(this.b, dkrkVar.b) && fdbq.f(this.c, dkrkVar.c) && this.a == dkrkVar.a && this.g == dkrkVar.g && Float.compare(this.d, dkrkVar.d) == 0 && fdbq.f(this.e, dkrkVar.e);
    }

    @Override // defpackage.dkri
    public final int f() {
        return this.g;
    }

    public final int hashCode() {
        dkpi dkpiVar = this.b;
        int iHashCode = dkpiVar == null ? 0 : dkpiVar.hashCode();
        String str = this.c;
        int iHashCode2 = (((((((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.a) * 31) + this.g) * 31) + Float.floatToIntBits(this.d);
        fdae fdaeVar = this.e;
        return (iHashCode2 * 31) + (fdaeVar != null ? fdaeVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SingleMonogramUiData(item=");
        sb.append(this.b);
        sb.append(", contentDescription=");
        sb.append(this.c);
        sb.append(", iconOverride=");
        int i = this.a;
        sb.append((Object) (i != 1 ? i != 2 ? i != 3 ? "SELECTED" : "PROCESSING" : "BLOCKED" : "NONE"));
        sb.append(", shape=");
        sb.append((Object) dkrh.a(this.g));
        sb.append(", spacerWeight=");
        sb.append(this.d);
        sb.append(", onClick=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ dkrk(dkpi dkpiVar, String str, int i, int i2, float f, fdae fdaeVar, int i3) {
        i = (i3 & 4) != 0 ? 1 : i;
        if (i == 0) {
            throw null;
        }
        i2 = (i3 & 8) != 0 ? 1 : i2;
        if (i2 == 0) {
            throw null;
        }
        int i4 = i3 & 32;
        int i5 = i3 & 16;
        int i6 = i3 & 2;
        int i7 = i3 & 1;
        fdaeVar = i4 != 0 ? null : fdaeVar;
        f = i5 != 0 ? 0.05f : f;
        dkpiVar = 1 == i7 ? null : dkpiVar;
        str = i6 != 0 ? null : str;
        this.b = dkpiVar;
        this.c = str;
        this.a = i;
        this.g = i2;
        this.d = f;
        this.e = fdaeVar;
        this.f = dkpiVar == null ? fcvo.a : fcva.b(dkpiVar);
    }
}
