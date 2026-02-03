package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class zr {
    public final cvw a = new cvw();
    public final ctz b = new ctz();

    public final vu a(wv wvVar, int i) {
        zq zqVar;
        vu vuVar;
        cvw cvwVar = this.a;
        int iC = cvwVar.c(wvVar);
        if (iC >= 0 && (zqVar = (zq) cvwVar.g(iC)) != null) {
            int i2 = zqVar.b;
            if ((i2 & i) != 0) {
                int i3 = (~i) & i2;
                zqVar.b = i3;
                if (i == 4) {
                    vuVar = zqVar.c;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    vuVar = zqVar.d;
                }
                if ((i3 & 12) == 0) {
                    cvwVar.e(iC);
                    zq.b(zqVar);
                }
                return vuVar;
            }
        }
        return null;
    }

    final void b(wv wvVar) {
        cvw cvwVar = this.a;
        zq zqVarA = (zq) cvwVar.get(wvVar);
        if (zqVarA == null) {
            zqVarA = zq.a();
            cvwVar.put(wvVar, zqVarA);
        }
        zqVarA.b |= 1;
    }

    public final void c(long j, wv wvVar) {
        this.b.h(j, wvVar);
    }

    public final void d(wv wvVar, vu vuVar) {
        cvw cvwVar = this.a;
        zq zqVarA = (zq) cvwVar.get(wvVar);
        if (zqVarA == null) {
            zqVarA = zq.a();
            cvwVar.put(wvVar, zqVarA);
        }
        zqVarA.d = vuVar;
        zqVarA.b |= 8;
    }

    public final void e(wv wvVar, vu vuVar) {
        cvw cvwVar = this.a;
        zq zqVarA = (zq) cvwVar.get(wvVar);
        if (zqVarA == null) {
            zqVarA = zq.a();
            cvwVar.put(wvVar, zqVarA);
        }
        zqVarA.c = vuVar;
        zqVarA.b |= 4;
    }

    public final void f() {
        this.a.clear();
        this.b.g();
    }

    final void g(wv wvVar) {
        zq zqVar = (zq) this.a.get(wvVar);
        if (zqVar == null) {
            return;
        }
        zqVar.b &= -2;
    }

    final void h(wv wvVar) {
        ctz ctzVar = this.b;
        int iB = ctzVar.b();
        while (true) {
            iB--;
            if (iB < 0) {
                break;
            }
            if (wvVar == ctzVar.e(iB)) {
                Object[] objArr = ctzVar.c;
                Object obj = objArr[iB];
                Object obj2 = cua.a;
                if (obj != obj2) {
                    objArr[iB] = obj2;
                    ctzVar.a = true;
                }
            }
        }
        zq zqVar = (zq) this.a.remove(wvVar);
        if (zqVar != null) {
            zq.b(zqVar);
        }
    }

    public final boolean i(wv wvVar) {
        zq zqVar = (zq) this.a.get(wvVar);
        return (zqVar == null || (zqVar.b & 1) == 0) ? false : true;
    }
}
