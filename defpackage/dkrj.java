package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkrj implements dkri {
    public final List a;
    private final String b;
    private final float c;
    private final fdae d;
    private final int e;
    private final int f;

    public dkrj() {
        this(null, 0, 0.0f, null, 63);
    }

    @Override // defpackage.dkri
    public final float a() {
        return this.c;
    }

    @Override // defpackage.dkri
    public final String b() {
        return null;
    }

    @Override // defpackage.dkri
    public final List c() {
        return this.a;
    }

    @Override // defpackage.dkri
    public final fdae d() {
        return this.d;
    }

    @Override // defpackage.dkri
    public final int e() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkrj)) {
            return false;
        }
        dkrj dkrjVar = (dkrj) obj;
        String str = dkrjVar.b;
        if (!fdbq.f(null, null)) {
            return false;
        }
        int i = dkrjVar.e;
        return fdbq.f(this.a, dkrjVar.a) && this.f == dkrjVar.f && Float.compare(this.c, dkrjVar.c) == 0 && fdbq.f(this.d, dkrjVar.d);
    }

    @Override // defpackage.dkri
    public final int f() {
        return this.f;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() + 31) * 31) + this.f) * 31) + Float.floatToIntBits(this.c);
        fdae fdaeVar = this.d;
        return (iHashCode * 31) + (fdaeVar == null ? 0 : fdaeVar.hashCode());
    }

    public final String toString() {
        return "MultiMonogramUiData(contentDescription=null, iconOverride=NONE, items=" + this.a + ", shape=" + ((Object) dkrh.a(this.f)) + ", spacerWeight=" + this.c + ", onClick=" + this.d + ")";
    }

    public /* synthetic */ dkrj(List list, int i, float f, fdae fdaeVar, int i2) {
        list = (i2 & 4) != 0 ? fcvo.a : list;
        int i3 = i2 & 2;
        i = (i2 & 8) != 0 ? 1 : i;
        f = (i2 & 16) != 0 ? 0.05f : f;
        fdaeVar = (i2 & 32) != 0 ? null : fdaeVar;
        if (i3 == 0) {
            throw null;
        }
        list.getClass();
        if (i == 0) {
            throw null;
        }
        this.b = null;
        this.e = 1;
        this.a = list;
        this.f = i;
        this.c = f;
        this.d = fdaeVar;
    }
}
