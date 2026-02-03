package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgm {
    public String a;
    public kbi b;
    public int c;
    public boolean d;
    public int e;
    public kio f;
    public jvi g;
    public boolean h;
    public jvl j;
    public kji k;
    private jyq m;
    private long q;
    private long n = fgj.a;
    public long i = 0;
    public long l = kik.c(0, 0);
    private int o = -1;
    private int p = -1;

    public fgm(String str, jyq jyqVar, kbi kbiVar, int i, boolean z, int i2) {
        this.a = str;
        this.m = jyqVar;
        this.b = kbiVar;
        this.c = i;
        this.d = z;
        this.e = i2;
    }

    private final void g() {
        this.g = null;
        this.j = null;
        this.k = null;
        this.o = -1;
        this.p = -1;
        this.l = kik.c(0, 0);
        this.i = 0L;
        this.h = false;
    }

    public final int a(int i, kji kjiVar) {
        int i2 = this.o;
        int i3 = this.p;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long jD = kim.d(0, i, 0, Alert.DURATION_SHOW_INDEFINITELY);
        int iF = fddu.f(fbg.a(b(jD, kjiVar).b()), kil.c(jD));
        this.o = i;
        this.p = iF;
        return iF;
    }

    public final jvi b(long j, kji kjiVar) {
        jvl jvlVarC = c(kjiVar);
        long jB = fgk.b(j, this.d, this.c, jvlVarC.a());
        boolean z = this.d;
        int i = this.c;
        return new juh((kfz) jvlVarC, fgk.a(z, i, this.e), i, jB);
    }

    public final jvl c(kji kjiVar) {
        jvl kfzVar = this.j;
        if (kfzVar == null || kjiVar != this.k || kfzVar.c()) {
            this.k = kjiVar;
            String str = this.a;
            jyq jyqVarB = jyr.b(this.m, kjiVar);
            fcvo fcvoVar = fcvo.a;
            kio kioVar = this.f;
            kioVar.getClass();
            kfzVar = new kfz(str, jyqVarB, fcvoVar, fcvoVar, this.b, kioVar);
        }
        this.j = kfzVar;
        return kfzVar;
    }

    public final void d(long j) {
        this.q = j | (this.q << 2);
    }

    public final void e(kio kioVar) {
        kio kioVar2 = this.f;
        long jA = kioVar != null ? fgj.a(kioVar) : fgj.a;
        if (kioVar2 == null) {
            this.f = kioVar;
            this.n = jA;
        } else if (kioVar == null || !fgj.d(this.n, jA)) {
            this.f = kioVar;
            this.n = jA;
            d(1L);
            g();
        }
    }

    public final void f(String str, jyq jyqVar, kbi kbiVar, int i, boolean z, int i2) {
        this.a = str;
        this.m = jyqVar;
        this.b = kbiVar;
        this.c = i;
        this.d = z;
        this.e = i2;
        d(2L);
        g();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb.append(this.g != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        sb.append((Object) fgj.c(this.n));
        sb.append(", history=");
        sb.append(this.q);
        sb.append(", constraints=$)");
        return sb.toString();
    }
}
