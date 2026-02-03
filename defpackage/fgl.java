package defpackage;

import androidx.car.app.model.Alert;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgl {
    public kio a;
    public jyi b;
    private juo c;
    private kbi d;
    private int e;
    private boolean f;
    private int g;
    private List h;
    private jyq j;
    private jvf k;
    private kji l;
    private long o;
    private long i = fgj.a;
    private int m = -1;
    private int n = -1;

    public /* synthetic */ fgl(juo juoVar, jyq jyqVar, kbi kbiVar, int i, boolean z, int i2, List list) {
        this.c = juoVar;
        this.d = kbiVar;
        this.e = i;
        this.f = z;
        this.g = i2;
        this.h = list;
        this.j = jyqVar;
    }

    private final void i() {
        this.k = null;
        this.b = null;
        this.n = -1;
        this.m = -1;
    }

    public final int a(int i, kji kjiVar) {
        int i2 = this.m;
        int i3 = this.n;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long jD = kim.d(0, i, 0, Alert.DURATION_SHOW_INDEFINITELY);
        float f = b(jD, kjiVar).e;
        int iF = fddu.f(fbg.a(f), kil.c(jD));
        this.m = i;
        this.n = iF;
        return iF;
    }

    public final jvc b(long j, kji kjiVar) {
        jvf jvfVarC = c(kjiVar);
        long jB = fgk.b(j, this.f, this.e, jvfVarC.a());
        boolean z = this.f;
        int i = this.e;
        return new jvc(jvfVarC, jB, fgk.a(z, i, this.g), i);
    }

    public final jvf c(kji kjiVar) {
        jvf jvfVar = this.k;
        if (jvfVar == null || kjiVar != this.l || jvfVar.c()) {
            this.l = kjiVar;
            juo juoVar = this.c;
            jyq jyqVarB = jyr.b(this.j, kjiVar);
            kio kioVar = this.a;
            kioVar.getClass();
            kbi kbiVar = this.d;
            List list = this.h;
            if (list == null) {
                list = fcvo.a;
            }
            jvfVar = new jvf(juoVar, jyqVarB, list, kioVar, kbiVar);
        }
        this.k = jvfVar;
        return jvfVar;
    }

    public final jyi d() {
        jyi jyiVar = this.b;
        if (jyiVar != null) {
            return jyiVar;
        }
        toString();
        throw new IllegalStateException("Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: ".concat(toString()));
    }

    public final jyi e(kji kjiVar, long j, jvc jvcVar) {
        float fMin = Math.min(jvcVar.a.a(), jvcVar.d);
        juo juoVar = this.c;
        jyq jyqVar = this.j;
        List list = this.h;
        if (list == null) {
            list = fcvo.a;
        }
        int i = this.g;
        boolean z = this.f;
        int i2 = this.e;
        kio kioVar = this.a;
        kioVar.getClass();
        return new jyi(new jyh(juoVar, jyqVar, list, i, z, i2, kioVar, kjiVar, this.d, j), jvcVar, kim.e(j, (fbg.a(fMin) << 32) | (fbg.a(jvcVar.e) & 4294967295L)));
    }

    public final void f(long j) {
        this.o = j | (this.o << 2);
    }

    public final void g(kio kioVar) {
        kio kioVar2 = this.a;
        long jA = kioVar != null ? fgj.a(kioVar) : fgj.a;
        if (kioVar2 == null) {
            this.a = kioVar;
            this.i = jA;
        } else if (kioVar == null || !fgj.d(this.i, jA)) {
            this.a = kioVar;
            this.i = jA;
            f(1L);
            i();
        }
    }

    public final void h(juo juoVar, jyq jyqVar, kbi kbiVar, int i, boolean z, int i2, List list) {
        this.c = juoVar;
        boolean zX = jyqVar.x(this.j);
        this.j = jyqVar;
        if (!zX) {
            f(0L);
            this.k = null;
            this.b = null;
            this.n = -1;
            this.m = -1;
        }
        this.d = kbiVar;
        this.e = i;
        this.f = z;
        this.g = i2;
        this.h = list;
        f(2L);
        i();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiParagraphLayoutCache(textLayoutResult=");
        sb.append(this.b != null ? "<TextLayoutResult>" : "null");
        sb.append(", lastDensity=");
        sb.append((Object) fgj.c(this.i));
        sb.append(", history=");
        sb.append(this.o);
        sb.append(", constraints=");
        jyi jyiVar = this.b;
        sb.append(jyiVar != null ? new kil(jyiVar.a.j) : "null");
        sb.append(')');
        return sb.toString();
    }
}
