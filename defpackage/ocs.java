package defpackage;

import j$.util.Objects;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ocs {
    public final long a;
    public final long b;
    public final int c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;
    public final int h;
    public final mag i;
    public final int j;
    public final int k;
    public final int l;
    public final String m;
    public final String n;
    public final int o;
    public final ocp p;
    final ekgb q;

    public ocs(ekgb ekgbVar, long j, long j2, int i, int i2, int i3, String str, String str2, int i4, mag magVar, int i5, int i6, int i7, String str3, String str4, int i8, ocp ocpVar) {
        this.q = ekgbVar;
        this.a = j;
        this.b = j2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = str;
        this.g = str2;
        this.h = i4;
        this.i = magVar;
        this.j = i5;
        this.k = i6;
        this.l = i7;
        this.m = str3;
        this.n = str4;
        this.o = i8;
        this.p = ocpVar;
        a(str2, i8, ekgbVar, 1);
        a(str4, i8, ekgbVar, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void a(String str, int i, List list, int i2) {
        if (str == null || i == 1) {
            return;
        }
        ekqh it = ((ekgb) list).iterator();
        char c = 0;
        while (it.hasNext()) {
            ocr ocrVar = (ocr) it.next();
            if ((i2 == 1 ? ocrVar.d : ocrVar.e) == null) {
                if (c == 1) {
                    return;
                } else {
                    c = 2;
                }
            } else if (c == 2) {
                return;
            } else {
                c = 1;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ocs)) {
            return false;
        }
        ocs ocsVar = (ocs) obj;
        return Objects.equals(this.q, ocsVar.q) && this.a == ocsVar.a && this.b == ocsVar.b && this.c == ocsVar.c && this.d == ocsVar.d && this.e == ocsVar.e && Objects.equals(this.f, ocsVar.f) && Objects.equals(this.g, ocsVar.g) && this.h == ocsVar.h && Objects.equals(this.i, ocsVar.i) && this.j == ocsVar.j && this.k == ocsVar.k && this.l == ocsVar.l && Objects.equals(this.m, ocsVar.m) && Objects.equals(this.n, ocsVar.n) && this.o == ocsVar.o && Objects.equals(this.p, ocsVar.p);
    }

    public final int hashCode() {
        int iHashCode = Objects.hashCode(this.q) * 31;
        String str = this.f;
        return ((((((((((((((((((((((((((((((iHashCode + ((int) this.a)) * 31) + ((int) this.b)) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + Objects.hashCode(str)) * 31) + Objects.hashCode(this.g)) * 31) + this.h) * 31) + Objects.hashCode(this.i)) * 31) + this.j) * 31) + this.k) * 31) + this.l) * 31) + Objects.hashCode(this.m)) * 31) + Objects.hashCode(this.n)) * 31) + this.o) * 31) + Objects.hashCode(this.p);
    }
}
