package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qcf implements qbi {
    private final Handler a = laf.a(Looper.getMainLooper());

    @Override // defpackage.qbi
    public final void a(Runnable runnable) {
        this.a.removeCallbacks(runnable);
    }

    @Override // defpackage.qbi
    public final void b(long j, Runnable runnable) {
        this.a.postDelayed(runnable, j);
    }
}
