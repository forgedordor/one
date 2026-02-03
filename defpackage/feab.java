package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class feab extends fdlg {
    private final String a;
    private final fdzx b;

    public feab(int i, int i2, long j, String str) {
        this.a = str;
        this.b = new fdzx(i, i2, j, str);
    }

    @Override // defpackage.fdjq
    public final void a(fcyh fcyhVar, Runnable runnable) {
        fdzx.e(this.b, runnable, false, 6);
    }

    public final void c(Runnable runnable, boolean z) {
        this.b.a(runnable, true, z);
    }

    public void close() {
        this.b.close();
    }

    @Override // defpackage.fdlg
    public final Executor g() {
        return this.b;
    }

    @Override // defpackage.fdjq
    public final void h(fcyh fcyhVar, Runnable runnable) {
        fdzx.e(this.b, runnable, true, 2);
    }
}
