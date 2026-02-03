package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rtm implements rtg, rte {
    public volatile rte a;
    public volatile rte b;
    private final rtg c;
    private final Object d;
    private rtf e;
    private rtf f;
    private boolean g;

    public rtm(Object obj, rtg rtgVar) {
        rtf rtfVar = rtf.CLEARED;
        this.e = rtfVar;
        this.f = rtfVar;
        this.d = obj;
        this.c = rtgVar;
    }

    @Override // defpackage.rtg
    public final rtg a() {
        rtg rtgVarA;
        synchronized (this.d) {
            rtg rtgVar = this.c;
            rtgVarA = rtgVar != null ? rtgVar.a() : this;
        }
        return rtgVarA;
    }

    @Override // defpackage.rte
    public final void b() {
        synchronized (this.d) {
            this.g = true;
            try {
                if (this.e != rtf.SUCCESS) {
                    rtf rtfVar = this.f;
                    rtf rtfVar2 = rtf.RUNNING;
                    if (rtfVar != rtfVar2) {
                        this.f = rtfVar2;
                        this.b.b();
                    }
                }
                if (this.g) {
                    rtf rtfVar3 = this.e;
                    rtf rtfVar4 = rtf.RUNNING;
                    if (rtfVar3 != rtfVar4) {
                        this.e = rtfVar4;
                        this.a.b();
                    }
                }
            } finally {
                this.g = false;
            }
        }
    }

    @Override // defpackage.rte
    public final void c() {
        synchronized (this.d) {
            this.g = false;
            rtf rtfVar = rtf.CLEARED;
            this.e = rtfVar;
            this.f = rtfVar;
            this.b.c();
            this.a.c();
        }
    }

    @Override // defpackage.rtg
    public final void d(rte rteVar) {
        synchronized (this.d) {
            if (!rteVar.equals(this.a)) {
                this.f = rtf.FAILED;
                return;
            }
            this.e = rtf.FAILED;
            rtg rtgVar = this.c;
            if (rtgVar != null) {
                rtgVar.d(this);
            }
        }
    }

    @Override // defpackage.rtg
    public final void e(rte rteVar) {
        synchronized (this.d) {
            if (rteVar.equals(this.b)) {
                this.f = rtf.SUCCESS;
                return;
            }
            this.e = rtf.SUCCESS;
            rtg rtgVar = this.c;
            if (rtgVar != null) {
                rtgVar.e(this);
            }
            if (!this.f.f) {
                this.b.c();
            }
        }
    }

    @Override // defpackage.rte
    public final void f() {
        synchronized (this.d) {
            if (!this.f.f) {
                this.f = rtf.PAUSED;
                this.b.f();
            }
            if (!this.e.f) {
                this.e = rtf.PAUSED;
                this.a.f();
            }
        }
    }

    @Override // defpackage.rtg
    public final boolean g(rte rteVar) {
        boolean z;
        synchronized (this.d) {
            rtg rtgVar = this.c;
            z = false;
            if ((rtgVar == null || rtgVar.g(this)) && rteVar.equals(this.a) && this.e != rtf.PAUSED) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.rtg
    public final boolean h(rte rteVar) {
        boolean z;
        synchronized (this.d) {
            rtg rtgVar = this.c;
            z = false;
            if ((rtgVar == null || rtgVar.h(this)) && rteVar.equals(this.a) && !j()) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.rtg
    public final boolean i(rte rteVar) {
        boolean z;
        synchronized (this.d) {
            rtg rtgVar = this.c;
            z = false;
            if ((rtgVar == null || rtgVar.i(this)) && (rteVar.equals(this.a) || this.e != rtf.SUCCESS)) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.rtg, defpackage.rte
    public final boolean j() {
        boolean z;
        synchronized (this.d) {
            z = true;
            if (!this.b.j() && !this.a.j()) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.rte
    public final boolean k() {
        boolean z;
        synchronized (this.d) {
            z = this.e == rtf.CLEARED;
        }
        return z;
    }

    @Override // defpackage.rte
    public final boolean l() {
        boolean z;
        synchronized (this.d) {
            z = this.e == rtf.SUCCESS;
        }
        return z;
    }

    @Override // defpackage.rte
    public final boolean m(rte rteVar) {
        if (rteVar instanceof rtm) {
            rtm rtmVar = (rtm) rteVar;
            if (this.a != null ? this.a.m(rtmVar.a) : rtmVar.a == null) {
                if (this.b == null) {
                    if (rtmVar.b == null) {
                        return true;
                    }
                } else if (this.b.m(rtmVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.rte
    public final boolean n() {
        boolean z;
        synchronized (this.d) {
            z = this.e == rtf.RUNNING;
        }
        return z;
    }
}
