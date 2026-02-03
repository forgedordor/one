package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdyr extends fdjq implements fdkh {
    public final fdjq a;
    public final fdhx b;
    public final Object c;
    private final /* synthetic */ fdkh d;
    private final int e;
    private final fdyx f;

    /* JADX WARN: Multi-variable type inference failed */
    public fdyr(fdjq fdjqVar, int i) {
        fdkh fdkhVar = fdjqVar instanceof fdkh ? (fdkh) fdjqVar : null;
        this.d = fdkhVar == null ? fdke.a : fdkhVar;
        this.a = fdjqVar;
        this.e = i;
        this.b = new fdhx(0, fdia.a);
        this.f = new fdyx();
        this.c = new Object();
    }

    private final boolean j() {
        synchronized (this.c) {
            fdhx fdhxVar = this.b;
            if (fdhxVar.c >= this.e) {
                return false;
            }
            fdhxVar.b();
            return true;
        }
    }

    @Override // defpackage.fdjq
    public final void a(fcyh fcyhVar, Runnable runnable) {
        Runnable runnableG;
        this.f.d(runnable);
        if (this.b.c >= this.e || !j() || (runnableG = g()) == null) {
            return;
        }
        try {
            fdyf.b(this.a, this, new fdyq(this, runnableG));
        } catch (Throwable th) {
            this.b.a();
            throw th;
        }
    }

    @Override // defpackage.fdkh
    public final fdks c(long j, Runnable runnable, fcyh fcyhVar) {
        return this.d.c(j, runnable, fcyhVar);
    }

    @Override // defpackage.fdkh
    public final void d(long j, fdis fdisVar) {
        this.d.d(j, fdisVar);
    }

    public final Runnable g() {
        while (true) {
            fdyx fdyxVar = this.f;
            Runnable runnable = (Runnable) fdyxVar.b();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.c) {
                fdhx fdhxVar = this.b;
                fdhxVar.a();
                if (fdyxVar.a() == 0) {
                    return null;
                }
                fdhxVar.b();
            }
        }
    }

    @Override // defpackage.fdjq
    public final void h(fcyh fcyhVar, Runnable runnable) {
        Runnable runnableG;
        this.f.d(runnable);
        if (this.b.c >= this.e || !j() || (runnableG = g()) == null) {
            return;
        }
        try {
            this.a.h(this, new fdyq(this, runnableG));
        } catch (Throwable th) {
            this.b.a();
            throw th;
        }
    }

    @Override // defpackage.fdjq
    public final fdjq i(int i) {
        fdys.a(1);
        return this.e <= 1 ? this : super.i(1);
    }

    @Override // defpackage.fdjq
    public final String toString() {
        return this.a + ".limitedParallelism(" + this.e + ")";
    }
}
