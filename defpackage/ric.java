package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ric {
    private boolean a;
    private final Handler b = new Handler(Looper.getMainLooper(), new rib());

    public final synchronized void a(rhy rhyVar, boolean z) {
        if (!this.a && !z) {
            this.a = true;
            rhyVar.e();
            this.a = false;
            return;
        }
        this.b.obtainMessage(1, rhyVar).sendToTarget();
    }
}
