package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egtc implements qbi {
    final Handler a;

    public egtc(Handler handler) {
        this.a = handler;
    }

    @Override // defpackage.qbi
    public final void a(Runnable runnable) {
        this.a.removeCallbacks(runnable);
    }

    @Override // defpackage.qbi
    public final void b(long j, Runnable runnable) {
        this.a.postDelayed(runnable, j);
    }
}
