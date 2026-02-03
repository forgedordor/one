package defpackage;

import androidx.car.app.model.Alert;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhpt extends dhph {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final String g;
    public final String h;
    public final boolean i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private final boolean m;
    private final boolean n;
    private final Duration o;
    private final int p;

    public dhpt() {
        this(false, false, false, false, null, null, false, 65535);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhpt)) {
            return false;
        }
        dhpt dhptVar = (dhpt) obj;
        if (this.j != dhptVar.j || this.k != dhptVar.k || this.a != dhptVar.a) {
            return false;
        }
        boolean z = dhptVar.l;
        if (this.b != dhptVar.b || this.c != dhptVar.c || this.d != dhptVar.d || this.e != dhptVar.e || !fdbq.f(this.f, dhptVar.f) || !fdbq.f(this.g, dhptVar.g) || !fdbq.f(this.h, dhptVar.h) || this.i != dhptVar.i) {
            return false;
        }
        boolean z2 = dhptVar.m;
        boolean z3 = dhptVar.n;
        if (!fdbq.f(this.o, dhptVar.o)) {
            return false;
        }
        int i = dhptVar.p;
        return true;
    }

    public final int hashCode() {
        int iA = dhps.a(this.j);
        String str = this.f;
        boolean z = this.e;
        boolean z2 = this.d;
        boolean z3 = this.c;
        boolean z4 = this.b;
        return (((((((((((((((((((((((((((((iA * 31) + dhps.a(this.k)) * 31) + dhps.a(this.a)) * 31) + dhps.a(false)) * 31) + dhps.a(z4)) * 31) + dhps.a(z3)) * 31) + dhps.a(z2)) * 31) + dhps.a(z)) * 31) + str.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + dhps.a(this.i)) * 31) + dhps.a(true)) * 31) + dhps.a(false)) * 31) + this.o.hashCode()) * 31) + Alert.DURATION_SHOW_INDEFINITELY;
    }

    public /* synthetic */ dhpt(boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, boolean z5, int i) {
        str = (i & 256) != 0 ? "ondevicesafety-pa.googleapis.com" : str;
        Duration durationE = eoob.e(10);
        str.getClass();
        str2 = (i & 512) != 0 ? "AIzaSyBVISctL4wnC5nctQ1nGYDRD6zybQjKCL8" : str2;
        str2.getClass();
        String str3 = (i & 1024) != 0 ? "https://www.gstatic.com" : null;
        str3.getClass();
        this.j = 1 == ((z ? 1 : 0) & ((i & 1) ^ 1));
        this.k = ((i & 2) == 0) & z2;
        this.a = (!((i & 4) == 0)) | z3;
        this.l = false;
        this.b = (i & 16) != 0;
        this.c = (i & 32) != 0;
        this.d = ((i & 64) == 0) & z4;
        this.e = (i & 128) != 0;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = ((i & 2048) == 0) & z5;
        this.m = true;
        this.n = false;
        this.o = durationE;
        this.p = Alert.DURATION_SHOW_INDEFINITELY;
    }
}
