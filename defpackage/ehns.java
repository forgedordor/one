package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehns implements lun {
    private final lvn a;
    private final eics b;

    public ehns(eics eicsVar, lvn lvnVar) {
        this.a = lvnVar;
        this.b = eicsVar;
    }

    @Override // defpackage.lun
    public final void c(lvj lvjVar) {
        eidc.j();
        try {
            this.a.e(lva.ON_PAUSE);
            eidc.q();
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.lun
    public final void d(lvj lvjVar) {
        eics eicsVar = this.b;
        try {
            eifp eifpVarB = eicsVar.b();
            try {
                this.a.e(lva.ON_RESUME);
                eifpVarB.close();
            } catch (Throwable th) {
                try {
                    eifpVarB.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } finally {
            eicsVar.a = null;
            eicsVar.b = null;
        }
    }

    @Override // defpackage.lun
    public final void f(lvj lvjVar) {
        eidc.j();
        try {
            this.a.e(lva.ON_STOP);
            eidc.q();
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.lun
    public final void fh(lvj lvjVar) {
        eifp eifpVarB = this.b.b();
        try {
            this.a.e(lva.ON_DESTROY);
            eifpVarB.close();
        } catch (Throwable th) {
            try {
                eifpVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.lun
    public final void gF(lvj lvjVar) {
        eidc.j();
        try {
            this.a.e(lva.ON_CREATE);
            eidc.q();
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.lun
    public final void gG(lvj lvjVar) {
        eidc.j();
        try {
            this.a.e(lva.ON_START);
            eidc.q();
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
