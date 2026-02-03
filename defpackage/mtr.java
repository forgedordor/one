package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mtr implements mse {
    public mca a = mca.a;
    private boolean b;
    private long c;
    private long d;

    @Override // defpackage.mse
    public final long a() {
        long j = this.c;
        if (!this.b) {
            return j;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.d;
        return j + (this.a.b == 1.0f ? mgb.w(jElapsedRealtime) : jElapsedRealtime * r4.d);
    }

    @Override // defpackage.mse
    public final mca b() {
        return this.a;
    }

    public final void c(long j) {
        this.c = j;
        if (this.b) {
            this.d = SystemClock.elapsedRealtime();
        }
    }

    @Override // defpackage.mse
    public final void d(mca mcaVar) {
        if (this.b) {
            c(a());
        }
        this.a = mcaVar;
    }

    public final void e() {
        if (this.b) {
            return;
        }
        this.d = SystemClock.elapsedRealtime();
        this.b = true;
    }

    public final void f() {
        if (this.b) {
            c(a());
            this.b = false;
        }
    }

    @Override // defpackage.mse
    public final /* synthetic */ boolean g() {
        return false;
    }
}
