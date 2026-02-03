package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jcw {
    public final jcr a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;
    public int k;
    public boolean l;
    public boolean m;
    public int n;
    public jdm p;
    public int q = 5;
    public final jdv o = new jdv(this);

    public jcw(jcr jcrVar) {
        this.a = jcrVar;
    }

    public final jer a() {
        return this.a.v.d;
    }

    public final kil b() {
        jdv jdvVar = this.o;
        if (jdvVar.j) {
            return new kil(jdvVar.d);
        }
        return null;
    }

    public final kil c() {
        jdm jdmVar = this.p;
        if (jdmVar != null) {
            return jdmVar.l;
        }
        return null;
    }

    public final void d() {
        this.o.x = true;
        jdm jdmVar = this.p;
        if (jdmVar != null) {
            jdmVar.r = true;
        }
    }

    public final void e() {
        this.e = true;
        this.f = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            r4 = this;
            jcr r0 = r4.a
            int r0 = r0.aC()
            r1 = 3
            r2 = 4
            r3 = 1
            if (r0 == r1) goto Le
            if (r0 != r2) goto L1b
            r0 = r2
        Le:
            jdv r1 = r4.o
            boolean r1 = r1.y
            if (r1 == 0) goto L18
            r4.j(r3)
            goto L1b
        L18:
            r4.i(r3)
        L1b:
            if (r0 != r2) goto L2c
            jdm r0 = r4.p
            if (r0 == 0) goto L29
            boolean r0 = r0.s
            if (r0 != r3) goto L29
            r4.l(r3)
            return
        L29:
            r4.k(r3)
        L2c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jcw.f():void");
    }

    public final void g(int i) {
        int i2 = this.k;
        this.k = i;
        if ((i2 == 0) != (i == 0)) {
            jcr jcrVarS = this.a.s();
            jcw jcwVar = jcrVarS != null ? jcrVarS.w : null;
            if (jcwVar != null) {
                if (i == 0) {
                    jcwVar.g(jcwVar.k - 1);
                } else {
                    jcwVar.g(jcwVar.k + 1);
                }
            }
        }
    }

    public final void h(int i) {
        int i2 = this.n;
        this.n = i;
        if ((i2 == 0) != (i == 0)) {
            jcr jcrVarS = this.a.s();
            jcw jcwVar = jcrVarS != null ? jcrVarS.w : null;
            if (jcwVar != null) {
                if (i == 0) {
                    jcwVar.h(jcwVar.n - 1);
                } else {
                    jcwVar.h(jcwVar.n + 1);
                }
            }
        }
    }

    public final void i(boolean z) {
        if (this.j != z) {
            this.j = z;
            if (z) {
                if (this.i) {
                    return;
                }
                g(this.k + 1);
            } else {
                if (this.i) {
                    return;
                }
                g(this.k - 1);
            }
        }
    }

    public final void j(boolean z) {
        if (this.i != z) {
            this.i = z;
            if (z) {
                if (this.j) {
                    return;
                }
                g(this.k + 1);
            } else {
                if (this.j) {
                    return;
                }
                g(this.k - 1);
            }
        }
    }

    public final void k(boolean z) {
        if (this.m != z) {
            this.m = z;
            if (z) {
                if (this.l) {
                    return;
                }
                h(this.n + 1);
            } else {
                if (this.l) {
                    return;
                }
                h(this.n - 1);
            }
        }
    }

    public final void l(boolean z) {
        if (this.l != z) {
            this.l = z;
            if (z) {
                if (this.m) {
                    return;
                }
                h(this.n + 1);
            } else {
                if (this.m) {
                    return;
                }
                h(this.n - 1);
            }
        }
    }

    public final void m() {
        jdv jdvVar = this.o;
        if ((jdvVar.r != null || jdvVar.p().f() != null) && jdvVar.q) {
            jdvVar.q = false;
            jdvVar.r = jdvVar.p().f();
            jcr jcrVarS = this.a.s();
            if (jcrVarS != null) {
                jcr.ay(jcrVarS, false, 7);
            }
        }
        jdm jdmVar = this.p;
        if (jdmVar != null) {
            if (jdmVar.u == null) {
                jdf jdfVarC = jdmVar.q().C();
                jdfVarC.getClass();
                if (jdfVarC.f() == null) {
                    return;
                }
            }
            if (jdmVar.t) {
                jdmVar.t = false;
                jdf jdfVarC2 = jdmVar.q().C();
                jdfVarC2.getClass();
                jdmVar.u = jdfVarC2.f();
                jcr jcrVar = this.a;
                if (jcx.a(jcrVar)) {
                    jcr jcrVarS2 = jcrVar.s();
                    if (jcrVarS2 != null) {
                        jcr.ay(jcrVarS2, false, 7);
                        return;
                    }
                    return;
                }
                jcr jcrVarS3 = jcrVar.s();
                if (jcrVarS3 != null) {
                    jcr.aw(jcrVarS3, false, 7);
                }
            }
        }
    }

    public final boolean n() {
        return this.o.v;
    }
}
