package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rtb implements rtg, rte {
    public volatile rte a;
    public volatile rte b;
    private final Object c;
    private final rtg d;
    private rtf e;
    private rtf f;

    public rtb(Object obj, rtg rtgVar) {
        rtf rtfVar = rtf.CLEARED;
        this.e = rtfVar;
        this.f = rtfVar;
        this.c = obj;
        this.d = rtgVar;
    }

    @Override // defpackage.rtg
    public final rtg a() {
        rtg rtgVarA;
        synchronized (this.c) {
            rtg rtgVar = this.d;
            rtgVarA = rtgVar != null ? rtgVar.a() : this;
        }
        return rtgVarA;
    }

    @Override // defpackage.rte
    public final void b() {
        synchronized (this.c) {
            rtf rtfVar = this.e;
            rtf rtfVar2 = rtf.RUNNING;
            if (rtfVar != rtfVar2) {
                this.e = rtfVar2;
                this.a.b();
            }
        }
    }

    @Override // defpackage.rte
    public final void c() {
        synchronized (this.c) {
            rtf rtfVar = rtf.CLEARED;
            this.e = rtfVar;
            this.a.c();
            if (this.f != rtfVar) {
                this.f = rtfVar;
                this.b.c();
            }
        }
    }

    @Override // defpackage.rtg
    public final void d(rte rteVar) {
        synchronized (this.c) {
            if (rteVar.equals(this.b)) {
                this.f = rtf.FAILED;
                rtg rtgVar = this.d;
                if (rtgVar != null) {
                    rtgVar.d(this);
                }
                return;
            }
            this.e = rtf.FAILED;
            rtf rtfVar = this.f;
            rtf rtfVar2 = rtf.RUNNING;
            if (rtfVar != rtfVar2) {
                this.f = rtfVar2;
                this.b.b();
            }
        }
    }

    @Override // defpackage.rtg
    public final void e(rte rteVar) {
        synchronized (this.c) {
            if (rteVar.equals(this.a)) {
                this.e = rtf.SUCCESS;
            } else if (rteVar.equals(this.b)) {
                this.f = rtf.SUCCESS;
            }
            rtg rtgVar = this.d;
            if (rtgVar != null) {
                rtgVar.e(this);
            }
        }
    }

    @Override // defpackage.rte
    public final void f() {
        synchronized (this.c) {
            rtf rtfVar = this.e;
            rtf rtfVar2 = rtf.RUNNING;
            if (rtfVar == rtfVar2) {
                this.e = rtf.PAUSED;
                this.a.f();
            }
            if (this.f == rtfVar2) {
                this.f = rtf.PAUSED;
                this.b.f();
            }
        }
    }

    @Override // defpackage.rtg
    public final boolean g(rte rteVar) {
        boolean z;
        synchronized (this.c) {
            rtg rtgVar = this.d;
            z = false;
            if ((rtgVar == null || rtgVar.g(this)) && rteVar.equals(this.a)) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.rtg
    public final boolean h(rte rteVar) {
        boolean z;
        boolean zEquals;
        synchronized (this.c) {
            rtg rtgVar = this.d;
            z = false;
            if (rtgVar == null || rtgVar.h(this)) {
                rtf rtfVar = this.e;
                rtf rtfVar2 = rtf.FAILED;
                if (rtfVar == rtfVar2) {
                    if (rteVar.equals(this.b)) {
                        rtf rtfVar3 = this.f;
                        if (rtfVar3 != rtf.SUCCESS) {
                            if (rtfVar3 == rtfVar2) {
                                z = true;
                            }
                            zEquals = false;
                        } else {
                            zEquals = true;
                        }
                    } else {
                        zEquals = false;
                    }
                }
                zEquals = rteVar.equals(this.a);
                if (zEquals) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // defpackage.rtg
    public final boolean i(rte rteVar) {
        boolean z;
        synchronized (this.c) {
            rtg rtgVar = this.d;
            z = true;
            if (rtgVar != null && !rtgVar.i(this)) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.rtg, defpackage.rte
    public final boolean j() {
        boolean z;
        synchronized (this.c) {
            z = true;
            if (!this.a.j() && !this.b.j()) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.rte
    public final boolean k() {
        boolean z;
        synchronized (this.c) {
            rtf rtfVar = this.e;
            rtf rtfVar2 = rtf.CLEARED;
            z = false;
            if (rtfVar == rtfVar2 && this.f == rtfVar2) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.rte
    public final boolean l() {
        boolean z;
        synchronized (this.c) {
            rtf rtfVar = this.e;
            rtf rtfVar2 = rtf.SUCCESS;
            z = true;
            if (rtfVar != rtfVar2 && this.f != rtfVar2) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.rte
    public final boolean m(rte rteVar) {
        if (rteVar instanceof rtb) {
            rtb rtbVar = (rtb) rteVar;
            if (this.a.m(rtbVar.a) && this.b.m(rtbVar.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.rte
    public final boolean n() {
        boolean z;
        synchronized (this.c) {
            rtf rtfVar = this.e;
            rtf rtfVar2 = rtf.RUNNING;
            z = true;
            if (rtfVar != rtfVar2 && this.f != rtfVar2) {
                z = false;
            }
        }
        return z;
    }
}
